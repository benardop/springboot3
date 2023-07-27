package com.benard.learningspringboot3.springboot3;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VideoService {
    List<Video> videos = List.of(
            new Video("Need help with your Spring Boot 3"),
            new Video("Don't do this in your code"),
            new Video("Secrets to fixing your code"));

    public List<Video> getVideos() {
        return videos;
    }

    public Video create(Video newVideo) {
      List<Video> extend = new ArrayList<>(videos);
      extend.add(newVideo);
      this.videos = List.copyOf(extend);
      return newVideo;
    }
}
