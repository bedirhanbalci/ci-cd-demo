package com.demo.githubactions.controller;

import com.demo.githubactions.service.ItemService;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.junit.jupiter.api.Assertions.*;

class ItemControllerTest {
    private ItemController itemController;

    @Mock
    private ItemService itemService;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        itemController = new ItemController(itemService);
    }


    @Test()
    public void createItem() {
        int a = 1;
        int b = 2;
        assertEquals(4, a + b);
    }

}