package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oei0 extends qei0 {
    public final mey0 a;
    public final String b;
    public final op80 c;

    public oei0(String str, op80 op80Var, mey0 mey0Var) {
        this.a = mey0Var;
        this.b = str;
        this.c = op80Var;
    }

    @Override // p.qei0
    public final mey0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oei0)) {
            return false;
        }
        oei0 oei0Var = (oei0) obj;
        return this.a.equals(oei0Var.a) && this.b.equals(oei0Var.b) && this.c.equals(oei0Var.c);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
