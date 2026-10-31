package p;

import android.app.Activity;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xta implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ zta a;

    public xta(zta ztaVar) {
        this.a = ztaVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        fta ftaVar = this.a.a;
        ffe1 ffe1Var = (ffe1) ftaVar.d;
        String str = ((bta) obj).a;
        huj.b((lzn0) ftaVar.e, (Activity) ftaVar.b, (ryf) ftaVar.c, oxf.b, str, ffe1Var.m(str));
        return rih1.a;
    }
}
