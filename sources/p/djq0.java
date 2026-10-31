package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class djq0 {
    public final z6a0 a;
    public final Function0 b;
    public volatile x390 c;

    public djq0(z6a0 z6a0Var, nbc nbcVar) {
        hhp0 hhp0Var = hhp0.a;
        cjq0 cjq0Var = cjq0.a;
        this.a = z6a0Var;
        this.b = cjq0Var;
    }

    public final void a(a7a0 a7a0Var) {
        if (a7a0Var.d) {
            long jI = a7a0Var.a + (jfv.i(nbc.e()) - ((Number) this.b.invoke()).longValue());
            hhp0.a.v(jI / 1000, (jI + jfv.i(a7a0Var.b)) / 1000);
        }
    }
}
