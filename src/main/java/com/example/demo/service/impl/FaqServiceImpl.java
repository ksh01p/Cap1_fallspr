package com.example.demo.service.impl;
import com.example.demo.domain.Faq;
import com.example.demo.dto.DefaultDto;
import com.example.demo.dto.DefaultDto;
import com.example.demo.dto.FaqDto;
import com.example.demo.repository.FaqRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.service.FaqService;
import com.example.demo.mapper.FaqMapper;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FaqServiceImpl implements FaqService {

    private final FaqRepository faqRepository;
    private final FaqMapper faqMapper;
    private final UserRepository userRepository;
    public FaqServiceImpl(
            FaqRepository faqRepository
            , FaqMapper faqMapper
            , UserRepository userRepository
    ) {
        this.faqRepository = faqRepository;
        this.faqMapper = faqMapper;
        this.userRepository = userRepository;
    }

    /**/

    @Override
    public DefaultDto.CreateResDto create(FaqDto.CreateReqDto param) {
        System.out.println("create");
        return faqRepository.save(param.toEntity()).toCreateResDto();
    }
    @Override
    public void update(FaqDto.UpdateReqDto param) {
        System.out.println("update");
        Faq faq = faqRepository.findById(param.getId()).orElseThrow(() -> new RuntimeException(""));
        if(param.getTitle() != null) {
            faq.setTitle(param.getTitle());
        }
        if(param.getContent() != null) {
            faq.setContent(param.getContent());
        }
        faqRepository.save(faq);
    }
    @Override
    public void delete(Long id) {
        Faq faq = faqRepository.findById(id).orElseThrow(() -> new RuntimeException(""));
        faqRepository.delete(faq);
    }

    public FaqDto.DetailResDto get(Long id) {
        return faqMapper.detail(id);
    }

    public List<FaqDto.DetailResDto> detaillist(List<FaqDto.DetailResDto> list) {
        List<FaqDto.DetailResDto> newList = new ArrayList<>();
        for(FaqDto.DetailResDto each : list){
            newList.add(get(each.getId()));
        }
        return newList;
    }

    @Override
    public FaqDto.DetailResDto detail(Long id) {
        return get(id);

    }
    @Override
    public List<FaqDto.DetailResDto> list(FaqDto.ListReqDto param) {
        return faqMapper.list(param);
        /*List<FaqDto.DetailResDto> list = new ArrayList<FaqDto.DetailResDto>();
        List<Faq> faqList = faqRepository.findAll();
        for(Faq faq : faqList) {
            //list.add(entityToDto(faq));
        }
        return list;*/
    }

    @Override
    public DefaultDto.PagedListResDto pagedList(FaqDto.PagedListReqDto param){
        DefaultDto.PagedListResDto retrunVal = DefaultDto.PagedListResDto.init(param, faqMapper.pagedListCount(param));
        retrunVal.setList(detaillist(faqMapper.pagedList(param)));
        return retrunVal;
    }


}