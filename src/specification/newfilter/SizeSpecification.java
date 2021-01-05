package specification.newfilter;

import specification.domain.Product;
import specification.domain.Size;

public class SizeSpecification implements Specification<Product> {
	
	private Size size;
	
	public SizeSpecification(Size size) {
		this.size = size;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return size == item.getSize();
	}

}
