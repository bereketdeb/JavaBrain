package javaCods;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

/* STEPS TO INSTRUCT SPRING MVC to perform some task before handling a request
 *  - 1. create a java class that extends "HandlerInterceptorAdapter"
 *  - 2. Override the "preHandle" method and write your code(task you want to do)
 *  - 3. put an intry of this newly added java class in the spring-dispatcher configuration xml file. 
 *  
 *  STEPS OF EXECUTION
 *  - first "preHandle" is called, if it returns true the request will go to the appropriate method of the request handler class
 *  - 
 * 
 */

public class DaysOfWeekBasedInterceptor extends HandlerInterceptorAdapter {
	
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object Handler) throws IOException{
		
		Calendar cal = Calendar.getInstance();
		int dayofweek = cal.get(cal.DAY_OF_WEEK);
		
		if(dayofweek ==5 ){ //1 means sunday, 2 monday ....
			response.getWriter().write("The website is closed on Sunday");
			
			return false;
		}
		return true;
		
	}

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// this method would be called after spring MVC executes the request handler method for the request
	}

	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		// this method would be called after the response object is produced by the view for the request
	}
	
	
	
	
}
