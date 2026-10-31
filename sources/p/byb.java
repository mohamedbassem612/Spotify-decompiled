package p;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class byb implements lqm0 {
    public final /* synthetic */ vy71 a;
    public final /* synthetic */ Function0 b;

    public byb(vy71 vy71Var, Function0 function0) {
        this.a = vy71Var;
        this.b = function0;
    }

    @Override // p.lqm0
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 mo604measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        Integer numValueOf;
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        int i = 1;
        List list3 = (List) arrayList.get(1);
        List list4 = (List) arrayList.get(2);
        List list5 = (List) arrayList.get(3);
        final int i2 = hjl.i(j);
        final int iH = hjl.h(j);
        long jB = hjl.b(j, 0, 0, 0, 0, 10);
        final ArrayList arrayList2 = new ArrayList(list4.size());
        int size = list4.size();
        for (int i3 = 0; i3 < size; i3++) {
            arrayList2.add(((afh0) list4.get(i3)).H(jB));
        }
        final ArrayList arrayList3 = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i4 = 0; i4 < size2; i4++) {
            arrayList3.add(((afh0) list2.get(i4)).H(jB));
        }
        if (!arrayList3.isEmpty()) {
            numValueOf = Integer.valueOf(((q5t0) arrayList3.get(0)).b);
            int iL = p7h.L(arrayList3);
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((q5t0) arrayList3.get(i)).b);
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i == iL) {
                        break;
                    }
                    i++;
                }
            }
        } else {
            numValueOf = null;
        }
        final int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        long jB2 = hjl.b(jB, 0, 0, 0, iH - iIntValue, 7);
        final ArrayList arrayList4 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i5 = 0; i5 < size3; i5++) {
            arrayList4.add(((afh0) list3.get(i5)).H(jB2));
        }
        final ArrayList arrayList5 = new ArrayList(list5.size());
        int size4 = list5.size();
        for (int i6 = 0; i6 < size4; i6++) {
            arrayList5.add(((afh0) list5.get(i6)).H(jB));
        }
        final vy71 vy71Var = this.a;
        final Function0 function0 = this.b;
        return ifh0Var.S(i2, iH, b7x.a, new iu30() { // from class: p.ayb
            public final Object invoke(Object obj) {
                Integer numValueOf3;
                Integer numValueOf4;
                Integer numValueOf5;
                int iU;
                p5t0 p5t0Var = (p5t0) obj;
                ArrayList arrayList6 = arrayList2;
                if (!arrayList6.isEmpty()) {
                    numValueOf3 = Integer.valueOf(((q5t0) arrayList6.get(0)).a);
                    int iL2 = p7h.L(arrayList6);
                    if (1 <= iL2) {
                        int i7 = 1;
                        while (true) {
                            Integer numValueOf6 = Integer.valueOf(((q5t0) arrayList6.get(i7)).a);
                            if (numValueOf6.compareTo(numValueOf3) > 0) {
                                numValueOf3 = numValueOf6;
                            }
                            if (i7 == iL2) {
                                break;
                            }
                            i7++;
                        }
                    }
                } else {
                    numValueOf3 = null;
                }
                int iIntValue2 = numValueOf3 != null ? numValueOf3.intValue() : 0;
                int i8 = i2;
                int iMax = Math.max(0, (i8 - iIntValue2) / 2);
                ArrayList arrayList7 = arrayList5;
                if (!arrayList7.isEmpty()) {
                    numValueOf4 = Integer.valueOf(((q5t0) arrayList7.get(0)).a);
                    int iL3 = p7h.L(arrayList7);
                    if (1 <= iL3) {
                        int i9 = 1;
                        while (true) {
                            Integer numValueOf7 = Integer.valueOf(((q5t0) arrayList7.get(i9)).a);
                            if (numValueOf7.compareTo(numValueOf4) > 0) {
                                numValueOf4 = numValueOf7;
                            }
                            if (i9 == iL3) {
                                break;
                            }
                            i9++;
                        }
                    }
                } else {
                    numValueOf4 = null;
                }
                int iIntValue3 = numValueOf4 != null ? numValueOf4.intValue() : 0;
                if (!arrayList7.isEmpty()) {
                    numValueOf5 = Integer.valueOf(((q5t0) arrayList7.get(0)).b);
                    int iL4 = p7h.L(arrayList7);
                    if (1 <= iL4) {
                        int i10 = 1;
                        while (true) {
                            Integer numValueOf8 = Integer.valueOf(((q5t0) arrayList7.get(i10)).b);
                            if (numValueOf8.compareTo(numValueOf5) > 0) {
                                numValueOf5 = numValueOf8;
                            }
                            if (i10 == iL4) {
                                break;
                            }
                            i10++;
                        }
                    }
                } else {
                    numValueOf5 = null;
                }
                int iIntValue4 = numValueOf5 != null ? numValueOf5.intValue() : 0;
                int i11 = (i8 - iIntValue3) / 2;
                int iOrdinal = vy71Var.d().ordinal();
                if (iOrdinal == 0 || iOrdinal == 1) {
                    iU = iH;
                } else {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    iU = jch0.U(((Number) function0.invoke()).floatValue());
                }
                int i12 = iU - iIntValue4;
                ArrayList arrayList8 = arrayList4;
                int size5 = arrayList8.size();
                for (int i13 = 0; i13 < size5; i13++) {
                    p5t0.l(0, iIntValue, p5t0Var, (q5t0) arrayList8.get(i13));
                }
                ArrayList arrayList9 = arrayList3;
                int size6 = arrayList9.size();
                for (int i14 = 0; i14 < size6; i14++) {
                    p5t0.l(0, 0, p5t0Var, (q5t0) arrayList9.get(i14));
                }
                int size7 = arrayList6.size();
                for (int i15 = 0; i15 < size7; i15++) {
                    p5t0.l(iMax, 0, p5t0Var, (q5t0) arrayList6.get(i15));
                }
                int size8 = arrayList7.size();
                for (int i16 = 0; i16 < size8; i16++) {
                    p5t0.l(i11, i12, p5t0Var, (q5t0) arrayList7.get(i16));
                }
                return rih1.a;
            }
        });
    }
}
