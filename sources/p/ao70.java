package p;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ao70 implements pua0 {
    public volatile Set a;

    public final Map a(Set set) {
        Set setV0 = dm61.v0(set, this.a);
        this.a = set;
        Set set2 = setV0;
        int iS = zno1.s(q7h.U(set2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : set2) {
            linkedHashMap.put(obj, new j3r((go70) obj));
        }
        return linkedHashMap;
    }

    public final Object c(List list, onm onmVar) {
        return rih1.a;
    }

    public final void dispose() {
    }

    public final void b(Set set) {
    }
}
