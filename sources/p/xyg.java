package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class xyg {
    public final String a;
    public final int b;
    public final s1f1 c;

    public xyg(String str, int i, s1f1 s1f1Var) {
        this.a = str;
        this.b = i;
        this.c = s1f1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xyg)) {
            return false;
        }
        xyg xygVar = (xyg) obj;
        return this.a.equals(xygVar.a) && this.b == xygVar.b && this.c.equals(xygVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b, this.a.hashCode() * 31, 31);
    }
}
