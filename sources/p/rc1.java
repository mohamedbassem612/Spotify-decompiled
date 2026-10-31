package p;

import android.view.View;
import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rc1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ vc1 a;

    public rc1(vc1 vc1Var) {
        this.a = vc1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        vc1 vc1Var = this.a;
        lzn0 lzn0Var = vc1Var.d;
        gc1 gc1Var = (gc1) obj;
        int iOrdinal = gc1Var.b.ordinal();
        if (iOrdinal == 0) {
            lzn0Var.c();
            lzn0Var.e();
        } else {
            if (iOrdinal != 1 && iOrdinal != 2) {
                eg.o();
                return null;
            }
            lzn0Var.e();
        }
        vc1Var.e.k(new er91((fs91) null, gc1Var.a, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
        return rih1.a;
    }
}
