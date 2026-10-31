package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e3k implements i3k {
    public final d3k a;

    public e3k(d3k d3kVar) {
        this.a = d3kVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e3k) && this.a == ((e3k) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
