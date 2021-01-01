public abstract class BaseSO implements Serializable {

    private static final long serialVersionUID = 8941946098561710546L;

    @Override
    public String toString() {
        return ToStringUtil.reflectionToLogStringByFields(this);
    }
    
}
