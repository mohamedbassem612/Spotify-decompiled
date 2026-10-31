package p;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cn70 {
    public static final cn70 b;
    public final List a;

    static {
        new cua((byte) 13);
        b = new cn70(z6x.a);
    }

    public cn70(List list) {
        this.a = list;
    }

    public static boolean c(cn70 cn70Var, cn70 cn70Var2) {
        List list = cn70Var2.a;
        List list2 = cn70Var.a;
        if (list2.isEmpty() && list.isEmpty()) {
            return true;
        }
        if (list.isEmpty() || list2.isEmpty()) {
            return false;
        }
        if (list2.equals(list)) {
            return true;
        }
        List<cz81> list3 = list2;
        if ((list3 instanceof Collection) && list3.isEmpty()) {
            return false;
        }
        for (cz81 cz81Var : list3) {
            List list4 = list;
            if (!(list4 instanceof Collection) || !list4.isEmpty()) {
                Iterator it = list4.iterator();
                while (it.hasNext()) {
                    if (u890.j(cz81Var.b, ((cz81) it.next()).b)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final String a() {
        Object next;
        Iterator it = o7h.a1(this.a, new cvt((byte) 15)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!f46.M(new ak[]{ak.a, ak.b, ak.c, ak.d}, ((cz81) next).a));
        cz81 cz81Var = (cz81) next;
        if (cz81Var != null) {
            return cz81Var.b;
        }
        return null;
    }

    public final boolean b(ak akVar) {
        List list = this.a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((cz81) it.next()).a == akVar) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cn70) {
            return c(this, (cn70) obj);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.getClass().hashCode();
    }
}
