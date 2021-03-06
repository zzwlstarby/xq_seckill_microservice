package net.lovexq.seckill.background.domain.special.dto;

import net.lovexq.seckill.background.domain.estate.model.EstateImageModel;
import net.lovexq.seckill.background.domain.special.model.SpecialStockModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 特价库存DTO
 *
 * @author LuPindong
 * @time 2017-04-20 16:40
 */
public class SpecialStockDTO extends SpecialStockModel {

    private String detailHref;
    private String totalPriceOriginal;
    private String totalPriceCurrent;
    private String unitPriceStr;
    private String areaStr;
    private List<EstateImageModel> estateImageList = new ArrayList();
    private Long startTimeX;
    private Long endTimeX;

    public String getDetailHref() {
        return detailHref;
    }

    public void setDetailHref(String detailHref) {
        this.detailHref = detailHref;
    }

    public String getTotalPriceOriginal() {
        return totalPriceOriginal;
    }

    public void setTotalPriceOriginal(String totalPriceOriginal) {
        this.totalPriceOriginal = totalPriceOriginal;
    }

    public String getTotalPriceCurrent() {
        return totalPriceCurrent;
    }

    public void setTotalPriceCurrent(String totalPriceCurrent) {
        this.totalPriceCurrent = totalPriceCurrent;
    }

    public String getUnitPriceStr() {
        return unitPriceStr;
    }

    public void setUnitPriceStr(String unitPriceStr) {
        this.unitPriceStr = unitPriceStr;
    }

    public String getAreaStr() {
        return areaStr;
    }

    public void setAreaStr(String areaStr) {
        this.areaStr = areaStr;
    }

    public List<EstateImageModel> getEstateImageList() {
        return estateImageList;
    }

    public void setEstateImageList(List<EstateImageModel> estateImageList) {
        this.estateImageList = estateImageList;
    }

    public Long getStartTimeX() {
        return startTimeX;
    }

    public void setStartTimeX(Long startTimeX) {
        this.startTimeX = startTimeX;
    }

    public Long getEndTimeX() {
        return endTimeX;
    }

    public void setEndTimeX(Long endTimeX) {
        this.endTimeX = endTimeX;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SpecialStockDTO)) return false;
        if (!super.equals(o)) return false;
        SpecialStockDTO that = (SpecialStockDTO) o;
        return Objects.equals(detailHref, that.detailHref);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), detailHref);
    }
}