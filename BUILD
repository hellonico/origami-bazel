load("@rules_java//java:defs.bzl", "java_binary", "java_library", "java_test")

package(default_visibility = ["//visibility:public"])


java_library(
    name = "java-maven-lib",
    srcs = glob(["src/main/java/com/example/myproject/*.java"]),
    deps = [
         "@maven//:origami_origami",
         "@maven//:origami_filters",
         "@maven//:org_clojure_clojure",
         "@maven//:opencv_opencv"
    ],
)

java_binary(
    name = "origami-check",
    main_class = "com.example.myproject.App",
    runtime_deps = [":java-maven-lib"],
)

java_binary(
    name = "origami-webcam",
    main_class = "com.example.myproject.Cam",
    runtime_deps = [":java-maven-lib"],
)

java_binary(
    name = "origami-greycam",
    main_class = "com.example.myproject.GreyCam",
    runtime_deps = [":java-maven-lib"],
)

java_binary(
    name = "origami-cartooncam",
    main_class = "com.example.myproject.CartoonCam",
    runtime_deps = [":java-maven-lib"],
)

java_binary(
    name = "origami-yolocam",
    main_class = "com.example.myproject.YoloCam",
    runtime_deps = [":java-maven-lib"],
)



java_test(
    name = "tests",
    srcs = glob(["src/test/java/com/example/myproject/*.java"]),
    test_class = "com.example.myproject.TestApp",
    deps = [
        ":java-maven-lib",
        "@maven//:junit_junit",
    ],
)
