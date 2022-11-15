package roy.aman.sytbackendapp.Utility;

import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
public class PostResponse {
	
	private List<PostDto> posts;
	
	private int pageNumber;
	
	private int pageSize;
	
	private int totalPages;
	
	private long totalElements;
	
	private boolean lastPage;
	

}
