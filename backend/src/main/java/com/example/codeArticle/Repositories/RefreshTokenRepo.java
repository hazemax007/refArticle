package com.example.codeArticle.Repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.codeArticle.Models.RefreshToken;

@Repository
public interface RefreshTokenRepo extends JpaRepository<RefreshToken, Long>{
    
    Optional<RefreshToken> findByToken(String token);

    void deleteByToken(String token);
}
