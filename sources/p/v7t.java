package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v7t implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ w7t a;

    public v7t(w7t w7tVar) {
        this.a = w7tVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        u7t u7tVar;
        if (onmVar instanceof u7t) {
            u7tVar = (u7t) onmVar;
            int i = u7tVar.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                u7tVar.b = i - Integer.MIN_VALUE;
            } else {
                u7tVar = new u7t(this, onmVar);
            }
        } else {
            u7tVar = new u7t(this, onmVar);
        }
        Object obj2 = u7tVar.a;
        int i2 = u7tVar.b;
        if (i2 == 0) {
            hm5.M(obj2);
            lt20 lt20Var = new lt20(new m441(new hxn((Object) this.a, obj, false, (lnm) null, (byte) 19)), new re1(3, (lnm) null, (byte) 19), (byte) 0);
            wmk wmkVar = new wmk(r261Var, (byte) 2);
            u7tVar.b = 1;
            Object objCollect = lt20Var.collect(wmkVar, u7tVar);
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
