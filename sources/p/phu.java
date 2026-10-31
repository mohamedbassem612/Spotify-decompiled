package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class phu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ao0 a;
    public final /* synthetic */ gid b;

    public phu(ao0 ao0Var, gid gidVar) {
        this.a = ao0Var;
        this.b = gidVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        xk21 xk21Var = (xk21) obj;
        ao0.a(this.a, co0.i, xk21Var.a.a(), (Long) null, kk0.e(2), (String) null, 116);
        gid.i(this.b, xk21Var.a, "image_fetch_failure", "Failed to fetch image: ".concat(xk21Var.b));
        return rih1.a;
    }
}
