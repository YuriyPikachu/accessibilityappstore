package net.accessiblility.app.store.model;

import java.sql.Timestamp;

import net.accessiblility.app.store.model.User;
import net.accessiblility.app.store.model.Version;
import net.accessiblility.app.store.model.base.BaseComment;


public class Comment extends BaseComment {

	public Comment() {
		// TODO Auto-generated constructor stub
		super();
	}

	public Comment(int id, String content, Timestamp contentTime, User user, int thumbsUp, int score, Version version) {
		super(id, content, contentTime, user, thumbsUp, score, version);
		// TODO Auto-generated constructor stub
	}
}
