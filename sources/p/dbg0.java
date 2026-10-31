package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dbg0 {
    public final q9g0 a;

    public dbg0(q9g0 q9g0Var) {
        this.a = q9g0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dbg0) && this.a.equals(((dbg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
