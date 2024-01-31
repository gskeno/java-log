
# 细节

## 如何指定日志目录为工作目录?
使用`${sys:user.dir}`占位符，表示工作目录；使用`${user.home}`占位符表示用户主目录。

与log4j不同，其没有`sys:`前缀。

## 如何控制log4j2框架自身的日志是否输出?
依赖`status` 属性控制
```xml
<!--设置log4j2的自身log级别为warn，info，debug等，可以控制log4j2框架自身的日志是否输出-->
<Configuration status="debug" monitorInterval="30">
```

