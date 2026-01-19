package tacos.db.repository;

import tacos.models.TacoOrder;

public interface OrderRepository {

    TacoOrder save(TacoOrder order);
}
