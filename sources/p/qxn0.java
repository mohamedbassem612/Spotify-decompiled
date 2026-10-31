package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class qxn0 implements igb1 {
    public final lxn0 a;
    public final pxn0 b;

    public qxn0(lxn0 lxn0Var, pxn0 pxn0Var) {
        this.a = lxn0Var;
        this.b = pxn0Var;
    }

    @Override // p.igb1
    public final hgb1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxn0)) {
            return false;
        }
        qxn0 qxn0Var = (qxn0) obj;
        return this.a.equals(qxn0Var.a) && this.b.equals(qxn0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
