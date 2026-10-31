package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hmv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ f1n0 a;

    public hmv(f1n0 f1n0Var) {
        this.a = f1n0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        tv80 tv80Var = ((nmv) obj).a;
        Object objD = f1n0.d(this.a, new dwn0("https://www.spotify.com/platform-rules/plain", "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
