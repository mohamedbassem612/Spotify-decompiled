package p;

import android.os.Bundle;
import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import j$.time.Instant;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class md40 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ pd40 a;

    public md40(pd40 pd40Var) {
        this.a = pd40Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        wp20 wp20Var = this.a.b;
        n4y0 n4y0Var = ((rd40) obj).a;
        if (!(n4y0Var instanceof h4y0)) {
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956208});
            n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
            ((kt91) wp20Var.b).k(new er91((fs91) null, "", 2131956208, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        } else if (((rg4) wp20Var.e).a()) {
            x1i1.a((x1i1) wp20Var.c, new z740(1, ((lm10) ((ced0) wp20Var.d)).a, "generate"), 6);
        } else {
            long epochMilli = Instant.parse(((h4y0) n4y0Var).b).toEpochMilli();
            a1r0 a1r0Var = (a1r0) wp20Var.a;
            Bundle bundle = new Bundle();
            bundle.putLong("reset_timestamp", epochMilli);
            a1r0.m(a1r0Var, "spotify:internal:magpie:cap", (tv80) null, bundle, 8);
        }
        return rih1.a;
    }
}
