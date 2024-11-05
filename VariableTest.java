class VariableTest{
	public static void main(String[] args){
		
		//1.测试整型变量的使用
		//byte(1字节=8bit) short(2byte) int(4byte) long(8byte)
		byte b1 = 12;
		byte b2 = 127;
		//编译不通过。因为超出了byte的存储范围
		//byte b3 = 128;

		short s1 = 1234;

		int i1 = 1232234132;
		//① 声明long类型变量时，需要提供后缀。后缀为"l"或"L"
		long l1 = 123123123L;

		//② 开发中，定义整型变量一般没有特殊情况都是int

		//2.测试浮点型(float double)
		//① 声明float类型变量时，需提供后缀'f'或'F'
		float f1 = 12.3f;
		System.out.println("f1 = " + f1);
		
		//② 开发中，大家定义浮点数时候一般用double，因为精度更高
		
		//③ float类型表数范围要大于long类型的表数范围，但是精度不高。
		//  如果在开发中需要极高的精度，需要使用BigDecimal来替换浮点型变量。
		//测试1
		System.out.println(0.1 + 0.2);
		
				
		//测试2
		float ff1 = 123123123f;
		float ff2 = ff1 + 1;
		System.out.println(ff1);
		System.out.println(ff2);
		System.out.println(ff1 == ff2);
	}
}