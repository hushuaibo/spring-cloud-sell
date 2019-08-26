package cn.algerfan.order.repository;

import cn.algerfan.order.domain.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author algerfan
 * @time 2019 17: 21
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail, Integer> {
}