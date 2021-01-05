package specification;

import java.util.Arrays;
import java.util.List;

import specification.domain.Color;
import specification.domain.Product;
import specification.domain.Size;
import specification.newfilter.AndSpecification;
import specification.newfilter.BetterProductFilter;
import specification.newfilter.ColorSpecification;
import specification.newfilter.SizeSpecification;
import specification.oldfilter.ProductFilter;

public class Main {

	public static void main(String[] args) {
		Product p1 = new Product("Basketball", Color.RED, Size.MEDIUM);
		Product p2 = new Product("Cup", Color.WHITE, Size.SMALL);
		Product p3 = new Product("Comb", Color.BLACK, Size.XSMALL);
		Product p4 = new Product("Box", Color.BLUE, Size.LARGE);
		Product p5 = new Product("Shoes", Color.RED, Size.SMALL);
		Product p6 = new Product("T-shirt", Color.BLUE, Size.XLARGE);
		Product p7 = new Product("Shorts", Color.RED, Size.MEDIUM);
		Product p8 = new Product("Socks", Color.WHITE, Size.SMALL);
		Product p9 = new Product("Glasses", Color.BLACK, Size.SMALL);
		Product p10 = new Product("Plushie", Color.GREEN, Size.LARGE);

		List<Product> products = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);

		System.out.println("*** Using old filter ***");
		ProductFilter pf = new ProductFilter();

		System.out.println("Filtering by color RED");
		List<Product> filteredProducts = pf.filterByColor(products, Color.RED);
		System.out.println(filteredProducts);

		System.out.println("Filtering by size SMALL");
		filteredProducts = pf.filterBySize(products, Size.SMALL);
		System.out.println(filteredProducts);
		
		System.out.println("Filtering by color RED and size SMALL");
		filteredProducts = pf.filterByColorAndSize(products, Color.RED, Size.SMALL);
		System.out.println(filteredProducts);
		
		System.out.println();
		System.out.println();
		
		System.out.println("*** Using new filter ***");
		BetterProductFilter bpf = new BetterProductFilter();
		
		System.out.println("Filtering by color RED");
		ColorSpecification colorSpec = new ColorSpecification(Color.RED);
		filteredProducts = bpf.filter(products, colorSpec);
		System.out.println(filteredProducts);

		System.out.println("Filtering by size SMALL");
		SizeSpecification sizeSpec = new SizeSpecification(Size.SMALL);
		filteredProducts = bpf.filter(products, sizeSpec);
		System.out.println(filteredProducts);
		
		System.out.println("Filtering by color RED and size SMALL");
		filteredProducts = bpf.filter(products, new AndSpecification(colorSpec, sizeSpec));
		System.out.println(filteredProducts);
		
	}

}
