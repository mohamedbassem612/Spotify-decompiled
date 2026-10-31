package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class t97 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ ha7 a;

    public t97(ha7 ha7Var) {
        this.a = ha7Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        d97 d97Var = (d97) obj;
        yvd yvdVar = (yvd) this.a.a.b;
        yrd yrdVar = d97Var.a;
        List list = d97Var.b;
        x9a x9aVar = (x9a) yvdVar.e.get(yrdVar.f);
        if (x9aVar != null) {
            x9aVar.d().c.onNext(new csd(yrdVar.e, list, yrdVar.a));
        }
        return rih1.a;
    }
}
