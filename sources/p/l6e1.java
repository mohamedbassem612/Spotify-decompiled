package p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class l6e1 implements gfh0 {
    public final boolean a;
    public final w5e1 b;
    public final o5e1 c;
    public final vzq0 d;
    public final float e;

    public l6e1(boolean z, w5e1 w5e1Var, o5e1 o5e1Var, vzq0 vzq0Var, float f) {
        this.a = z;
        this.b = w5e1Var;
        this.c = o5e1Var;
        this.d = vzq0Var;
        this.e = f;
    }

    public static int c(List list, int i, vu30 vu30Var) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        List list2 = list;
        int size = list2.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (u890.j(ejo1.p((afh0) obj7), "TextField")) {
                int iIntValue = ((Number) vu30Var.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list2.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (u890.j(ejo1.p((afh0) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                afh0 afh0Var = (afh0) obj2;
                int iIntValue2 = afh0Var != null ? ((Number) vu30Var.invoke(afh0Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list2.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (u890.j(ejo1.p((afh0) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                afh0 afh0Var2 = (afh0) obj3;
                int iIntValue3 = afh0Var2 != null ? ((Number) vu30Var.invoke(afh0Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list2.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (u890.j(ejo1.p((afh0) obj4), "Prefix")) {
                        break;
                    }
                    i5++;
                }
                afh0 afh0Var3 = (afh0) obj4;
                int iIntValue4 = afh0Var3 != null ? ((Number) vu30Var.invoke(afh0Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list2.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (u890.j(ejo1.p((afh0) obj5), "Suffix")) {
                        break;
                    }
                    i6++;
                }
                afh0 afh0Var4 = (afh0) obj5;
                int iIntValue5 = afh0Var4 != null ? ((Number) vu30Var.invoke(afh0Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list2.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (u890.j(ejo1.p((afh0) obj6), "Leading")) {
                        break;
                    }
                    i7++;
                }
                afh0 afh0Var5 = (afh0) obj6;
                int iIntValue6 = afh0Var5 != null ? ((Number) vu30Var.invoke(afh0Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list2.size();
                for (int i8 = 0; i8 < size7; i8++) {
                    Object obj8 = list.get(i8);
                    if (u890.j(ejo1.p((afh0) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                }
                afh0 afh0Var6 = (afh0) obj;
                int i9 = iIntValue4 + iIntValue5;
                return jjl.g(Math.max(iIntValue + i9, Math.max((afh0Var6 != null ? ((Number) vu30Var.invoke(afh0Var6, Integer.valueOf(i))).intValue() : 0) + i9, iIntValue2)) + iIntValue6 + iIntValue3, jjl.b(0, 0, 0, 0, 15));
            }
        }
        p5d0.c("Collection contains no element matching the predicate.");
        jah.d();
        return 0;
    }

    public static final int d(l6e1 l6e1Var, int i, int i2, q5t0 q5t0Var) {
        return l6e1Var.a ? Math.round(((i - q5t0Var.b) / 2.0f) * 1.0f) : i2;
    }

    public final int a(wat watVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        vzq0 vzq0Var = this.d;
        int iI0 = watVar.i0(vzq0Var.a() + vzq0Var.d());
        int[] iArr = {i7, i5, i6, dm5.U(i2, 0, f)};
        for (int i9 = 0; i9 < 4; i9++) {
            i = Math.max(i, iArr[i9]);
        }
        return jjl.f(Math.max(i3, Math.max(i4, iI0 + (i2 > 0 ? Math.max(watVar.i0(this.e * 2.0f), dm5.U(0, i2, onm0.a.a(f))) : 0) + i)) + i8, j);
    }

    public final int b(p890 p890Var, List list, int i, vu30 vu30Var) {
        Object obj;
        int i2;
        int iV;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int i3;
        Object obj5;
        int i4;
        Object obj6;
        Object obj7;
        List list2 = list;
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (u890.j(ejo1.p((afh0) obj), "Leading")) {
                break;
            }
            i5++;
        }
        afh0 afh0Var = (afh0) obj;
        if (afh0Var != null) {
            i2 = i;
            iV = ejo1.v(i2, afh0Var.C(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue = ((Number) vu30Var.invoke(afh0Var, Integer.valueOf(i2))).intValue();
        } else {
            i2 = i;
            iV = i2;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i6);
            if (u890.j(ejo1.p((afh0) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        afh0 afh0Var2 = (afh0) obj2;
        if (afh0Var2 != null) {
            iV = ejo1.v(iV, afh0Var2.C(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue2 = ((Number) vu30Var.invoke(afh0Var2, Integer.valueOf(i2))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i7);
            if (u890.j(ejo1.p((afh0) obj3), "Label")) {
                break;
            }
            i7++;
        }
        afh0 afh0Var3 = (afh0) obj3;
        int iIntValue3 = afh0Var3 != null ? ((Number) vu30Var.invoke(afh0Var3, Integer.valueOf(iV))).intValue() : 0;
        int size4 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i8);
            if (u890.j(ejo1.p((afh0) obj4), "Prefix")) {
                break;
            }
            i8++;
        }
        afh0 afh0Var4 = (afh0) obj4;
        if (afh0Var4 != null) {
            int iIntValue4 = ((Number) vu30Var.invoke(afh0Var4, Integer.valueOf(iV))).intValue();
            iV = ejo1.v(iV, afh0Var4.C(Alert.DURATION_SHOW_INDEFINITELY));
            i3 = iIntValue4;
        } else {
            i3 = 0;
        }
        int size5 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i9);
            if (u890.j(ejo1.p((afh0) obj5), "Suffix")) {
                break;
            }
            i9++;
        }
        afh0 afh0Var5 = (afh0) obj5;
        if (afh0Var5 != null) {
            int iIntValue5 = ((Number) vu30Var.invoke(afh0Var5, Integer.valueOf(iV))).intValue();
            iV = ejo1.v(iV, afh0Var5.C(Alert.DURATION_SHOW_INDEFINITELY));
            i4 = iIntValue5;
        } else {
            i4 = 0;
        }
        int size6 = list2.size();
        for (int i10 = 0; i10 < size6; i10++) {
            Object obj8 = list.get(i10);
            if (u890.j(ejo1.p((afh0) obj8), "TextField")) {
                int iIntValue6 = ((Number) vu30Var.invoke(obj8, Integer.valueOf(iV))).intValue();
                int size7 = list2.size();
                int i11 = 0;
                while (true) {
                    if (i11 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i11);
                    if (u890.j(ejo1.p((afh0) obj6), "Hint")) {
                        break;
                    }
                    i11++;
                }
                afh0 afh0Var6 = (afh0) obj6;
                int iIntValue7 = afh0Var6 != null ? ((Number) vu30Var.invoke(afh0Var6, Integer.valueOf(iV))).intValue() : 0;
                int size8 = list2.size();
                int i12 = 0;
                while (true) {
                    if (i12 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj9 = list.get(i12);
                    if (u890.j(ejo1.p((afh0) obj9), "Supporting")) {
                        obj7 = obj9;
                        break;
                    }
                    i12++;
                }
                afh0 afh0Var7 = (afh0) obj7;
                return a(p890Var, iIntValue6, iIntValue3, iIntValue, iIntValue2, i3, i4, iIntValue7, afh0Var7 != null ? ((Number) vu30Var.invoke(afh0Var7, Integer.valueOf(i2))).intValue() : 0, jjl.b(0, 0, 0, 0, 15), this.c.invoke());
            }
        }
        p5d0.c("Collection contains no element matching the predicate.");
        jah.d();
        return 0;
    }

    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        return b(p890Var, list, i, new f6f0((byte) 22));
    }

    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        return c(list, i, new f6f0((byte) 20));
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m644measure3p2s80s(final ifh0 ifh0Var, List list, long j) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        List list2;
        Object obj5;
        int i;
        Object obj6;
        Object obj7;
        int i2;
        int i3;
        q5t0 q5t0Var;
        int i4;
        final float fInvoke = this.c.invoke();
        vzq0 vzq0Var = this.d;
        int iI0 = ifh0Var.i0(vzq0Var.d());
        int iI1 = ifh0Var.i0(vzq0Var.a());
        long jB = hjl.b(j, 0, 0, 0, 0, 10);
        List list3 = list;
        int size = list3.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i5);
            if (u890.j(t3k1.s((afh0) obj), "Leading")) {
                break;
            }
            i5++;
        }
        afh0 afh0Var = (afh0) obj;
        q5t0 q5t0VarH = afh0Var != null ? afh0Var.H(jB) : null;
        int i6 = q5t0VarH != null ? q5t0VarH.a : 0;
        int iMax = Math.max(0, q5t0VarH != null ? q5t0VarH.b : 0);
        int size2 = list3.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i7);
            if (u890.j(t3k1.s((afh0) obj2), "Trailing")) {
                break;
            }
            i7++;
        }
        afh0 afh0Var2 = (afh0) obj2;
        q5t0 q5t0VarH2 = afh0Var2 != null ? afh0Var2.H(jjl.j(jB, -i6, 0, 2)) : null;
        int i8 = (q5t0VarH2 != null ? q5t0VarH2.a : 0) + i6;
        int iMax2 = Math.max(iMax, q5t0VarH2 != null ? q5t0VarH2.b : 0);
        int size3 = list3.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i9);
            if (u890.j(t3k1.s((afh0) obj3), "Prefix")) {
                break;
            }
            i9++;
        }
        afh0 afh0Var3 = (afh0) obj3;
        q5t0 q5t0VarH3 = afh0Var3 != null ? afh0Var3.H(jjl.j(jB, -i8, 0, 2)) : null;
        int i10 = i8 + (q5t0VarH3 != null ? q5t0VarH3.a : 0);
        int iMax3 = Math.max(iMax2, q5t0VarH3 != null ? q5t0VarH3.b : 0);
        int size4 = list3.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (u890.j(t3k1.s((afh0) obj4), "Suffix")) {
                break;
            }
            i11++;
        }
        afh0 afh0Var4 = (afh0) obj4;
        q5t0 q5t0VarH4 = afh0Var4 != null ? afh0Var4.H(jjl.j(jB, -i10, 0, 2)) : null;
        int i12 = i10 + (q5t0VarH4 != null ? q5t0VarH4.a : 0);
        int iMax4 = Math.max(iMax3, q5t0VarH4 != null ? q5t0VarH4.b : 0);
        int size5 = list3.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size5) {
                list2 = list3;
                obj5 = null;
                break;
            }
            obj5 = list.get(i13);
            list2 = list3;
            if (u890.j(t3k1.s((afh0) obj5), "Label")) {
                break;
            }
            i13++;
            list3 = list2;
        }
        afh0 afh0Var5 = (afh0) obj5;
        final p811 p811Var = new p811();
        int i14 = -i12;
        p811Var.a = afh0Var5 != null ? afh0Var5.H(jjl.i(i14, jB, -iI1)) : null;
        int size6 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size6) {
                i = iI1;
                obj6 = null;
                break;
            }
            obj6 = list.get(i15);
            i = iI1;
            if (u890.j(t3k1.s((afh0) obj6), "Supporting")) {
                break;
            }
            i15++;
            iI1 = i;
        }
        afh0 afh0Var6 = (afh0) obj6;
        int iN = afh0Var6 != null ? afh0Var6.n(hjl.k(j)) : 0;
        q5t0 q5t0Var2 = (q5t0) p811Var.a;
        int i16 = (q5t0Var2 != null ? q5t0Var2.b : 0) + iI0;
        long jI = jjl.i(i14, hjl.b(j, 0, 0, 0, 0, 11), ((-i16) - i) - iN);
        int size7 = list2.size();
        int i17 = 0;
        while (i17 < size7) {
            int i18 = i16;
            afh0 afh0Var7 = (afh0) list.get(i17);
            int i19 = size7;
            final int i20 = iI0;
            if (u890.j(t3k1.s(afh0Var7), "TextField")) {
                final q5t0 q5t0VarH5 = afh0Var7.H(jI);
                long jB2 = hjl.b(jI, 0, 0, 0, 0, 14);
                List list4 = list;
                int size8 = list4.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i21);
                    int i22 = size8;
                    int i23 = i21;
                    if (u890.j(t3k1.s((afh0) obj7), "Hint")) {
                        break;
                    }
                    i21 = i23 + 1;
                    size8 = i22;
                }
                afh0 afh0Var8 = (afh0) obj7;
                q5t0 q5t0VarH6 = afh0Var8 != null ? afh0Var8.H(jB2) : null;
                int iMax5 = Math.max(iMax4, Math.max(q5t0VarH5.b, q5t0VarH6 != null ? q5t0VarH6.b : 0) + i18 + i);
                int i24 = q5t0VarH != null ? q5t0VarH.a : 0;
                int i25 = q5t0VarH2 != null ? q5t0VarH2.a : 0;
                int i26 = q5t0VarH3 != null ? q5t0VarH3.a : 0;
                int i27 = i25;
                int i28 = q5t0VarH4 != null ? q5t0VarH4.a : 0;
                int i29 = q5t0VarH5.a;
                q5t0 q5t0Var3 = (q5t0) p811Var.a;
                int i30 = i26 + i28;
                int iG = jjl.g(Math.max(i29 + i30, Math.max((q5t0VarH6 != null ? q5t0VarH6.a : 0) + i30, q5t0Var3 != null ? q5t0Var3.a : 0)) + i24 + i27, j);
                final q5t0 q5t0VarH7 = afh0Var6 != null ? afh0Var6.H(hjl.b(jjl.j(jB, 0, -iMax5, 1), 0, iG, 0, 0, 9)) : null;
                int i31 = q5t0VarH7 != null ? q5t0VarH7.b : 0;
                int i32 = q5t0VarH5.b;
                q5t0 q5t0Var4 = (q5t0) p811Var.a;
                int i33 = q5t0Var4 != null ? q5t0Var4.b : 0;
                int i34 = q5t0VarH != null ? q5t0VarH.b : 0;
                int i35 = q5t0VarH2 != null ? q5t0VarH2.b : 0;
                int i36 = q5t0VarH3 != null ? q5t0VarH3.b : 0;
                int i37 = q5t0VarH4 != null ? q5t0VarH4.b : 0;
                int i38 = q5t0VarH6 != null ? q5t0VarH6.b : 0;
                if (q5t0VarH7 != null) {
                    i2 = iG;
                    i3 = q5t0VarH7.b;
                    q5t0Var = q5t0VarH3;
                    i4 = 0;
                } else {
                    i2 = iG;
                    i3 = 0;
                    q5t0Var = q5t0VarH3;
                    i4 = 0;
                }
                final int iA = a(ifh0Var, i32, i33, i34, i35, i36, i37, i38, i3, j, fInvoke);
                final int i39 = iA - i31;
                int size9 = list4.size();
                int i40 = i4;
                while (i40 < size9) {
                    afh0 afh0Var9 = (afh0) list.get(i40);
                    if (u890.j(t3k1.s(afh0Var9), "Container")) {
                        final q5t0 q5t0VarH8 = afh0Var9.H(jjl.a(i2 != Integer.MAX_VALUE ? i2 : i4, i2, i39 != Integer.MAX_VALUE ? i39 : i4, i39));
                        final int i41 = i2;
                        final q5t0 q5t0Var5 = q5t0VarH;
                        final q5t0 q5t0Var6 = q5t0VarH2;
                        final q5t0 q5t0Var7 = q5t0Var;
                        final q5t0 q5t0Var8 = q5t0VarH4;
                        final q5t0 q5t0Var9 = q5t0VarH6;
                        return ifh0Var.S(i41, iA, b7x.a, new iu30() { // from class: p.k6e1
                            /* JADX WARN: Code duplicated, block: B:20:0x009e  */
                            public final Object invoke(Object obj8) {
                                float f;
                                float f2;
                                int iI2;
                                int i42;
                                float f3;
                                p5t0 p5t0Var = (p5t0) obj8;
                                p811 p811Var2 = p811Var;
                                Object obj9 = p811Var2.a;
                                l6e1 l6e1Var = this;
                                ifh0 ifh0Var2 = ifh0Var;
                                int i43 = i41;
                                int i44 = iA;
                                q5t0 q5t0Var10 = q5t0VarH5;
                                q5t0 q5t0Var11 = q5t0Var9;
                                q5t0 q5t0Var12 = q5t0Var5;
                                q5t0 q5t0Var13 = q5t0Var6;
                                q5t0 q5t0Var14 = q5t0Var7;
                                q5t0 q5t0Var15 = q5t0Var8;
                                q5t0 q5t0Var16 = q5t0VarH8;
                                q5t0 q5t0Var17 = q5t0VarH7;
                                if (obj9 != null) {
                                    boolean z = l6e1Var.a;
                                    int i45 = i20;
                                    if (z) {
                                        iI2 = Math.round(((i39 - ((q5t0) obj9).b) / 2.0f) * 1.0f);
                                    } else {
                                        iI2 = ifh0Var2.i0(l6e1Var.e) + i45;
                                    }
                                    q5t0 q5t0Var18 = (q5t0) p811Var2.a;
                                    int i46 = q5t0Var18.b + i45;
                                    flb0 layoutDirection = ifh0Var2.getLayoutDirection();
                                    w5e1 w5e1Var = l6e1Var.b;
                                    p5t0.g(0, 0, p5t0Var, q5t0Var16);
                                    int i47 = i44 - (q5t0Var17 != null ? q5t0Var17.b : 0);
                                    if (q5t0Var12 != null) {
                                        p5t0Var.k(q5t0Var12, 0, Math.round(((i47 - q5t0Var12.b) / 2.0f) * 1.0f), 0.0f);
                                    }
                                    float f4 = fInvoke;
                                    int iU = dm5.U(iI2, i45, f4);
                                    flb0 flb0Var = flb0.a;
                                    if (layoutDirection == flb0Var) {
                                        if (q5t0Var12 != null) {
                                            i42 = q5t0Var12.a;
                                        } else {
                                            i42 = 0;
                                        }
                                    } else if (q5t0Var13 != null) {
                                        i42 = q5t0Var13.a;
                                    } else {
                                        i42 = 0;
                                    }
                                    int i48 = i42;
                                    int iRound = Math.round((1.0f + (layoutDirection == flb0Var ? -1.0f : (-1.0f) * (-1.0f))) * ((((i43 - (q5t0Var12 != null ? q5t0Var12.a : 0)) - (q5t0Var13 != null ? q5t0Var13.a : 0)) - q5t0Var18.a) / 2.0f)) + i48;
                                    i3p1.y(w5e1Var);
                                    float f5 = -1.0f;
                                    float f6 = (((i43 - (q5t0Var12 != null ? q5t0Var12.a : 0)) - (q5t0Var13 != null ? q5t0Var13.a : 0)) - q5t0Var18.a) / 2.0f;
                                    if (layoutDirection != flb0Var) {
                                        f5 = (-1.0f) * (-1.0f);
                                    }
                                    p5t0Var.f(q5t0Var18, dm5.U(iRound, Math.round((1.0f + f5) * f6) + i48, f4), iU, 0.0f);
                                    if (q5t0Var14 != null) {
                                        p5t0Var.k(q5t0Var14, q5t0Var12 != null ? q5t0Var12.a : 0, i46, 0.0f);
                                    }
                                    int i49 = (q5t0Var12 != null ? q5t0Var12.a : 0) + (q5t0Var14 != null ? q5t0Var14.a : 0);
                                    p5t0Var.k(q5t0Var10, i49, i46, 0.0f);
                                    if (q5t0Var11 != null) {
                                        p5t0Var.k(q5t0Var11, i49, i46, 0.0f);
                                    }
                                    if (q5t0Var15 != null) {
                                        p5t0Var.k(q5t0Var15, (i43 - (q5t0Var13 != null ? q5t0Var13.a : 0)) - q5t0Var15.a, i46, 0.0f);
                                    }
                                    if (q5t0Var13 != null) {
                                        f3 = 0.0f;
                                        p5t0Var.k(q5t0Var13, i43 - q5t0Var13.a, Math.round(((i47 - q5t0Var13.b) / 2.0f) * 1.0f), 0.0f);
                                    } else {
                                        f3 = 0.0f;
                                    }
                                    if (q5t0Var17 != 0) {
                                        p5t0Var.k(q5t0Var17, 0, i47, f3);
                                    }
                                } else {
                                    float fH = ifh0Var2.h();
                                    p5t0.i(p5t0Var, q5t0Var16, 0L);
                                    int i50 = i44 - (q5t0Var17 != null ? q5t0Var17.b : 0);
                                    int iU2 = jch0.U(l6e1Var.d.d() * fH);
                                    if (q5t0Var12 != null) {
                                        f = 0.0f;
                                        p5t0Var.k(q5t0Var12, 0, Math.round(((i50 - q5t0Var12.b) / 2.0f) * 1.0f), 0.0f);
                                    } else {
                                        f = 0.0f;
                                    }
                                    if (q5t0Var14 != null) {
                                        p5t0Var.k(q5t0Var14, q5t0Var12 != null ? q5t0Var12.a : 0, l6e1.d(l6e1Var, i50, iU2, q5t0Var14), f);
                                    }
                                    int i51 = (q5t0Var12 != null ? q5t0Var12.a : 0) + (q5t0Var14 != null ? q5t0Var14.a : 0);
                                    p5t0Var.k(q5t0Var10, i51, l6e1.d(l6e1Var, i50, iU2, q5t0Var10), 0.0f);
                                    if (q5t0Var11 != null) {
                                        p5t0Var.k(q5t0Var11, i51, l6e1.d(l6e1Var, i50, iU2, q5t0Var11), 0.0f);
                                    }
                                    if (q5t0Var15 != null) {
                                        p5t0Var.k(q5t0Var15, (i43 - (q5t0Var13 != null ? q5t0Var13.a : 0)) - q5t0Var15.a, l6e1.d(l6e1Var, i50, iU2, q5t0Var15), 0.0f);
                                    }
                                    if (q5t0Var13 != null) {
                                        f2 = 0.0f;
                                        p5t0Var.k(q5t0Var13, i43 - q5t0Var13.a, Math.round(((i50 - q5t0Var13.b) / 2.0f) * 1.0f), 0.0f);
                                    } else {
                                        f2 = 0.0f;
                                    }
                                    if (q5t0Var17 != null) {
                                        p5t0Var.k(q5t0Var17, 0, i50, f2);
                                    }
                                }
                                return rih1.a;
                            }
                        });
                    }
                    i40++;
                    q5t0Var = q5t0Var;
                    q5t0VarH = q5t0VarH;
                }
                p5d0.c("Collection contains no element matching the predicate.");
                jah.d();
                return null;
            }
            i17++;
            size7 = i19;
            i16 = i18;
            iI0 = i20;
            jI = jI;
        }
        p5d0.c("Collection contains no element matching the predicate.");
        jah.d();
        return null;
    }

    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        return b(p890Var, list, i, new f6f0((byte) 21));
    }

    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        return c(list, i, new f6f0((byte) 19));
    }
}
