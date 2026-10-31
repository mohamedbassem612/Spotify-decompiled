package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hai0 extends iai0 {
    public final mey0 a;
    public final String b;
    public final op80 c;

    public hai0(String str, op80 op80Var, mey0 mey0Var) {
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
        if (!(obj instanceof hai0)) {
            return false;
        }
        hai0 hai0Var = (hai0) obj;
        return this.a.equals(hai0Var.a) && this.b.equals(hai0Var.b) && this.c.equals(hai0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
