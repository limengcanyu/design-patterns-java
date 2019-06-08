package com.filter.pattern;

import java.util.List;

/**
 * comment
 *
 * @author rock
 * @date 2019/6/8
 */
public interface Criteria {
    List<Person> meetCriteria(List<Person> persons);
}
