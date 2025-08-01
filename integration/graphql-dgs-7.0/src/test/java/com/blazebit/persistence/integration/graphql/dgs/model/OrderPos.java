/*
 * SPDX-License-Identifier: Apache-2.0
 * Copyright Blazebit
 */

package com.blazebit.persistence.integration.graphql.dgs.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;

/**
 * @author Christian Beikov
 * @since 1.6.16
 */
@Entity
public class OrderPos {

    @EmbeddedId
    private OrderPosId id;
    @MapsId("orderId")
    @ManyToOne(fetch = FetchType.LAZY)
    private Order order;
    private String name;

    public OrderPos() {
    }

    public OrderPos(String name) {
        this.name = name;
    }

    public OrderPosId getId() {
        return id;
    }

    public void setId(OrderPosId id) {
        this.id = id;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
