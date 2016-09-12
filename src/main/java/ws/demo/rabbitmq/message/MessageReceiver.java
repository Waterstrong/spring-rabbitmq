package ws.demo.rabbitmq.message;


import java.util.concurrent.CountDownLatch;

public class MessageReceiver {
    private CountDownLatch latch = new CountDownLatch(1);

    public void onMessage(String message) {
        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }
}
