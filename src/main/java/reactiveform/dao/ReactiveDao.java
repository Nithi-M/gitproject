package reactiveform.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import reactiveform.entity.Reactiveform;
import reactiveform.repository.ReactiveformRepository;

@Repository
public class ReactiveDao {
	@Autowired
	ReactiveformRepository  rcrepo;
	
	public Reactiveform inset(Reactiveform r) {
		 return rcrepo.save(r);
		
	}
	
	public List<Reactiveform> get() {
		return rcrepo.findAll();

	}
	
	
	public Reactiveform getbyid(int n) {
		 return rcrepo.findById(n).get();
		
	}
	
	public Reactiveform update(Reactiveform m) {
		return rcrepo.save(m);
	}
	
	public Reactiveform delete(Reactiveform y) {
		 rcrepo.delete(y);
		 
		 return y;
	}
}
