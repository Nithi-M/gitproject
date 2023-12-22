package reactiveform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import reactiveform.dao.ReactiveDao;
import reactiveform.entity.Reactiveform;

@Service
public class ReactiveformService {
	@Autowired
	ReactiveDao rcdao;
	
	public Reactiveform inset(Reactiveform r) {
		return rcdao.inset(r);
	}
public List<Reactiveform> get() {
	return rcdao.get();
}

public Reactiveform getbyid(int n) {
	return rcdao.getbyid(n);
}

public Reactiveform update (Reactiveform m) {
	return rcdao.update(m);
}
	
public Reactiveform delete (Reactiveform y) {
	return rcdao.delete(y);
}
}
