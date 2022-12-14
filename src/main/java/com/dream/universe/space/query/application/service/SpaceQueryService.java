package com.dream.universe.space.query.application.service;

import com.dream.universe.jwt.TokenProvider;
import com.dream.universe.member.dao.MemberMapper;
import com.dream.universe.member.dto.MemberDTO;
import com.dream.universe.space.domain.model.Music;
import com.dream.universe.space.domain.model.Space;
import com.dream.universe.space.query.application.dao.MusicQueryDAO;
import com.dream.universe.space.query.application.dao.SpaceQueryDAO;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SpaceQueryService {

    private final TokenProvider tokenProvider;
    private final MemberMapper memberMapper;
    public final SpaceQueryDAO spaceQueryDAO;
    public final MusicQueryDAO musicQueryDAO;

    public SpaceQueryService(MemberMapper memberMapper, TokenProvider tokenProvider, SpaceQueryDAO spaceQueryDAO,MusicQueryDAO musicQueryDAO){
        this.memberMapper = memberMapper;
        this.tokenProvider = tokenProvider;
        this.spaceQueryDAO = spaceQueryDAO;
        this.musicQueryDAO = musicQueryDAO;
    }

    public List<Space> findAllById(String accessToken) {
        String memberId = tokenProvider.getUserId(accessToken);
        MemberDTO member = memberMapper.findById(memberId);

        List<Space> space = spaceQueryDAO.findAllByMemberCode(member.getMemberCode());

        System.out.println("space = " + space);
        return space;
    }

    public Music findMusicById(String spaceCode) {
        Optional<Music> omusic = musicQueryDAO.findById(Long.parseLong(spaceCode));
        Music music = omusic.get();
        return music;
    }

    public List<Space> findAllRecommend(String spaceType) {
        List<Space> space = spaceQueryDAO.findAll(Sort.by(Sort.Direction.DESC, "spaceLike","spaceBookmark"));

        System.out.println("size = " + space.size());
        System.out.println(spaceType);
        int size = space.size();
        for(int i=space.size()-1;i>=0;i--){
//            System.out.printf("i= " + i + " ");
            if(!(space.get(i).getSpaceType().equals(spaceType))){
//                System.out.println(space.get(i).getSpaceType());
                space.remove(i);
//                System.out.println("size2 = " + space.size());
            }
        }

        System.out.println("after size = " + space.size());

        if(space.size()>11){
            int i=space.size()-1;
            while(i>11){
                space.remove(i);
                i--;
            }
        }
        System.out.println("final size = " + space.size());
//        System.out.println("space = " + space);
        return space;
    }

    public List<Space> searchAllSpace(String spaceName) {
        List<Space> space = spaceQueryDAO.findByspaceNameContains(spaceName);
        System.out.println("space = " + space);
        List<Space> spacetag1 = spaceQueryDAO.findByspaceTag1Contains(spaceName);
        List<Space> spacetag2 = spaceQueryDAO.findByspaceTag2Contains(spaceName);
        List<Space> spacetag3 = spaceQueryDAO.findByspaceTag3Contains(spaceName);

        space.addAll(spacetag1);
        space.addAll(spacetag2);
        space.addAll(spacetag3);

        if(space.size()>17){
            int i=space.size()-1;
            while(i>11){
                space.remove(i);
                i--;
            }
        }

        return space;
    }

}
