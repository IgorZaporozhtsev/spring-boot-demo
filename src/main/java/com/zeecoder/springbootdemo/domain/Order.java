package com.zeecoder.springbootdemo.domain;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "internal_order")
@NamedEntityGraph(name = "Order.items",
        attributeNodes = @NamedAttributeNode("items")
)
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    private List<Item> items = new ArrayList<>();

}
