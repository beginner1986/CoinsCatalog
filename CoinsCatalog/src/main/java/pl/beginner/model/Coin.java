package pl.beginner.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;

@Getter
@Entity
@Table(name = "coins")
public class Coin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String name;
	private String code;
	private String year;
	private String diameter;
	private String shape;
	private String inscription;
	private String circulation;
	private String metal;
	private String fineness;
	private String weight;
	private String stamp;
	private String border;
	private String comment;
	private String photo;
}
