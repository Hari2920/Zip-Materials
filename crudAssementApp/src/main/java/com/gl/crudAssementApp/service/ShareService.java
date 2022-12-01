package com.gl.crudAssementApp.service;

	import java.util.List;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Service;

	import com.gl.crudAssementApp.bean.CompanyShare;
	import com.gl.crudAssementApp.repository.CompanyShareRepository;





	@Service
	public class ShareService {	
		@Autowired
		private CompanyShareRepository repository;
		
		public void save(CompanyShare share) {
			repository.save(share);
		}
		public List<CompanyShare> findAll(){
			return repository.findAll();
		}
		
		public CompanyShare findById(Long id){
			return repository.getById(id);
		}
		
		public Long generateShareId(){
			Long val=repository.findMaxCompanyID();
			if(val==null)
				val=1000001L;
			else
				val=val+1;
			return val;
			}
		
		public void delete(long id) {
			repository.deleteById(id);
		}

	}


