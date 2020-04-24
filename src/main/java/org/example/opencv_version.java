package org.example;

import org.opencv.core.Core;

import java.net.URL;

class opencv_version {

//  static { System.loadLibrary(Core.NATIVE_LIBRARY_NAME); }

    public static void main(String[] args) {

        URL url = ClassLoader.getSystemResource("lib/opencv_java430.dll");
        System.load(url.getPath());

        if ((1 == args.length) && (0 == args[0].compareTo("--build"))) {

            System.out.println(Core.getBuildInformation());
        } else if ((1 == args.length) && (0 == args[0].compareTo("--help"))) {

            System.out.println("\t--build\n\t\tprint complete build info");
            System.out.println("\t--help\n\t\tprint this help");
        } else {

            System.out.println("Welcome to OpenCV " + Core.VERSION);
        }
    }

}
