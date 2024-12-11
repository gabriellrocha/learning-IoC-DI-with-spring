@Component | Marca uma classe como 'Bean' gerenciado, o Spring detecta essa classe automaticamente durante o 
escaneamento do pacote (component scanning) e a registra como um componente que pode ser injetado em outros lugares
da aplicação. É uma annotation genérica usada principalmente para indicar que a classe é um componente básico.
Outras annotations como `@Service`, `@Repository`, `@Controller` são especializadas de @Component, usadas para indicar
papéis específicos no contexto da uma aplicação Spring.