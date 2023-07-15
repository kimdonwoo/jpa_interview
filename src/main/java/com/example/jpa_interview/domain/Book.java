package com.example.jpa_interview.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {

    // javax.persistence
    @Id
    @GeneratedValue
    private Integer id;

    @Setter
    private String title;

    @ManyToOne
    @Setter @Getter
    private BookStore bookStore;

    /*
        @Setter는 클래스에 달지마라..

         mappedby 설정안하면 중간꺼 하나 생김
            -> 왜 안됨 ? 저 테이블은 우리가 관리할 수 없는 테이블임 저 테이블에 참조가 되어 있지 않음 ORM
            -> 중간 단계에 테이블이 있으면 join할 떄 한번더 걸어야함 => 오버헤드 증가함
                =>장애의 90퍼 센트는 RDBMS 문제
         즉, 중간 테이블을 없애기 위해서 연관관계 주인을 정해야함..
             mappedby는 주인이 아닌 쪽에 달아야 함
     */


}
