package p;

import android.util.Size;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cn51 {
    public final boolean a;

    public cn51(boolean z) {
        this.a = z;
    }

    public final jn51 a(nn51 nn51Var, Size size) {
        Object next;
        ArrayList arrayList = nn51Var.c;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (dn51.a.contains(((jn51) obj).c)) {
                arrayList2.add(obj);
            }
        }
        int i = 0;
        List listA1 = o7h.a1(arrayList2, pap1.s(new iu30[]{an51.b, bn51.b}));
        if (!this.a) {
            Iterator it = listA1.iterator();
            while (it.hasNext()) {
                next = it.next();
                jn51 jn51Var = (jn51) next;
                if (jn51Var.e >= size.getWidth() && jn51Var.d >= size.getHeight()) {
                    return (jn51) next;
                }
            }
            next = null;
            return (jn51) next;
        }
        Iterator it2 = listA1.iterator();
        while (true) {
            if (!it2.hasNext()) {
                i = -1;
                break;
            }
            jn51 jn51Var2 = (jn51) it2.next();
            if (jn51Var2.e >= size.getWidth() && jn51Var2.d >= size.getHeight()) {
                break;
            }
            i++;
        }
        return (jn51) (i > 0 ? listA1.get(i - 1) : o7h.t0(i, listA1));
    }
}
