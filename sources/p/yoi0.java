package p;

import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class yoi0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ epi0 a;

    public yoi0(epi0 epi0Var) {
        this.a = epi0Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        bjx bjxVar = this.a.b;
        s521 s521Var = ((coi0) obj).a;
        kt91 kt91Var = (kt91) bjxVar.e;
        if (s521Var instanceof q521) {
            kt91Var.k(new er91((fs91) null, ((q521) s521Var).a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } else {
            if (!(s521Var instanceof r521)) {
                eg.o();
                return null;
            }
            int i = ((r521) s521Var).a;
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i)});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        }
        return rih1.a;
    }
}
