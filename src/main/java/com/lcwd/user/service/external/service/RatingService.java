package com.lcwd.user.service.external.service;

import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "RATINGSERVICE")
public interface RatingService {

}
