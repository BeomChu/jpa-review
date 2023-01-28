package org.example.domain;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "ORDERS") //order라는 테이블을 가지고있는 database가 있음
public class Order {

    @Id
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public LocalDateTime getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(LocalDateTime orderDate) {
        this.orderDate = orderDate;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    @Column(name = "member_id")
    private Long memberId;

    //강의에서 1.8 이후로는 데이터베이스에 적용 가능하다고 봤음 강의 확인 후 수정
    private LocalDateTime orderDate;

    // ORDINAL 설정시에 데이터베이스에 0,1 등으로 저장되는데 enum순서 변경 혹은 추가시 위험할 수 있음
    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
