package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class nrh1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ orh1 a;

    public nrh1(orh1 orh1Var) {
        this.a = orh1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mrh1 mrh1Var;
        if (onmVar instanceof mrh1) {
            mrh1Var = (mrh1) onmVar;
            int i = mrh1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mrh1Var.b = i - Integer.MIN_VALUE;
            } else {
                mrh1Var = new mrh1(this, onmVar);
            }
        } else {
            mrh1Var = new mrh1(this, onmVar);
        }
        Object obj2 = mrh1Var.a;
        int i2 = mrh1Var.b;
        byte b = 1;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            lt20 lt20Var = new lt20(new m441(new xoh1(this.a, (krh1) obj, lnmVar, b)), new q8t0(3, null, (byte) 29), (byte) 0);
            aud1 aud1Var = new aud1(r261Var, (byte) 4);
            mrh1Var.b = 1;
            Object objCollect = lt20Var.collect(aud1Var, mrh1Var);
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
