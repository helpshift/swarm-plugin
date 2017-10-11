package hudson.plugins.swarm;

public class ClientMetrics implements ClientMetricsMBean {

    private String state;

    private Long lastDisconnectionTime;

    public ClientMetrics() {
        this.lastDisconnectionTime = null;
    }

    @java.lang.Override
    public void setState(String state) {
        this.state = state;
    }

    @java.lang.Override
    public String getState() {
        return this.state;
    }

    @java.lang.Override
    public Long getLastDisconnectionTime() {
        return lastDisconnectionTime;
    }

    @java.lang.Override
    public void setLastDisconnectionTime(Long lastDisconnectionTime) {
        this.lastDisconnectionTime = lastDisconnectionTime;
    }
}
