package com.vidya.beans;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ImagesView {

	private List<String> images;

	@PostConstruct
	public void init() {
		images = new ArrayList<String>();
		for (int i = 1; i <= 9; i++) {
			images.add("DSC_" + i + ".jpg");
		}
	}

	public List<String> getImages() {
		return images;
	}
}
