package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class ew30 {
    public static final Map a = sqg0.J(oqn1.n(aq10.a, b3f1.b), oqn1.n(aq10.b, b3f1.d), oqn1.n(aq10.c, b3f1.a));

    public static final ArrayList a(bq10 bq10Var) {
        List<bq10> list = bq10Var.d;
        ArrayList arrayList = new ArrayList();
        for (bq10 bq10Var2 : list) {
            r7h.W(o7h.N0(a(bq10Var2), k4p1.x(bq10Var2.c)), arrayList);
        }
        return arrayList;
    }

    public static final c3f1 b(bq10 bq10Var, String str, String str2, b3f1 b3f1Var) {
        String str3 = bq10Var.a;
        e3f1 e3f1Var = new e3f1(bq10Var.b);
        String str4 = bq10Var.c;
        boolean zJ = u890.j(str4, str);
        List list = bq10Var.d;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            arrayList.add(b((bq10) it.next(), str, str2, null));
        }
        boolean zJ2 = u890.j(bq10Var.c, str2);
        if (b3f1Var == null && (b3f1Var = (b3f1) a.get(bq10Var.e)) == null) {
            b3f1Var = b3f1.a;
        }
        b3f1 b3f1Var2 = b3f1Var;
        String str5 = bq10Var.f;
        zp10 zp10Var = bq10Var.g;
        return new c3f1(str3, e3f1Var, str4, zJ, null, arrayList, zJ2, b3f1Var2, str5, zp10Var != null ? new a3f1(zp10Var.a(), zp10Var.b()) : null, 16);
    }
}
