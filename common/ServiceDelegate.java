private final static Logger LOGGER = LoggerFactory.getLogger(ServiceDelegate.class);

    public static <T, F> T invoke(InvocationSupport<T, F> invocation) {
        F sourceResult = null;
        try {
            sourceResult = invocation.apply();
        } catch (Exception e) {
            LogUtils.error(LOGGER, "ServiceDelegate invoke throw a exception", e, true);
            throw new ThirdPartyException("rpc调用异常", ErrorContextUtil.rpcThrowoutException(
                    "rpc调用异常", null));
        }
        
        Result<T> result = invocation.convertResult(sourceResult);
        
        if (!result.isSuccess()) {
            LogUtils.error(LOGGER, String.format("调用外部系统的 facade 服务, 接口级回参显示调用结果为失败, errorContext=%s, traceId=%s",
                    result.getErrorContext().toString(), TracerContextUtil.getTraceId()));
        }
        
        ResultExceptionConvertUtil.throwException(result);
        
        return result.getResultObj();
    }
    
}
