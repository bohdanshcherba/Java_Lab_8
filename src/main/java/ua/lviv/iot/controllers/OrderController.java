package ua.lviv.iot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.models.cosmeticTools.goods.MakeupBrushes;
import ua.lviv.iot.service.ItemService;

import java.util.*;

@RestController
@RequestMapping(path = "/brushes")
public class OrderController {

    @Autowired(required = false)
    private ItemService itemService;

    @GetMapping
    public List<MakeupBrushes> getAllBrushes() {
        return itemService.getAllBrushes();
    }

    @GetMapping("/{id}")
    public Object getBrush(@PathVariable(name = "id") Integer id) {
        if (itemService.getBrush(id) != null) {
            return itemService.getBrush(id);
        } else {
            return new ResponseEntity<MakeupBrushes>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping()
    public MakeupBrushes addBrush(@RequestBody MakeupBrushes brush) {
        return itemService.addBrush(brush);
    }


    @PutMapping()
    public Object updateBrush(@RequestBody MakeupBrushes brush) {
        if (itemService.getBrush(brush.getId()) != null) {
            return itemService.updateBrush(brush);
        } else {
            return new ResponseEntity<MakeupBrushes>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public Object deleteBrush(@PathVariable(name = "id") Integer id) {
        if (itemService.getBrush(id) != null) {
            return itemService.deleteBrush(id);
        } else {
            return new ResponseEntity<MakeupBrushes>(HttpStatus.NOT_FOUND);
        }
    }


}
