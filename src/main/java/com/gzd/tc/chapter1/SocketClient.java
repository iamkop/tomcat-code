package com.gzd.tc.chapter1;

import java.io.*;
import java.net.Socket;

/**
 * @author gzd
 * @date 2018/1/5 9:42
 * @desc 利用socket来模拟http请求
 */
public class SocketClient {

    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("127.0.0.1", 6080);
        OutputStream os = socket.getOutputStream();
        boolean autoFlush = true;
        PrintWriter out = new PrintWriter(os, autoFlush);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        // 发送 http 请求到web服务
        out.println("GET /test HTTP/1.1");
        out.println("Host: localhost:6080");
        out.println("Connection: Close");
        out.println();
        // 读取返回结果并打印
        boolean loop = true;
        StringBuffer sb = new StringBuffer(8096);
        while (loop) {
            if (in.ready()) {
                int i = 0;
                while (i != -1) {
                    i = in.read();
                    sb.append((char) i);
                }
                loop = false;
            }
            Thread.currentThread().sleep(50);
        }
        System.out.println(sb.toString());
        socket.close();
    }
}
