package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nkw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ glw a;

    public nkw(glw glwVar) {
        this.a = glwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        mkw mkwVar;
        if (onmVar instanceof mkw) {
            mkwVar = (mkw) onmVar;
            int i = mkwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                mkwVar.b = i - Integer.MIN_VALUE;
            } else {
                mkwVar = new mkw(this, onmVar);
            }
        } else {
            mkwVar = new mkw(this, onmVar);
        }
        Object obj2 = mkwVar.a;
        int i2 = mkwVar.b;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new ciw0(this.a.g, (dew) obj, lnmVar, (byte) 0));
            wmk wmkVar = new wmk(r261Var, (byte) 17);
            mkwVar.b = 1;
            Object objCollect = m441Var.collect(wmkVar, mkwVar);
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
