package om.javatpoint.limitsservice;  

import org.springframework.web.bind.annotation.GetMapping;  
import org.springframework.web.bind.annotation.RestController;  
import om.javatpoint.limitsservice.bean.LimitConfiguration;  

@RestController  
public class LimitsConfigurationController   
{  

	@GetMapping("/limits")  
    public LimitConfiguration retriveLimitsFromConfigurations()  
    {  
		return new LimitConfiguration(1000, 1);  
    }  
}  