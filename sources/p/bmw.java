package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bmw implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ mmw a;

    public bmw(mmw mmwVar) {
        this.a = mmwVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        amw amwVar;
        if (onmVar instanceof amw) {
            amwVar = (amw) onmVar;
            int i = amwVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                amwVar.b = i - Integer.MIN_VALUE;
            } else {
                amwVar = new amw(this, onmVar);
            }
        } else {
            amwVar = new amw(this, onmVar);
        }
        Object obj2 = amwVar.a;
        int i2 = amwVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            m441 m441Var = new m441(new rzu((k9w) obj, this.a, (lnm) null, (byte) 5));
            wmk wmkVar = new wmk(r261Var, (byte) 18);
            amwVar.b = 1;
            Object objCollect = m441Var.collect(wmkVar, amwVar);
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
