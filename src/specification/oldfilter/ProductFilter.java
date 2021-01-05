package specification.oldfilter;

import java.util.List;
import java.util.stream.Collectors;

import specification.domain.Color;
import specification.domain.Product;
import specification.domain.Size;

/**
 * Filter without using design pattern, not reusable 
 * */
public class ProductFilter {
	
	public List<Product> filterByColor(List<Product> products, Color color) {
		return products.stream().filter(p -> p.getColor() == color).collect(Collectors.toList());
	}
	
	public List<Product> filterBySize(List<Product> products, Size size) {
		return products.stream().filter(p -> p.getSize() == size).collect(Collectors.toList());
	}
	
	public List<Product> filterByColorAndSize(List<Product> products, Color color, Size size) {
		return products.stream().filter(p -> p.getColor() == color && p.getSize() == size).collect(Collectors.toList());
	} 
	
	// everytime we need to filter new data we basically have to copy and paste old code with little modification
	// not good... and repetitive

}
