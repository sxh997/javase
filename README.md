#java学习

1.什么是jre,jdk,jvm

>jvm:java虚拟机，识别.class文件字节码调用操作系统API完成动作。是跨平台的核心，不同的操作系统向上的API不同，但同一段字节码，在不同的jvm实现上会映射到不同的系统API进行调用。

>jre:java运行时环境，包括了jvm标准实现和java的基础类库

>jdk:java开发工具包，集成jre和其他工具

2.DOS常见的命令

>dir 查看当前目录下的文件夹和子文件夹

>cd 改变当前的文件夹

>md 创建当前文件夹

>re 删除当前文件夹

>cls 清除屏幕

>d: c: 切换盘符

>Tab 自动补全文件名或文件夹

>上下箭头 显示之前或之后的命令

3.jDK12安装搭建

>正常安装后,需要注意的点有这些：1.jre需要在installya下执行一个语句才能生成：

```
bin\jlink.exe --module-path jmods --add-modules java.desktop --output jre
```

>配置环境变量的时候，在path下记得把jre也配置上，
```
%JAVA_HOME%\jre\bin
```

>可以安装多个jdk版本，更改环境变量的路径即可更改所用版本

4.运行java文件以及解决乱码

>编译java文件

```
javac -encoding utf-8  a.java
```
**<font color="red"> 编译时注意的点：</font>**

1.文件名和类名的文件名保持一致

2.一个java文件中可以包含多个class，但是只能有一个public class

3.main方法是所有方法的入口

4.main函数中可以支持多种参数列表，参数名称无所谓，但是一般携程args

5.每行结尾使用;  代码块使用{}括起来


>运行

```
java a
```
**注意，运行的是类而不是class文件**

5.编码风格

>注意缩进，符号成对，见名知意。

>记得注释或说明文档。

```
//单行注释
/*多行注释*/
/**
文档注释
*/
注释不能嵌套
```

6.反编译文件工具

>luyten   :注意反编译时候的乱码问题，也不会翻译注释；也可以直接把jar包丢进去进行反编译

