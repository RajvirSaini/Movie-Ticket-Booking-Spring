package com.personal.project.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Theater {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private int rows;
    private int columns;
    

//    @OneToMany(mappedBy = "theater")
//    private List<Show> shows;

    public Theater() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Theater(Long id, String name, String location, int rows, int columns) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.rows = rows;
		this.columns = columns;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getLocation() {
		return location;
	}


	public void setLocation(String location) {
		this.location = location;
	}


	public int getRows() {
		return rows;
	}


	public void setRows(int rows) {
		this.rows = rows;
	}


	public int getColumns() {
		return columns;
	}


	public void setColumns(int columns) {
		this.columns = columns;
	}
    
    
}
