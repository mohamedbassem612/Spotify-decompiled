package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n63 {
    public final tb51 a;
    public final o5r b;

    public /* synthetic */ n63(tb51 tb51Var, o5r o5rVar) {
        this.a = tb51Var;
        this.b = o5rVar;
    }

    public static s63 b(n63 n63Var, lby lbyVar, i53 i53Var, boolean z, d8r0 d8r0Var, String str, int i) {
        return n63Var.a(lbyVar, i53Var, z, d8r0Var, str, tb51.g(n63Var.a, lbyVar), i, null, null);
    }

    public s63 a(lby lbyVar, i53 i53Var, boolean z, d8r0 d8r0Var, String str, String str2, int i, Integer num, String str3) {
        String str4 = lbyVar.a;
        String str5 = lbyVar.b;
        String str6 = lbyVar.c;
        String strU = k4p1.u(i53Var, this.b);
        ArrayList arrayList = i53Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ol11) it.next()).a);
        }
        int i2 = 1;
        q8b q8bVar = z ? new q8b(p7h.N(o7h.s0(arrayList2)), true) : new q8b(z6x.a, false);
        boolean z2 = i53Var.d;
        boolean z3 = i53Var.e;
        if (!i53Var.f) {
            i2 = z3 ? 2 : 3;
        }
        return new s63(str4, str5, str2, str6, strU, arrayList, q8bVar, str, d8r0Var, i, z2, i2, lbyVar.d, num, str3);
    }

    public tf3 c(lby lbyVar, i53 i53Var, boolean z, d8r0 d8r0Var, String str, List list) {
        String str2 = lbyVar.a;
        String str3 = lbyVar.b;
        String strG = tb51.g(this.a, lbyVar);
        String str4 = lbyVar.c;
        String strU = k4p1.u(i53Var, this.b);
        ArrayList arrayList = i53Var.a;
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ol11) it.next()).a);
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ol11) it2.next()).a);
        }
        int i = 1;
        q8b q8bVar = z ? new q8b(p7h.N(o7h.s0(arrayList3)), true) : new q8b(z6x.a, false);
        boolean z2 = i53Var.d;
        boolean z3 = i53Var.e;
        if (!i53Var.f) {
            i = z3 ? 2 : 3;
        }
        return new tf3(str2, str3, strG, str4, strU, arrayList2, str, q8bVar, d8r0Var, z2, i, list, lbyVar.d);
    }
}
