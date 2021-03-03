package br.com.rogerioreis.dadospessoais;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.rogerioreis.dadospessoais.model.Pessoa;
import br.com.rogerioreis.dadospessoais.model.PessoaDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController // faz a classe se comportar como webservice
@RequestMapping("/dadospessoais") // esta notação configura a url do webservice
@Api(value = "API Rest Pessoa")
public class PessoaRest {
	
	@Autowired // aqui é injetado uma instância da classe PessoaDao
	private PessoaDao pessoaDao;
	
	@GetMapping("/pessoas") // expõe o método get
	@ApiOperation(value = "Retorna uma lista de pessoas")
	public List<Pessoa> lista (){	
		return pessoaDao.findAll();
	}
	
	@PostMapping // expõe o método post
	@ApiOperation(value = "Salva e atualiza uma pessoa")
	public void post (@RequestBody Pessoa pessoa) {
		pessoaDao.save(pessoa);
	}
	
	@DeleteMapping ("/{id}")
	@ApiOperation(value = "Deleta uma pessoa")
	public void delete (@PathVariable ("id") Long id) {
		pessoaDao.deleteById(id);
	}
}
