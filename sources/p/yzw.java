package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yzw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xzw xzwVar;
        if (onmVar instanceof xzw) {
            xzwVar = (xzw) onmVar;
            int i = xzwVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                xzwVar.b = i - os00.INVALID_ID;
            } else {
                xzwVar = new xzw(this, onmVar);
            }
        } else {
            xzwVar = new xzw(this, onmVar);
        }
        Object obj2 = xzwVar.a;
        int i2 = xzwVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new p1r((gju) obj, (lnm) null, (byte) 15));
            wmk wmkVar = new wmk(r261Var, (byte) 21);
            xzwVar.b = 1;
            Object objCollect = m441Var.collect(wmkVar, xzwVar);
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
