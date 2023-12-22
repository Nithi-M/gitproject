package reactiveform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactiveform.entity.Reactiveform;
import reactiveform.service.ReactiveformService;

@RestController
@RequestMapping(value="/form")
@CrossOrigin(origins="*")
public class ReactiveformController {
	@Autowired
	ReactiveformService recsrc;
	
	@PostMapping(value="/give")
	public Reactiveform inset(@RequestBody Reactiveform r) {
		return recsrc.inset(r);
	}
	
@GetMapping(value="/get")
public List<Reactiveform> get() {
	return recsrc.get();
}

@GetMapping(value="/getbyid/{n}")
public Reactiveform getbyid(@PathVariable int n) {
	return recsrc.getbyid(n);
}

@PutMapping(value="/update")
public Reactiveform update(@RequestBody Reactiveform m) {
	return recsrc.update(m);
}

@DeleteMapping(value="/delete/{y}")
public Reactiveform delete(@PathVariable Reactiveform  y) {
	return recsrc.delete(y);
}

}
