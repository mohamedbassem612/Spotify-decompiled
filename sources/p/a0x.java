package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class a0x implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        zzw zzwVar;
        if (onmVar instanceof zzw) {
            zzwVar = (zzw) onmVar;
            int i = zzwVar.b;
            if ((i & os00.INVALID_ID) != 0) {
                zzwVar.b = i - os00.INVALID_ID;
            } else {
                zzwVar = new zzw(this, onmVar);
            }
        } else {
            zzwVar = new zzw(this, onmVar);
        }
        Object obj2 = zzwVar.a;
        int i2 = zzwVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new p1r((veu) obj, (lnm) null, (byte) 14));
            wmk wmkVar = new wmk(r261Var, (byte) 22);
            zzwVar.b = 1;
            Object objCollect = m441Var.collect(wmkVar, zzwVar);
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
