package p;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class lxg1 {
    public static final bma1 a = bma1.b.u("tv_adoption_last_shown_ts");

    public static final void b(List list, Map map, Map map2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            l0l l0lVar = (l0l) it.next();
            nya nyaVar = (nya) map.get(l0lVar.d());
            if (nyaVar != null) {
                re9 re9Var = nyaVar.a;
            }
        }
    }
}
