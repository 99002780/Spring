package com.example.demo.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
	public class TopicService {
		public List <Topic>topics= new ArrayList<>(Arrays.asList(
					new Topic("spring","SpringBoot","Springboot framework"),
					new Topic("java","Java core","Java course")
					));
		
		public List<Topic> getAllTopics(){
			return topics;
		}
	    
		public Topic getTopics(String id) {
			return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
		}
	
		public void addTopic(Topic topic) {
			topics.add(topic);
			
		}
	
		public void updateTopic(String id, Topic topic) {
		     for(int i=0;i<topics.size();i++) {
		    	 Topic t =topics.get(i);
		    	 if(t.getId().equals(id)){
		    		 topics.set(i, topic);
		    		 return;
		    	 }
		     }
			
		}
	
		public void deleteTopic(String id) {
			topics.removeIf(t -> t.getId().equals(id));
		}
	
		
	
		
	}