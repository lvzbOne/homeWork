package org.geekbang.netty.server;

import org.geekbang.netty.inbound.HttpInboundServer;

import java.util.Arrays;
import java.util.List;

/**
 * @author 起凤
 * @description: TODO
 * @date 2022/3/20
 */
public class NettyServer {
    public static void main(String[] args) throws Exception {
        String[] targetUrls = {"http://localhost:8801/", "http://localhost:8802/", "http://localhost:8803/"};
        final List<String> urlList = Arrays.asList(targetUrls);

        HttpInboundServer server = new HttpInboundServer(8809, urlList);
        server.run();
    }
}
