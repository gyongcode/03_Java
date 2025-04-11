package com.ohgiraffers.hw2.comparator;


import com.ohgiraffers.hw2.model.dto.BoardDTO;

import java.util.Comparator;

public class AscBoardDate implements Comparator<BoardDTO> {

	@Override
	public int compare(BoardDTO b1, BoardDTO b2) {
		
		return b1.getBoardDate().compareTo(b2.getBoardDate());
	}

}
