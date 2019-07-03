package com.example.URL_Board;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@NoArgsConstructor
@RequiredArgsConstructor
@ToString
@Setter
@Getter
public class URL {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	/*
	@Column(unique=true, nullable=false)
	@NonNull
	private String url;
	*/
	
	@Column
	private int count;
	
	@Column(nullable=false)
	@NonNull
	private String originalurl;
}