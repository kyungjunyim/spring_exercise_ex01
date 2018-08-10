package org.zerock.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.zerock.domain.BoardVO;
import org.zerock.domain.Criteria;
import org.zerock.domain.SearchCriteria;
import org.zerock.persistence.BoardDAO;

@Service
public class BoardServiceImpl implements BoardService {
	@Inject
	private BoardDAO boardDAO;

	@Transactional
	@Override
	public void regist(BoardVO board) throws Exception {
		boardDAO.create(board);
		String[] files = board.getFiles();
		if(files == null) {
			System.out.println("file is null");
			return;
		}
		for(String fileName : files) {
			boardDAO.addAttach(fileName);
		}
	}

	@Transactional(isolation=Isolation.READ_COMMITTED)
	@Override
	public BoardVO read(int bno) throws Exception {
		return boardDAO.read(bno);
	}

	@Transactional
	@Override
	public void modify(BoardVO board) throws Exception {
		boardDAO.update(board);
		
		int bno = board.getBno();
		boardDAO.deleteAttach(bno);
		
		String[] files = board.getFiles();
		
		if(files == null) {
			return;
		}
		
		for(String fileName : files) {
			boardDAO.replaceAttach(fileName, bno);
		}
	}

	@Override
	public void remove(int bno) throws Exception {
		boardDAO.deleteAttach(bno);
		boardDAO.delete(bno);
	}

	@Override
	public List<BoardVO> listAll() throws Exception {
		return boardDAO.listAll();
	}
	
	@Override
	public List<BoardVO> listCriteria(Criteria cri) throws Exception {
		return boardDAO.listCriteria(cri);
	}
	
	@Override
	public int listCountCriteria(Criteria cri) throws Exception {
		return boardDAO.countPaging(cri);
	}
	
	@Override
	public List<BoardVO> listSearchCriteria(SearchCriteria cri) throws Exception {
		return boardDAO.listSearch(cri);
	}
	
	@Override
	public int listSearchCount(SearchCriteria cri) throws Exception {
		return boardDAO.listSearchCount(cri);
	}
	
	@Override
	public void incrementViewcnt(int bno) throws Exception {
		boardDAO.incrementViewcnt(bno);
	}

	@Override
	public List<String> getAttach(int bno) throws Exception {
		return boardDAO.getAttach(bno);
	}

}
