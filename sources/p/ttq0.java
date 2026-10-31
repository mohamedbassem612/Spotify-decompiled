package p;

import androidx.car.app.model.Alert;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ttq0 implements gfh0 {
    public final iu30 a;
    public final boolean b;
    public final w5e1 c;
    public final o5e1 d;
    public final vzq0 e;
    public final float f;

    public ttq0(iu30 iu30Var, boolean z, w5e1 w5e1Var, o5e1 o5e1Var, vzq0 vzq0Var, float f) {
        this.a = iu30Var;
        this.b = z;
        this.c = w5e1Var;
        this.d = o5e1Var;
        this.e = vzq0Var;
        this.f = f;
    }

    public static final int e(int i, ttq0 ttq0Var, int i2, int i3, q5t0 q5t0Var, q5t0 q5t0Var2) {
        if (ttq0Var.b) {
            i3 = Math.round(((i2 - q5t0Var2.b) / 2.0f) * 1.0f);
        }
        return Math.max(i + i3, (q5t0Var != null ? q5t0Var.b : 0) / 2);
    }

    public final int a(wat watVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j, float f) {
        int[] iArr = {i7, i3, i4, dm5.U(i6, 0, f)};
        for (int i9 = 0; i9 < 4; i9++) {
            i5 = Math.max(i5, iArr[i9]);
        }
        vzq0 vzq0Var = this.e;
        float fX0 = watVar.X0(vzq0Var.d());
        return jjl.f(Math.max(i, Math.max(i2, jch0.U(dm5.T(fX0, Math.max(fX0, i6 / 2.0f), f) + i5 + watVar.X0(vzq0Var.a())))) + i8, j);
    }

    public final int b(wat watVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, float f) {
        int i8 = i3 + i4;
        int iMax = Math.max(i5 + i8, Math.max(i7 + i8, dm5.U(i6, 0, f))) + i + i2;
        vzq0 vzq0Var = this.e;
        flb0 flb0Var = flb0.a;
        return jjl.g(Math.max(iMax, jch0.U((i6 + watVar.X0(vzq0Var.c(flb0Var) + vzq0Var.b(flb0Var))) * f)), j);
    }

    public final int c(p890 p890Var, List list, int i, vu30 vu30Var) {
        Object obj;
        int iV;
        int iIntValue;
        Object obj2;
        int iIntValue2;
        Object obj3;
        Object obj4;
        int iIntValue3;
        Object obj5;
        int iIntValue4;
        int i2;
        Object obj6;
        Object obj7;
        ttq0 ttq0Var = this;
        float fInvoke = ttq0Var.d.invoke();
        List list2 = list;
        int size = list2.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i3);
            if (u890.j(ejo1.p((afh0) obj), "Leading")) {
                break;
            }
            i3++;
        }
        afh0 afh0Var = (afh0) obj;
        if (afh0Var != null) {
            iV = ejo1.v(i, afh0Var.C(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue = ((Number) vu30Var.invoke(afh0Var, Integer.valueOf(i))).intValue();
        } else {
            iV = i;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i4);
            if (u890.j(ejo1.p((afh0) obj2), "Trailing")) {
                break;
            }
            i4++;
        }
        afh0 afh0Var2 = (afh0) obj2;
        if (afh0Var2 != null) {
            iV = ejo1.v(iV, afh0Var2.C(Alert.DURATION_SHOW_INDEFINITELY));
            iIntValue2 = ((Number) vu30Var.invoke(afh0Var2, Integer.valueOf(i))).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i5);
            if (u890.j(ejo1.p((afh0) obj3), "Label")) {
                break;
            }
            i5++;
        }
        afh0 afh0Var3 = (afh0) obj3;
        int iIntValue5 = afh0Var3 != null ? ((Number) vu30Var.invoke(afh0Var3, Integer.valueOf(dm5.U(iV, i, fInvoke)))).intValue() : 0;
        int size4 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i6);
            if (u890.j(ejo1.p((afh0) obj4), "Prefix")) {
                break;
            }
            i6++;
        }
        afh0 afh0Var4 = (afh0) obj4;
        if (afh0Var4 != null) {
            iIntValue3 = ((Number) vu30Var.invoke(afh0Var4, Integer.valueOf(iV))).intValue();
            iV = ejo1.v(iV, afh0Var4.C(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size5) {
                obj5 = null;
                break;
            }
            obj5 = list.get(i7);
            if (u890.j(ejo1.p((afh0) obj5), "Suffix")) {
                break;
            }
            i7++;
        }
        afh0 afh0Var5 = (afh0) obj5;
        if (afh0Var5 != null) {
            iIntValue4 = ((Number) vu30Var.invoke(afh0Var5, Integer.valueOf(iV))).intValue();
            iV = ejo1.v(iV, afh0Var5.C(Alert.DURATION_SHOW_INDEFINITELY));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i8 = 0;
        while (i8 < size6) {
            Object obj8 = list.get(i8);
            if (u890.j(ejo1.p((afh0) obj8), "TextField")) {
                int iIntValue6 = ((Number) vu30Var.invoke(obj8, Integer.valueOf(iV))).intValue();
                int size7 = list2.size();
                int i9 = 0;
                while (true) {
                    if (i9 >= size7) {
                        i2 = iIntValue6;
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i9);
                    i2 = iIntValue6;
                    if (u890.j(ejo1.p((afh0) obj6), "Hint")) {
                        break;
                    }
                    i9++;
                    iIntValue6 = i2;
                }
                afh0 afh0Var6 = (afh0) obj6;
                int iIntValue7 = afh0Var6 != null ? ((Number) vu30Var.invoke(afh0Var6, Integer.valueOf(iV))).intValue() : 0;
                int size8 = list2.size();
                int i10 = 0;
                while (true) {
                    if (i10 >= size8) {
                        obj7 = null;
                        break;
                    }
                    obj7 = list.get(i10);
                    if (u890.j(ejo1.p((afh0) obj7), "Supporting")) {
                        break;
                    }
                    i10++;
                }
                afh0 afh0Var7 = (afh0) obj7;
                return ttq0Var.a(p890Var, iIntValue, iIntValue2, iIntValue3, iIntValue4, i2, iIntValue5, iIntValue7, afh0Var7 != null ? ((Number) vu30Var.invoke(afh0Var7, Integer.valueOf(i))).intValue() : 0, jjl.b(0, 0, 0, 0, 15), fInvoke);
            }
            i8++;
            iIntValue3 = iIntValue3;
            ttq0Var = this;
        }
        p5d0.c("Collection contains no element matching the predicate.");
        jah.d();
        return 0;
    }

    public final int d(p890 p890Var, List list, int i, vu30 vu30Var) {
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
                    if (u890.j(ejo1.p((afh0) obj4), "Leading")) {
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
                    if (u890.j(ejo1.p((afh0) obj5), "Prefix")) {
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
                    if (u890.j(ejo1.p((afh0) obj6), "Suffix")) {
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
                return b(p890Var, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, afh0Var6 != null ? ((Number) vu30Var.invoke(afh0Var6, Integer.valueOf(i))).intValue() : 0, jjl.b(0, 0, 0, 0, 15), this.d.invoke());
            }
        }
        p5d0.c("Collection contains no element matching the predicate.");
        jah.d();
        return 0;
    }

    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        return c(p890Var, list, i, new f6f0((byte) 4));
    }

    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        return d(p890Var, list, i, new f6f0((byte) 3));
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v7 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.ModVisitor.anonymousCallArgMod(ModVisitor.java:535)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.ModVisitor.processAnonymousConstructor(ModVisitor.java:528)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:111)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final p.hfh0 m710measure3p2s80s(p.ifh0 r44, java.util.List r45, long r46) {
        /*
            Method dump skipped, instruction units count: 1135
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.ttq0.m710measure3p2s80s(p.ifh0, java.util.List, long):p.hfh0");
    }

    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        return c(p890Var, list, i, new f6f0((byte) 2));
    }

    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        return d(p890Var, list, i, new f6f0((byte) 5));
    }
}
