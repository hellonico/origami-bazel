package com.example.myproject;

import origami.*;
import org.opencv.core.*;

import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

import java.util.function.Function;

import static org.opencv.imgproc.Imgproc.*;

public class YoloCam {

  public static void main(String... args) throws Exception {
        Origami.init();
        Camera web = new Camera().device(0);
        Filter p = new origami.filters.detect.Yolo("networks.yolo:yolov3-tiny:1.0.0");
        web.filter(p).fullscreen().run();
  }

}
