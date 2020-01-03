package com.example.myproject;

import origami.*;
import org.opencv.core.*;

public class Cam {

  public static void main(String... args) throws Exception {
        Origami.init();
        Camera web = new Camera().device(0);
        web.fullscreen().run();
  }

}
