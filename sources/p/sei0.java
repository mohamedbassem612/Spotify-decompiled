package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sei0 extends tei0 {
    public final mey0 a;
    public final String b;
    public final op80 c;
    public final x360 d;

    public sei0(mey0 mey0Var, String str, op80 op80Var, x360 x360Var) {
        this.a = mey0Var;
        this.b = str;
        this.c = op80Var;
        this.d = x360Var;
    }

    @Override // p.tei0
    public final mey0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sei0)) {
            return false;
        }
        sei0 sei0Var = (sei0) obj;
        return this.a.equals(sei0Var.a) && this.b.equals(sei0Var.b) && this.c.equals(sei0Var.c) && u890.j(this.d, sei0Var.d);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        int i = x0d.i(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
        x360 x360Var = this.d;
        return i + (x360Var == null ? 0 : x360Var.hashCode());
    }
}
