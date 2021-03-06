package com.jarvis.cache.to;

import com.jarvis.cache.type.AutoLoadQueueSortType;

/**
 * AutoLoadHandler 配置
 * @author jiayu.qiu
 */
public class AutoLoadConfig {

    /**
     * 处理自动加载队列的线程数量
     */
    private int threadCnt=10;

    /**
     * 自动加载队列中允许存放的最大容量
     */
    private int maxElement=20000;

    /**
     * 是否打印比较耗时的请求
     */
    private boolean printSlowLog=true;

    /**
     * 当请求耗时超过此值时，记录目录（printSlowLog=true 时才有效），单位：毫秒
     */
    private int slowLoadTime=500;

    /**
     * 自动加载队列排序算法
     */
    private AutoLoadQueueSortType sortType=AutoLoadQueueSortType.NONE;

    /**
     * 加载数据之前去缓存服务器中检查，数据是否快过期，如果应用程序只是部署在一台服务器，设置为false, 如果部署到多台服务器，可以考虑设置为true
     */
    private boolean checkFromCacheBeforeLoad=false;

    public int getThreadCnt() {
        return threadCnt;
    }

    public void setThreadCnt(int threadCnt) {
        if(threadCnt <= 0) {
            return;
        }
        this.threadCnt=threadCnt;
    }

    public int getMaxElement() {
        return maxElement;
    }

    public void setMaxElement(int maxElement) {
        if(maxElement <= 0) {
            return;
        }
        this.maxElement=maxElement;
    }

    public AutoLoadQueueSortType getSortType() {
        return sortType;
    }

    public void setSortType(Integer sortType) {
        this.sortType=AutoLoadQueueSortType.getById(sortType);
    }

    public boolean isPrintSlowLog() {
        return printSlowLog;
    }

    public void setPrintSlowLog(boolean printSlowLog) {
        this.printSlowLog=printSlowLog;
    }

    public int getSlowLoadTime() {
        return slowLoadTime;
    }

    public void setSlowLoadTime(int slowLoadTime) {
        this.slowLoadTime=slowLoadTime;
    }

    public boolean isCheckFromCacheBeforeLoad() {
        return checkFromCacheBeforeLoad;
    }

    public void setCheckFromCacheBeforeLoad(boolean checkFromCacheBeforeLoad) {
        this.checkFromCacheBeforeLoad=checkFromCacheBeforeLoad;
    }

}
