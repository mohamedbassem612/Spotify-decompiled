package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class qqm implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ twu a;
    public final /* synthetic */ r2v b;

    public qqm(twu twuVar, r2v r2vVar) {
        this.a = twuVar;
        this.b = r2vVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        onh0 onh0Var = (onh0) obj;
        int i = onh0Var.d;
        String str = onh0Var.a;
        int iC = l1d.C(i);
        if (iC == 0) {
            this.a.b(Collections.singletonList(new cxu(str, onh0Var.b, onh0Var.c)));
        } else {
            if (iC != 1) {
                eg.o();
                return null;
            }
            this.b.b(Collections.singletonList(new a3v(str)));
        }
        return rih1.a;
    }
}
