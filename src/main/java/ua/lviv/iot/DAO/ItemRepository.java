package ua.lviv.iot.DAO;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.models.cosmeticTools.goods.MakeupBrushes;

@Repository
public interface ItemRepository extends CrudRepository<MakeupBrushes, Integer> {

}
