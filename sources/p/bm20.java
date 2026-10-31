package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class bm20 {
    public final am20 a;
    public final e940 b;

    public bm20(am20 am20Var, e940 e940Var) {
        this.a = am20Var;
        this.b = e940Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bm20)) {
            return false;
        }
        bm20 bm20Var = (bm20) obj;
        return u890.j(this.a, bm20Var.a) && u890.j(this.b, bm20Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        e940 e940Var = this.b;
        return iHashCode + (e940Var == null ? 0 : e940Var.hashCode());
    }

    public /* synthetic */ bm20() {
        this(zl20.a, null);
    }
}
