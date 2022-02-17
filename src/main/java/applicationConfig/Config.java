package applicationConfig;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @ProjectName: SpringBasicDetails
 * @Author: Temesgen D.
 * @Date: 2/16/22
 */

@Configuration
@ComponentScan(basePackages = {"proxy", "repositories", "service"})
public class Config {

}
