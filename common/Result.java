/**
 * 泛型Result结果类
 */
public class Result<T> extends BaseSO {

    /** serial */
    private static final long serialVersionUID = -757959713205186605L;

    /** 是否成功。 */
    private boolean           success;
    
    /**是否可以重试*/
    private boolean           retry;

    /** 错误上下文。 */
    private ErrorContext      errorContext;

    /** 对象实例。 */
    private T                 resultObj;

    /**
     * 构造函数。
     */
    public Result() {
    }

    /**
     * 构造函数。
     * @param success 是否成功。
     * @param errorContext 错误上下文。
     * @param resultObj 对象实例。
     */
    public Result(boolean success, ErrorContext errorContext, T resultObj) {
        this.success = success;
        this.errorContext = errorContext;
        this.resultObj = resultObj;
    }
    
   /**
    * 构造函数-重试
    * @param success
    * @param retry
    * @param errorContext
    * @param resultObj
    */
    public Result(boolean success, boolean retry,ErrorContext errorContext, T resultObj) {
        this.success = success;
        this.retry = retry;
        this.errorContext = errorContext;
        this.resultObj = resultObj;
    }

    /**
     * Getter method for property <tt>success</tt>.
     * 
     * @return property value of success
     */
    public boolean isSuccess() {
        return success;
    }

    /**
     * Setter method for property <tt>success</tt>.
     * 
     * @param success value to be assigned to property success
     */
    public void setSuccess(boolean success) {
        this.success = success;
    }

    /**
     * Getter method for property <tt>errorContext</tt>.
     * 
     * @return property value of errorContext
     */
    public ErrorContext getErrorContext() {
        return errorContext;
    }

    /**
     * Setter method for property <tt>errorContext</tt>.
     * 
     * @param errorContext value to be assigned to property errorContext
     */
    public void setErrorContext(ErrorContext errorContext) {
        this.errorContext = errorContext;
    }

    /**
     * Getter method for property <tt>resultObj</tt>.
     * 
     * @return property value of resultObj
     */
    public T getResultObj() {
        return resultObj;
    }

    /**
     * Setter method for property <tt>resultObj</tt>.
     * 
     * @param resultObj value to be assigned to property resultObj
     */
    public void setResultObj(T resultObj) {
        this.resultObj = resultObj;
    }

    /**
     * Getter method for property <tt>retry</tt>.
     * 
     * @return property value of retry
     */
    public boolean isRetry() {
        return retry;
    }

    /**
     * Setter method for property <tt>retry</tt>.
     * 
     * @param retry value to be assigned to property retry
     */
    public void setRetry(boolean retry) {
        this.retry = retry;
    }
    
}
