package roy.aman.sytbackendapp.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import roy.aman.sytbackendapp.Utility.VoteType;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class Vote {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer voteId;
	
	private VoteType votetype;
	
	@OneToOne
	private User voter;
	
	@OneToOne
	private Post post;
	
	
}
