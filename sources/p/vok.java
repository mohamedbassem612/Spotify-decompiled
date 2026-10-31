package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vok implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ps7 a;
    public final /* synthetic */ npk b;
    public final /* synthetic */ cfd c;

    public vok(ps7 ps7Var, npk npkVar, cfd cfdVar) {
        this.a = ps7Var;
        this.b = npkVar;
        this.c = cfdVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Object objCollect = new m441(new qk3(obj, (lnm) null, this.a, this.b, this.c, (byte) 5)).collect(new wmk(r261Var, (byte) 1), onmVar);
        return objCollect == d9n.a ? objCollect : rih1.a;
    }
}
