# 基础原理

- 通过SPI机制,`jcl-over-slf4j-2.0.11.jar!/META-INF/services/org.apache.commons.logging.LogFactory`
确定了LogFactory实现为`org.apache.commons.logging.impl.SLF4JLogFactory` 

# 细节
- 由于`jcl-over-slf4j-2.0.11.jar`内部已经有了`commons-logging`的核心类，所以可以单独使用。