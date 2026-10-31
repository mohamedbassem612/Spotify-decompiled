package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tm2 extends xm2 {
    public final rk2 b;

    public tm2(rk2 rk2Var) {
        super(rk2Var);
        this.b = rk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tm2) && this.b.equals(((tm2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
