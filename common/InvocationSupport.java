public interface InvocationSupport<T, F> {

    /**
     * 结果转换
     * 
     * @param input
     * @return
     */
    Result<T> convertResult(F input);

    /**
     * 逻辑执行
     * 
     * @return
     */
    F apply();

}
