package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gai0 extends iai0 {
    public final mey0 a;
    public final String b;
    public final op80 c;

    public gai0(String str, op80 op80Var, mey0 mey0Var) {
        this.a = mey0Var;
        this.b = str;
        this.c = op80Var;
    }

    @Override // p.iai0
    public final mey0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gai0)) {
            return false;
        }
        gai0 gai0Var = (gai0) obj;
        return this.a.equals(gai0Var.a) && this.b.equals(gai0Var.b) && this.c.equals(gai0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
