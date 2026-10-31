package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b070 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        a070 a070Var;
        if (onmVar instanceof a070) {
            a070Var = (a070) onmVar;
            int i = a070Var.b;
            if ((i & os00.INVALID_ID) != 0) {
                a070Var.b = i - os00.INVALID_ID;
            } else {
                a070Var = new a070(this, onmVar);
            }
        } else {
            a070Var = new a070(this, onmVar);
        }
        Object obj2 = a070Var.a;
        int i2 = a070Var.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new y2k(2, null, (byte) 3));
            cg00 cg00Var = new cg00(r261Var, (byte) 17);
            a070Var.b = 1;
            Object objCollect = m441Var.collect(cg00Var, a070Var);
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
