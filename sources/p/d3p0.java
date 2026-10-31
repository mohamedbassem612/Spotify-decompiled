package p;

import android.content.Context;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class d3p0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qmu a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ lhd c;

    public d3p0(qmu qmuVar, Context context, lhd lhdVar) {
        this.a = qmuVar;
        this.b = context;
        this.c = lhdVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        c3p0 c3p0Var;
        if (onmVar instanceof c3p0) {
            c3p0Var = (c3p0) onmVar;
            int i = c3p0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                c3p0Var.b = i - Integer.MIN_VALUE;
            } else {
                c3p0Var = new c3p0(this, onmVar);
            }
        } else {
            c3p0Var = new c3p0(this, onmVar);
        }
        Object obj2 = c3p0Var.a;
        int i2 = c3p0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            qmu qmuVar = this.a;
            lt20 lt20Var = new lt20(new fu20(new qsc0(new iib(new fu20(rqt0.u(new xy0(qmuVar.c, (byte) 18)), new ett(qmuVar, (lnm) null, (byte) 3), (byte) 1), new xx0(qmuVar, (lnm) null, (byte) 6), (byte) 6), qmuVar, this.b, (byte) 14), new e3p0(this.c, (lnm) null, (byte) 0), (byte) 1), new ob00(3, null, (byte) 13), (byte) 0);
            q5g0 q5g0Var = new q5g0(r261Var, (byte) 28);
            c3p0Var.b = 1;
            Object objCollect = lt20Var.collect(q5g0Var, c3p0Var);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
