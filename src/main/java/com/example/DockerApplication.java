package com.example;

import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class DockerApplication {

    public static void main(String[] args) throws IOException {
        SpringApplication.run(DockerApplication.class, args);

//        // 创建Httpclient对象,相当于打开了浏览器
//        CloseableHttpClient httpclient = HttpClients.createDefault();
//
//        // 创建HttpGet请求，相当于在浏览器输入地址
//        HttpGet httpGet = new HttpGet("http://www.qq.com/");
//
//        CloseableHttpResponse response = null;
//        try {
//            // 执行请求，相当于敲完地址后按下回车。获取响应
//            response = httpclient.execute(httpGet);
//            // 判断返回状态是否为200
//            if (response.getStatusLine().getStatusCode() == 200) {
//                // 解析响应，获取数据
//                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
//                System.out.println(content);
//            }
//        } catch (ClientProtocolException e) {
//            e.printStackTrace();
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            if (response != null) {
//                // 关闭资源
//                response.close();
//            }
//            // 关闭浏览器
//            httpclient.close();
//        }
    }

}
