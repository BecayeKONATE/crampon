package com.saraya.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.saraya.model.Crampon;

@Service
public class CramponService {
	private static List<Crampon> cramp = new ArrayList<Crampon>();
	private static int count = 7;
	
	static {
		cramp.add(new Crampon(1, "Nike", "https://www.prodirectsoccer.com/fr/ProductImages/Thumbs/244072_thumb_0946155.jpg?impolicy=thumb&imwidth=356"));
		cramp.add(new Crampon(2, "Adidas", "https://www.footballbootsdb.com/logos/boots/2021/07/60f0861c66a97.jpg"));
		cramp.add(new Crampon(3, "New Balance", "https://www.sportbusinessmag.com/wp-content/uploads/2021/05/raheem-sterling-new-balance-partnership-official-08.jpg"));
		cramp.add(new Crampon(4, "Puma", "https://m.media-amazon.com/images/I/71YLZ9nyhzL._AC_UY500_.jpg"));
		cramp.add(new Crampon(5, "CR7", "https://i0.wp.com/www.luxe.net/wp-content/uploads/2015/01/mercurial-cr7-rare-gold-1.jpg"));
		cramp.add(new Crampon(6, "Nike Mercura", "https://www.footpack.fr/wp-content/uploads/2021/01/nike-mercurial-superfly-7-chosen-2-mbappe-lebron-james-1-scaled.jpg"));
		cramp.add(new Crampon(7, "Adidas Predator", "https://www.footballbootsdb.com/fr/logos/boots/2021/04/60817d26f11ab.jpg"));
	}
	
	public List<Crampon> getAllCrampon(){
		return cramp;
	}
	
	public void addCrampon(String make, String image) {
		cramp.add(new Crampon(++count,make, image));
	}
	
	public void deleteCrampon(int id) {
		Iterator<Crampon> iterate = cramp.iterator();
		while(iterate.hasNext()) {
			Crampon crp = iterate.next();
			if(crp.getId() == id) {
				iterate.remove();
			}
		}
	}
	
	public Crampon seeCrampon(int id) {
		for (Crampon crmp : cramp) {
			if(crmp.getId() == id) {
				return crmp;
			}
		}
		return null;
	}
	
	public void update(Crampon crampon) {
		cramp.remove(crampon);
		cramp.add(crampon);
	}
}
