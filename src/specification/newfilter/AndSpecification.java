package specification.newfilter;

import specification.domain.Product;

public class AndSpecification implements Specification<Product> {
	
	private Specification<Product> left;
	private Specification<Product> right;
	
	public AndSpecification(Specification<Product> left, Specification<Product> right) {
		this.left = left;
		this.right = right;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return left.isSatisfied(item) && right.isSatisfied(item);
	}

}
