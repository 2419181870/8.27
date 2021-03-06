package com.cdut.demo.filter;

import com.cdut.demo.service.Impl.StudentLoginImpl;
import com.cdut.demo.util.JwtUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * token验证拦截器
 */
@Component
public class LoginInterceptor implements HandlerInterceptor {

	@Autowired
	StudentLoginImpl studentLogin;

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		// 从 http 请求头中取出 token
		String token = request.getHeader("token");
		// 如果不是映射到方法直接通过
		if(!(handler instanceof HandlerMethod)){
			return true;
		}
		if (token != null){
			Long Id = JwtUtil.getIdByToken(request);
			boolean result = JwtUtil.verify(token,Id,studentLogin.getStudentPassword(Id));
			if(result){
				System.out.println("通过拦截器");
				return true;
			}
		}
		return false;
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

	}
}