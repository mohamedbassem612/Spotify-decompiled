package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vq00 implements gfh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ vq00(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m484measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        Object obj = this.c;
        switch (b) {
            case 0:
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) it.next()).H(j));
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = arrayList.iterator();
                int i = 0;
                int i2 = 0;
                while (true) {
                    Integer num = null;
                    if (!it2.hasNext()) {
                        Iterator it3 = arrayList.iterator();
                        if (it3.hasNext()) {
                            Integer numValueOf = Integer.valueOf(((q5t0) it3.next()).b);
                            while (true) {
                                num = numValueOf;
                                while (true) {
                                    if (it3.hasNext()) {
                                        numValueOf = Integer.valueOf(((q5t0) it3.next()).b);
                                        if (num.compareTo(numValueOf) < 0) {
                                        }
                                    }
                                }
                            }
                        }
                        return ifh0Var.S(i, num != null ? num.intValue() : 0, b7xVar, new djx((o95) obj, arrayList, arrayList2, (byte) 13));
                    }
                    Object next = it2.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList2.add(Integer.valueOf(i));
                    i += ((q5t0) next).a + (i2 < arrayList.size() - 1 ? this.b : 0);
                    i2 = i3;
                }
                break;
            default:
                int i4 = hjl.i(j);
                int i5 = this.b;
                int i6 = (i5 * 2) + i4;
                long jA = jjl.a(i6, i6, 0, hjl.h(j));
                mmr0 mmr0Var = (mmr0) obj;
                return ifh0Var.S(hjl.i(j), hjl.h(j), b7xVar, new fu(((afh0) list.get(0)).H(hjl.b(jA, 0, 0, 0, yoi1.p(((Number) mmr0Var.a).intValue(), 0, hjl.h(j)), 7)), i5, mmr0Var, ((afh0) list.get(1)).H(hjl.b(jA, 0, 0, 0, yoi1.p(hjl.h(j) - ((Number) mmr0Var.b).intValue(), 0, hjl.h(j)), 7)), (byte) 19));
        }
    }
}
