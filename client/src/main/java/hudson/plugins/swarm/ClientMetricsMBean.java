package hudson.plugins.swarm;

public interface ClientMetricsMBean {

    public void setState(String state);

    public String getState();

    public void setLastDisconnectionTime(Long lastDisconnectionTime);

    public Long getLastDisconnectionTime();

}