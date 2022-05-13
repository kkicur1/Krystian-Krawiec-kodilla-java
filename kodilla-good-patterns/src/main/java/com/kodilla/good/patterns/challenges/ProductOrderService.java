package com.kodilla.good.patterns.challenges;

public class ProductOrderService {

    private InformationService informationService;
    private OrderService orderService;
    private OrderRepository orderRepository;

    public ProductOrderService(final InformationService informationService,
                           final OrderService orderService,
                           final OrderRepository orderRepository) {
        this.informationService = informationService;
        this.orderService = orderService;
        this.orderRepository = orderRepository;
    }

    public OrderDto process(final OrderRequest orderRequest) {
        boolean isBought = orderService.order(orderRequest.getUser(), orderRequest.getProduct(),
                orderRequest.getOrderTime());

        if (isBought) {
            orderRequest.getProduct().decreaseStock();
            informationService.inform(orderRequest.getUser());
            orderRepository.createOrder(orderRequest.getUser(), orderRequest.getProduct(), orderRequest.getOrderTime());
            return new OrderDto(orderRequest.getUser(), orderRequest.getProduct(),true);
        } else {
            return new OrderDto(orderRequest.getUser(),orderRequest.getProduct(),false);
        }
    }
}