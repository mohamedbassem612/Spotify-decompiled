package p;

import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class nq10 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ lik1 a;
    public final /* synthetic */ uq10 b;

    public nq10(uq10 uq10Var, lik1 lik1Var) {
        this.a = lik1Var;
        this.b = uq10Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Set set = s4b1.f;
        boolean z = (((mq10) obj).a || uic.x(this.a.a).c == blc0.mb) ? false : true;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131958265});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        er91 er91Var = new er91((fs91) null, "", 2131958265, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        kt91 kt91Var = this.b.c;
        if (z) {
            kt91Var.o(er91Var);
        } else {
            kt91Var.k(er91Var);
        }
        return rih1.a;
    }
}
