package cn.itcast.demo;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.StorageServer;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;

import com.sun.security.ntlm.Client;

public class Test {

	
	 public static void main(String[] args)throws Exception{
		 
	     ClientGlobal.init("D:\\woorkspace\\fastDFSdemo\\src\\main\\resources\\fdfs_client.conf");
	     TrackerClient trackerClient = new TrackerClient();
		 
	     TrackerServer trackerServer = trackerClient.getConnection();
		 
	     StorageServer storageServer = null;
		 
	     StorageClient storageClient = new StorageClient(trackerServer, storageServer);
		 
		 String[] strings = storageClient.upload_file("D:\\ad.jpg","jpg",null);
		 
		 for(String str:strings) {
			  System.out.println(str);
		 }
		 
	}

}
