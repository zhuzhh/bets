package com.simple.bets.modular.sys.service;

import com.simple.bets.core.base.service.IService;
import com.simple.bets.modular.sys.model.JobModel;

import java.util.List;

/**
 * @Author wangdingfeng
 * @Description //定时任务
 * @Date 15:19 2019/2/2
 **/

public interface JobService extends IService<JobModel> {
    /**
     * 查询任务
     * @param jobId
     * @return
     */
    JobModel findJob(Long jobId);

    /**
     * 查询所有任务
     * @param jobModel
     * @return
     */
    List<JobModel> findAllJobs(JobModel jobModel);

    void saveOrUpdate(JobModel jobModel);

    void deleteBatch(String jobIds);

    int updateBatch(String jobIds, String status);

    void run(String jobIds);

    void pause(String jobIds);

    void resume(String jobIds);

    List<JobModel> getSysCronClazz(JobModel jobModel);
}
