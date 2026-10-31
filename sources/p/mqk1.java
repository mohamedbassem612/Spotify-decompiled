package p;

import com.spotify.mobius.Next;
import com.spotify.mobius.Update;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class mqk1 implements Update {
    public static final mqk1 a = new mqk1();

    public final Next a(Object obj, Object obj2) {
        Object next;
        jqk1 jqk1VarA;
        jqk1 jqk1Var = (jqk1) obj;
        gqk1 gqk1Var = (gqk1) obj2;
        gfu0 gfu0Var = jqk1Var.b;
        List list = jqk1Var.a;
        Object obj3 = null;
        if (gqk1Var instanceof cqk1) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((hqk1) next).a, ((cqk1) gqk1Var).a));
            hqk1 hqk1Var = (hqk1) next;
            if (hqk1Var == null) {
                return Next.j();
            }
            if (u890.j(gfu0Var != null ? gfu0Var.a : null, ((cqk1) gqk1Var).a)) {
                jqk1VarA = jqk1.a(jqk1Var, null, null, 0L, 13);
            } else {
                String str = hqk1Var.a;
                String str2 = hqk1Var.d;
                long j = jqk1Var.c;
                jqk1VarA = jqk1.a(jqk1Var, null, new gfu0(j, str, str2, false), j + 1, 9);
            }
            return Next.h(jqk1VarA);
        }
        if (gqk1Var instanceof dqk1) {
            if (gfu0Var != null) {
                long j2 = gfu0Var.c;
                if (j2 == ((dqk1) gqk1Var).a) {
                    return Next.h(jqk1.a(jqk1Var, null, new gfu0(j2, gfu0Var.a, gfu0Var.b, true), 0L, 13));
                }
            }
            return Next.j();
        }
        if (gqk1Var instanceof eqk1) {
            return (gfu0Var != null && gfu0Var.c == ((eqk1) gqk1Var).a && gfu0Var.d) ? Next.h(jqk1.a(jqk1Var, null, null, 0L, 13)) : Next.j();
        }
        if (!(gqk1Var instanceof fqk1)) {
            eg.o();
            return null;
        }
        if (jqk1Var.d) {
            return Next.j();
        }
        List<hqk1> list2 = list;
        for (Object obj4 : list2) {
            if (u890.j(((hqk1) obj4).a, ((fqk1) gqk1Var).a)) {
                obj3 = obj4;
                break;
            }
        }
        hqk1 hqk1Var2 = (hqk1) obj3;
        if (hqk1Var2 == null) {
            return Next.j();
        }
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (hqk1 hqk1Var3 : list2) {
            arrayList.add(new hqk1(hqk1Var3.a, hqk1Var3.b, hqk1Var3.c, hqk1Var3.d, u890.j(hqk1Var3.a, ((fqk1) gqk1Var).a)));
        }
        return Next.i(jqk1.a(jqk1Var, arrayList, null, 0L, 6), Collections.singleton(new bqk1(((fqk1) gqk1Var).a, hqk1Var2.b)));
    }
}
