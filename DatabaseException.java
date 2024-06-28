// this is the custom exception
public class DatabaseException extends Exception {
    
    public String errMsg;
    public DatabaseException(String msg)
    { 
        errMsg = "DB exception:" + msg;
    }
    
    public String getErrMessage()
    {
        return errMsg;
    }
}
