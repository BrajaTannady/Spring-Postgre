package com.example.springpostgre.api.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springpostgre.api.model.Item;
import com.example.springpostgre.api.repository.ItemRepository;

@RestController
public class ItemController {
	@Autowired
	ItemRepository repository;
	
	@RequestMapping("/insertItem")
	public String insertItem() {
//		repository.save(new Item("Samsung", 10, "Merah"));
//		repository.save(new Item("Oppo", 15, "Putih"));
//		repository.save(new Item("XiaoMi", 20, "Biru"));
//		repository.save(new Item("Iphone", 25, "Kuning"));
		return "Done";
	}
	
	@RequestMapping("/findAllItem")
	public String findAllItem(){
		String result = "<html>";
		
//		for(Item item : repository.findAll()) {
//			result += "<div>" + item.toString() + "</div>";
//		}
		return result + "</html>";
	}
	
	@RequestMapping("/findItemId")
	public String findItemById(@RequestParam("item_id") String id) {
		String result = "";
//		result = repository.findById(id).toString();
		return result;
	}
	
}
