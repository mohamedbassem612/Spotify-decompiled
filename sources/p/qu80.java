package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qu80 extends z47 {
    public final String g;

    public qu80(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qu80) && this.g.equals(((qu80) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }

    public final String x() {
        return this.g;
    }
}
