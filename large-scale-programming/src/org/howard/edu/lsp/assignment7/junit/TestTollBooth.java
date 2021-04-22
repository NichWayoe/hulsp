package org.howard.edu.lsp.assignment7.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.howard.edu.lsp.assignment7.tollboot.AccraTollBooth;
import org.howard.edu.lsp.assignment7.tollboot.HondaTruck;
import org.howard.edu.lsp.assignment7.tollboot.KiaTruck;
import org.howard.edu.lsp.assignment7.tollboot.TollBooth;
import org.howard.edu.lsp.assignment7.tollboot.Truck;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class TestTollBooth {
	TollBooth booth;
	Truck kia;
	Truck honda;

	@BeforeEach
	void setUp() {
		booth = new AccraTollBooth();
		kia = new KiaTruck(10, 1200);
		honda = new HondaTruck(5, 5000);
	}

	@DisplayName("Test cases for CalculateToll")
	@Test
	void TestCalculateToll() {
		assertEquals(booth.calculateToll(honda), 25025);
		assertEquals(booth.calculateToll(kia), 6050);
		assertNotEquals(booth.calculateToll(honda), 250000);
		assertNotEquals(booth.calculateToll(kia), 70000);
	}

	@DisplayName("Test cases for PayToll")
	@Test
	void TestPayToll() {
		booth.payToll(9000);
		assertEquals(booth.getTotalReceipts(), 9000);
		booth.payToll(9000);
		assertEquals(booth.getTotalReceipts(), 18000);
		assertNotEquals(booth.getTotalReceipts(), 9000);
	}

	@DisplayName("Test cases for Reset")
	@Test
	void TestReset() {
		double toll = booth.calculateToll(honda);
		booth.payToll(toll);
		booth.reset();
		assertEquals(booth.getTotalReceipts(), 0);
		assertNotEquals(booth.getTotalReceipts(), toll);
	}

	@DisplayName("Test cases for loadWeight")
	@Test
	void TestloadWeight() {
		kia.loadItems(100);
		honda.loadItems(50);

		assertEquals(kia.getweight(), 1300);
		assertEquals(honda.getweight(), 5050);
	}

	@DisplayName("Test cases for unloadWeight")
	@Test
	void TestUnloadWeight() {

		kia.unloadItems(100);
		honda.unloadItems(50);
		assertEquals(honda.getweight(), 5000);
		assertEquals(kia.getweight(), 1200);
		honda.loadItems(5000);
		kia.loadItems(200);

		kia.unloadItems(100);
		honda.unloadItems(300);
		assertEquals(honda.getweight(), 9700);
		assertEquals(kia.getweight(), 1300);

	}

	@DisplayName("Test cases for unloadWeight")
	@Test
	void TestOffAllWeight() {
		kia.offLoadAllitems();
		honda.offLoadAllitems();
		assertEquals(kia.getweight(), 1200);
		assertEquals(honda.getweight(), 5000);
	}

	@DisplayName("Test cases for DisplayData")
	@Test
	void TestDisplayData() {
		double toll = booth.calculateToll(honda);
		booth.payToll(toll);
		String message = "Total since last collection - Receipts: $" +toll + " Trucks: " + booth.getTotalNUmberOfTrucks();
		assertEquals(booth.displayData(), message);
	}

	@DisplayName("Test cases for toString")
	@Test
	void TesttoString() {
		String message = "Total since last collection - Receipts: $" + booth.getTotalReceipts() + " Trucks: " + booth.getTotalNUmberOfTrucks();
		assertEquals(booth.toString(), message);
	}

	@AfterEach
	void tearDown() {
		booth = null;
		kia = null;
		honda = null;

	}


}
