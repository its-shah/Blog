package com.myblog.payload;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PostDto{
    private long id;

    @NotEmpty
    @Size(min = 2, message = "Post title should have private least 2 characters")
    private String title;

    @NotEmpty
    @Size(min = 4, message = "Post description should have least 2 characters")
    private String description;

    @NotEmpty
    @Size(min = 4, message = "Post content should have private least 2 characters")
    private String content;
}
