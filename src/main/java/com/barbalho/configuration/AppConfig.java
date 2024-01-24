package com.barbalho.configuration;

//@Configuration
//@EnableMethodSecurity
//public class AppConfig extends WebSecurityConfiguration{
//	
//	@Bean
//	SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{
//		
//		http.sessionManagement(management -> management.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//		.authorizeHttpRequests(authorize -> authorize.requestMatchers("/api/**")
//				.authenticated().anyRequest().permitAll())
//		.csrf(csrf -> csrf.disable())
//		.cors(cors -> cors.configurationSource(corsConfigurationSource()))
//		.formLogin(Customizer.withDefaults());
//		
//		return http.build();
//	}
//
//	private CorsConfigurationSource corsConfigurationSource() {		
//		
//		return new CorsConfigurationSource() {
//			
//			@Override
//			public CorsConfiguration getCorsConfiguration(HttpServletRequest request) {
//				CorsConfiguration cfg = new CorsConfiguration();
//				cfg.setAllowedOrigins(Collections.singletonList("*"));
//				cfg.setAllowedMethods(Collections.singletonList("*"));
//				cfg.setAllowedHeaders(Collections.singletonList("*"));
//				cfg.setExposedHeaders(Collections.singletonList("*"));
//				cfg.setMaxAge(3600L);
//				return cfg;
//			}
//		};
//	}

	
	
//}
