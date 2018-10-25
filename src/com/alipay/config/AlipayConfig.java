package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016091700535535";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvAIBADANBgkqhkiG9w0BAQEFAASCBKYwggSiAgEAAoIBAQCQf28j3NZBadeAYVXQ/BgF06pWAQDd4TAmXgXOuKGNdJFUWhrZyIQ5x2wcJEN9g+7eY9ZLMfUGW+JECeODaH6Fe2W95T4+9WvDkc4ZpTUhoxv6ZtBZ8rryZmmhsU7YTrF5qjS4Fumt5y90eAsxn4I7KoZ+k9e4PrHtIVnqn3xOYdVyEW867NcRTkXHbg1gCAtwC16l4TbzlTzgwmVkjPldubQwWVIlMEhIOvcP0enZYdwTJsNs9Io2qYdwNQ3bCtdjbJv9F+MpW43n1Q4jKGSDHM/BAHv2uZDgq2ESI3jMTjQoYN0Bxf5ATIBTtnLLL5wtsdhGVlaQLQC9zuiMV0QLAgMBAAECggEAI3wH8QikXP/++fntNxsRUyz9oY0xh0trpaBlULSqh7BemBZgjabeQcolVGvbXxFtMZPW5jRodZ1O3WKISpb4qxL4kz+en5tpUWeW81lMyOvjTQS+mbgwDKL1wc1nDVuV3cjclXCbBifF0ZZBOXhwZNM2oBLyYL6UtyT/jcyInD6u6mRxRcC1QIP9pgoEGh4/hUo0rSJlmE+MXDAUUVpsHYhAdsOjo7imt1SnGcGriR6c1wEDeCYfPIaYpGo4A1hEA+tEssvJd1cOydcZCOyNWF453GBfcnbv+KVJz6+NZtVmBaStPkV4hln6Czd+6ewl81x55sS7JpAa5aJCtebUcQKBgQDc8eRzDTlo6n7r3iC75zKDZJYIbUHKYwzMbboM+LW0VLpmFvm33Eu2tSEu6ff5lzXG0qbjA9yamUwT5VBKLfD/bz4U2I4iRyObl2sQZyTRidG2pfBK/isWswAOdSuo/yb8qwcZMhMEnBgxwHI1kzs9qIASgCU+Erc+87GIbk3/1wKBgQCnbH5eSXla+wwUblmIQIT0YC5Um/U+hQ/jhYJPC6BWPytNen9IN5T3H0+icV0FDTubw4o9eibdubaStAvKzysYsMf8BeT1GlQZXcb/rLfrFNmuRIs3IRy06XlF/+q4IFTrJ0j8O5DkAudojC33x6MvKIxCv4A/eOwshs/HICSm7QKBgGvA5ONffbI3OvMZf+lkFfSSp8EwV7e2mtVQZj5RRXzPHaEQb3VF0P8oUyioHrHxFt8CeTWZ+orDXKEPYxrqUPCidiqAesEo5KrLLAHx67jteAOV5h0M3ELTxaFHb6WZ2o+7cVjOXQwQfJQ3APwz895cQSnEqWUeh5QCEYEyGoQ9AoGAZkpiNuc7LvwdWEpHh3isAsbU57rVrtoLaB5FDFh1INy9bzv9kjjrWcUWmZAbnh+EoNlql78PCf8SbjV00veaRB6WQQO07I+mfE0QbVuwjv+RM+kLCabAbEQNZVhDpzWRzI6XCAy4rKadjgG/gBjIOeLTN2DbUWxnF5lSTz3zRs0CgYBbA6Er4f5PQziC8JKiyAAGccidheMg7TkH0ETDSF63khTfUUEY0h7mhrwNipZNeosmWqFZ6WrzR5yNq1dVT4UCEMiSYF6h72q2HV1rprzx55mJRNndHhlM/Mot/Buc0MqDfwP+aV0qTpxTBfaeQk6QZoW4ULSQGh6CkrrntdJ2LA==";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
                                              
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA5DJ3JMprwlzgpdx7/5rDd3rgM5e8H0e2Tbwlob6yzpyB0JtYsKZ+7kuTsmC2ewq9Yffrofb9I3jMXr9Lo92fk5ZyTZeGEVsT05/8tE7yAMCoQoKSenJ+RrhfPdpTq4GBetSPH1V3F7lUSfv1yjILKMphgH3LjsB9CTHN31dg4NC8/h3saeuRWwii7oKQywaElieWvZcup3gZUNj+ZJUqucdVP5TLFGfloayuSgF8XbOJB/Wkw4JQPA+WMmnVfNixxB7VVSDQch+td462IOVmTgB9kCWf1aX6Wth/8C43yRMyc2gGim72H/3Xhi6s7SD80rI23UAwaietShZqxY1xMQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://localhost:8080/ZFB/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://localhost:8080/ZFB/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "D:\\log";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

