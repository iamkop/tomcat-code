package com.gzd.tc.chapter1;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author gzd
 * @date 2018/1/5 10:44
 * @desc http web 服务器
 */
public class HttpServer {

    /**
     * 存放web资源的路径,如 html 等静态文件
     */
    public static final String WEB_ROOT =
            System.getProperty("user.dir") + File.separator + "webroot";

    private static final String SHUTDOWN_COMMAND = "/SHUTDOWN";

    private boolean shutdown = false;

    public void await() {
        ServerSocket serverSocket = null;
        int port = 8080;
        try {
            serverSocket = new ServerSocket(port, 1, InetAddress.getByName("127.0.0.1"));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(1);
        }
        // 开始循环,等待请求
        int i = 10;
        while (!shutdown) {
            System.out.println(i);
            Socket socket = null;
            InputStream input = null;
            OutputStream output = null;

            i++;
        }
    }

    public static void main(String[] args) {
        HttpServer server = new HttpServer();
        server.await();
    }
}
