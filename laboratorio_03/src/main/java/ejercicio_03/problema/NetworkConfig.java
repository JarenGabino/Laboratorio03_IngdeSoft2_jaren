package ejercicio_03.problema;

public enum NetworkConfig {
    INSTANCE; // única instancia

    private String endpoint = "https://api.game.local"; // antes host/port/secure

    public String getEndpoint() { return endpoint; }
    public void setEndpoint(String endpoint) { this.endpoint = endpoint; }

    @Override
    public String toString() {
        return "NetworkConfig{endpoint='" + endpoint + "'}";
    }
}
