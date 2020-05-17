package com.xuecheng.manage_cms.controller;

import com.xuecheng.api.cms.CmsPageControllerApi;
import com.xuecheng.framework.domain.cms.CmsPage;
import com.xuecheng.framework.domain.cms.request.QueryPageRequest;
import com.xuecheng.framework.model.response.CommonCode;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.QueryResult;
import com.xuecheng.manage_cms.service.PageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author qianhao
 * @create 2020/5/10-18:12
 */
@RestController
@RequestMapping("/cms/page")
public class CmsPageController implements CmsPageControllerApi {

    @Autowired
    private PageService pageService;

    @Override
    @GetMapping("/list/{page}/{size}")
    public QueryResponseResult findList(@PathVariable("page") int page,
                                        @PathVariable("size") int size, QueryPageRequest queryPageRequest) {
        /*QueryResult<CmsPage> qr = new QueryResult<>();
        List<CmsPage> list = new ArrayList<>();
        CmsPage page1 = new CmsPage();
        page1.setPageName("测试页面");
        list.add(page1);
        qr.setList(list);
        qr.setTotal(list.size());
        QueryResponseResult result = new QueryResponseResult(CommonCode.SUCCESS,qr);*/
        return pageService.queryPageResult(page,size,queryPageRequest);
    }

}
