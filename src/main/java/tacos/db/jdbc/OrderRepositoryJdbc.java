package tacos.db.jdbc;

import tacos.models.h2.TacoOrder;

public interface OrderRepositoryJdbc {

    TacoOrder save(TacoOrder order);
}
