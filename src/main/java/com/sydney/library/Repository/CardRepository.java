package com.sydney.library.Repository;

import com.sydney.library.Model.Card;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CardRepository extends JpaRepository<Card,Integer> {
}
