package es;

import org.elasticsearch.index.query.QueryBuilder;
import org.elasticsearch.index.query.QueryBuilders;

import java.util.Collection;

/**
 * Created by alex on 2020/1/31.
 */
public class ESSimpleExpression {

    private String fieldName;       //属性名
    private Object value;           //对应值
    private Collection<Object> values;           //对应值
    private ESCriterion.Operator operator;      //计算符
    private Object from;
    private Object to;

    public ESSimpleExpression(String fieldName, Object value) {
        this.fieldName = fieldName;
        this.value = value;
    }

    public ESSimpleExpression(String fieldName, Object from, Object to) {
        this.fieldName = fieldName;
        this.from = from;
        this.to = to;
    }

    public ESSimpleExpression(String fieldName, Object value, ESCriterion.Operator operator) {
        this.fieldName = fieldName;
        this.value = value;
        this.operator = operator;
    }

    public ESSimpleExpression(String fieldName, Object value, Collection<Object> values, ESCriterion.Operator operator, Object from, Object to) {
        this.fieldName = fieldName;
        this.value = value;
        this.values = values;
        this.operator = operator;
        this.from = from;
        this.to = to;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Collection<Object> getValues() {
        return values;
    }

    public void setValues(Collection<Object> values) {
        this.values = values;
    }

    public ESCriterion.Operator getOperator() {
        return operator;
    }

    public void setOperator(ESCriterion.Operator operator) {
        this.operator = operator;
    }

    public Object getFrom() {
        return from;
    }

    public void setFrom(Object from) {
        this.from = from;
    }

    public Object getTo() {
        return to;
    }

    public void setTo(Object to) {
        this.to = to;
    }

    public QueryBuilder toBuilder() {
        QueryBuilder qb = null;
        switch (operator) {
            case TERM:
                qb = QueryBuilders.termQuery(fieldName, value);
                break;
            case TERMS:
                qb = QueryBuilders.termsQuery(fieldName, values);
                break;
            case RANGE:
                qb = QueryBuilders.rangeQuery(fieldName).from(from).to(to).includeLower(true).includeUpper(true);
                break;
            case FUZZY:
                qb = QueryBuilders.fuzzyQuery(fieldName, value);
                break;
            case QUERY_STRING:
                qb = QueryBuilders.queryStringQuery(value.toString());
        }
        return qb;
    }
}
