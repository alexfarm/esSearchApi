package es;

import org.elasticsearch.index.query.QueryBuilder;

import java.util.List;

/**
 * Created by alex on 2020/1/30.
 */
public interface ESCriterion {
    public enum Operator {
        TERM, TERMS, RANGE, FUZZY, QUERY_STRING, MISSING
    }

    public enum MatchMode {
        START, END, ANYWHERE
    }

    public enum Projection {
        MAX, MIN, AVG, LENGTH, SUM, COUNT
    }

    public List<QueryBuilder> listBuilders();
}
