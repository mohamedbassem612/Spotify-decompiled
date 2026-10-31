package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class riu0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        qiu0 qiu0Var;
        if (onmVar instanceof qiu0) {
            qiu0Var = (qiu0) onmVar;
            int i = qiu0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                qiu0Var.b = i - Integer.MIN_VALUE;
            } else {
                qiu0Var = new qiu0(this, onmVar);
            }
        } else {
            qiu0Var = new qiu0(this, onmVar);
        }
        Object obj2 = qiu0Var.a;
        int i2 = qiu0Var.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new ian0((hju0) obj, lnmVar, (byte) 12));
            klp0 klp0Var = new klp0(r261Var, (byte) 4);
            qiu0Var.b = 1;
            Object objCollect = m441Var.collect(klp0Var, qiu0Var);
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
