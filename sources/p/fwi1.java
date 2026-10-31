package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fwi1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lzn0 a;

    public fwi1(lzn0 lzn0Var) {
        this.a = lzn0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cwi1 cwi1Var = (cwi1) obj;
        tv80 tv80Var = cwi1Var.d;
        String str = cwi1Var.c;
        lzn0 lzn0Var = this.a;
        if (tv80Var != null) {
            lzn0Var.a(str, tv80Var, (Bundle) null);
        } else {
            lzn0Var.h(str);
        }
        return rih1.a;
    }
}
