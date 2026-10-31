package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class pei0 extends qei0 {
    public final mey0 a;
    public final String b;
    public final op80 c;
    public final x360 d;

    public pei0(mey0 mey0Var, String str, op80 op80Var, x360 x360Var) {
        this.a = mey0Var;
        this.b = str;
        this.c = op80Var;
        this.d = x360Var;
    }

    @Override // p.qei0
    public final mey0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pei0)) {
            return false;
        }
        pei0 pei0Var = (pei0) obj;
        return this.a.equals(pei0Var.a) && this.b.equals(pei0Var.b) && this.c.equals(pei0Var.c) && u890.j(this.d, pei0Var.d);
    }

    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        int i = x0d.i(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        x360 x360Var = this.d;
        return i + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
