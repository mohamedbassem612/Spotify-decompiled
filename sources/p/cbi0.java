package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cbi0 implements qq60 {
    public final String a;
    public final op80 b;
    public final mey0 c;

    public cbi0(String str, op80 op80Var, mey0 mey0Var) {
        this.a = str;
        this.b = op80Var;
        this.c = mey0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cbi0)) {
            return false;
        }
        cbi0 cbi0Var = (cbi0) obj;
        return this.a.equals(cbi0Var.a) && this.b.equals(cbi0Var.b) && this.c.equals(cbi0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31);
    }
}
