package specification.newfilter;

import java.util.List;
import java.util.stream.Collectors;

import specification.domain.Product;

public class BetterProductFilter implements Filter<Product> {

	@Override
	public List<Product> filter(List<Product> items, Specification<Product> specification) {
		return items.stream().filter(p -> specification.isSatisfied(p)).collect(Collectors.toList());
	}

}
