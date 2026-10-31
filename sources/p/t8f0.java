package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class t8f0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ wmy a;

    public t8f0(wmy wmyVar) {
        this.a = wmyVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        List list = w8f0.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            rih1 rih1Var = rih1.a;
            if (!zHasNext) {
                return rih1Var;
            }
            ((gw70) this.a.d).f((String) it.next()).n();
            arrayList.add(rih1Var);
        }
    }
}
