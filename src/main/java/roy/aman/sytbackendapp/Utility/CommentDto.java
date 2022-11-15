package roy.aman.sytbackendapp.Utility;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import roy.aman.sytbackendapp.Entities.User;

@Getter
@Setter
@NoArgsConstructor
public class CommentDto {
	
	private Integer commentId;

	private String comment;
	
}
