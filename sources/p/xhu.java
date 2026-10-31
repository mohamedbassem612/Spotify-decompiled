package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xhu implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ yhu a;

    public xhu(yhu yhuVar) {
        this.a = yhuVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cl21 cl21Var = (cl21) obj;
        yhu yhuVar = this.a;
        ao0.a(yhuVar.e, co0.i, cl21Var.a.a, (Long) null, "image_postfetch_failure", (String) null, 116);
        gid.i(yhuVar.f, cl21Var.a, "image_fetch_failure", "Failed to fetch image: ".concat(cl21Var.b));
        return rih1.a;
    }
}
