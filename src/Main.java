class WirelessNetwork {

    public long cost, number;

    public WirelessNetwork(long cost, long number) {
        this.cost = cost;
        this.number = number;
    }

    public static
    /**
     * @param n The number of stations
     * @param m The number of edges
     * @param b the budget
     * @param edges the edges in the network, you should ignore edges[0] and only use edges[1] to
     *     edges[m].
     */
    WirelessNetwork setUpTheNetwork(int n, int m, int b, Edge[] edges) {
        return new WirelessNetwork(-999,-999);
    }
}

class Edge {

    // from, to and length
    int x, y, l;

    public Edge(int from, int to, int length) {
        x = from;
        y = to;
        l = length;
    }
}