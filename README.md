# scala-spark-newbie
sbt/scala/spark tutorial

## install SBT
brew install sbt

sbt new scala/scala-seed.g8
```
## make sure u use a `right` JDK, Homebrew comes with some other JDK might not work
(base) MacBook-Pro:spark hwchan$ ls /Library/Java/JavaVirtualMachines/
jdk-11.0.1.jdk		jdk1.8.0_144.jdk
(base) MacBook-Pro:spark hwchan$ export JAVA_HOME=/Library/Java/JavaVirtualMachines/jdk1.8.0_144.jdk
```

## Now that we have SBT installed, it’s time to create a simple project with giter8:

sbt new scala/hello-world.g8
```
Copying runtime jar.
[info] Loading settings for project global-plugins from idea.sbt ...
[info] Loading global plugins from /Users/hwchan/.sbt/1.0/plugins
[info] Updating ProjectRef(uri("file:/Users/hwchan/.sbt/1.0/plugins/"), "global-plugins")...
...
name [Hello World template]: 
Template applied in /Users/hwchan/github/spark/./hello-world-template

```


