package p;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class f261 {
    public static final Comparator[] a;
    public static final f6f0 b;

    static {
        Comparator[] comparatorArr = new Comparator[2];
        int i = 0;
        while (i < 2) {
            comparatorArr[i] = new xvd(new xvd(i == 0 ? k0d.O0 : k0d.t, (byte) 23), (byte) 24);
            i++;
        }
        a = comparatorArr;
        b = new f6f0((byte) 13);
    }

    public static final void a(v161 v161Var, ArrayList arrayList, j6 j6Var, j6 j6Var2, fdn0 fdn0Var) {
        o161 o161Var = v161Var.d;
        Object objG = o161Var.a.g(z161.n);
        if (objG == null) {
            objG = Boolean.FALSE;
        }
        boolean zBooleanValue = ((Boolean) objG).booleanValue();
        if ((zBooleanValue || ((Boolean) j6Var2.invoke(v161Var)).booleanValue()) && ((Boolean) j6Var.invoke(v161Var)).booleanValue()) {
            arrayList.add(v161Var);
        }
        if (zBooleanValue) {
            fdn0Var.i(v161Var.f, b(v161Var, j6Var, j6Var2, v161.j(7, v161Var)));
            return;
        }
        List listJ = v161.j(7, v161Var);
        int size = listJ.size();
        for (int i = 0; i < size; i++) {
            a((v161) listJ.get(i), arrayList, j6Var, j6Var2, fdn0Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00d3  */
    public static final ArrayList b(v161 v161Var, j6 j6Var, j6 j6Var2, List list) {
        fdn0 fdn0Var = pr80.a;
        fdn0 fdn0Var2 = new fdn0();
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            a((v161) list.get(i), arrayList, j6Var, j6Var2, fdn0Var2);
        }
        char c = v161Var.c.a1 == flb0.b ? (char) 1 : (char) 0;
        ArrayList arrayList2 = new ArrayList(arrayList.size() / 2);
        int iL = p7h.L(arrayList);
        if (iL >= 0) {
            int i2 = 0;
            while (true) {
                v161 v161Var2 = (v161) arrayList.get(i2);
                if (i2 == 0) {
                    arrayList2.add(new mmr0(v161Var2.h(), p7h.O(new v161[]{v161Var2})));
                    break;
                }
                float f = v161Var2.h().b;
                float f2 = v161Var2.h().d;
                boolean z = f >= f2;
                int iL2 = p7h.L(arrayList2);
                if (iL2 >= 0) {
                    int i3 = 0;
                    while (true) {
                        n511 n511Var = (n511) ((mmr0) arrayList2.get(i3)).a;
                        float f3 = n511Var.b;
                        float f4 = n511Var.d;
                        boolean z2 = f3 >= f4;
                        if (!z && !z2 && Math.max(f, f3) < Math.min(f2, f4)) {
                            arrayList2.set(i3, new mmr0(new n511(Math.max(n511Var.a, 0.0f), Math.max(n511Var.b, f), Math.min(n511Var.c, Float.POSITIVE_INFINITY), Math.min(f4, f2)), ((mmr0) arrayList2.get(i3)).b));
                            ((List) ((mmr0) arrayList2.get(i3)).b).add(v161Var2);
                            break;
                        }
                        if (i3 != iL2) {
                            i3++;
                        }
                    }
                }
                arrayList2.add(new mmr0(v161Var2.h(), p7h.O(new v161[]{v161Var2})));
                break;
                if (i2 == iL) {
                    break;
                }
                i2++;
            }
        }
        r7h.f0(arrayList2, k0d.P0);
        ArrayList arrayList3 = new ArrayList();
        Comparator comparator = a[c ^ 1];
        int size2 = arrayList2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            mmr0 mmr0Var = (mmr0) arrayList2.get(i4);
            r7h.f0((List) mmr0Var.b, comparator);
            arrayList3.addAll((Collection) mmr0Var.b);
        }
        r7h.f0(arrayList3, new m((byte) 25));
        int size3 = 0;
        while (size3 <= p7h.L(arrayList3)) {
            List list2 = (List) fdn0Var2.b(((v161) arrayList3.get(size3)).f);
            if (list2 != null) {
                if (((Boolean) j6Var2.invoke(arrayList3.get(size3))).booleanValue()) {
                    size3++;
                } else {
                    arrayList3.remove(size3);
                }
                arrayList3.addAll(size3, list2);
                size3 += list2.size();
            } else {
                size3++;
            }
        }
        return arrayList3;
    }
}
