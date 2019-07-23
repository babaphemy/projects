package net.myeverlasting.essladmin.service;

import java.util.List;

import net.myeverlasting.essladmin.entity.Merchant;

public interface MerchServ {
	public abstract List<Merchant> all();
	public abstract Merchant findOne(Long id);
	public abstract Merchant addOne(Merchant merch);
	public abstract List<Merchant> byOwner(Long id);
	

}
