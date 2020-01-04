Origami / Maven Java application
----------------------

This project demonstrates the usage of Bazel to retrieve origami dependencies from Maven
repositories.

To build this example, you will need to [install
Bazel](http://bazel.io/docs/install.html).

The Java application makes use of a library in
[Origami](https://github.com/hellonico/origami), which is downloaded from a custom remote
repository using Maven.

This application demonstrates the usage of
[`rules_jvm_external`](https://github.com/bazelbuild/rules_jvm_external/) to
configure dependencies. The dependencies are configured in the `WORKSPACE` file.

Build the application by running:

```
$ bazel build :origami-check
```

Test the application by running:

```
$ bazel test :tests
```

Run the application by running

```
$ ./bazel-bin/origami-check
```

# other application 

- *origami-check*: load and display a mat
- *origami-webcam*: run the webcam
- *origami-greycam*: run the webcam with an extra origami filter to turn the stream to grey 

# build or test all

## the old way 

```
# https://github.com/bazelbuild/bazel/issues/4257
# build all
$ bazel build $(bazel query //...)
# test all
$ bazel test $(bazel query //...) 
```

## the new way 

```
$ bazel clean
$ bazel build //...
$ bazel test //...
```