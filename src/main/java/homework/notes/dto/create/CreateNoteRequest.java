package homework.notes.dto.create;

import lombok.Data;

@Data
public class CreateNoteRequest {
    private String title;
    private String content;
}