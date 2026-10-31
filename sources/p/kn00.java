package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kn00 implements w11 {
    public final boolean a;
    public final tn00 b;

    public kn00(boolean z, tn00 tn00Var) {
        this.a = z;
        this.b = tn00Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kn00)) {
            return false;
        }
        kn00 kn00Var = (kn00) obj;
        return this.a == kn00Var.a && u890.j(this.b, kn00Var.b);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        tn00 tn00Var = this.b;
        return iHashCode + (tn00Var == null ? 0 : tn00Var.hashCode());
    }
}
