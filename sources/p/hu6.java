package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hu6 implements gfh0 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ hu6(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0175  */
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m622measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        int i;
        Object next;
        hfh0 hfh0Var;
        boolean z;
        int iMax;
        int iMax2;
        int i2;
        int i3;
        int iU;
        byte b = this.a;
        Object obj = this.b;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                float fI = hjl.i(j);
                float fH = hjl.h(j);
                czg czgVar = (czg) obj;
                float f = czgVar.b;
                float fMin = Math.min(fI, fH / f);
                float f2 = fMin * f;
                float f3 = (fI - fMin) / 2.0f;
                float f4 = (fH - f2) / 2.0f;
                boolean z2 = ifh0Var.getLayoutDirection() == flb0.b;
                List list2 = list;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                int i4 = 0;
                for (Object obj2 : list2) {
                    int i5 = i4 + 1;
                    if (i4 < 0) {
                        p7h.T();
                        throw null;
                    }
                    afh0 afh0Var = (afh0) obj2;
                    int iU2 = jch0.U(((jcg) czgVar.a.get(i4)).a * fMin);
                    if (!((iU2 >= 0) & (iU2 >= 0))) {
                        sf80.a("width and height must be >= 0");
                    }
                    arrayList.add(afh0Var.H(jjl.h(iU2, iU2, iU2, iU2)));
                    i4 = i5;
                }
                return ifh0Var.S(hjl.i(j), hjl.h(j), b7xVar, new gu6(arrayList, czgVar, f3, fMin, z2, fI, f4, f2));
            case 1:
                if (list.isEmpty()) {
                    return ifh0Var.S(0, 0, b7xVar, em50.Q0);
                }
                int iI0 = ifh0Var.i0(16.0f);
                List list3 = list;
                ArrayList<q5t0> arrayList2 = new ArrayList(q7h.U(list3, 10));
                Iterator it = list3.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((afh0) it.next()).H(j));
                }
                int i6 = ((q5t0) o7h.q0(arrayList2)).b;
                int iH = hjl.h(j);
                if (((c380) obj).isEmpty() || iH <= 0) {
                    i = 0;
                } else {
                    int i7 = iH / (i6 + iI0);
                    i = i7 >= 1 ? i7 : 1;
                }
                int[] iArr = new int[i];
                for (int i8 = 0; i8 < i; i8++) {
                    iArr[i8] = 0;
                }
                ArrayList arrayList3 = new ArrayList(i);
                for (int i9 = 0; i9 < i; i9++) {
                    arrayList3.add(new ArrayList());
                }
                int iI1 = ifh0Var.i0(16.0f);
                for (q5t0 q5t0Var : arrayList2) {
                    lr80 it2 = f46.l0(iArr).iterator();
                    sr80 sr80Var = (sr80) it2;
                    if (sr80Var.c) {
                        lr80 lr80Var = it2;
                        next = lr80Var.next();
                        if (sr80Var.c) {
                            int i10 = iArr[((Number) next).intValue()];
                            do {
                                Object next2 = lr80Var.next();
                                int i11 = iArr[((Number) next2).intValue()];
                                if (i10 > i11) {
                                    next = next2;
                                    i10 = i11;
                                }
                            } while (sr80Var.c);
                        }
                    } else {
                        next = null;
                    }
                    next.getClass();
                    int iIntValue = ((Number) next).intValue();
                    ((List) arrayList3.get(iIntValue)).add(q5t0Var);
                    iArr[iIntValue] = q5t0Var.a + iI1 + iArr[iIntValue];
                }
                Integer numV0 = f46.v0(iArr);
                int iIntValue2 = (numV0 != null ? numV0.intValue() : 0) + iI1;
                return ifh0Var.S(iIntValue2 < 0 ? 0 : iIntValue2, ((i - 1) * iI0) + (i6 * i), b7xVar, new ou50(i, i6, iI0, arrayList3, iI1));
            case 2:
                return ifh0Var.S(hjl.i(j), hjl.h(j), b7xVar, new gub0(list, this, (byte) 1));
            case 3:
                tb91 tb91Var = (tb91) obj;
                int i12 = tb91Var.a;
                float[] fArr = tb91Var.g;
                qqq0 qqq0Var = tb91Var.m;
                int size = list.size();
                for (int i13 = 0; i13 < size; i13++) {
                    afh0 afh0Var2 = (afh0) list.get(i13);
                    hfh0Var = null;
                    if (t3k1.s(afh0Var2) == gb91.a) {
                        q5t0 q5t0VarH = afh0Var2.H(j);
                        int size2 = list.size();
                        for (int i14 = 0; i14 < size2; i14++) {
                            afh0 afh0Var3 = (afh0) list.get(i14);
                            if (t3k1.s(afh0Var3) == gb91.b) {
                                qqq0 qqq0Var2 = qqq0.a;
                                q5t0 q5t0VarH2 = qqq0Var == qqq0Var2 ? afh0Var3.H(hjl.b(jjl.j(j, 0, -q5t0VarH.b, 1), 0, 0, 0, 0, 14)) : afh0Var3.H(hjl.b(jjl.j(j, -q5t0VarH.a, 0, 2), 0, 0, 0, 0, 11));
                                n811 n811Var = new n811();
                                float fC = tb91Var.c();
                                if (u890.f(fC, fArr.length == 0 ? null : Float.valueOf(fArr[0]))) {
                                    z = true;
                                } else if (u890.f(fC, fArr.length == 0 ? null : Float.valueOf(fArr[fArr.length - 1]))) {
                                    z = true;
                                } else {
                                    z = false;
                                }
                                int iU3 = q5t0VarH2.U(rb91.d);
                                int i15 = iU3 != Integer.MIN_VALUE ? iU3 : 0;
                                if (qqq0Var == qqq0Var2) {
                                    iMax = Math.max(q5t0VarH2.a, q5t0VarH.a);
                                    int i16 = q5t0VarH.b;
                                    int i17 = q5t0VarH2.b;
                                    iMax2 = i16 + i17;
                                    i2 = (iMax - q5t0VarH2.a) / 2;
                                    i3 = i16 / 2;
                                    iU = (iMax - q5t0VarH.a) / 2;
                                    n811Var.a = (i12 <= 0 || z) ? jch0.U(i17 * fC) : jch0.U((i17 - (i15 * 2)) * fC) + i15;
                                } else {
                                    iMax = q5t0VarH2.a + q5t0VarH.a;
                                    iMax2 = Math.max(q5t0VarH2.b, q5t0VarH.b);
                                    i2 = q5t0VarH.a / 2;
                                    i3 = (iMax2 - q5t0VarH2.b) / 2;
                                    iU = (i12 <= 0 || z) ? jch0.U(q5t0VarH2.a * fC) : jch0.U((q5t0VarH2.a - (i15 * 2)) * fC) + i15;
                                    n811Var.a = (iMax2 - q5t0VarH.b) / 2;
                                }
                                int i18 = iU;
                                int i19 = i3;
                                int i20 = i2;
                                tb91Var.h.t(iMax);
                                tb91Var.i.t(iMax2);
                                return ifh0Var.S(iMax, iMax2, b7xVar, new pb91(q5t0VarH2, i20, i19, q5t0VarH, i18, n811Var));
                            }
                        }
                        p5d0.c("Collection contains no element matching the predicate.");
                        jah.d();
                        return hfh0Var;
                    }
                }
                hfh0Var = null;
                p5d0.c("Collection contains no element matching the predicate.");
                jah.d();
                return hfh0Var;
            case 4:
                afh0 afh0Var4 = (afh0) o7h.q0(list);
                qqt qqtVar = (qqt) obj;
                int iI2 = ifh0Var.i0(qqtVar.a);
                int iI3 = ifh0Var.i0(qqtVar.b);
                if (!((iI2 >= 0) & (iI3 >= 0))) {
                    sf80.a("width and height must be >= 0");
                }
                return ifh0Var.S(hjl.i(j), hjl.h(j), b7xVar, new iv81(afh0Var4.H(jjl.h(iI2, iI2, iI3, iI3)), qqtVar, (byte) 3));
            default:
                float f5 = wie1.a;
                int iI4 = ifh0Var.i0(16.0f);
                int iI5 = ifh0Var.i0(16.0f);
                int iI6 = ifh0Var.i0(8.0f);
                int iI7 = ifh0Var.i0(16.0f);
                int iI8 = ifh0Var.i0(wie1.a);
                long jB = jjl.b(0, hjl.i(j) - (iI4 * 2), 0, 0, 13);
                q5t0 q5t0VarH3 = ((afh0) list.get(0)).H(jB);
                q5t0 q5t0VarH4 = ((afh0) list.get(1)).H(jB);
                int i21 = q5t0VarH3.b + iI5 + iI7;
                int i22 = i21 + iI8 + iI6;
                int i23 = q5t0VarH4.b + i22 + iI5;
                ((iu30) obj).invoke(Float.valueOf(((iI8 / 2.0f) + i21) / i23));
                return ifh0Var.S(hjl.i(j), i23, b7xVar, new jcx(q5t0VarH3, iI4, iI5, q5t0VarH4, i22));
        }
    }
}
