package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class kq11 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ op11 a;

    public kq11(op11 op11Var) {
        this.a = op11Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        eq11 eq11Var = (eq11) obj;
        String str = eq11Var.b;
        String str2 = eq11Var.c;
        String str3 = eq11Var.a;
        List list = eq11Var.d;
        String str4 = eq11Var.e;
        bwn bwnVar = eq11Var.f;
        Map mapO = bwnVar.a;
        if (nhc1.Y(str2, "spotify:show", false)) {
            mapO = sqg0.O(mapO, Collections.singletonMap("end_of_context_action", "stop"));
        }
        Object objG = this.a.g(str, str2, str3, list, str4, new wp11(mapO, bwnVar.b), onmVar);
        return objG == d9n.a ? objG : rih1.a;
    }
}
