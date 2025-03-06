package spring.streams.streams_method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StreamsMethodApplication {

	public static void main(String[] args) {

		//Streams Initialization
		
		//1.Collection Obj
		List<String> stream1 = List.of("Kartheek","Abhinav","Babu");		

		//2. Arrays of Values
		String[] stream2 = {"Abhinav", "Kartheek","Babu"};
		Stream<String> arrayStreams = Arrays.stream(stream2);
		
		//3.Stream methods
		Stream<String> stream3 = Stream.of("Babu", "Kartheek","Abhinav");
		
	}

}
