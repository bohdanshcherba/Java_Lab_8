package ua.lviv.iot.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.lviv.iot.models.cosmeticTools.goods.MakeupBrushes;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
@RequestMapping(path = "/brushes/")
public class OrderController {

    private final Map<Integer, MakeupBrushes> brushes = new HashMap<>();

    private final AtomicInteger idCounter = new AtomicInteger();

    @GetMapping
    public List<MakeupBrushes>getBrushes() {
        return new LinkedList<MakeupBrushes>(brushes.values());
    }

    @GetMapping(path = "/{id}")
    public MakeupBrushes getBrushes(final @PathVariable("id") Integer brushesId) {
        return brushes.get(brushesId);
    }

    @PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
    public MakeupBrushes createBrushes(@RequestBody MakeupBrushes brush) {

        brush.setId(idCounter.incrementAndGet());
        this.brushes.put(brush.getId(), brush);

        return brush;
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<MakeupBrushes> deleteBrushes(@PathVariable("id") Integer brushesId) {
        HttpStatus status = brushes.remove(brushesId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;

        return ResponseEntity.status(status).build();
    }

    @PutMapping(path = "/{id}")
    public MakeupBrushes updateBrushes(final @PathVariable("id") Integer brushesId, final @RequestBody MakeupBrushes brush) {
        brush.setId(brushesId);
        return this.brushes.put(brush.getId(), brush);
    }

}


//{
//        "name":"sss",
//        "price":22,
//        "producer":"chine",
//        "professional":"true",
//        "lengthMm":22,
//        "rigidity":22
//
//        }