package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t4b extends z47 {
    public final String g;

    public t4b(String str) {
        this.g = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t4b) && this.g.equals(((t4b) obj).g);
    }

    public final int hashCode() {
        return this.g.hashCode();
    }
}
