package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rei0 extends tei0 {
    public final mey0 a;
    public final String b;
    public final op80 c;

    public rei0(String str, op80 op80Var, mey0 mey0Var) {
        this.a = mey0Var;
        this.b = str;
        this.c = op80Var;
    }

    @Override // p.tei0
    public final mey0 b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rei0)) {
            return false;
        }
        rei0 rei0Var = (rei0) obj;
        return this.a.equals(rei0Var.a) && this.b.equals(rei0Var.b) && this.c.equals(rei0Var.c);
    }

    @Override // p.qq60
    public final String getId() {
        return this.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b);
    }
}
