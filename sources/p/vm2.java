package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vm2 extends xm2 {
    public final rk2 b;

    public vm2(rk2 rk2Var) {
        super(rk2Var);
        this.b = rk2Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vm2) && this.b.equals(((vm2) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
