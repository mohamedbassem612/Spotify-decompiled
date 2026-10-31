package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class lq1 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ qr1 a;

    public lq1(qr1 qr1Var) {
        this.a = qr1Var;
    }

    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        ym71 ym71Var;
        jp1 jp1Var = (jp1) obj;
        qr1 qr1Var = this.a;
        s4g0 s4g0Var = qr1Var.n;
        Set set = jp1Var.a;
        s4g0Var.h = true;
        LinkedHashSet linkedHashSet = s4g0Var.g;
        r7h.W(set, linkedHashSet);
        xab1 xab1Var = s4g0Var.e;
        if (xab1Var != null || !linkedHashSet.isEmpty()) {
            s4g0Var.e = null;
            s4g0Var.f = fn31.T(s4g0Var.c, (o8n) null, 0, new m2a0(xab1Var, s4g0Var, (lnm) null, (byte) 21), 3);
        }
        in71 in71Var = qr1Var.o;
        Set set2 = jp1Var.b;
        LinkedHashMap linkedHashMap = in71Var.h;
        in71Var.i = true;
        Iterator it = set2.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            ym71Var = ym71.a;
            if (!zHasNext) {
                break;
            }
            linkedHashMap.putIfAbsent((ajk1) it.next(), ym71Var);
        }
        if (linkedHashMap.values().contains(ym71Var)) {
            fn31.T(in71Var.e, (o8n) null, 0, new fn71(in71Var, null, (byte) 1), 3);
        }
        return rih1.a;
    }
}
