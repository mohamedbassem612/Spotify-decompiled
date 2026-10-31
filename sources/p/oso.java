package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class oso {
    public static dvb1 a(dw20 dw20Var) {
        Object next;
        ArrayList<oyh> arrayList = dw20Var.b;
        int iS = zno1.s(q7h.U(arrayList, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (oyh oyhVar : arrayList) {
            linkedHashMap.put(new jvb1(oyhVar.a), oyhVar.b);
        }
        Iterator it = myo1.w(dw20Var.a.w(), myo1.t(linkedHashMap.values())).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (linkedHashMap.containsKey(new jvb1(((evb1) next).a)));
        evb1 evb1Var = (evb1) next;
        return evb1Var != null ? new cvb1(evb1Var) : bvb1.a;
    }
}
