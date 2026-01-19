package br.com.dio.storefront.service;

import br.com.dio.storefront.DTO.StockStatusMessage;

interface IProductChangeAvailabilityConsumer {

    void receive(final StockStatusMessage message);
}

