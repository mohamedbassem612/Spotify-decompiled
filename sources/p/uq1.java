package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class uq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ f2g1 a;

    public uq1(f2g1 f2g1Var) {
        this.a = f2g1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        so1 so1Var = (so1) this.a.b;
        pia1 pia1Var = ((aq1) obj).a;
        String str = so1Var.S0;
        if (!ihc1.y0(str)) {
            bpb1 bpb1Var = so1Var.X0;
            ria1 ria1Var = so1Var.d;
            String strC = ria1.c(pia1Var);
            hma1 hma1VarEdit = ria1Var.b.b(ria1Var.a, str).edit();
            hma1VarEdit.d(ria1.d, strC);
            hma1VarEdit.g();
            bpb1Var.m((Object) null, ria1.b(strC));
        }
        return rih1.a;
    }
}
