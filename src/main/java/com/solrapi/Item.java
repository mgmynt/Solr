package com.solrapi;
import org.springframework.data.annotation.Id;
import org.springframework.data.solr.core.mapping.Indexed;
import org.springframework.data.solr.core.mapping.SolrDocument;

@SolrDocument(collection = "Items")
public class Item
{
    @Id

    @Indexed(name = "id", type = "Integer")
    Integer id;
    @Indexed(name = "title", type = "String")
    String title;
    @Indexed(name = "price", type = "Integer")
    Integer price;
    @Indexed(name = "descr", type = "String")
    String descr;

    public Item() {} // Empty constructor is required

    public Item(Integer id, String title, Integer price, String descr)
    {
        super();
        this.id = id;
        this.title = title;
        this.price = price;
        this.descr = descr;
    }

    // Getter Setters
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public String getDescr(){
        return descr;
    }
    public void setDescr(String descr){
        this.descr = descr;
    }
}

