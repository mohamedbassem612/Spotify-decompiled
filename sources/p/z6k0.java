package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class z6k0 {
    public final rxj0 a;

    public z6k0(rxj0 rxj0Var) {
        this.a = rxj0Var;
    }

    public static boolean a(Map map) {
        return b(map) || u890.j(map.get("mix-type"), "only-auto");
    }

    public static boolean b(Map map) {
        return Boolean.parseBoolean((String) map.get("mix"));
    }

    public static boolean c(List list) {
        List list2 = list;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            return true;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (u890.j(((ll81) it.next()).a, "set-transition")) {
                return false;
            }
        }
        return true;
    }

    public final uuj0 d(Map map, Map map2) {
        Object next;
        boolean z = Boolean.parseBoolean((String) map.get("not-mixable"));
        String str = (String) map.get("not-mixable.reason");
        Iterator it = wgo0.e.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((wgo0) next).a.equals(str));
        wgo0 wgo0Var = (wgo0) next;
        if (z) {
            return new tuj0(wgo0Var);
        }
        return new suj0(this.a.j || Boolean.parseBoolean((String) map2.get("can-view-transition")));
    }
}
