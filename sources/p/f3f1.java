package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f3f1 {
    public final g3f1 a;
    public final List b;
    public final boolean c;
    public final boolean d;

    public f3f1(g3f1 g3f1Var, List list, boolean z, boolean z2) {
        this.a = g3f1Var;
        this.b = list;
        this.c = z;
        this.d = z2;
    }

    public static f3f1 a(f3f1 f3f1Var, List list) {
        g3f1 g3f1Var = f3f1Var.a;
        boolean z = f3f1Var.c;
        boolean z2 = f3f1Var.d;
        f3f1Var.getClass();
        f3f1Var.getClass();
        return new f3f1(g3f1Var, list, z, z2);
    }

    public static c3f1 b(List list) {
        Object obj = null;
        if (list.isEmpty()) {
            return null;
        }
        List list2 = list;
        for (Object obj2 : list2) {
            if (((c3f1) obj2).d) {
                obj = obj2;
                break;
            }
        }
        c3f1 c3f1Var = (c3f1) obj;
        if (c3f1Var != null) {
            return c3f1Var;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            r7h.W(((c3f1) it.next()).f, arrayList);
        }
        return b(arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3f1)) {
            return false;
        }
        f3f1 f3f1Var = (f3f1) obj;
        return u890.j(this.a, f3f1Var.a) && u890.j(this.b, f3f1Var.b) && this.c == f3f1Var.c && this.d == f3f1Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + xcg1.g(xcg1.g(f4i1.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public /* synthetic */ f3f1(g3f1 g3f1Var, List list, boolean z, int i) {
        this(g3f1Var, list, (i & 4) != 0 ? true : z, true);
    }
}
