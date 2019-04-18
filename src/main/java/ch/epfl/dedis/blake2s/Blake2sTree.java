package ch.epfl.dedis.blake2s;

public class Blake2sTree {
    private int fanout = 1;
    private int maxDepth = 1;
    private long leafSize = 0;
    private int innerDigestLength = 0;
    private long nodeOffset = 0;
    private int nodeDepth = 0;
    private boolean lastNode = false;

    public Blake2sTree() {}

    public Blake2sTree(int fanout, int maxDepth, long leafSize, int innerDigestLength, long nodeOffset, int nodeDepth, boolean lastNode) {
        this.fanout = fanout;
        this.maxDepth = maxDepth;
        this.leafSize = leafSize;
        this.innerDigestLength = innerDigestLength;
        this.nodeOffset = nodeOffset;
        this.nodeDepth = nodeDepth;
        this.lastNode = lastNode;
    }

    public int getFanout() {
        return this.fanout;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public long getLeafSize() {
        return this.leafSize;
    }

    public int getInnerDigestLength() {
        return this.innerDigestLength;
    }

    public long getNodeOffset() {
        return this.nodeOffset;
    }

    public void incrementNodeOffset() {
        nodeOffset++;
    }

    public int getNodeDepth() {
        return this.nodeDepth;
    }

    public boolean isLastNode() {
        return this.lastNode;
    }
}
