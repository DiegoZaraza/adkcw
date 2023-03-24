# ADKCW-WP 
Project designed for the automation of the website [ADKCW-WP](https://adkcw-wp.adkalpha.com/contact/)

### What you’ll need
+ A favorite text editor or IDE
+ JDK 8 or later
+ Install Gradle

### Install Gradle
+ **On Unix**

```
$ sudo add-apt-repository ppa:cwchien/gradle
$ sudo apt-get update
$ sudo apt-get install gradle
```


+ **On Mac OS X**
    + `brew install gradle`

    + [Install Homebrew](http://brew.sh/).


+ **On Windows**

  + [Download from Gradle site](https://docs.gradle.org/current/userguide/installation.html).

  + Unzip the Gradle download to the folder to which you would like to install Gradle, eg. “C:\Program Files”. The subdirectory gradle-x.x will be created from the archive, where x.x is the version.

  + Add location of your Gradle “bin” folder to your path. Open the system properties (WinKey + Pause), select the “Advanced” tab, and the “Environment Variables” button, then add “C:\Program Files\gradle-x.x\bin” (or wherever you unzipped Gradle) to the end of your “Path” variable under System Properties. Be sure to omit any quotation marks around the path even if it contains spaces. Also make sure you separated from previous PATH entries with a semicolon “;”.

  + In the same dialog, make sure that JAVA_HOME exists in your user variables or in the system variables and it is set to the location of your JDK, e.g. C:\Program Files\Java\jdk1.7.0_06 and that %JAVA_HOME%\bin is in your Path environment variable.

  + Open a new command prompt (type cmd in Start menu) and run gradle –version to verify that it is correctly installed.
  
### To test the Gradle installation, run Gradle from the command-line: `gradle`
+ If all goes well, you see a welcome message:
```
:help

Welcome to Gradle 2.8.

To run a build, run gradle <task> ...

To see a list of available tasks, run gradle tasks

To see a list of command-line options, run gradle --help

To see more detail about a task, run gradle help --task <task>

BUILD SUCCESSFUL

Total time: 6.317 secs
```

+  You now have Gradle installed.

## Get the code

Git:

    Whit SSH
    git clone git@github.com:DiegoZaraza/adkcw.git
    cd adkcw
    
    With HTTPS
    git clone git@github.com:DiegoZaraza/adkcw.git
    cd adkcw
    
Or simply [download a zip](https://github.com/DiegoZaraza/adkcw/archive/refs/heads/main.zip) file

## Execution
For execute the project you must use:
    
    gradle cucumber
    

# Questions

1. **Would you implement a security layer for the routine?**

Yes, it is possible to implement a security layer where sensitive information such as users and passwords are encrypted for test access.

2. **What raw data will be required?**

For a contact form it is not necessary since it can handle information created in the same execution, although it is necessary to test fields with some specific information if it would be necessary to have it also secure so that only the methods can access it.

3. **Sketch a set of test conditions and link its test cases.**


For the page it is important to validate 
* Verify that all required form fields are present and labeled correctly

**Test case 1:** Verify that the name, email, and message fields are present and labeled correctly 

* Verify that the form input is validated to prevent invalid input

**Test case 2:** Verify that an error message is displayed when a user submits an empty form
**Test case 3:** Verify that an error message is displayed when an invalid email address is entered 
* Verify that the form submission is successful

**Test case 4:** Verify that a success message is displayed when the form is submitted successfully


4. **Does Selenium allow you to check the API call when clicking the “submit” contact form button.**

It is quite a complex issue to handle from selenium since it is designed for UI interaction, However, you can use tools such as browser plugins or network monitoring tools to inspect the API call.

5. **Is there a way to avoid manually entering the basic auth credentials?**

If by adding them with the url in this format it can be done ```http://username:password@example.com```