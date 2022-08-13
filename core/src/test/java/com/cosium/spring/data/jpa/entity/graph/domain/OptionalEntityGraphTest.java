package com.cosium.spring.data.jpa.entity.graph.domain;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

/**
 * Created on 04/08/18.
 *
 * @author Reda.Housni-Alaoui
 */
public class OptionalEntityGraphTest {

  @Test
  public void testEmpty() {
    EntityGraph emptyGraph = EntityGraphs.empty();
    assertThat(OptionalEntityGraph.of(emptyGraph)).isEmpty();
  }

  @Test
  public void testNonEmpty() {
    EntityGraph fooGraph = EntityGraphs.named("foo");
    assertThat(OptionalEntityGraph.of(fooGraph)).contains(fooGraph);
  }
}
