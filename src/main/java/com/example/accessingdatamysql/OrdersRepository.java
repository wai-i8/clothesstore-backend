package com.example.accessingdatamysql;

import java.util.List;
import org.springframework.data.jpa.repository.*;


// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface OrdersRepository extends JpaRepository<orders, Long> {

    @Query(value = "SELECT O FROM orders O WHERE user_id = ?1")
    List<orders>findUserOrders(Integer user_id);

}
