package p;

import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class suo {
    public final otu a;

    public suo(otu otuVar) {
        this.a = otuVar;
    }

    public static m5y a(j5y j5yVar, String str, nrs0 nrs0Var) {
        Object next;
        Object next2;
        c380 c380Var;
        Object next3;
        c380 c380Var2 = j5yVar.a;
        Iterator it = c380Var2.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((n5y) next).b.equals(nrs0Var != null ? nrs0Var.a : null));
        n5y n5yVar = (n5y) next;
        if (n5yVar != null && (c380Var = n5yVar.c) != null) {
            Iterator it2 = c380Var.iterator();
            do {
                if (!it2.hasNext()) {
                    next3 = null;
                    break;
                }
                next3 = it2.next();
            } while (!((m5y) next3).a.equals(str));
            m5y m5yVar = (m5y) next3;
            if (m5yVar != null) {
                return m5yVar;
            }
        }
        Iterator it3 = c380Var2.iterator();
        while (it3.hasNext()) {
            Iterator it4 = ((n5y) it3.next()).c.iterator();
            do {
                if (!it4.hasNext()) {
                    next2 = null;
                    break;
                }
                next2 = it4.next();
            } while (!((m5y) next2).a.equals(str));
            m5y m5yVar2 = (m5y) next2;
            if (m5yVar2 != null) {
                return m5yVar2;
            }
        }
        return null;
    }

    public static ruo b(j5y j5yVar, String str, nrs0 nrs0Var) {
        if (nrs0Var == null) {
            return null;
        }
        n5y n5yVar = (n5y) o7h.t0(nrs0Var.b, j5yVar.a);
        if (n5yVar == null || !n5yVar.b.equals(nrs0Var.a)) {
            return null;
        }
        m5y m5yVar = (m5y) o7h.t0(nrs0Var.c, n5yVar.c);
        if (m5yVar != null && m5yVar.a.equals(str)) {
            return new ruo(m5yVar, nrs0Var);
        }
        return null;
    }
}
