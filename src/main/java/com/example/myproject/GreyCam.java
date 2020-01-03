package com.example.myproject;

import origami.*;
import org.opencv.core.*;

import org.opencv.imgproc.Imgproc;
import org.opencv.videoio.VideoCapture;

import java.util.function.Function;

import static org.opencv.imgproc.Imgproc.*;

public class GreyCam {

  public static void main(String... args) throws Exception {
        Origami.init();
        Camera web = new Camera().device(0);
        Filter p = mat -> {
            Imgproc.cvtColor(mat, mat, COLOR_BGR2GRAY);
            cvtColor(mat, mat, COLOR_GRAY2BGR);
            return mat;
        };
        web.filter(p).fullscreen().run();
  }

}
