package p;

import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ynk1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ hok1 a;

    public ynk1(hok1 hok1Var) {
        this.a = hok1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        n57.s("Speech recognition error occurred");
        kt91 kt91Var = this.a.b;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956723});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", 2131956723, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
