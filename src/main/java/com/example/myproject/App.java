package com.example.myproject;

import origami.*;
import org.opencv.core.*;

public class App {

  public App(int size) {
        Origami.init();
        Mat hello= Mat.eye(size,size, CvType.CV_8UC1);
        System.out.println(hello.dump());
  }

  public static void main(String... args) throws Exception {
  	   int size = args.length > 0 ? Integer.parseInt(args[0]) : 3;
        App app = new App(size);
  }

}
