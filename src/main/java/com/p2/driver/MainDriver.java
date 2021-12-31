package com.p2.driver;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.p2.dao.LoginsDAO;
import com.p2.dao.OrderContentsDAO;
import com.p2.dao.OrdersDAO;
import com.p2.model.OrderContents;
import com.p2.model.Orders;

import com.p2.dao.InventoryDAO;
import com.p2.dao.LoginsDAO;
import com.p2.model.Inventory;
import com.p2.util.HibernateSessFact;

@SpringBootApplication

public class MainDriver {
	static Session session;
	static Integer results;

		public static void main(String[] args) {
			SpringApplication.run(MainDriver.class, args);

			OrdersDAO orderDao = new OrdersDAO();
			OrderContentsDAO odc = new OrderContentsDAO();
			OrderContents item = new OrderContents(5, "Matcha Cake", 50);
			System.out.println(odc.addToExistingOrderContents(1, null));
			
			//I wrote this method in LoginsDAO to avoid clogging up the main driver
			//LoginsDAO.colleenLoginMethodTesting();
			
			/*
			Inventory inventory = new Inventory(1,"cheesecake",25);
			InventoryDAO inventoryDAO = new InventoryDAO();
			inventoryDAO.updateInventory(inventory);
//			*/
//			Inventory inventory = new Inventory();
//			InventoryDAO inventoryDAO = new InventoryDAO();
//			inventoryDAO.trying();
//			
			

		}
}
