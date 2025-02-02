/**
 * 
 */
package br.com.fqueiroz.vendas.online.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

/**
 * @author filipe.queiroz
 *
 */
@Configuration
@EnableMongoRepositories(basePackages = "br.com.fqueiroz.vendas.online.repository")
public class MongoConfig {

}
