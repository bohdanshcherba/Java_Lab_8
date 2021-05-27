package ua.lviv.iot.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.lviv.iot.models.cosmeticTools.goods.MakeupBrushes;

@Repository
public interface ItemRepository extends JpaRepository<MakeupBrushes, Integer> {

}
