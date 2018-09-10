package com.ideas2it.hospitalmanagement.commons;

/**
 * Constants Class is used to store all the constants in other parts of the 
 * application. It is created to reduce repeated Strings and code Size.
 *
 * @author   Rahul Ravi
 * @version  1.0
 */
public final class Constants {

    private Constants() {
    }

    public static final String NAME = "name";
    public static final String ROLE = "role";
    public static final String EMAIL = "email";
    public static final String LOGGER_PROPERTIES_LOCATION =
            "log4j.xml";
    public static final String HIBERNATE_CONFIG_FILE =
            "hibernate.cfg.xml";
    public static final String SIGNIN = "signin";
    public static final String SIGNIN_PASSWORD_FAIL_MESSAGE = "Sign-in Failed! Passwords Dont Match";
    public static final String SIGNIN_USER_FAIL_MESSAGE = "Sign-in Failed! User already registered";
    public static final String USER_FAIL = "userFail";
    public static final String SIGNIN_FAIL = "signinFail";
    public static final String SIGN_UP_SUCCESS = "signUpSuccess";
    public static final String SIGN_UP_SUCCESS_MESSAGE = "User successfully Registered!";
    public static final String SIGN_UP_FAIL = "signUpFail";
    public static final String SIGN_UP_FAIL_MESSAGE = "User Registration Failed! Try again Later";
    public static final String STYLES = "styles";
    public static final String IMAGES = "images";
    public static final String SCRIPT = "script";
    public static final String SIGNUP = "signup";
    public static final String LOGIN = "login";
    public static final String LOGIN_PATH = "/login";
    public static final String MAIN_MENU_PATH = "/main_menu";
    public static final String INDEX_PATH = "/WEB-INF/views/index.jsp";
    public static final String SIGNUP_PATH = "/signup";
    public static final String LOGOUT_PATH = "/logout";
    public static final String SIGNIN_EMAIL = "signinEmail";
    public static final String DATABASE_FAILURE = "Database Connection Error has Occured";
}
