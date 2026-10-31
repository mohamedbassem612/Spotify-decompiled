package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class now0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qow0 a;

    public now0(qow0 qow0Var) {
        this.a = qow0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        a1r0 a1r0Var = this.a.b;
        zqr0 zqr0Var = new zqr0(((tow0) obj).a);
        Bundle bundle = new Bundle();
        bundle.putParcelable("privacy_result", zqr0Var);
        a1r0.j(a1r0Var, "spotify:internal:magpie:update-privacy", (String) null, bundle, false, 10);
        return rih1.a;
    }
}
