package p;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class z561 extends j2h1 {
    public static n561 Q(Iterator it) {
        return R(new i46(it, (byte) 4));
    }

    public static n561 R(n561 n561Var) {
        return n561Var instanceof khl ? n561Var : new khl(n561Var);
    }

    public static n561 S(n561 n561Var, int i) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return n561Var;
        }
        return n561Var instanceof x9v ? ((x9v) n561Var).a(i) : new p9v(n561Var, i);
    }

    public static nf20 T(iu30 iu30Var, n561 n561Var) {
        return new nf20(n561Var, true, iu30Var);
    }

    public static nf20 U(iu30 iu30Var, n561 n561Var) {
        return new nf20(n561Var, false, iu30Var);
    }

    public static nf20 V(n561 n561Var) {
        return U(new cix0((byte) 18), n561Var);
    }

    public static Object W(nf20 nf20Var) {
        mf20 mf20Var = new mf20(nf20Var);
        if (mf20Var.hasNext()) {
            return mf20Var.next();
        }
        return null;
    }

    public static fp20 X(iu30 iu30Var, n561 n561Var) {
        return new fp20(n561Var, iu30Var, c661.a);
    }

    public static fp20 Y(iu30 iu30Var, n561 n561Var) {
        return new fp20(n561Var, iu30Var, b661.a);
    }

    public static final fp20 Z(n561 n561Var) {
        cix0 cix0Var = new cix0((byte) 15);
        if (!(n561Var instanceof sgg1)) {
            return new fp20(n561Var, new cix0((byte) 17), cix0Var);
        }
        sgg1 sgg1Var = (sgg1) n561Var;
        return new fp20(sgg1Var.a, sgg1Var.b, cix0Var);
    }

    public static oh40 a0(qga0 qga0Var) {
        return new oh40(qga0Var, re11.a, (byte) 0);
    }

    public static n561 b0(Function0 function0) {
        return R(new oh40(function0, new ki5(function0, (byte) 7), (byte) 0));
    }

    public static n561 c0(iu30 iu30Var, Object obj) {
        return obj == null ? v7x.a : new oh40(new ww21(obj, (byte) 7), iu30Var, (byte) 0);
    }

    public static String d0(n561 n561Var, String str) throws IOException {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "");
        int i = 0;
        for (Object obj : n561Var) {
            i++;
            if (i > 1) {
                sb.append((CharSequence) str);
            }
            jhc1.l(sb, obj, null);
        }
        sb.append((CharSequence) "");
        return sb.toString();
    }

    public static Object e0(n561 n561Var) {
        Iterator it = n561Var.iterator();
        if (!it.hasNext()) {
            bhn0.t("Sequence is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static nf20 f0(iu30 iu30Var, n561 n561Var) {
        return V(new sgg1(iu30Var, n561Var));
    }

    public static Object g0(nf20 nf20Var, Comparator comparator) {
        mf20 mf20Var = new mf20(nf20Var);
        if (!mf20Var.hasNext()) {
            return null;
        }
        Object next = mf20Var.next();
        while (mf20Var.hasNext()) {
            Object next2 = mf20Var.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static i46 h0(Object obj) {
        return new i46(obj, (byte) 5);
    }

    public static n561 i0(Object... objArr) {
        return f46.I(objArr);
    }

    public static n561 j0(n561 n561Var, int i) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return v7x.a;
        }
        return n561Var instanceof x9v ? ((x9v) n561Var).b(i) : new ipd1(n561Var, i);
    }

    public static List k0(n561 n561Var) {
        Iterator it = n561Var.iterator();
        if (!it.hasNext()) {
            return z6x.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return k4p1.x(next);
        }
        ArrayList arrayListH = ydh.h(next);
        while (it.hasNext()) {
            arrayListH.add(it.next());
        }
        return arrayListH;
    }

    public static ArrayList l0(n561 n561Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = n561Var.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    public static Set m0(n561 n561Var) {
        Iterator it = n561Var.iterator();
        if (!it.hasNext()) {
            return w7x.a;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return Collections.singleton(next);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add(next);
        while (it.hasNext()) {
            linkedHashSet.add(it.next());
        }
        return linkedHashSet;
    }

    public static i46 n0(i46 i46Var) {
        return new i46(new d661(i46Var, new f6f0((byte) 14), (lnm) null), (byte) 3);
    }
}
