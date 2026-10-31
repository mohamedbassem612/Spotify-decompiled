package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y2g0 {
    public final tif1 a;
    public final llm b;

    public y2g0(tif1 tif1Var) {
        this.a = tif1Var;
        fns fnsVar = igu.a;
        bs50 bs50Var = pyf0.a.f;
        j0d1 j0d1VarB = guo1.B();
        bs50Var.getClass();
        this.b = smo1.e(ilo1.B(bs50Var, j0d1VarB).y(new z8n("MainThreadRunnerCoroutines")));
    }

    public final void a(Function0 function0) {
        c921.y(this.b, (o8n) null, 0, new to1(function0, (lnm) null, (byte) 15), 3);
    }

    public final void b(String str, Function0 function0) {
        String strConcat = "MainThreadRunner".concat(str);
        this.a.e(1, strConcat, "mtr");
        c921.D(new v4e0(this, strConcat, function0, (lnm) null, (byte) 14));
    }
}
