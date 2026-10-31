package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class dcb0 implements rqw {
    public final brl0 a;

    public dcb0(String str) {
        this.a = new brl0(str, (byte) 16);
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        bcb0 bcb0Var = (bcb0) obj2;
        zbb0 zbb0Var = (zbb0) obj3;
        y6h1 y6h1Var = this.a.b;
        List list = bcb0Var.c;
        boolean zEquals = zbb0Var.equals(wbb0.a);
        b7x b7xVar = b7x.a;
        if (zEquals) {
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
        }
        if (!(zbb0Var instanceof xbb0)) {
            if (!zbb0Var.equals(ybb0.a)) {
                eg.o();
                return null;
            }
            x6h1 x6h1VarC = y6h1Var.c();
            x6h1VarC.i.add(new a7h1("language_row", "off", 0, (String) null, (String) null));
            x6h1VarC.j = false;
            return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis());
        }
        String str = ((xbb0) zbb0Var).a;
        List list2 = list;
        ArrayList arrayList = new ArrayList();
        for (Object obj4 : list2) {
            if (!((xab0) obj4).c) {
                arrayList.add(obj4);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj5 : list2) {
            if (((xab0) obj5).c) {
                arrayList2.add(obj5);
            }
        }
        Iterator it = o7h.N0(arrayList2, arrayList).iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (u890.j(((xab0) it.next()).a, str)) {
                break;
            }
            i++;
        }
        Integer numValueOf = Integer.valueOf(i);
        if (i < 0) {
            numValueOf = null;
        }
        Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() + (bcb0Var.d ? 1 : 0)) : null;
        x6h1 x6h1VarC2 = y6h1Var.c();
        x6h1VarC2.i.add(new a7h1("language_row", str, numValueOf2, (String) null, (String) null));
        x6h1VarC2.j = false;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis());
    }

    public final /* bridge */ /* synthetic */ Object d(Object obj, Object obj2, op80 op80Var) {
        return null;
    }
}
