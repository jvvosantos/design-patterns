package specification.newfilter;

import specification.domain.Color;
import specification.domain.Product;

public class ColorSpecification implements Specification<Product> {
	
	private Color color;
	
	public ColorSpecification(Color color) {
		this.color = color;
	}

	@Override
	public boolean isSatisfied(Product item) {
		return color == item.getColor();
	}

}
