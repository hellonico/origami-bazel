package com.example.myproject;

import origami.*;
import org.opencv.core.*;

import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

import java.util.function.Function;

import static org.opencv.imgproc.Imgproc.*;

public class CartoonCam {

  public static void main(String... args) throws Exception {
        Origami.init();
        Camera web = new Camera().device(0);
        Filter p = new origami.filters.Cartoon2();
        web.filter(p).fullscreen().run();
  }

}
