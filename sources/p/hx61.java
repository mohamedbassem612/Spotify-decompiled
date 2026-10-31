package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hx61 implements myl {
    public final int a;
    public final q95 b;
    public final q95 c;
    public final q95 d;
    public final boolean e;

    public hx61(String str, int i, q95 q95Var, q95 q95Var2, q95 q95Var3, boolean z) {
        this.a = i;
        this.b = q95Var;
        this.c = q95Var2;
        this.d = q95Var3;
        this.e = z;
    }

    public final wpl a(cdf0 cdf0Var, fcf0 fcf0Var, hba hbaVar) {
        return new vvg1(hbaVar, this);
    }

    public final q95 b() {
        return this.c;
    }

    public final q95 c() {
        return this.d;
    }

    public final q95 d() {
        return this.b;
    }

    public final int e() {
        return this.a;
    }

    public final boolean f() {
        return this.e;
    }

    public final String toString() {
        return "Trim Path: {start: " + this.b + ", end: " + this.c + ", offset: " + this.d + "}";
    }
}
