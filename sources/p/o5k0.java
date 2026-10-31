package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final /* synthetic */ class o5k0 implements Update {
    public final Next a(Object obj, Object obj2) {
        Object next;
        Object next2;
        s5k0 s5k0Var = (s5k0) obj;
        m5k0 m5k0Var = (m5k0) obj2;
        List list = s5k0Var.a;
        if (m5k0Var instanceof f5k0) {
            return Next.a(Collections.singleton(w4k0.a));
        }
        if (m5k0Var instanceof h5k0) {
            List<fy00> list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            for (fy00 fy00Var : list2) {
                arrayList.add(fy00.a(fy00Var, (String) ((h5k0) m5k0Var).a.get(fy00Var.b), false, 0, 27));
            }
            return Next.h(s5k0.a(s5k0Var, arrayList, aub1.a, 2));
        }
        if (m5k0Var instanceof g5k0) {
            return Next.h(s5k0.a(s5k0Var, null, wtb1.a, 3));
        }
        if (m5k0Var instanceof l5k0) {
            List<fy00> list3 = list;
            Iterator it = list3.iterator();
            do {
                if (!it.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it.next();
            } while (!u890.j(((fy00) next2).a, ((l5k0) m5k0Var).a));
            fy00 fy00Var2 = (fy00) next2;
            if (fy00Var2 == null || fy00Var2.c == null) {
                return Next.j();
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
            for (fy00 fy00VarA : list3) {
                if (u890.j(fy00VarA.a, ((l5k0) m5k0Var).a)) {
                    fy00VarA = fy00.a(fy00VarA, null, !fy00VarA.d, 0, 23);
                }
                arrayList2.add(fy00VarA);
            }
            return Next.h(s5k0.a(s5k0Var, arrayList2, null, 6));
        }
        if (m5k0Var instanceof i5k0) {
            List<fy00> list4 = list;
            Iterator it2 = list4.iterator();
            do {
                if (!it2.hasNext()) {
                    next = null;
                    break;
                }
                next = it2.next();
            } while (!u890.j(((fy00) next).a, ((i5k0) m5k0Var).a));
            fy00 fy00Var3 = (fy00) next;
            String str = fy00Var3 != null ? fy00Var3.c : null;
            if (fy00Var3 == null || str == null || fy00Var3.e != 1) {
                return Next.j();
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
            for (fy00 fy00VarA2 : list4) {
                if (u890.j(fy00VarA2.a, ((i5k0) m5k0Var).a)) {
                    fy00VarA2 = fy00.a(fy00VarA2, null, false, 2, 15);
                }
                arrayList3.add(fy00VarA2);
            }
            return Next.i(s5k0.a(s5k0Var, arrayList3, null, 6), Collections.singleton(new y4k0(((i5k0) m5k0Var).a, str, s5k0Var.b)));
        }
        if (m5k0Var instanceof k5k0) {
            List<fy00> list5 = list;
            ArrayList arrayList4 = new ArrayList(q7h.U(list5, 10));
            for (fy00 fy00VarA3 : list5) {
                if (u890.j(fy00VarA3.a, ((k5k0) m5k0Var).a)) {
                    fy00VarA3 = fy00.a(fy00VarA3, null, false, 3, 15);
                }
                arrayList4.add(fy00VarA3);
            }
            return Next.h(s5k0.a(s5k0Var, arrayList4, null, 6));
        }
        if (!(m5k0Var instanceof j5k0)) {
            eg.o();
            return null;
        }
        List<fy00> list6 = list;
        ArrayList arrayList5 = new ArrayList(q7h.U(list6, 10));
        for (fy00 fy00VarA4 : list6) {
            if (u890.j(fy00VarA4.a, ((j5k0) m5k0Var).a)) {
                fy00VarA4 = fy00.a(fy00VarA4, null, false, 1, 15);
            }
            arrayList5.add(fy00VarA4);
        }
        return Next.h(s5k0.a(s5k0Var, arrayList5, null, 6));
    }
}
