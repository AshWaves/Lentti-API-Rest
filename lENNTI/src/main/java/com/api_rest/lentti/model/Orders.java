/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.api_rest.lentti.model;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 *
 */
@Entity
@Table(name = "orders")
@EqualsAndHashCode
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Orders implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_order")
    private Integer idOrder;
    @Basic(optional = false)
    @Column(name = "quantity_products")
    private int quantityProducts;
    @Basic(optional = false)
    @Column(name = "total_price")
    private double totalPrice;
    @Basic(optional = false)
    @Column(name = "pick_up_location")
    private String pickUpLocation;
    @Basic(optional = false)
    @Column(name = "place_of_delivery")
    private String placeOfDelivery;
    @Column(name = "description")
    private String description;
    @JoinColumn(name = "delivery_document", referencedColumnName = "delivery_document")
    @ManyToOne(optional = false)
    private Deliveries deliveryDocument;
    @JoinColumn(name = "user_document", referencedColumnName = "user_document")
    @ManyToOne(optional = false)
    private Users userDocument;


}
