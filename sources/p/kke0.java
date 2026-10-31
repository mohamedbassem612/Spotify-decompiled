package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kke0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ in01 a;

    public kke0(in01 in01Var) {
        this.a = in01Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        nhe0 nhe0Var = ((oje0) obj).c;
        in01 in01Var = this.a;
        ArrayList arrayList = new ArrayList(in01Var.a());
        r7h.a0(arrayList, new hn01(nhe0Var, (byte) 1));
        in01Var.b(arrayList);
        return rih1.a;
    }
}
