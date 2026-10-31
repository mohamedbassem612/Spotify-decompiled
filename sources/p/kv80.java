package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kv80 extends z47 {
    public final String g;

    public kv80(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kv80) && this.g.equals(((kv80) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String x() {
        return this.g;
    }
}
