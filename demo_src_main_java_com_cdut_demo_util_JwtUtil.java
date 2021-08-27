package com.cdut.demo.util;

import com.auth0.jwt.JWT;
import com.auth0.jwt.JWTVerifier;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.cdut.demo.entity.Student;
import com.cdut.demo.mapper.StudentLoginMapper;
import io.jsonwebtoken.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

@Component
public class JwtUtil {
	@Autowired
	StudentLoginMapper studentLoginMapper;
	/**
	 * Token过期时间
	 */
	private static final Long EXPIRE_TIME=6000L;

	/**
	 * 生成Token
	 */

	public  static boolean verify(String token,Long id ,String password) {
		try {
			// 设置加密算法
			Algorithm algorithm = Algorithm.HMAC256(password);
			JWTVerifier verifier = JWT.require(algorithm)
					.withClaim("id", id)
					.build();
			// 效验TOKEN
			DecodedJWT jwt = verifier.verify(token);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}
		public static String sign(Long id,String password) {
			Date date = new Date(System.currentTimeMillis() + EXPIRE_TIME);
			Algorithm algorithm = Algorithm.HMAC256(password);
			// 附带id信息
			return JWT.create()
					.withClaim("id",id)
					.withExpiresAt(date)
					.sign(algorithm);

		}
	public static Long getIdByToken(HttpServletRequest request)  {
		String token = request.getHeader("token");
		DecodedJWT jwt = JWT.decode(token);
		return jwt.getClaim("id").asLong();

	}




}
