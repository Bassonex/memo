package com.app.dao;


import com.app.model.Note;
import com.app.model.NoteCategory;
import com.app.model.NotePriority;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class NoteDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    // Notes only
    public List<Note> getNotesDb() {
        RowMapper<Note> rowMapper = (rs, rowNumber) -> mapNotes(rs);
        return jdbcTemplate.query("SELECT * FROM notes", rowMapper);
    }

    private Note mapNotes(ResultSet rs) throws SQLException {
        Note note = new Note();
        NotePriority notePriority = new NotePriority();
        NoteCategory noteCategory = new NoteCategory();


        note.setId(rs.getLong("id"));
        note.setTitle(rs.getString("title"));
        note.setNote(rs.getString("note"));

        notePriority.setName(rs.getString("note_priority"));
        System.out.println("Hello PRIORITY! " + notePriority.getName());
        note.setNotePriority(notePriority);



        noteCategory.setName(rs.getString("note_category"));
        System.out.println("Hello CATEGORY! " + noteCategory.getName());
        note.setCategory(noteCategory);

        return note;
    }

    // Note priority

}
