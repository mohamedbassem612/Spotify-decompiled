package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xo01 {
    public final wo01 a;
    public final wo01 b;

    public xo01(wo01 wo01Var, wo01 wo01Var2) {
        this.a = wo01Var;
        this.b = wo01Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xo01)) {
            return false;
        }
        xo01 xo01Var = (xo01) obj;
        return this.a.equals(xo01Var.a) && this.b.equals(xo01Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
