package p;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
@o661
public final class y1b1 {
    public static final x1b1 Companion = new x1b1();
    public static final znb0[] c = {dm5.S(2, gr81.d1)};
    public final List a;
    public long b;

    public /* synthetic */ y1b1(int i, List list) {
        if (1 != (i & 1)) {
            o6p1.t(i, 1, w1b1.a.getDescriptor());
            throw null;
        }
        this.a = list;
        this.b = 1800L;
    }

    public final n1b1 a(String str) {
        Object next;
        z6x z6xVar = this.a;
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        Iterator it = ((Iterable) z6xVar).iterator();
        while (it.hasNext()) {
            next = it.next();
            n1b1 n1b1Var = (n1b1) next;
            n1b1Var.getClass();
            Set set = s4b1.f;
            s4b1 s4b1VarX = uic.x(n1b1Var.c);
            s4b1 s4b1VarX2 = uic.x(str);
            blc0 blc0Var = s4b1VarX.c;
            blc0 blc0Var2 = blc0.o6;
            if ((blc0Var == blc0Var2 || s4b1VarX2.c == blc0Var2) ? false : u890.j(s4b1VarX.j(), s4b1VarX2.j())) {
                return (n1b1) next;
            }
        }
        next = null;
        return (n1b1) next;
    }

    public final long b() {
        return this.b;
    }

    public final void c(y1b1 y1b1Var) {
        List<n1b1> list;
        List<n1b1> list2;
        if (y1b1Var == null || (list = y1b1Var.a) == null || (list2 = this.a) == null) {
            return;
        }
        HashMap map = new HashMap();
        for (n1b1 n1b1Var : list) {
            map.put(n1b1Var.c, n1b1Var);
        }
        HashMap map2 = new HashMap();
        for (n1b1 n1b1Var2 : list2) {
            map2.put(n1b1Var2.c, n1b1Var2);
        }
        for (Map.Entry entry : map2.entrySet()) {
            String str = (String) entry.getKey();
            n1b1 n1b1Var3 = (n1b1) entry.getValue();
            n1b1 n1b1Var4 = (n1b1) map.get(str);
            if (n1b1Var4 != null && n1b1Var4.f) {
                n1b1Var3.f = true;
            }
        }
    }

    public final void d(long j) {
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y1b1) && u890.j(this.a, ((y1b1) obj).a);
    }

    public final int hashCode() {
        List list = this.a;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }
}
