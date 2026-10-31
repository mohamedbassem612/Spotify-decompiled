package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ypc implements cmh1 {
    public final /* synthetic */ cmh1 a;
    public final /* synthetic */ zpc b;

    public ypc(cmh1 cmh1Var, zpc zpcVar) {
        this.a = cmh1Var;
        this.b = zpcVar;
    }

    public final Map a(Set set) {
        Map mapA = this.a.a(set);
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapA.size()));
        for (Map.Entry entry : mapA.entrySet()) {
            linkedHashMap.put(entry.getKey(), this.b.f((jh5) entry.getKey(), (k3r) entry.getValue()));
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
