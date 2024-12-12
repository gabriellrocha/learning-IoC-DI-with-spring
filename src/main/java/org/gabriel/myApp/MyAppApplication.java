package org.gabriel.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args); // Isto cria um Container IoC

		/* O container IoC (Inversion of Control) é o núcleo do ‘Framework’, ele gerencia os objetos da aplicação
		também chamados 'Beans', controlando o seu ciclo de vida e também a suas dependências */


//		Developer developer = new Developer();
//		developer.build();
		/* Aqui crio um objeto normalmente, mas "dentro" da JVM e não do container IoC, então será
		minha responsabilidade gerenciá-lo*/

		// 'Por debaixo dos panos o Spring Framework funciona assim....
		// Veja aqui não uso new

		Developer developer1 = context.getBean(Developer.class); // lembre-se de dizer ao Spring quais classes ele irá gerenciar @Component
		developer1.build();
	}

}
