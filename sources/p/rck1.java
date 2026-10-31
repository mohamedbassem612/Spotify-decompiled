package p;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class rck1 {
    public final LinkedHashMap a = new LinkedHashMap();

    public final void a() {
        LinkedHashMap linkedHashMap = this.a;
        Map mapU = sqg0.U(linkedHashMap);
        linkedHashMap.clear();
        Iterator it = mapU.values().iterator();
        while (it.hasNext()) {
            ((xbk1) it.next()).Q();
        }
    }

    public final String toString() {
        String strR = rc11.a.b(rck1.class).r();
        if (strR == null) {
            strR = "ViewModelStore";
        }
        int iHashCode = hashCode();
        eth.h(16);
        return strR + "@" + Integer.toString(iHashCode, 16) + "(keys=" + o7h.p1(this.a.keySet()) + ")";
    }
}
