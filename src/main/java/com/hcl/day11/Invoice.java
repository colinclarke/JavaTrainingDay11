package com.hcl.day11;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Invoice {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;

	@Override
	public String toString() {
		return String.format(
				"Part Number: %-10.10s Part Description: %-20.20s Quantity: %-10d Price Per Item: $%-10.2f", partNumber,
				partDescription, quantity, pricePerItem);
	}

}
