package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z4g implements a5g {
    public final a8x a;

    public z4g(a8x a8xVar) {
        this.a = a8xVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z4g) && this.a.equals(((z4g) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
