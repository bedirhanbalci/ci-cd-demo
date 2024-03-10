package com.demo.githubactions.dto;

import com.demo.githubactions.model.Item;
import lombok.Data;

@Data
public class CreateItemDto {

    private String name;

    private Double price;

    private String brand;

    private String category;

    public Item toEntity(CreateItemDto createItemDto) {
        return Item.builder()
                .name(createItemDto.getName())
                .price(createItemDto.getPrice())
                .brand(createItemDto.getBrand())
                .category(createItemDto.getCategory())
                .build();
    }
}
