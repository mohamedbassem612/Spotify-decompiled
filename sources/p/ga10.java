package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ga10 {
    public final oox0 a;
    public final ykm b;

    public ga10(oox0 oox0Var, ykm ykmVar) {
        this.a = oox0Var;
        this.b = ykmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ga10)) {
            return false;
        }
        ga10 ga10Var = (ga10) obj;
        return this.a.equals(ga10Var.a) && this.b.equals(ga10Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
