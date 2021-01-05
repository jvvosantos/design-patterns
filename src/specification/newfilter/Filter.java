package specification.newfilter;

import java.util.List;

public interface Filter<T> {
	
	public List<T> filter(List<T> items, Specification<T> specification);

}
