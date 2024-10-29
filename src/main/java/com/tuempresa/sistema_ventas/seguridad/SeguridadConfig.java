package com.tuempresa.sistema_ventas.seguridad;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import static org.springframework.security.config.Customizer.withDefaults;

@Configuration
public class SeguridadConfig {

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    
        http
            .csrf(csrf -> csrf.disable())  
            .authorizeHttpRequests(auth -> auth
                .requestMatchers("/api/productos/**").permitAll()  
                .requestMatchers("/api/empresas/**").permitAll()  
                .requestMatchers("/api/contactos/**").permitAll() 
                .requestMatchers("/api/pedidos/**").permitAll()  
                .requestMatchers("/api/usuarios/**").permitAll() 
                .anyRequest().authenticated())  
            .httpBasic(withDefaults());  

        return http.build();
    }
}

