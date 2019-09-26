package com.example.demo;

import com.example.demo.controller.EventListener;
import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class DemoApplication {

	public static HazelcastInstance hazelcastInstance;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		hazelcastInstance = Hazelcast.newHazelcastInstance();
		Map<Long, String> map = hazelcastInstance.getReplicatedMap("data");
		((IMap<Long, String>) map).addEntryListener(new EventListener(), true);
		for (Long i = 0L; i < 20L; i++) {
			map.put(i, "dasda" + i);
		}
	}

}
