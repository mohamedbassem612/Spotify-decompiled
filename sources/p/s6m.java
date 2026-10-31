package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s6m implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ rhg0 a;
    public final /* synthetic */ v6m b;

    public s6m(rhg0 rhg0Var, v6m v6mVar) {
        this.a = rhg0Var;
        this.b = v6mVar;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        Set set = ((w6m) obj).a;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((aa3) this.b.b.b).b.a(new ef31((String) it.next())));
        }
        this.a.a(o7h.p1(arrayList), (ArrayList) null, (ArrayList) null);
        return rih1.a;
    }
}
