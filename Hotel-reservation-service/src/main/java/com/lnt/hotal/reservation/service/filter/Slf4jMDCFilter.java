package com.lnt.hotal.reservation.service.filter;

import java.io.IOException;
import java.util.UUID;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import org.springframework.web.filter.OncePerRequestFilter;

import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = false)
@Component
public class Slf4jMDCFilter extends OncePerRequestFilter {

	private final String responseHeader;
	private final String mdcTokenKey = "Slf4jMDCFilter.UUID";
	private final String requestHeader;

	public Slf4jMDCFilter(String responseHeader, String requestHeader) {
		super();
		this.responseHeader = responseHeader;
		this.requestHeader = requestHeader;
	}

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {

		try {
			final String token;
			if (!StringUtils.isEmpty(requestHeader) && !StringUtils.isEmpty(request.getHeader(requestHeader))) {
				token = request.getHeader(requestHeader);
			} else {
				token = UUID.randomUUID().toString().toUpperCase().replace("-", "");
			}
			MDC.put(mdcTokenKey, token);
			filterChain.doFilter(request, response);
		} finally {
			MDC.remove(mdcTokenKey);
		}
	}

}
