package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jdw0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        idw0 idw0Var;
        if (onmVar instanceof idw0) {
            idw0Var = (idw0) onmVar;
            int i = idw0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                idw0Var.b = i - Integer.MIN_VALUE;
            } else {
                idw0Var = new idw0(this, onmVar);
            }
        } else {
            idw0Var = new idw0(this, onmVar);
        }
        Object obj2 = idw0Var.a;
        int i2 = idw0Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new ian0((kcw0) obj, (lnm) null, (byte) 17));
            klp0 klp0Var = new klp0(r261Var, (byte) 8);
            idw0Var.b = 1;
            Object objCollect = m441Var.collect(klp0Var, idw0Var);
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
