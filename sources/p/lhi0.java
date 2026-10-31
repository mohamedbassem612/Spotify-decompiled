package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lhi0 extends mhi0 {
    public final mey0 a;
    public final String b;
    public final op80 c;

    public lhi0(String str, op80 op80Var, mey0 mey0Var) {
        this.a = mey0Var;
        this.b = str;
        this.c = op80Var;
    }

    @Override // p.mhi0
    public final mey0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhi0)) {
            return false;
        }
        lhi0 lhi0Var = (lhi0) obj;
        return this.a.equals(lhi0Var.a) && this.b.equals(lhi0Var.b) && this.c.equals(lhi0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
