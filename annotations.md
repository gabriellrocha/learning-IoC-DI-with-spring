O que é Bean? No Spring Bean é um objeto gerenciado pelo container IoC. Ele é uma instância de classe configurada,
inicializada e controlada pelo Spring. Ou seja, o IoC cria e gerência o seu ciclo de vida (desde a criação até a destruição)
Escopo do Bean - Os beans podem ter diferentes escopos, como `singleton`( uma única instância p/ toda a aplicação) ou
`prototype` (uma nova instância a cada solicitação)
Bean = Objeto


@Component | Marca uma classe como 'Bean' gerenciado, o Spring detecta essa classe automaticamente durante o 
escaneamento do pacote (component scanning) e a registra como um componente que pode ser injetado em outros lugares
da aplicação. É uma annotation genérica usada principalmente para indicar que a classe é um componente básico.
Outras annotations como `@Service`, `@Repository`, `@Controller` são especializadas de @Component, usadas para indicar
papéis específicos no contexto dá aplicação Spring.

@Autowired | Indica onde injetar uma dependência em um Bean - field, constructor (default), setter

@Primary | Indica qual _bean_ deve ser priorizado quando houver múltiplos candidatos para injeção de dependência
do mesmo tipo

@Qualifier | Usado para indicar qual _bean_ deve ser injetado quando há múltiplas opções disponíveis. Análogo à @Primary
na funcionalidade, mas tem contextos de aplicação diferentes. O primeiro define um _bean_ padrão no momento que ele é
registrado no contêiner IoC, enquanto @Qualifier é usado localmente, no ponto onde a injeção ocorre. Sempre terá prioridade
sobre @Primary.

@Lazy | Cria os Beans sob demanda, apenas quando for acessado pela primeira vez, continua a ser singleton por padrão


