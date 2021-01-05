package specification.newfilter;

public interface Specification<T> {
	
	public boolean isSatisfied(T item);
	
}
