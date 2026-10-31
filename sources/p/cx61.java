package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cx61 implements myl {
    public final String a;
    public final int b;
    public final p95 c;
    public final boolean d;

    public cx61(String str, int i, p95 p95Var, boolean z) {
        this.a = str;
        this.b = i;
        this.c = p95Var;
        this.d = z;
    }

    @Override // p.myl
    public final wpl a(cdf0 cdf0Var, fcf0 fcf0Var, hba hbaVar) {
        return new kw61(cdf0Var, hbaVar, this);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ShapePath{name=");
        sb.append(this.a);
        sb.append(", index=");
        return l1d.o(sb, this.b, '}');
    }
}
