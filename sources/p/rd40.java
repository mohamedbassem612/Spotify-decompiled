package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rd40 {
    public final n4y0 a;

    public rd40(n4y0 n4y0Var) {
        this.a = n4y0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rd40) && this.a.equals(((rd40) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
