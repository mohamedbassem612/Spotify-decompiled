package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class kr31 implements cba, wpl {
    public final cdf0 a;
    public final fba b;
    public lw61 c;

    public kr31(cdf0 cdf0Var, hba hbaVar, jr31 jr31Var) {
        this.a = cdf0Var;
        fba fbaVarC0 = jr31Var.b().c0();
        this.b = fbaVarC0;
        hbaVar.d(fbaVarC0);
        fbaVarC0.a(this);
    }

    public static int d(int i, int i2) {
        int i3 = i / i2;
        if ((i ^ i2) < 0 && i3 * i2 != i) {
            i3--;
        }
        return i - (i3 * i2);
    }

    @Override // p.cba
    public final void a() {
        this.a.invalidateSelf();
    }

    @Override // p.wpl
    public final void b(List list, List list2) {
    }
}
