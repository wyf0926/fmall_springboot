package edu.wyf.fmall.comparator;


import java.util.Comparator;

import edu.wyf.fmall.pojo.Product;

public class ProductReviewComparator implements Comparator<Product> {

	@Override
	public int compare(Product p1, Product p2) {
		return p2.getReviewCount()-p1.getReviewCount();
	}

}
