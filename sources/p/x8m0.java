package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class x8m0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l9m0 a;

    public x8m0(l9m0 l9m0Var) {
        this.a = l9m0Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        w8m0 w8m0Var;
        if (onmVar instanceof w8m0) {
            w8m0Var = (w8m0) onmVar;
            int i = w8m0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                w8m0Var.b = i - Integer.MIN_VALUE;
            } else {
                w8m0Var = new w8m0(this, onmVar);
            }
        } else {
            w8m0Var = new w8m0(this, onmVar);
        }
        Object obj2 = w8m0Var.a;
        int i2 = w8m0Var.b;
        rih1 rih1Var = rih1.a;
        if (i2 != 0) {
            if (i2 == 1) {
                hm5.M(obj2);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj2);
        ch chVar = this.a.e;
        lnm lnmVar = null;
        byte b = 0;
        mr20 mr20VarU = rqt0.u(h5p1.s(h4p1.f(new wg(chVar, null, (byte) 1)), h4p1.f(new bh(chVar, ch.c, new yg(chVar, (byte) 0), lnmVar, b)), rqt0.u(hu20.d(new mr20[]{h4p1.f(new bh(chVar, ch.d, new yg(chVar, (byte) 1), lnmVar, b)), h4p1.f(new wg(chVar, null, (byte) 0))})), xg.h));
        q5g0 q5g0Var = new q5g0(r261Var, (byte) 18);
        w8m0Var.b = 1;
        Object objCollect = mr20VarU.collect(new dgk0(q5g0Var, (byte) 7), w8m0Var);
        d9n d9nVar = d9n.a;
        if (objCollect != d9nVar) {
            objCollect = rih1Var;
        }
        return objCollect == d9nVar ? d9nVar : rih1Var;
    }
}
