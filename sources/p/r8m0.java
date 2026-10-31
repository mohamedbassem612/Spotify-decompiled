package p;

import android.content.Intent;
import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r8m0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ l9m0 a;

    public r8m0(l9m0 l9m0Var) {
        this.a = l9m0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        jxp0 jxp0Var = this.a.b;
        String str = ((hcm1) obj).e;
        if (!ihc1.y0(str)) {
            ecm1 ecm1Var = (ecm1) jxp0Var.b;
            Intent intentA = ecm1Var.b.a(new dwn0("spotify:chat-modal:".concat(str), "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
            intentA.putExtra("is_internal_navigation", true);
            ecm1Var.a.a(intentA);
        }
        return rih1.a;
    }
}
