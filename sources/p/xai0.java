package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xai0 {
    public final t810 a;
    public final lai0 b;

    public xai0(t810 t810Var, lai0 lai0Var) {
        this.a = t810Var;
        this.b = lai0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xai0)) {
            return false;
        }
        xai0 xai0Var = (xai0) obj;
        return this.a.equals(xai0Var.a) && u890.j(this.b, xai0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
