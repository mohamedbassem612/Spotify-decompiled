package p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class j37 implements gfh0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ float b;

    public /* synthetic */ j37(byte b, float f) {
        this.a = b;
        this.b = f;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m635measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        int i;
        Integer numValueOf;
        Integer num;
        int i2;
        byte b = this.a;
        char c = 2;
        b7x b7xVar = b7x.a;
        float f = this.b;
        int i3 = 0;
        switch (b) {
            case 0:
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((afh0) it.next()).H(j));
                }
                if (arrayList.isEmpty()) {
                    return ifh0Var.S(0, 0, b7xVar, fz6.X0);
                }
                int i4 = ((q5t0) o7h.q0(arrayList)).a;
                int iI0 = ifh0Var.i0(f);
                int size = ((i4 - iI0) * (arrayList.size() - 1)) + i4;
                Iterator it2 = arrayList.iterator();
                if (!it2.hasNext()) {
                    hhg1.k();
                    return null;
                }
                int i5 = ((q5t0) it2.next()).b;
                while (it2.hasNext()) {
                    int i6 = ((q5t0) it2.next()).b;
                    if (i5 < i6) {
                        i5 = i6;
                    }
                }
                return ifh0Var.S(size, i5, b7xVar, new i37(arrayList, i4, iI0, (byte) 0));
            case 1:
                List list3 = list;
                ArrayList arrayList2 = new ArrayList(q7h.U(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(((afh0) it3.next()).H(hjl.b(j, 0, 0, 0, 0, 10)));
                }
                if (arrayList2.isEmpty()) {
                    return ifh0Var.S(0, 0, b7xVar, z4m.N0);
                }
                int iI1 = ifh0Var.i0(f);
                Iterator it4 = arrayList2.iterator();
                if (it4.hasNext()) {
                    int i7 = ((q5t0) it4.next()).a;
                    while (it4.hasNext()) {
                        int i8 = ((q5t0) it4.next()).a;
                        if (i7 < i8) {
                            i7 = i8;
                        }
                    }
                    int i9 = (int) (i7 * 0.7f);
                    int size2 = ((arrayList2.size() - 1) * i9) + i7;
                    int i10 = iI1 * 2;
                    int i11 = size2 + i10;
                    Iterator it5 = arrayList2.iterator();
                    if (it5.hasNext()) {
                        int i12 = ((q5t0) it5.next()).b;
                        while (it5.hasNext()) {
                            int i13 = ((q5t0) it5.next()).b;
                            if (i12 < i13) {
                                i12 = i13;
                            }
                        }
                        int i14 = i12 + i10;
                        return ifh0Var.S(i11, i14, b7xVar, new n6m(arrayList2, iI1, i9, i14, (byte) 0));
                    }
                    hhg1.k();
                } else {
                    hhg1.k();
                }
                return null;
            case 2:
                int iI2 = ifh0Var.i0(f);
                q5t0 q5t0VarH = ((afh0) list.get(0)).H(hjl.b(j, 0, 0, 0, 0, 14));
                if (hjl.h(j) == Integer.MAX_VALUE) {
                    i = Integer.MAX_VALUE;
                } else {
                    int iH = (hjl.h(j) - q5t0VarH.b) - iI2;
                    if (iH < 0) {
                        iH = 0;
                    }
                    i = iH;
                }
                afh0 afh0Var = (afh0) list.get(1);
                int i15 = q5t0VarH.a;
                if (i15 < 0) {
                    sf80.a("width must be >= 0");
                }
                q5t0 q5t0VarH2 = afh0Var.H(hjl.b(jjl.h(i15, i15, 0, Alert.DURATION_SHOW_INDEFINITELY), 0, 0, 0, i, 7));
                return ifh0Var.S(yoi1.p(q5t0VarH.a, hjl.k(j), hjl.i(j)), yoi1.p(q5t0VarH.b + iI2 + q5t0VarH2.b, hjl.j(j), hjl.h(j)), b7xVar, new udx(q5t0VarH, q5t0VarH2, iI2, (byte) 0));
            case 3:
                List list4 = list;
                ArrayList arrayList3 = new ArrayList(q7h.U(list4, 10));
                Iterator it6 = list4.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((afh0) it6.next()).H(j));
                }
                int iI3 = ifh0Var.i0(f * 0.15f);
                int size3 = arrayList3.size() - 1;
                if (size3 < 0) {
                    size3 = 0;
                }
                int i16 = size3 * iI3;
                Iterator it7 = arrayList3.iterator();
                int i17 = 0;
                while (it7.hasNext()) {
                    i17 += ((q5t0) it7.next()).a;
                }
                int i18 = i17 - i16;
                i3 = i18 >= 0 ? i18 : 0;
                Iterator it8 = arrayList3.iterator();
                if (!it8.hasNext()) {
                    hhg1.k();
                    return null;
                }
                int i19 = ((q5t0) it8.next()).b;
                while (it8.hasNext()) {
                    int i20 = ((q5t0) it8.next()).b;
                    if (i19 < i20) {
                        i19 = i20;
                    }
                }
                return ifh0Var.S(i3, i19, b7xVar, new s2k(arrayList3, iI3, (byte) 2));
            case 4:
                List list5 = list;
                Iterator it9 = list5.iterator();
                if (it9.hasNext()) {
                    numValueOf = Integer.valueOf(((afh0) it9.next()).w(hjl.h(j)));
                    while (it9.hasNext()) {
                        Integer numValueOf2 = Integer.valueOf(((afh0) it9.next()).w(hjl.h(j)));
                        if (numValueOf.compareTo(numValueOf2) < 0) {
                            numValueOf = numValueOf2;
                        }
                    }
                } else {
                    numValueOf = null;
                }
                int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
                int i21 = hjl.i(j);
                int i22 = iIntValue > i21 ? i21 : iIntValue;
                long jB = hjl.b(j, i22, i22, 0, 0, 12);
                ArrayList arrayList4 = new ArrayList(q7h.U(list5, 10));
                Iterator it10 = list5.iterator();
                while (it10.hasNext()) {
                    arrayList4.add(((afh0) it10.next()).H(jB));
                }
                Iterator it11 = arrayList4.iterator();
                if (it11.hasNext()) {
                    Integer numValueOf3 = Integer.valueOf(((q5t0) it11.next()).b);
                    while (true) {
                        num = numValueOf3;
                        while (true) {
                            if (it11.hasNext()) {
                                numValueOf3 = Integer.valueOf(((q5t0) it11.next()).b);
                                if (num.compareTo(numValueOf3) < 0) {
                                }
                            }
                        }
                    }
                } else {
                    num = null;
                }
                int iIntValue2 = num != null ? num.intValue() : 0;
                int iI4 = ifh0Var.i0(f);
                int size4 = arrayList4.size() * i22;
                int size5 = arrayList4.size() - 1;
                return ifh0Var.S(((size5 >= 0 ? size5 : 0) * iI4) + size4, iIntValue2, b7xVar, new i37(arrayList4, i22, iI4, (byte) 1));
            case 5:
                List list6 = list;
                ArrayList arrayList5 = new ArrayList(q7h.U(list6, 10));
                Iterator it12 = list6.iterator();
                while (it12.hasNext()) {
                    arrayList5.add(((afh0) it12.next()).H(j));
                }
                int iI5 = ifh0Var.i0(f * 0.15f);
                if (arrayList5.size() == 2) {
                    Iterator it13 = arrayList5.iterator();
                    while (it13.hasNext()) {
                        i3 += ((q5t0) it13.next()).a;
                    }
                    i2 = i3 - iI5;
                } else {
                    i2 = ((q5t0) o7h.q0(arrayList5)).a;
                }
                Iterator it14 = arrayList5.iterator();
                if (!it14.hasNext()) {
                    hhg1.k();
                    return null;
                }
                int i23 = ((q5t0) it14.next()).b;
                while (it14.hasNext()) {
                    int i24 = ((q5t0) it14.next()).b;
                    if (i23 < i24) {
                        i23 = i24;
                    }
                }
                return ifh0Var.S(i2, i23, b7xVar, new s2k(arrayList5, iI5, (byte) 5));
            case 6:
                int iI6 = ifh0Var.i0(48.0f);
                return ifh0Var.S(iI6, iI6, b7xVar, new ri6(((afh0) o7h.q0(list)).H(jjl.b(0, 0, 0, 0, 15)), iI6, f, (byte) 1));
            default:
                List list7 = list;
                int size6 = list7.size();
                for (int i25 = 0; i25 < size6; i25++) {
                    afh0 afh0Var2 = (afh0) list.get(i25);
                    if (t3k1.s(afh0Var2) == nfx0.a) {
                        q5t0 q5t0VarH3 = afh0Var2.H(hjl.b(j, 0, 0, 0, 0, 10));
                        long j2 = jjl.j(hjl.b(j, hjl.i(j), 0, 0, hjl.h(j), 2), -q5t0VarH3.a, 0, 2);
                        int size7 = list7.size();
                        int i26 = 0;
                        while (i26 < size7) {
                            afh0 afh0Var3 = (afh0) list.get(i26);
                            char c2 = c;
                            if (t3k1.s(afh0Var3) == nfx0.b) {
                                q5t0 q5t0VarH4 = afh0Var3.H(j2);
                                int i27 = hjl.i(j);
                                int iH2 = hjl.h(j);
                                int i28 = q5t0VarH3.a / 2;
                                int iU = jch0.U(q5t0VarH4.a * f);
                                int iMax = Math.max((q5t0VarH3.b - q5t0VarH4.b) / 2, 0);
                                int i29 = (iH2 - q5t0VarH4.b) - iMax;
                                return ifh0Var.S(i27, iH2, b7xVar, new k8h0(q5t0VarH4, i28, i29, q5t0VarH3, iU, i29 - iMax));
                            }
                            i26++;
                            c = c2;
                        }
                        p5d0.c("Collection contains no element matching the predicate.");
                        jah.d();
                        return null;
                    }
                }
                p5d0.c("Collection contains no element matching the predicate.");
                jah.d();
                return null;
        }
    }
}
