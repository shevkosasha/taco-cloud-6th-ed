package tacos.db.jdbc.repository;

import tacos.models.TacoOrder;

public interface OrderRepositoryJdbc {

    TacoOrder save(TacoOrder order);
}
