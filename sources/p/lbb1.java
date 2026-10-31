package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lbb1 implements nbb1 {
    public final hbb1 a;
    public final rbb1 b;

    public lbb1(hbb1 hbb1Var, rbb1 rbb1Var) {
        this.a = hbb1Var;
        this.b = rbb1Var;
    }

    public final ibb1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lbb1)) {
            return false;
        }
        lbb1 lbb1Var = (lbb1) obj;
        return this.a.equals(lbb1Var.a) && this.b.equals(lbb1Var.b);
    }

    public final rbb1 getPlaceholder() {
        return this.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }
}
