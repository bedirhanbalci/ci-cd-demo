package com.demo.githubactions.controller;

import com.demo.githubactions.dto.CreateItemDto;
import com.demo.githubactions.model.Item;
import com.demo.githubactions.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/items")
@RequiredArgsConstructor
public class ItemController {

    private final ItemService itemService;

    @PostMapping
    public Item createItem(@RequestBody CreateItemDto dto) {
        return itemService.createItem(dto);
    }
}
