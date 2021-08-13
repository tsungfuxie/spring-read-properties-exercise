package person.tsungfuxie.springreadpropertiesexercise.properties;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(
		value = "classpath:MyConfiguration.properties", 
		ignoreResourceNotFound = true, 
		encoding="UTF-8")
public class DemoReadProperties {
	
	@Value("${config.type.user.name}")
    private String configTypeUserName;

	@Value("${config.type.user.id}")
    private String configTypeUserId;
	
	@Value("${config.type.user.mail}")
    private String configTypeUserMail;
	
	@Value("${config.type.user.is.married}")
    private Boolean configTypeUserIsMarried;
	
	@Value("${config.type.demo.default:this is a default value}")
    private String configTypeDemoDefault;
	
	@Value("${config.type.string.array:one,two,three}")
	private String[] configTypeStringArrayWithDefaults;
	
	@Value("${config.type.int.array:1,2,3}")
	private int[] configTypeIntArrayWithDefaults;
	
	@Value("#{systemProperties['os.name'] ?: 'my default system property value'}")
	private String spelWithSystemPropertiesValue;
	
	@Value("#{${config.type.map}}")
	private Map<String, Integer> configTypeMap;

	public String getConfigTypeUserName() {
		return configTypeUserName;
	}

	public void setConfigTypeUserName(String configTypeUserName) {
		this.configTypeUserName = configTypeUserName;
	}

	public String getConfigTypeUserId() {
		return configTypeUserId;
	}

	public void setConfigTypeUserId(String configTypeUserId) {
		this.configTypeUserId = configTypeUserId;
	}

	public String getConfigTypeUserMail() {
		return configTypeUserMail;
	}

	public void setConfigTypeUserMail(String configTypeUserMail) {
		this.configTypeUserMail = configTypeUserMail;
	}

	

	public Boolean getConfigTypeUserIsMarried() {
		return configTypeUserIsMarried;
	}

	public void setConfigTypeUserIsMarried(Boolean configTypeUserIsMarried) {
		this.configTypeUserIsMarried = configTypeUserIsMarried;
	}

	public String getConfigTypeDemoDefault() {
		return configTypeDemoDefault;
	}

	public void setConfigTypeDemoDefault(String configTypeDemoDefault) {
		this.configTypeDemoDefault = configTypeDemoDefault;
	}

	public String[] getConfigTypeStringArrayWithDefaults() {
		return configTypeStringArrayWithDefaults;
	}

	public void setConfigTypeStringArrayWithDefaults(String[] configTypeStringArrayWithDefaults) {
		this.configTypeStringArrayWithDefaults = configTypeStringArrayWithDefaults;
	}

	

	public int[] getConfigTypeIntArrayWithDefaults() {
		return configTypeIntArrayWithDefaults;
	}

	public void setConfigTypeIntArrayWithDefaults(int[] configTypeIntArrayWithDefaults) {
		this.configTypeIntArrayWithDefaults = configTypeIntArrayWithDefaults;
	}

	public String getSpelWithSystemPropertiesValue() {
		return spelWithSystemPropertiesValue;
	}

	public void setSpelWithSystemPropertiesValue(String spelWithSystemPropertiesValue) {
		this.spelWithSystemPropertiesValue = spelWithSystemPropertiesValue;
	}

	public Map<String, Integer> getConfigTypeMap() {
		return configTypeMap;
	}

	public void setConfigTypeMap(Map<String, Integer> configTypeMap) {
		this.configTypeMap = configTypeMap;
	}

	
	
}
