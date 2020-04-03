package config;

public class EnvConfig {
    private static final String ENV = "educats.bntu.by";
    private static final String PORT = "Account";
    private static final String USERNAME = "foo";
    private static final String PASSWORD = "bar";
    public static final String URI_LOGIN = "https://educats.bntu.by/Account";
    public static final String URI_REGISTRATION = "https://"+ENV+"/"+PORT+"/Register";
    public static final String URI_REGISTRATION_API = "https://"+ENV+"/"+PORT+"/Register/api";
}
//https://educats.bntu.by/Account/Login