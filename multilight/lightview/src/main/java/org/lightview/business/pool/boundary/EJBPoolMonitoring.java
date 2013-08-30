/*
 *
 */
package org.lightview.business.pool.boundary;

import javax.annotation.PostConstruct;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 *
 * @author adam-bien.com
 */
public class EJBPoolMonitoring {

    private Client client;

    private String baseUri = "http://localhost:8080/";
    private String URI = "{base-uri}lightfish/resources/applications/{application}/ejbs/{ejb}";

    @PostConstruct
    public void init() {
        this.client = ClientBuilder.newClient();
    }

}
