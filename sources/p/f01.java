package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class f01 {
    public static final Set b = f46.S0(new String[]{"video/webm", "video/mp4", "video/3gpp"});
    public final v290 a;

    public f01(v290 v290Var) {
        this.a = v290Var;
    }

    public final e01 a(List list) {
        Object next;
        Object next2;
        List list2 = list;
        Iterator it = list2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((a7j1) next).e instanceof o57));
        a7j1 a7j1Var = (a7j1) next;
        if (a7j1Var != null) {
            String str = ((o57) a7j1Var.e).a;
            this.a.getClass();
            return new e01(a7j1Var.f, wqn1.n(str), str);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : list2) {
            if (((a7j1) obj).e instanceof p57) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            a7j1 a7j1Var2 = (a7j1) obj2;
            if (b.contains(a7j1Var2.a) && a7j1Var2.d > 0) {
                arrayList2.add(obj2);
            }
        }
        Iterator it2 = arrayList2.iterator();
        if (it2.hasNext()) {
            next2 = it2.next();
            if (it2.hasNext()) {
                int iAbs = Math.abs(640000 - ((a7j1) next2).d);
                do {
                    Object next3 = it2.next();
                    int iAbs2 = Math.abs(640000 - ((a7j1) next3).d);
                    if (iAbs > iAbs2) {
                        next2 = next3;
                        iAbs = iAbs2;
                    }
                } while (it2.hasNext());
            }
        } else {
            next2 = null;
        }
        a7j1 a7j1Var3 = (a7j1) next2;
        if (a7j1Var3 == null) {
            a7j1Var3 = (a7j1) o7h.s0(arrayList);
        }
        if (a7j1Var3 == null) {
            return null;
        }
        return new e01(a7j1Var3.f, ((p57) a7j1Var3.e).a, null);
    }
}
