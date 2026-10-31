package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class tii0 implements l9c {
    public final String a;
    public final k3h1 b;
    public final mey0 c;

    public tii0(String str, k3h1 k3h1Var, mey0 mey0Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = mey0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tii0)) {
            return false;
        }
        tii0 tii0Var = (tii0) obj;
        return this.a.equals(tii0Var.a) && this.b.equals(tii0Var.b) && this.c.equals(tii0Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
