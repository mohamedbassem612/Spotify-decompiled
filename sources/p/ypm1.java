package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ypm1 {
    public final boolean a;
    public final xpm1 b;

    public ypm1(boolean z, xpm1 xpm1Var) {
        this.a = z;
        this.b = xpm1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ypm1)) {
            return false;
        }
        ypm1 ypm1Var = (ypm1) obj;
        return this.a == ypm1Var.a && this.b.equals(ypm1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
