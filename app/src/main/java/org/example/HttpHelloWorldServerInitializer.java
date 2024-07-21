package org.example;

import io.netty.channel.ChannelInitializer;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.compression.CompressionOptions;
import io.netty.handler.codec.http.HttpContentCompressor;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.HttpServerExpectContinueHandler;

class HttpHelloWorldServerInitializer extends ChannelInitializer<SocketChannel> {
	@Override
	public void initChannel(SocketChannel channel) {
		channel.pipeline()
				.addLast(new HttpServerCodec())
				.addLast(new HttpContentCompressor((CompressionOptions[]) null))
				.addLast(new HttpServerExpectContinueHandler())
				.addLast(new HttpHelloWorldServerHandler());
	}
}
