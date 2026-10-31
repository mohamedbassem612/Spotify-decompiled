package p;

import android.graphics.Path;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ow61 implements myl {
    public final boolean a;
    public final Path.FillType b;
    public final String c;
    public final p95 d;
    public final p95 e;
    public final boolean f;

    public ow61(String str, boolean z, Path.FillType fillType, p95 p95Var, p95 p95Var2, boolean z2) {
        this.c = str;
        this.a = z;
        this.b = fillType;
        this.d = p95Var;
        this.e = p95Var2;
        this.f = z2;
    }

    @Override // p.myl
    public final wpl a(cdf0 cdf0Var, fcf0 fcf0Var, hba hbaVar) {
        return new a620(cdf0Var, hbaVar, this);
    }

    public final String toString() {
        return f4i1.g(new StringBuilder("ShapeFill{color=, fillEnabled="), this.a, '}');
    }
}
