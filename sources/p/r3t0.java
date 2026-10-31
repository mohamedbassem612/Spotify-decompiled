package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r3t0 {
    public final h290 a;

    public r3t0(h290 h290Var) {
        this.a = h290Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r3t0) && this.a.equals(((r3t0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
