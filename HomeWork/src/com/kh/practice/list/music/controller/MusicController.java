package com.kh.practice.list.music.controller;

import java.util.ArrayList;
import java.util.List;

import com.kh.practice.list.music.model.vo.Music;

public class MusicController {
	
	private List<Music> musics = new ArrayList();
	
	{
		
	}
	
	public int addList(String title, String singer) {
		
		musics.add(new Music(title, singer));
		return 1;
	
	}
	
	public int addAtZero(String title, String singer) {
		
	
		musics.add(0, new Music(title, singer));
		return 1;
	}
	
	public List<Music> printAll() {
		return musics;
	}

}
