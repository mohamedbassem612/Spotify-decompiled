package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class lm0 implements nm0 {
    public final Object a;
    public final xpw b;

    public lm0(Object obj, xpw xpwVar) {
        this.a = obj;
        this.b = xpwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm0)) {
            return false;
        }
        lm0 lm0Var = (lm0) obj;
        return this.a.equals(lm0Var.a) && u890.j(this.b, lm0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
