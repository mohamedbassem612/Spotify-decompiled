package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class i0j1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        h0j1 h0j1Var;
        if (onmVar instanceof h0j1) {
            h0j1Var = (h0j1) onmVar;
            int i = h0j1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                h0j1Var.b = i - Integer.MIN_VALUE;
            } else {
                h0j1Var = new h0j1(this, onmVar);
            }
        } else {
            h0j1Var = new h0j1(this, onmVar);
        }
        Object obj2 = h0j1Var.a;
        int i2 = h0j1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new y2k(2, (lnm) null, (byte) 5));
            aud1 aud1Var = new aud1(r261Var, (byte) 13);
            h0j1Var.b = 1;
            Object objCollect = m441Var.collect(aud1Var, h0j1Var);
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
