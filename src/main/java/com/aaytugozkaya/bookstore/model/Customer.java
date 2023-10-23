package com.aaytugozkaya.bookstore.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
import org.springframework.context.annotation.Primary;

@Table
@Data
@Getter
@Setter
@Builder
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Customer {


        @Id
        private int Id;
        private String name;
        private String surname;
        private String email;
        private String password;
        private String phone;

}
