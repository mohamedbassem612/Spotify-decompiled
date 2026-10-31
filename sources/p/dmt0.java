package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dmt0 implements qq60, rnt0 {
    public final String a;
    public final op80 b;
    public final lnt0 c;
    public final x360 d;
    public final String e;

    public dmt0(String str, op80 op80Var, lnt0 lnt0Var, x360 x360Var, String str2) {
        this.a = str;
        this.b = op80Var;
        this.c = lnt0Var;
        this.d = x360Var;
        this.e = str2;
    }

    @Override // p.rnt0
    public final lnt0 a() {
        return this.c;
    }

    @Override // p.rnt0
    public final x360 b() {
        return this.d;
    }

    @Override // p.rnt0
    public final String c() {
        return this.e;
    }

    @Override // p.rnt0
    public final op80 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dmt0)) {
            return false;
        }
        dmt0 dmt0Var = (dmt0) obj;
        return this.a.equals(dmt0Var.a) && this.b.equals(dmt0Var.b) && this.c.equals(dmt0Var.c) && u890.j(this.d, dmt0Var.d) && this.e.equals(dmt0Var.e);
    }

    @Override // p.qq60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + x0d.i(this.b, this.a.hashCode() * 31, 31)) * 31;
        x360 x360Var = this.d;
        return this.e.hashCode() + ((iHashCode + (x360Var == null ? 0 : x360Var.hashCode())) * 31);
    }
}
