package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bzj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xzj0 a;

    public bzj0(xzj0 xzj0Var) {
        this.a = xzj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        g0k0 g0k0Var = (g0k0) obj;
        ajq0 ajq0Var = this.a.f;
        boolean zJ = u890.j(g0k0Var.a, Boolean.TRUE);
        tv80 tv80Var = g0k0Var.b;
        ((ldk0) ((cdk0) ajq0Var.c)).c();
        ((lzn0) ajq0Var.a).e();
        Object objY = fn31.Y(geo0.b, new hl1(ajq0Var, zJ, tv80Var, (lnm) null, (byte) 2), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objY != d9nVar) {
            objY = rih1Var;
        }
        return objY == d9nVar ? objY : rih1Var;
    }
}
