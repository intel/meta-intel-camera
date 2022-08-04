DISCONTINUATION OF PROJECT.

This project will no longer be maintained by Intel.

Intel has ceased development and contributions including, but not limited to, maintenance, bug fixes, new releases, or updates, to this project. 

Intel no longer accepts patches to this project.

If you have an ongoing need to use this project, are interested in independently developing it, or would like to maintain patches for the open source software community, please create your own fork of this project. 
Layer for Intel Camera
======================
This layer adds the packages necessary for supporting MIPI cameras on Intel 5xx. The supported camera sensors are IMX214 and OV5670.

## Dependencies
This layer depends on components from the following repositories:
* [intel-camera-drivers](https://github.com/01org/intel-camera-drivers)
* [intel-camera-adaptation](https://github.com/Intel-5xx-Camera/intel-camera-adaptation)
* [intel-camera-dev-support](https://github.com/Intel-5xx-Camera/intel-camera-dev-support)
* [icamerasrc](https://github.com/01org/icamerasrc)

## Getting Started
* Add the `meta-intel-camera` layer to `conf/bblayers.conf` in your `build` directory
* Build the image

## Usage
### Unit Tests
Google Test (gtest) based camera subsystem tests are included in `intel-camera-dev-support`.

### GStreamer
GStreamer preview pipelines for the main camera (IMX214):

    $ gst-launch-1.0 icamerasrc device-name=0 io-mode=3 ! video/x-raw,format=NV12,width=1920,height=1080 ! vaapisink dmabuf-alloc-tiled=true
    $ gst-launch-1.0 icamerasrc device-name=0 io-mode=3 ! video/x-raw,format=NV12,width=1280,height=720 ! vaapisink dmabuf-alloc-tiled=true
    $ gst-launch-1.0 icamerasrc device-name=0 io-mode=3 ! video/x-raw,format=NV12,width=3840,height=2160 ! vaapisink dmabuf-alloc-tiled=true

GStreamer preview pipelines for the secondary camera (OV5670):

    $ gst-launch-1.0 icamerasrc device-name=1 io-mode=3 ! video/x-raw,format=NV12,width=1920,height=1080 ! vaapisink dmabuf-alloc-tiled=true
    $ gst-launch-1.0 icamerasrc device-name=1 io-mode=3 ! video/x-raw,format=NV12,width=1280,height=720 ! vaapisink dmabuf-alloc-tiled=true

