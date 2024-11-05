
/*这是多行注释

我们可以声明多行注释的信息
注意：编译以后的字节码文件不包含注释中的信息
多行注释不能够去嵌套使用
*/

public class CommentTest{
	/**
	这是main方法。格式是固定的。（文档注释）
	*/
	/*这是main方法。格式是固定的。（多行注释）
	*/
	public static void main(String[] args){
		//这是输出语句
		System.out.println("hello,world");
	}
}

/*
文档注释：
文档注释内容可以被JDK提供的javadoc所解析，生成一套以网页文件形式体现的该程序的说明文档
*/

/**
这是我的第一个java程序。easy

@author zhulin
@version 1.0

*/