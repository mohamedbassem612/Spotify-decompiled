package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v931 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ca31 a;

    public v931(ca31 ca31Var) {
        this.a = ca31Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        q931 q931Var = (q931) obj;
        String str = q931Var.a;
        tv80 tv80Var = q931Var.b;
        boolean z = q931Var.c;
        ca31 ca31Var = this.a;
        Object objY = fn31.Y(ca31Var.b, new m311(str, z, tv80Var, ca31Var, (lnm) null), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
