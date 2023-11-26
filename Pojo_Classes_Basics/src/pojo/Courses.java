package pojo;

import java.util.List;

// Since the Courses part of our API has nested JSON so we created a seperate Courses.java file
public class Courses {
    // Again in each course we have a json containing course title and price so we created a seperate file for each course.
    // A seperate WebAutomation.java is created to store the contents of webAutomation course.
	private List<WebAutomation> webAutomation;

    // A seperate Api.java is created to store the contents of api course.
	private List<Api> api;

    // A seperate Mobile.java is created to store the contents of mobile course.
	private List<Mobile> mobile;

	public List<WebAutomation> getWebAutomation() {
		return webAutomation;
	}
	public void setWebAutomation(List<WebAutomation> webAutomation) {
		this.webAutomation = webAutomation;
	}

	public List<Api> getApi() {
		return api;
	}
	public void setApi(List<Api> api) {
		this.api = api;
	}
    
	public List<Mobile> getMobile() {
		return mobile;
	}
	public void setMobile(List<Mobile> mobile) {
		this.mobile = mobile;
	}


	

}
