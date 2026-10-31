package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class p7h extends k4p1 {
    public static ArrayList H(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i36(objArr, true));
    }

    public static int I(ArrayList arrayList, Comparable comparable) {
        int size = arrayList.size();
        Q(arrayList.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iT = pap1.t((Comparable) arrayList.get(i3), comparable);
            if (iT < 0) {
                i2 = i3 + 1;
            } else {
                if (iT <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static int J(List list, iu30 iu30Var) {
        int size = list.size();
        Q(list.size(), size);
        int i = size - 1;
        int i2 = 0;
        while (i2 <= i) {
            int i3 = (i2 + i) >>> 1;
            int iIntValue = ((Number) iu30Var.invoke(list.get(i3))).intValue();
            if (iIntValue < 0) {
                i2 = i3 + 1;
            } else {
                if (iIntValue <= 0) {
                    return i3;
                }
                i = i3 - 1;
            }
        }
        return -(i2 + 1);
    }

    public static tr80 K(Collection collection) {
        return new tr80(0, collection.size() - 1, 1);
    }

    public static int L(List list) {
        return list.size() - 1;
    }

    public static List M(Object... objArr) {
        return objArr.length > 0 ? f46.H(objArr) : z6x.a;
    }

    public static List N(Object obj) {
        return obj != null ? k4p1.x(obj) : z6x.a;
    }

    public static ArrayList O(Object... objArr) {
        return objArr.length == 0 ? new ArrayList() : new ArrayList(new i36(objArr, true));
    }

    public static final List P(List list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? list : k4p1.x(list.get(0));
        }
        return z6x.a;
    }

    public static final void Q(int i, int i2) {
        if (i2 < 0) {
            hhg1.n(gvg.e(i2, "fromIndex (0) is greater than toIndex (", ")."));
        } else {
            if (i2 <= i) {
                return;
            }
            eg.g(l1d.j(i2, i, "toIndex (", ") is greater than size (", ")."));
        }
    }

    public static List R(Iterable iterable, dqz0 dqz0Var) {
        List listN1 = o7h.n1(iterable);
        for (int iL = L(listN1); iL > 0; iL--) {
            int iG = dqz0Var.g(iL + 1);
            ArrayList arrayList = (ArrayList) listN1;
            arrayList.set(iG, arrayList.set(iL, arrayList.get(iG)));
        }
        return listN1;
    }

    public static void S() {
        throw new ArithmeticException("Count overflow has happened.");
    }

    public static void T() {
        throw new ArithmeticException("Index overflow has happened.");
    }
}
