package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public abstract class rqp0 {
    public static final mdz a(String str) {
        y6b1 m231Var;
        try {
            m231Var = new y6b1(str, false);
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        if (m231Var instanceof m231) {
            m231Var = null;
        }
        y6b1 y6b1Var = m231Var;
        if (y6b1Var == null) {
            y6b1Var = new y6b1("spotify:episode:invalid", false);
        }
        idz idzVar = new idz(1970, 1, 1, 0, 0);
        den denVar = new den();
        z6x z6xVar = z6x.a;
        return new mdz(y6b1Var, "", "", (kdz) null, denVar, z6xVar, z6xVar, z6xVar, false, 1, false, false, "", 0L, idzVar, z6xVar, "", "", "");
    }

    public static final ArrayList b(List list) {
        List list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(new zpp0(a((String) it.next())));
        }
        return arrayList;
    }
}
