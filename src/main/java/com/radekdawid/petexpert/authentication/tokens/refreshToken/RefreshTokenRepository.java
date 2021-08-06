package com.radekdawid.petexpert.authentication.tokens.refreshToken;

import com.radekdawid.petexpert.users.user.model.User;
import org.jetbrains.annotations.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {

    @NotNull
    Optional<RefreshToken> findById(@NotNull Long id);
    Optional<RefreshToken> findByToken(String token);
    Optional<RefreshToken> findRefreshTokenByUser(User user);

    void deleteByUser(User user);
}
