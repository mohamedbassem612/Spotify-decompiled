package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kbb1 implements nbb1 {
    public final ibb1 a;
    public final obb1 b;

    public kbb1(ibb1 ibb1Var, obb1 obb1Var) {
        this.a = ibb1Var;
        this.b = obb1Var;
    }

    public final ibb1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kbb1)) {
            return false;
        }
        kbb1 kbb1Var = (kbb1) obj;
        return this.a.equals(kbb1Var.a) && this.b.equals(kbb1Var.b);
    }

    public final rbb1 getPlaceholder() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.a.hashCode() + (this.a.hashCode() * 31);
    }
}
