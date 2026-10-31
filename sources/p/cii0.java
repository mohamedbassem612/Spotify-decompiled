package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class cii0 {
    public final t810 a;
    public final rhi0 b;

    public cii0(t810 t810Var, rhi0 rhi0Var) {
        this.a = t810Var;
        this.b = rhi0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cii0)) {
            return false;
        }
        cii0 cii0Var = (cii0) obj;
        return this.a.equals(cii0Var.a) && u890.j(this.b, cii0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
