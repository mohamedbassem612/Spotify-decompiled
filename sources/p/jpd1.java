package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jpd1 implements qq60 {
    public final lpd1 a;
    public final String b;
    public final op80 c;

    public jpd1(lpd1 lpd1Var, String str, op80 op80Var) {
        this.a = lpd1Var;
        this.b = str;
        this.c = op80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jpd1)) {
            return false;
        }
        jpd1 jpd1Var = (jpd1) obj;
        return this.a.equals(jpd1Var.a) && this.b.equals(jpd1Var.b) && this.c.equals(jpd1Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
