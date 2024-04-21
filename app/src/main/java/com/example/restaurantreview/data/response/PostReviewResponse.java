package com.example.restaurantreview.data.response;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class PostReviewResponse {
    @SerializedName("customerReviews")
    private List<CustomerReviewItem> customerReviews;

    @SerializedName("error")
    private boolean error;

    @SerializedName("message")
    private String message;

    public List<CustomerReviewItem> getCustomerReviews() {
        return customerReviews;
    }

    public boolean isError() {
        return error;
    }

    public String getMessage() {
        return message;
    }
}


