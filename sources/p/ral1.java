package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ral1 implements qq60 {
    public final String a;
    public final op80 b;
    public final wcl1 c;

    public ral1(String str, op80 op80Var, wcl1 wcl1Var) {
        this.a = str;
        this.b = op80Var;
        this.c = wcl1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ral1)) {
            return false;
        }
        ral1 ral1Var = (ral1) obj;
        return this.a.equals(ral1Var.a) && this.b.equals(ral1Var.b) && this.c.equals(ral1Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
