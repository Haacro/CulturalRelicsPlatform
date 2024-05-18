package com.ruoyi.museum.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 博物馆文物信息管理对象 museum
 * 
 * @author ruoyi
 * @date 2024-05-18
 */
public class Museum extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** ID */
    private Long id;

    /** 博物馆名称 */
    @Excel(name = "博物馆名称")
    private String museum;

    /** 文物名称 */
    @Excel(name = "文物名称")
    private String name;

    /** 存货 */
    @Excel(name = "存货")
    private String inventory;

    /** 大小 */
    @Excel(name = "大小")
    private String size;

    /** 源网址 */
    @Excel(name = "源网址")
    private String details;

    /** 朝代 */
    @Excel(name = "朝代")
    private String era;

    /** 工艺 */
    @Excel(name = "工艺")
    private String technique;

    /** 种类 */
    @Excel(name = "种类")
    private String category;

    /** 图片url */
    @Excel(name = "图片url")
    private String imageUrl;

    /** 作者 */
    @Excel(name = "作者")
    private String author;

    /** 卷数 */
    @Excel(name = "卷数")
    private String numberOfVolume;

    /** 雕刻或手工复制 */
    @Excel(name = "雕刻或手工复制")
    private String engravedOrHandcopied;

    public void setId(Long id) 
    {
        this.id = id;
    }

    public Long getId() 
    {
        return id;
    }
    public void setMuseum(String museum) 
    {
        this.museum = museum;
    }

    public String getMuseum() 
    {
        return museum;
    }
    public void setName(String name) 
    {
        this.name = name;
    }

    public String getName() 
    {
        return name;
    }
    public void setInventory(String inventory) 
    {
        this.inventory = inventory;
    }

    public String getInventory() 
    {
        return inventory;
    }
    public void setSize(String size) 
    {
        this.size = size;
    }

    public String getSize() 
    {
        return size;
    }
    public void setDetails(String details) 
    {
        this.details = details;
    }

    public String getDetails() 
    {
        return details;
    }
    public void setEra(String era) 
    {
        this.era = era;
    }

    public String getEra() 
    {
        return era;
    }
    public void setTechnique(String technique) 
    {
        this.technique = technique;
    }

    public String getTechnique() 
    {
        return technique;
    }
    public void setCategory(String category) 
    {
        this.category = category;
    }

    public String getCategory() 
    {
        return category;
    }
    public void setImageUrl(String imageUrl) 
    {
        this.imageUrl = imageUrl;
    }

    public String getImageUrl() 
    {
        return imageUrl;
    }
    public void setAuthor(String author) 
    {
        this.author = author;
    }

    public String getAuthor() 
    {
        return author;
    }
    public void setNumberOfVolume(String numberOfVolume) 
    {
        this.numberOfVolume = numberOfVolume;
    }

    public String getNumberOfVolume() 
    {
        return numberOfVolume;
    }
    public void setEngravedOrHandcopied(String engravedOrHandcopied) 
    {
        this.engravedOrHandcopied = engravedOrHandcopied;
    }

    public String getEngravedOrHandcopied() 
    {
        return engravedOrHandcopied;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("museum", getMuseum())
            .append("name", getName())
            .append("inventory", getInventory())
            .append("size", getSize())
            .append("details", getDetails())
            .append("era", getEra())
            .append("technique", getTechnique())
            .append("category", getCategory())
            .append("imageUrl", getImageUrl())
            .append("author", getAuthor())
            .append("numberOfVolume", getNumberOfVolume())
            .append("engravedOrHandcopied", getEngravedOrHandcopied())
            .toString();
    }
}
