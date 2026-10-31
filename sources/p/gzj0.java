package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gzj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xzj0 a;

    public gzj0(xzj0 xzj0Var) {
        this.a = xzj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        o0k0 o0k0Var = (o0k0) obj;
        t2 t2Var = this.a.f24p;
        tv80 tv80Var = o0k0Var.b;
        lzn0 lzn0Var = t2Var.a;
        String str = o0k0Var.a;
        if (tv80Var != null) {
            lzn0Var.a(str, tv80Var, (Bundle) null);
        } else {
            lzn0Var.h(str);
        }
        return rih1.a;
    }
}
