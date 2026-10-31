package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dbi0 implements l9c {
    public final String a;
    public final k3h1 b;
    public final mey0 c;

    public dbi0(String str, k3h1 k3h1Var, mey0 mey0Var) {
        this.a = str;
        this.b = k3h1Var;
        this.c = mey0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dbi0)) {
            return false;
        }
        dbi0 dbi0Var = (dbi0) obj;
        return this.a.equals(dbi0Var.a) && this.b.equals(dbi0Var.b) && this.c.equals(dbi0Var.c);
    }

    @Override // p.l9c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + kaa0.f(this.b.b, this.a.hashCode() * 31, 31);
    }
}
