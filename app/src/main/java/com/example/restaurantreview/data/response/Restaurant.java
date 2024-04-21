package com.example.restaurantreview.data.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class Restaurant{

	@SerializedName("pictureId")
	private String pictureId;

	@SerializedName("customerReview")
	private List<CustomerReviewItem> customerReview;

	@SerializedName("name")
	private String name;

	@SerializedName("rating")
	private Object rating;

	@SerializedName("description")
	private String description;

	@SerializedName("id")
	private String id;

	public String getPictureId(){
		return pictureId;
	}

	public List<CustomerReviewItem> getCustomerReview(){
		return customerReview;
	}

	public String getName(){
		return name;
	}

	public Object getRating(){
		return rating;
	}

	public String getDescription(){
		return description;
	}

	public String getId(){
		return id;
	}
}