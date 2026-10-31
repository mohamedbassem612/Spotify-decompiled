package p;

import java.io.IOException;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public abstract class o7h extends r7h {
    public static Object A0(List list) {
        if (!list.isEmpty()) {
            return list.get(p7h.L(list));
        }
        bhn0.t("List is empty.");
        return null;
    }

    public static Object B0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(list.size() - 1);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static Object C0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    public static Comparable D0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float E0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable F0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            hhg1.k();
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) < 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Comparable G0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static Float H0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = ((Number) it.next()).floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, ((Number) it.next()).floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static Comparable I0(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            hhg1.k();
            return null;
        }
        Comparable comparable = (Comparable) it.next();
        while (it.hasNext()) {
            Comparable comparable2 = (Comparable) it.next();
            if (comparable.compareTo(comparable2) > 0) {
                comparable = comparable2;
            }
        }
        return comparable;
    }

    public static ArrayList J0(Iterable iterable, Object obj) {
        ArrayList arrayList = new ArrayList(q7h.U(iterable, 10));
        boolean z = false;
        for (Object obj2 : iterable) {
            boolean z2 = true;
            if (!z && u890.j(obj2, obj)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }

    public static List K0(Iterable iterable, Iterable iterable2) {
        Collection collectionY = r7h.Y(iterable2);
        if (collectionY.isEmpty()) {
            return l1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (!collectionY.contains(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static ArrayList L0(Iterable iterable, Iterable iterable2) {
        if (iterable instanceof Collection) {
            return N0(iterable2, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        r7h.W(iterable, arrayList);
        r7h.W(iterable2, arrayList);
        return arrayList;
    }

    public static ArrayList M0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return O0(obj, (Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        r7h.W(iterable, arrayList);
        arrayList.add(obj);
        return arrayList;
    }

    public static ArrayList N0(Iterable iterable, Collection collection) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            r7h.W(iterable, arrayList);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection2.size() + collection.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static ArrayList O0(Object obj, Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(obj);
        return arrayList;
    }

    public static Object P0(Collection collection, dqz0 dqz0Var) {
        if (!collection.isEmpty()) {
            return m0(collection, dqz0Var.g(collection.size()));
        }
        bhn0.t("Collection is empty.");
        return null;
    }

    public static void Q0(List list) {
        Collections.reverse(list);
    }

    public static final int R0(int i, List list) {
        if (i >= 0 && i <= p7h.L(list)) {
            return p7h.L(list) - i;
        }
        StringBuilder sbR = cy30.r(i, "Element index ", " must be in range [");
        sbR.append(new tr80(0, p7h.L(list), 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public static final int S0(int i, List list) {
        if (i >= 0 && i <= list.size()) {
            return list.size() - i;
        }
        StringBuilder sbR = cy30.r(i, "Position index ", " must be in range [");
        sbR.append(new tr80(0, list.size(), 1));
        sbR.append("].");
        throw new IndexOutOfBoundsException(sbR.toString());
    }

    public static List T0(Iterable iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return l1(iterable);
        }
        List listN1 = n1(iterable);
        Q0(listN1);
        return listN1;
    }

    public static Object U0(Iterable iterable) {
        if (iterable instanceof List) {
            return V0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            bhn0.t("Collection is empty.");
            return null;
        }
        Object next = it.next();
        if (!it.hasNext()) {
            return next;
        }
        hhg1.n("Collection has more than one element.");
        return null;
    }

    public static Object V0(List list) {
        int size = list.size();
        if (size == 0) {
            bhn0.t("List is empty.");
            return null;
        }
        if (size == 1) {
            return list.get(0);
        }
        hhg1.n("List has more than one element.");
        return null;
    }

    public static Object W0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return list.get(0);
            }
            return null;
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        Object next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static Object X0(List list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static List Y0(List list, tr80 tr80Var) {
        return tr80Var.isEmpty() ? z6x.a : l1(list.subList(tr80Var.a, tr80Var.b + 1));
    }

    public static List Z0(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            List listN1 = n1(iterable);
            if (((ArrayList) listN1).size() > 1) {
                Collections.sort(listN1);
            }
            return listN1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return l1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        f46.E0((Comparable[]) array);
        return f46.H(array);
    }

    public static List a1(Iterable iterable, Comparator comparator) {
        if (!(iterable instanceof Collection)) {
            List listN1 = n1(iterable);
            r7h.f0(listN1, comparator);
            return listN1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return l1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        f46.F0(array, comparator);
        return f46.H(array);
    }

    public static LinkedHashSet b1(Iterable iterable, Iterable iterable2) {
        Collection collectionY = r7h.Y(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (!collectionY.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static int c1(Iterable iterable) {
        Iterator it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += ((Number) it.next()).intValue();
        }
        return iIntValue;
    }

    public static List d1(Iterable iterable, int i) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return z6x.a;
        }
        if (iterable instanceof Collection) {
            if (i >= ((Collection) iterable).size()) {
                return l1(iterable);
            }
            if (i == 1) {
                return k4p1.x(p0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i);
        Iterator it = iterable.iterator();
        int i2 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i2++;
            if (i2 == i) {
                break;
            }
        }
        return p7h.P(arrayList);
    }

    public static List e1(int i, List list) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return z6x.a;
        }
        int size = list.size();
        if (i >= size) {
            return l1(list);
        }
        if (i == 1) {
            return k4p1.x(A0(list));
        }
        ArrayList arrayList = new ArrayList(i);
        if (list instanceof RandomAccess) {
            for (int i2 = size - i; i2 < size; i2++) {
                arrayList.add(list.get(i2));
            }
        } else {
            ListIterator listIterator = list.listIterator(size - i);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static boolean[] f1(Collection collection) {
        boolean[] zArr = new boolean[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            zArr[i] = ((Boolean) it.next()).booleanValue();
            i++;
        }
        return zArr;
    }

    public static double g0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dFloatValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dFloatValue += (double) ((Number) it.next()).floatValue();
            i++;
            if (i < 0) {
                p7h.S();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dFloatValue / ((double) i);
    }

    public static byte[] g1(Collection collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            bArr[i] = ((Number) it.next()).byteValue();
            i++;
        }
        return bArr;
    }

    public static double h0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        double dIntValue = 0.0d;
        int i = 0;
        while (it.hasNext()) {
            dIntValue += (double) ((Number) it.next()).intValue();
            i++;
            if (i < 0) {
                p7h.S();
                throw null;
            }
        }
        if (i == 0) {
            return Double.NaN;
        }
        return dIntValue / ((double) i);
    }

    public static void h1(Iterable iterable, AbstractCollection abstractCollection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            abstractCollection.add(it.next());
        }
    }

    public static boolean i0(Iterable iterable, Object obj) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        return u0(iterable, obj) >= 0;
    }

    public static float[] i1(Collection collection) {
        float[] fArr = new float[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            fArr[i] = ((Number) it.next()).floatValue();
            i++;
        }
        return fArr;
    }

    public static List j0(Iterable iterable) {
        return l1(o1(iterable));
    }

    public static HashSet j1(Iterable iterable) {
        HashSet hashSet = new HashSet(zno1.s(q7h.U(iterable, 12)));
        h1(iterable, hashSet);
        return hashSet;
    }

    public static List k0(Iterable iterable, int i) {
        ArrayList arrayList;
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        if (i == 0) {
            return l1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i;
            if (size <= 0) {
                return z6x.a;
            }
            if (size == 1) {
                return k4p1.x(z0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i < size2) {
                        arrayList.add(list.get(i));
                        i++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i2 = 0;
        for (Object obj : iterable) {
            if (i2 >= i) {
                arrayList.add(obj);
            } else {
                i2++;
            }
        }
        return p7h.P(arrayList);
    }

    public static int[] k1(Collection collection) {
        int[] iArr = new int[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = ((Number) it.next()).intValue();
            i++;
        }
        return iArr;
    }

    public static List l0(int i, List list) {
        if (i < 0) {
            hhg1.f(gvg.e(i, "Requested element count ", " is less than zero."));
            return null;
        }
        List list2 = list;
        int size = list.size() - i;
        if (size < 0) {
            size = 0;
        }
        return d1(list2, size);
    }

    public static List l1(Iterable iterable) {
        if (!(iterable instanceof Collection)) {
            return p7h.P(n1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return z6x.a;
        }
        if (size != 1) {
            return new ArrayList(collection);
        }
        return k4p1.x(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static final Object m0(Iterable iterable, int i) {
        boolean z = iterable instanceof List;
        if (z) {
            return ((List) iterable).get(i);
        }
        p94 p94Var = new p94(i, (byte) 2);
        if (z) {
            List list = (List) iterable;
            if (i >= 0 && i < list.size()) {
                return list.get(i);
            }
            p94Var.invoke(Integer.valueOf(i));
            throw null;
        }
        if (i < 0) {
            p94Var.invoke(Integer.valueOf(i));
            throw null;
        }
        int i2 = 0;
        for (Object obj : iterable) {
            int i3 = i2 + 1;
            if (i == i2) {
                return obj;
            }
            i2 = i3;
        }
        p94Var.invoke(Integer.valueOf(i));
        throw null;
    }

    public static long[] m1(Collection collection) {
        long[] jArr = new long[collection.size()];
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            jArr[i] = ((Number) it.next()).longValue();
            i++;
        }
        return jArr;
    }

    public static ArrayList n0(Iterable iterable, Class cls) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (cls.isInstance(obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final List n1(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new ArrayList((Collection) iterable);
        }
        ArrayList arrayList = new ArrayList();
        h1(iterable, arrayList);
        return arrayList;
    }

    public static ArrayList o0(Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : iterable) {
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static Set o1(Iterable iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        h1(iterable, linkedHashSet);
        return linkedHashSet;
    }

    public static Object p0(Iterable iterable) {
        if (iterable instanceof List) {
            return q0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        bhn0.t("Collection is empty.");
        return null;
    }

    public static Set p1(Iterable iterable) {
        boolean z = iterable instanceof Collection;
        w7x w7xVar = w7x.a;
        if (!z) {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            h1(iterable, linkedHashSet);
            int size = linkedHashSet.size();
            if (size != 0) {
                return size != 1 ? linkedHashSet : Collections.singleton(linkedHashSet.iterator().next());
            }
            return w7xVar;
        }
        Collection collection = (Collection) iterable;
        int size2 = collection.size();
        if (size2 == 0) {
            return w7xVar;
        }
        if (size2 == 1) {
            return Collections.singleton(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet(zno1.s(collection.size()));
        h1(iterable, linkedHashSet2);
        return linkedHashSet2;
    }

    public static Object q0(List list) {
        if (!list.isEmpty()) {
            return list.get(0);
        }
        bhn0.t("List is empty.");
        return null;
    }

    public static SortedSet q1(Iterable iterable) {
        TreeSet treeSet = new TreeSet();
        h1(iterable, treeSet);
        return treeSet;
    }

    public static Object r0(Iterable iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return list.get(0);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static Set r1(Iterable iterable, Iterable iterable2) {
        Set setO1 = o1(iterable);
        r7h.W(iterable2, setO1);
        return setO1;
    }

    public static Object s0(List list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static ArrayList s1(Iterable iterable, int i, int i2) {
        o0c.r(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itT = o0c.T(iterable.iterator(), i, i2, true, false);
            while (itT.hasNext()) {
                arrayList.add((List) itT.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        int i3 = 0;
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            ArrayList arrayList3 = new ArrayList(i4);
            for (int i5 = 0; i5 < i4; i5++) {
                arrayList3.add(list.get(i5 + i3));
            }
            arrayList2.add(arrayList3);
            i3 += i2;
        }
        return arrayList2;
    }

    public static Object t0(int i, List list) {
        if (i < 0 || i >= list.size()) {
            return null;
        }
        return list.get(i);
    }

    public static final ArrayList t1(Iterable iterable, int i, int i2, boolean z, iu30 iu30Var) {
        o0c.r(i, i2);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itT = o0c.T(iterable.iterator(), i, i2, z, true);
            while (itT.hasNext()) {
                arrayList.add(iu30Var.invoke((List) itT.next()));
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        int i3 = 0;
        ArrayList arrayList2 = new ArrayList((size / i2) + (size % i2 == 0 ? 0 : 1));
        f7 f7Var = new f7(list);
        while (i3 >= 0 && i3 < size) {
            int i4 = size - i3;
            if (i <= i4) {
                i4 = i;
            }
            if (!z && i4 < i) {
                break;
            }
            f7Var.c(i3, i4 + i3);
            arrayList2.add(iu30Var.invoke(f7Var));
            i3 += i2;
        }
        return arrayList2;
    }

    public static int u0(Iterable iterable, Object obj) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(obj);
        }
        int i = 0;
        for (Object obj2 : iterable) {
            if (i < 0) {
                p7h.T();
                throw null;
            }
            if (u890.j(obj, obj2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public static ba80 u1(Iterable iterable) {
        return new ba80(new hx4(iterable, (byte) 15));
    }

    public static LinkedHashSet v0(Iterable iterable, Iterable iterable2) {
        Collection collectionY = r7h.Y(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : iterable) {
            if (collectionY.contains(obj)) {
                linkedHashSet.add(obj);
            }
        }
        return linkedHashSet;
    }

    public static ArrayList v1(Iterable iterable, Iterable iterable2) {
        Iterator it = iterable.iterator();
        Iterator it2 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(q7h.U(iterable, 10), q7h.U(iterable2, 10)));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(oqn1.n(it.next(), it2.next()));
        }
        return arrayList;
    }

    public static final void w0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, iu30 iu30Var) throws IOException {
        appendable.append(charSequence2);
        int i2 = 0;
        for (Object obj : iterable) {
            i2++;
            if (i2 > 1) {
                appendable.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            } else {
                jhc1.l(appendable, obj, iu30Var);
            }
        }
        if (i >= 0 && i2 > i) {
            appendable.append(charSequence4);
        }
        appendable.append(charSequence3);
    }

    public static List w1(Iterable iterable) {
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return z6x.a;
        }
        ArrayList arrayList = new ArrayList();
        Object next = it.next();
        while (it.hasNext()) {
            Object next2 = it.next();
            arrayList.add(oqn1.n(next, next2));
            next = next2;
        }
        return arrayList;
    }

    public static /* synthetic */ void x0(Iterable iterable, Appendable appendable, String str, String str2, String str3, iu30 iu30Var, int i) throws IOException {
        if ((i & 2) != 0) {
            str = ", ";
        }
        String str4 = str;
        String str5 = (i & 4) != 0 ? "" : str2;
        String str6 = (i & 8) != 0 ? "" : str3;
        if ((i & 64) != 0) {
            iu30Var = null;
        }
        w0(iterable, appendable, str4, str5, str6, -1, "...", iu30Var);
    }

    public static String y0(Iterable iterable, CharSequence charSequence, String str, String str2, iu30 iu30Var, int i) {
        if ((i & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence2 = charSequence;
        String str3 = (i & 2) != 0 ? "" : str;
        String str4 = (i & 4) != 0 ? "" : str2;
        int i2 = (i & 8) != 0 ? -1 : 3;
        if ((i & 32) != 0) {
            iu30Var = null;
        }
        StringBuilder sb = new StringBuilder();
        w0(iterable, sb, charSequence2, str3, str4, i2, "...", iu30Var);
        return sb.toString();
    }

    public static Object z0(Iterable iterable) {
        if (iterable instanceof List) {
            return A0((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            bhn0.t("Collection is empty.");
            return null;
        }
        Object next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }
}
