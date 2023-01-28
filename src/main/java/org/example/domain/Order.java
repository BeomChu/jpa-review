package org.example.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS") //order라는 테이블을 가지고있는 database가 있음
public class Order {

    @Id
    private Long id;

    private Long memberId;

    private LocalDateTime orderDate;

    // ORDINAL 설정시에 데이터베이스에 0,1 등으로 저장되는데 enum순서 변경 혹은 추가시 위험할 수 있음
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
