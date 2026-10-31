package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class zoi0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ epi0 a;

    public zoi0(epi0 epi0Var) {
        this.a = epi0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        aoi0 aoi0Var = (aoi0) obj;
        bjx bjxVar = this.a.b;
        String str = aoi0Var.a;
        boolean z = aoi0Var.b;
        lzn0 lzn0Var = (lzn0) bjxVar.d;
        lzn0Var.c();
        Boolean bool = Boolean.FALSE;
        if (z) {
            bool = Boolean.TRUE;
        }
        lzn0Var.f(new dwn0(str, "", false, false, 0, 0, bool.booleanValue(), (a690) null, (Bundle) null, (cwn0) null));
        return rih1.a;
    }
}
