# Raviolini Sample API

This sample API is built on top of [Raviolini Framework](https://github.com/otaviofff/raviolini). It's been configured to store domain objects on PostgreSQL, cache them on Redis, and log execution output in a dated file. Also, in order to setup this entire infrastructure effortlessly, this sample project also provides a Vagrantfile that, once executed, will rely on a Bootstrap file to provision all these nodes.

## Domain

This sample API exposes a single domain object, named ```Dog```. Each object is defined by a simple set of three attributes, namely ```id```, ```name``` and ```neutered```.
