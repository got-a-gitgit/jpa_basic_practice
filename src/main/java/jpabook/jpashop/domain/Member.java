package jpabook.jpashop.domain;

import javax.persistence.*;

@Entity
public class Member extends BaseEntity {

    @Id @GeneratedValue //설정값 생략하면 strategy가 AUTO로 적용된다
    @Column(name = "MEMBER_ID")
    private Long id;
    private String name;

    @Embedded
    private Address address;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
