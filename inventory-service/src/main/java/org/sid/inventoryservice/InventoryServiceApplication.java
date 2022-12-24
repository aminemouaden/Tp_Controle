package org.sid.inventoryservice;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository productRepository){
		return args -> {
			productRepository.save(new Product(null,"Tel",2400,13));
			productRepository.save(new Product(null,"Chargeur",200,10));
			productRepository.save(new Product(null,"Laptop",7000,7));
			productRepository.save(new Product(null,"Manette",60,6));
			productRepository.save(new Product(null,"Souris",20,20));
			productRepository.save(new Product(null,"Clavier",20,9));
			productRepository.save(new Product(null,"cable HDMI",50,3));
			productRepository.save(new Product(null,"cable RJ45",20,15));
			productRepository.findAll().forEach(p->{
				System.out.println(p.getName());
			});
		};
	}


}

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
class Product{
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private double price;
	private double quantity;

}
@RepositoryRestResource
interface  ProductRepository extends JpaRepository<Product,Long>{

}
