package com.demo.githubactions.service;

import com.demo.githubactions.dto.CreateItemDto;
import com.demo.githubactions.model.Item;
import com.demo.githubactions.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public Item createItem(CreateItemDto dto) {
        return itemRepository.save(dto.toEntity(dto));
    }
}
