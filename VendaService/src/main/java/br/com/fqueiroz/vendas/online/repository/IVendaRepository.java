/**
 * 
 */
package br.com.fqueiroz.vendas.online.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import br.com.fqueiroz.vendas.online.domain.Venda;

/**
 * @author filipe.queiroz
 *
 */
@Repository
public interface IVendaRepository extends MongoRepository<Venda, String>{

	Optional<Venda> findByCodigo(String codigo);
}
