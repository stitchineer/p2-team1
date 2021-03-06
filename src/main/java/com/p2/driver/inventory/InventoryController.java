package com.p2.driver.inventory;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.p2.driver.ordercontents.OrderContents;

@RestController
@RequestMapping("/inventory")
@CrossOrigin("*")
public class InventoryController {

	@Autowired
	InventoryService inventoryService;
	
	@GetMapping
	public List<Inventory> getAllInventory(){
		return inventoryService.getAllInventory();	
	}
	
	@GetMapping("/{id}")
	public Optional<Inventory> getItemById(@PathVariable(required = true) int id){
		System.out.println("hello");
		System.out.println(inventoryService.getItemById(id));
		return inventoryService.getItemById(id);
	}
	
	@PostMapping
	public void addItem(@RequestBody Inventory inventory) {
		inventoryService.addItem(inventory);
	}
	
	@PutMapping("/updateinventory/{id}")
	public String updateQuantity(@PathVariable(value = "id") Integer id, @RequestBody Inventory inventory){
		System.out.println(id);
		return inventoryService.updateQuantity(inventory, id);
	}
	
}

