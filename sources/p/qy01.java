package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qy01 extends ry01 {
    public final tx01 a;

    public qy01(tx01 tx01Var) {
        this.a = tx01Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qy01) && this.a.equals(((qy01) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
