package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class duv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ drj0 a;

    public duv(drj0 drj0Var) {
        this.a = drj0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        drj0 drj0Var = this.a;
        f1n0 f1n0Var = (f1n0) drj0Var.b;
        String strA = aqv.a((String) drj0Var.c);
        tv80 tv80Var = ((auv) obj).a;
        Object objD = f1n0.d(f1n0Var, new dwn0(strA, "", false, false, 0, 0, true, (a690) null, (Bundle) null, tv80Var != null ? new bwn0(tv80Var) : null), onmVar);
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (objD != d9nVar) {
            objD = rih1Var;
        }
        return objD == d9nVar ? objD : rih1Var;
    }
}
