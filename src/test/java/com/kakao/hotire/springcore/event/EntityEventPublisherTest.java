package com.kakao.hotire.springcore.event;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
class EntityEventPublisherTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private EntityEventPublisher entityEventPublisher;

    @Test
    void publish() {
        // given
        final Entity entity = new Entity(1L);

        // when
        entityEventPublisher.publish(entity);

        // no assert
    }
}