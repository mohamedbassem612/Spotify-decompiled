package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tli1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ cmi1 a;

    public tli1(cmi1 cmi1Var) {
        this.a = cmi1Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        sli1 sli1Var;
        if (onmVar instanceof sli1) {
            sli1Var = (sli1) onmVar;
            int i = sli1Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                sli1Var.b = i - Integer.MIN_VALUE;
            } else {
                sli1Var = new sli1(this, onmVar);
            }
        } else {
            sli1Var = new sli1(this, onmVar);
        }
        Object obj2 = sli1Var.a;
        int i2 = sli1Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new p1r(this.a.h, (lnm) null, (byte) 24));
            aud1 aud1Var = new aud1(r261Var, (byte) 11);
            sli1Var.b = 1;
            Object objCollect = m441Var.collect(aud1Var, sli1Var);
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
