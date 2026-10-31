package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hfy implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dh30 a;

    public hfy(dh30 dh30Var) {
        this.a = dh30Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        gfy gfyVar;
        if (onmVar instanceof gfy) {
            gfyVar = (gfy) onmVar;
            int i = gfyVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                gfyVar.b = i - Integer.MIN_VALUE;
            } else {
                gfyVar = new gfy(this, onmVar);
            }
        } else {
            gfyVar = new gfy(this, onmVar);
        }
        Object obj2 = gfyVar.a;
        int i2 = gfyVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            rey reyVar = (rey) obj;
            lt20 lt20Var = new lt20(new m441(new n3s(this.a, reyVar, (lnm) null)), new jk(reyVar, null), (byte) 0);
            wmk wmkVar = new wmk(r261Var, (byte) 25);
            gfyVar.b = 1;
            Object objCollect = lt20Var.collect(wmkVar, gfyVar);
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
