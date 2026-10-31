package p;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class r7h extends q7h {
    public static void W(Iterable iterable, Collection collection) {
        if (iterable instanceof Collection) {
            collection.addAll((Collection) iterable);
            return;
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            collection.add(it.next());
        }
    }

    public static void X(List list, n561 n561Var) {
        Iterator it = n561Var.iterator();
        while (it.hasNext()) {
            list.add(it.next());
        }
    }

    public static final Collection Y(Iterable iterable) {
        return iterable instanceof Collection ? (Collection) iterable : o7h.l1(iterable);
    }

    public static final boolean Z(Iterable iterable, iu30 iu30Var, boolean z) {
        Iterator it = iterable.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            if (((Boolean) iu30Var.invoke(it.next())).booleanValue() == z) {
                it.remove();
                z2 = true;
            }
        }
        return z2;
    }

    public static boolean a0(List list, iu30 iu30Var) {
        int i;
        if (!(list instanceof RandomAccess)) {
            if ((list instanceof ola0) && !(list instanceof pla0)) {
                w0h1.O(list, "kotlin.collections.MutableIterable");
                throw null;
            }
            try {
                return Z(list, iu30Var, true);
            } catch (ClassCastException e) {
                u890.y(e, w0h1.class.getName());
                throw e;
            }
        }
        int iL = p7h.L(list);
        if (iL >= 0) {
            int i2 = 0;
            i = 0;
            while (true) {
                Object obj = list.get(i2);
                if (!((Boolean) iu30Var.invoke(obj)).booleanValue()) {
                    if (i != i2) {
                        list.set(i, obj);
                    }
                    i++;
                }
                if (i2 == iL) {
                    break;
                }
                i2++;
            }
        } else {
            i = 0;
        }
        if (i >= list.size()) {
            return false;
        }
        int iL2 = p7h.L(list);
        if (i <= iL2) {
            while (true) {
                list.remove(iL2);
                if (iL2 == i) {
                    break;
                }
                iL2--;
            }
        }
        return true;
    }

    public static Object b0(List list) {
        if (!list.isEmpty()) {
            return list.remove(0);
        }
        bhn0.t("List is empty.");
        return null;
    }

    public static Object c0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(0);
    }

    public static Object d0(List list) {
        if (!list.isEmpty()) {
            return list.remove(p7h.L(list));
        }
        bhn0.t("List is empty.");
        return null;
    }

    public static Object e0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.remove(p7h.L(list));
    }

    public static void f0(List list, Comparator comparator) {
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }
}
