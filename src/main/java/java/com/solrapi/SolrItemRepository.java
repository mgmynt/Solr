package java.com.solrapi;
import org.springframework.data.solr.repository.Query;
import org.springframework.data.solr.repository.SolrCrudRepository;

import java.util.List;

public interface SolrItemRepository extends SolrCrudRepository <Item,Integer>{
    @Query("title:*?0*")
    List<Item> findByTitle(String title);
    @Query("id:*?0*")
    Item findItById(Integer id);
    @Query("descr:*?0*")
    List<Item> findByDescr(String descr);


}
