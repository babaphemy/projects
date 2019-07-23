package net.myeverlasting.essladmin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.myeverlasting.essladmin.entity.Merchant;
import net.myeverlasting.essladmin.repository.MerchRepo;

@Service
public class MerchServImpl implements MerchServ {
	private MerchRepo merchRepo;
	

	public MerchServImpl(MerchRepo merchRepo) {
		super();
		this.merchRepo = merchRepo;
	}

	@Override
	public List<Merchant> all() {
		return merchRepo.findAll();
	}

	@Override
	public Merchant findOne(Long id) {
		return merchRepo.getOne(id);
	}

	@Override
	public Merchant addOne(Merchant merch) {
		return merchRepo.save(merch);
	}

	@Override
	public List<Merchant> byOwner(Long id) {
		return merchRepo.findByOwnerId(id);
	}

}
