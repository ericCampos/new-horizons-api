package dev.ericcampos.newhorizons.shared.infrastructure.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * TEMPORARY open security, only until day 3 (JWT + roles lesson).
 * <p>
 * Why it exists: adding spring-boot-starter-security locks every endpoint by default (401),
 * which would block the day 1 "curl returns JSON" milestone before security has been taught.
 * Why it is acceptable: the API only listens on 127.0.0.1 (server.address), never on the internet.
 * Day 3 replaces this class with the real JWT filter chain.
 */
@Configuration
class SecurityConfig {

    @Bean
    SecurityFilterChain openUntilDay3(HttpSecurity http) throws Exception {
        return http
                .csrf(csrf -> csrf.disable())
                .authorizeHttpRequests(auth -> auth.anyRequest().permitAll())
                .build();
    }
}
