package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nh10 implements pua0 {
    public final /* synthetic */ pua0 a;

    public nh10(pua0 pua0Var) {
        this.a = pua0Var;
    }

    public final Map a(Set set) {
        Map mapA = this.a.a(set);
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapA.size()));
        for (Map.Entry entry : mapA.entrySet()) {
            Object key = entry.getKey();
            qvc0 qvc0Var = (qvc0) entry.getKey();
            i3r i3rVar = (k3r) entry.getValue();
            if (ph10.a(qvc0Var.a) && (i3rVar instanceof h3r)) {
                i3rVar = i3r.a;
            }
            linkedHashMap.put(key, i3rVar);
        }
        return linkedHashMap;
    }

    public final void b(Set set) {
        this.a.b(set);
    }

    public final Object c(List list, onm onmVar) {
        Object objC = this.a.c(list, onmVar);
        return objC == d9n.a ? objC : rih1.a;
    }

    public final void dispose() {
        this.a.dispose();
    }
}
