package roy.aman.sytbackendapp.Services;

import java.util.List;

import roy.aman.sytbackendapp.Entities.Vote;

public interface VoteServices {

	List<Vote> getAllVotesOfPost(Integer postId);
	
	Integer upVote(Integer postId, Integer userId);
	
	Integer downVote(Integer postId, Integer userId);
	
}
