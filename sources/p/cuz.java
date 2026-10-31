package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class cuz {
    public static final Set a = f46.S0(new b3i1[]{nyu0.e, wyu0.f});

    public static final int a(String str) {
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        Set set2 = a;
        v5b1 v5b1Var = s4b1VarX.d;
        if (o7h.i0(set2, v5b1Var != null ? v5b1Var.getType() : null)) {
            return 1;
        }
        blc0 blc0Var = s4b1VarX.c;
        if (blc0Var == blc0.g1) {
            return 2;
        }
        if (blc0Var == blc0.fh) {
            return 3;
        }
        return (blc0Var == blc0.Pg || blc0Var == blc0.ld) ? 4 : 0;
    }

    public static final ArrayList b(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((dqp0) obj).b == poz.e) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((dqp0) it.next()).a);
        }
        return arrayList2;
    }

    public static final ArrayList c(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((dqp0) obj).b == poz.f) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((dqp0) it.next()).a);
        }
        return arrayList2;
    }

    public static final int d(o0v o0vVar) {
        if (o0vVar instanceof m0v) {
            return 0;
        }
        if (o0vVar instanceof l0v) {
            return 1;
        }
        if (o0vVar.equals(n0v.a)) {
            return 2;
        }
        if (o0vVar.equals(k0v.a)) {
            return 3;
        }
        eg.o();
        return 0;
    }
}
