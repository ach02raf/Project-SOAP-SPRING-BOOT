package com.example.consumingwebservices.consumingwebservices;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import com.example.ws.calculator.*;

public class calculatorClient extends WebServiceGatewaySupport {
    private static final Logger log = LoggerFactory.getLogger(calculatorClient.class);

    public AddResponse getAddResult(int a, int b) {
        Add add = new Add();
        add.setIntA(a);
        add.setIntB(b);
        log.info("Requesting location for " + add);
        AddResponse information = (AddResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", add,
                        new SoapActionCallback(
                                "http://tempuri.org/Add"));

        return information;
    }

    public MultiplyResponse getMultiplyResult(int a, int b) {
        Multiply multiply = new Multiply();
        multiply.setIntA(a);
        multiply.setIntB(b);
        log.info("Requesting location for " + multiply);
        MultiplyResponse information = (MultiplyResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", multiply,
                        new SoapActionCallback(
                                "http://tempuri.org/Multiply"));

        return information;
    }

    public DivideResponse getDivideResult(int a, int b) {
        Divide divide = new Divide();
        divide.setIntA(a);
        divide.setIntB(b);
        log.info("Requesting location for " + divide);
        DivideResponse information = (DivideResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", divide,
                        new SoapActionCallback(
                                "http://tempuri.org/Divide"));

        return information;
    }

    public SubtractResponse getSubtractResult(int a, int b) {
        Subtract subtract = new Subtract();
        subtract.setIntA(a);
        subtract.setIntB(b);
        log.info("Requesting location for " + subtract);
        SubtractResponse information = (SubtractResponse) getWebServiceTemplate()
                .marshalSendAndReceive("http://www.dneonline.com/calculator.asmx", subtract,
                        new SoapActionCallback(
                                "http://tempuri.org/Subtract"));

        return information;
    }
}
