package person.tsungfuxie.springreadpropertiesexercise.properties;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(value = "classpath:MyConfiguration.properties", ignoreResourceNotFound = true, encoding="UTF-8")
public class DemoReadProperties {
	
	@Value("${config.type.user.name}")
    private String configTypeUserName;

	@Value("${config.type.user.id}")
    private String configTypeUserId;
	
	@Value("${config.type.user.mail}")
    private String configTypeUserMail;
	
	@Value("${config.type.demo.default:this is a default value}")
    private String configTypeDemoDefault;
	
	@Value("${config.type.string.array:one,two,three}")
	private String[] configTypeStringArrayWithDefaults;
	
	@Value("${config.type.int.array:1,2,3}")
	private String[] configTypeIntArrayWithDefaults;
	
	@Value("#{systemProperties['os.name'] ?: 'my default system property value'}")
	private String spelWithSystemPropertiesValue;

	@Override
	public String toString() {
		return "DemoReadProperties [configTypeUserName=" + configTypeUserName + ", configTypeUserId=" + configTypeUserId
				+ ", configTypeUserMail=" + configTypeUserMail + ", configTypeDemoDefault=" + configTypeDemoDefault
				+ ", configTypeStringArrayWithDefaults=" + Arrays.toString(configTypeStringArrayWithDefaults)
				+ ", configTypeIntArrayWithDefaults=" + Arrays.toString(configTypeIntArrayWithDefaults)
				+ ", spelWithSystemPropertiesValue=" + spelWithSystemPropertiesValue + "]";
	}

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

	public String[] getConfigTypeIntArrayWithDefaults() {
		return configTypeIntArrayWithDefaults;
	}

	public void setConfigTypeIntArrayWithDefaults(String[] configTypeIntArrayWithDefaults) {
		this.configTypeIntArrayWithDefaults = configTypeIntArrayWithDefaults;
	}

	public String getSpelWithSystemPropertiesValue() {
		return spelWithSystemPropertiesValue;
	}

	public void setSpelWithSystemPropertiesValue(String spelWithSystemPropertiesValue) {
		this.spelWithSystemPropertiesValue = spelWithSystemPropertiesValue;
	}

	
	
}
