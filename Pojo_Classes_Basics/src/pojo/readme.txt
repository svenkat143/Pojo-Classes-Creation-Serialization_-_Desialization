// Actual JSON Body on which the whole operation is performed.

{
    "instructor": "RahulShetty", 
    "url": "rahulshettycademy.com", 
    "services": "projectSupport", 
    "expertise": "Automation",
    "courses": {
        "webAutomation": [
            {
                "courseTitle": "Selenium Webdriver Java", 
                "price":"50"
            },
            {
                "courseTitle": "Cypress", 
                "price": "40"
            },
            {
                "courseTitle": "Protractor", 
                "price": "40"
            }
        ],
        "api": [
            {
                "courseTitle": "Rest Assured Automation using Java", 
                "price":"50"
            },
            {    
                "courseTitle": "SoapUI Webservices testing",
                "price": "40"
            }
        ],
        "mobile": [
            {
                "courseTitle": "Appium-Mobile Automation using Java",
                "price":"50"
            }
        ]
    },
    "linkedIn": "https://www.linkedin.com/in/rahul-shetty-trainer/"
}


From lines 3 to 41 is the actual json on which the pojo classes are created.
GetCourse.java is the main Pojo file.
Since in the courses part of json we have nested json so store them we created Courses.java file.
In each course like webAutomation, api, mobile we again have array of JSONs so store them we created 3 individula file: -
WebAutomation.java, Api.java, and Mobile.java.

Once the pojo classes are created they are utilized in the restassured in the Demo Folder. 

GetCourse.java,Courses.java, WebAutomation.java, Api.java, and Mobile.java all 5 Pojo files are created for the deserializeTest.java file of Demo.
AddPlace.java and Location.java Pojo files are created for the serializeTest.java file of Demo