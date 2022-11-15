package roy.aman.sytbackendapp.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import roy.aman.sytbackendapp.Utility.CategoryDto;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer postId;

    private String postTitle;
    @Column(length = 10000)
    private String content;
    private String imageName;
    private Date addedDate;
    
    @ManyToOne
	@JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    @JoinColumn(name="author")
    private User author;

    private Integer votes;

    @OneToMany(mappedBy="post" )
    private List<Comment> comments = new ArrayList<>();    
    
    private Integer numberOfComments=0;

    
    
    
}
