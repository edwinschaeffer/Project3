package disburse.aspects;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggerAspect {
	private Logger logger = Logger.getLogger(getClass());
	
	@Before("execution(@org.springframework.web.bind.annotation.GetMapping * *.*(..)) || "
			+ "execution(@org.springframework.web.bind.annotation.PostMapping * *.*(..)) || " 
			+ "execution(@org.springframework.web.bind.annotation.RequestMapping * *.*(..))")
	public void logAllMapping(JoinPoint jp) {
		Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
		
		String username;
		if(principal instanceof UserDetails) {
			username = ((UserDetails)principal).getUsername();
		} else {
			username = principal.toString();
		}
		logger.info(username + " accessing - " + jp.getTarget().getClass() + " ; Executing " + jp.getSignature().getName() + "() method");
	}
}
