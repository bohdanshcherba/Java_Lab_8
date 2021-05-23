package ua.lviv.iot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.ApplicationScope;
import ua.lviv.iot.DAO.ItemRepository;
import ua.lviv.iot.models.cosmeticTools.goods.MakeupBrushes;

import java.util.List;

@Service
@ApplicationScope
public class ItemService {

    @Autowired
    private ItemRepository itemRepository;

    public List<MakeupBrushes> getAllBrushes(){
        return (List<MakeupBrushes>) itemRepository.findAll();
    }

    public MakeupBrushes getBrush(Integer id){
        return itemRepository.findById(id).orElse(null);
    }

    public MakeupBrushes addBrush(MakeupBrushes brush){
        itemRepository.save(brush);
        return brush;
    }

    public MakeupBrushes updateBrush(MakeupBrushes brush) {
        itemRepository.save(brush);
        return brush;
    }

    public MakeupBrushes deleteBrush(Integer id) {
        MakeupBrushes brush = itemRepository.findById(id).orElse(null);
        itemRepository.deleteById(id);
        return brush;
    }

}
