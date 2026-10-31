package p;

import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class nrv implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ dr41 a;

    public nrv(dr41 dr41Var) {
        this.a = dr41Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        int i;
        kt91 kt91Var = (kt91) this.a.b;
        int i2 = ((grv) obj).a;
        if (i2 == 1) {
            i = 2131955220;
        } else {
            if (i2 != 2) {
                throw null;
            }
            i = 2131955227;
        }
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
