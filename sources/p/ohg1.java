package p;

import android.os.Bundle;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ohg1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rhg1 a;

    public ohg1(rhg1 rhg1Var) {
        this.a = rhg1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        cya0 cya0Var = (cya0) obj;
        lvc1 lvc1Var = this.a.a;
        yig1 yig1Var = cya0Var.a;
        yxa0 yxa0Var = cya0Var.b;
        tv80 tv80Var = cya0Var.c;
        if (yxa0Var instanceof xxa0) {
            ((xk) lvc1Var.d).c(new gl(yig1Var), tv80Var, mno1.g());
        } else {
            ((lzn0) lvc1Var.b).a(cfm0.i("spotify:internal:kid-account-transition:legal-consent:", yig1Var.getValue(), nik1.H3).a, tv80Var, (Bundle) null);
        }
        return rih1.a;
    }
}
