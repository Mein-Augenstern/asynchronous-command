public abstract class BankInvocation<T> implements InvocationSupport<T, Result<T>> {

    @Override
    public Result<T> convertResult(Result<T> input) {
        return input;
    }

}
