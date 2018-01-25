package com.woomoon.test;

public class Test {


    public static void main(String[] args) {
//        精通，熟练，掌握，了解，

        String hbid = "HB000010";//假装是从数据库中拿到的数据
        System.out.println(hbid.charAt(1));//指定下标的字符串
        System.out.println("0最后一次出现的位置" + hbid.lastIndexOf("0"));
        System.out.println("字符串拼接方法：" + hbid.concat("AB"));
        System.out.println("拼接后的字符串" + hbid);
        //1、第一步：截取字符串
        String substr = hbid.substring(hbid.lastIndexOf("B") + 1);
        System.out.println("截取后的字符串：" + substr);
        //2、第二步：将HB后面的字符串转换成Integer类型
        Integer i = Integer.parseInt(substr);
        //3、第三步：给值加1
        System.out.println("算法执行后的结果：" + i++);
        //4、将计算结果转回字符串
        String result = Integer.toString(i);
        //5、计算字符串长度
        int length = result.length();
        System.out.println(length);
        //6、第六步：将结果字符串前面补足HB，数字用“0”补足6位
        StringBuffer sbf = new StringBuffer("HB");
//        String newnmb = StringUtils.leftPad(result, 6, '0');
//        System.out.println(newnmb);//补足后的结果
//        System.out.println("最终的结果" + sbf.append(newnmb));


    }

}
