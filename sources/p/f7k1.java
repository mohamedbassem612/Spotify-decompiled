package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f7k1 implements iu30 {
    public final vxr a;
    public final boolean b;

    public f7k1(vxr vxrVar, boolean z) {
        this.a = vxrVar;
        this.b = z;
    }

    public final Object invoke(Object obj) {
        hix0 hix0Var;
        i2z i2zVar;
        ph20 ph20Var = (ph20) obj;
        String str = ph20Var.a;
        boolean z = ph20Var.c;
        zsq0 zsq0Var = ph20Var.b;
        if (zsq0Var == null) {
            return new zh20(z);
        }
        if (zsq0Var instanceof zsq0) {
            Object obj2 = zsq0Var.a;
            if (!((m851) obj2).a.b.isEmpty()) {
                m851 m851Var = (m851) obj2;
                List list = ((m851) obj2).a.b;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                boolean z2 = false;
                int i = 0;
                for (Object obj3 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    i1z i1zVar = (i1z) obj3;
                    if (this.b) {
                        hix0 hix0Var2 = (iix0) ph20Var.d.get(i1zVar.a);
                        if (hix0Var2 == null) {
                            hix0Var2 = new hix0(z2, 0L);
                        }
                        hix0Var = hix0Var2;
                    } else {
                        hix0Var = null;
                    }
                    c481 c481Var = m851Var.a;
                    String str2 = c481Var.a.d;
                    List list2 = c481Var.b;
                    boolean z3 = m851Var.c;
                    n6v0 n6v0Var = m851Var.b;
                    boolean z4 = (z3 || !i1zVar.v) ? true : z2;
                    boolean z5 = i == list2.size() + (-1);
                    if (n6v0Var.equals(k6v0.a) || n6v0Var.equals(l6v0.a)) {
                        i2zVar = h2z.c;
                    } else {
                        if (!(n6v0Var instanceof m6v0)) {
                            eg.o();
                            return null;
                        }
                        m6v0 m6v0Var = (m6v0) n6v0Var;
                        i2zVar = new i2z(m6v0Var.a, m6v0Var.b, m6v0Var.c, m6v0Var.d, m6v0Var.e, m6v0Var.f);
                    }
                    n131 n131Var = m851Var.d;
                    arrayList.add(this.a.a(new kbz(str2, i1zVar, list2, z4, z5, i, i2zVar, new h131(n131Var.a, n131Var.b), true, hix0Var, m851Var.e.contains(i1zVar.a))));
                    i = i2;
                    ph20Var = ph20Var;
                    z2 = false;
                }
                return new bi20(str, arrayList, z);
            }
        }
        return new ai20(str, z);
    }
}
