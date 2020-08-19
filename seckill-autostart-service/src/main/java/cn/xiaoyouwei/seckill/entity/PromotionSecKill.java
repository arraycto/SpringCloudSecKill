package cn.xiaoyouwei.seckill.entity;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class PromotionSecKill {

    private Long psId;
    private Long goodsId;
    private Integer psCount;
    private Date startTime;
    private Date endTime;
    private Integer status;
    private Float currentPrice;

    public Long getPsId() {
        return psId;
    }

    public void setPsId(Long psId) {
        this.psId = psId;
    }

    public Long getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(Long goodsId) {
        this.goodsId = goodsId;
    }

    public Integer getPsCount() {
        return psCount;
    }

    public void setPsCount(Integer psCount) {
        this.psCount = psCount;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Float getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(Float currentPrice) {
        this.currentPrice = currentPrice;
    }

    @Override
    public String toString() {
        return "PromotionSecKill{" +
                "psId=" + psId +
                ", goodsId=" + goodsId +
                ", psCount=" + psCount +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", status=" + status +
                ", currentPrice=" + currentPrice +
                '}';
    }
}