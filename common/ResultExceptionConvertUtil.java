/**
 * 把RPC结果的异常信息转成Runtime异常
 */
public class ResultExceptionConvertUtil {

    public static <T> void throwException(com.mybank.bkcommon.model.Result<T> result) {

        if (result == null) {
            throw new ThirdPartyException("RPC result is null!");
        }

        if (result.isSuccess()) {
            return;
        }
        
        throw new ThirdPartyException("业务 RPC 调用失败", result.getErrorContext(), result.isRetry());
    }

}
