package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z7f1 implements gfh0 {
    public final dr20 a;
    public final g36 b;
    public final era c;
    public final int d;
    public final float e;

    public z7f1(dr20 dr20Var, g36 g36Var, era eraVar, int i, float f) {
        this.a = dr20Var;
        this.b = g36Var;
        this.c = eraVar;
        this.d = i;
        this.e = f;
    }

    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        Integer numValueOf;
        int iI0 = p890Var.i0(this.e);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((afh0) list.get(0)).d(i));
            int iL = p7h.L(list);
            int i2 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((afh0) list.get(i2)).d(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iL) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iI0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        int size = list.size();
        int iC = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iC += ((afh0) list.get(i2)).C(i);
        }
        return iC;
    }

    /* JADX INFO: renamed from: measure-3p2s80s, reason: not valid java name */
    public final hfh0 m731measure3p2s80s(final ifh0 ifh0Var, List list, final long j) {
        int i;
        int size = list.size();
        final int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            afh0 afh0Var = (afh0) list.get(i3);
            if (u890.j(t3k1.s(afh0Var), "navigationIcon")) {
                final q5t0 q5t0VarH = afh0Var.H(hjl.b(j, 0, 0, 0, 0, 14));
                List list2 = list;
                int size2 = list2.size();
                int i4 = 0;
                while (i4 < size2) {
                    afh0 afh0Var2 = (afh0) list.get(i4);
                    if (u890.j(t3k1.s(afh0Var2), "actionIcons")) {
                        final q5t0 q5t0VarH2 = afh0Var2.H(hjl.b(j, 0, 0, 0, 0, 14));
                        if (hjl.i(j) == Integer.MAX_VALUE) {
                            i = hjl.i(j);
                        } else {
                            i = (hjl.i(j) - q5t0VarH.a) - q5t0VarH2.a;
                            if (i < 0) {
                                i = 0;
                            }
                        }
                        int i5 = i;
                        int size3 = list2.size();
                        int i6 = 0;
                        while (i6 < size3) {
                            afh0 afh0Var3 = (afh0) list.get(i6);
                            if (u890.j(t3k1.s(afh0Var3), "title")) {
                                final q5t0 q5t0VarH3 = afh0Var3.H(hjl.b(j, 0, i5, 0, 0, 12));
                                vq60 vq60Var = xl3.b;
                                final int iU = q5t0VarH3.U(vq60Var) != Integer.MIN_VALUE ? q5t0VarH3.U(vq60Var) : 0;
                                float fInvoke = this.a.invoke();
                                int iU2 = Float.isNaN(fInvoke) ? 0 : jch0.U(fInvoke);
                                final int iMax = Math.max(ifh0Var.i0(this.e), q5t0VarH3.b);
                                if (hjl.h(j) == Integer.MAX_VALUE) {
                                    i2 = iMax;
                                } else {
                                    int i7 = iU2 + iMax;
                                    if (i7 >= 0) {
                                        i2 = i7;
                                    }
                                }
                                return ifh0Var.S(hjl.i(j), i2, b7x.a, new iu30() { // from class: p.y7f1
                                    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
                                    /* JADX WARN: Code duplicated, block: B:12:0x0060  */
                                    /* JADX WARN: Code duplicated, block: B:14:0x0068  */
                                    /* JADX WARN: Code duplicated, block: B:16:0x006e  */
                                    /* JADX WARN: Code duplicated, block: B:17:0x0071  */
                                    /* JADX WARN: Code duplicated, block: B:19:0x007c  */
                                    public final Object invoke(Object obj) {
                                        int i8;
                                        g36 g36Var;
                                        int i9;
                                        int i10;
                                        int i11;
                                        int i12;
                                        int i13;
                                        p5t0 p5t0Var = (p5t0) obj;
                                        q5t0 q5t0Var = q5t0VarH;
                                        int i14 = q5t0Var.b;
                                        int i15 = i2;
                                        int iMax2 = 0;
                                        p5t0.l(0, (i15 - i14) / 2, p5t0Var, q5t0Var);
                                        int iMax3 = Math.max(ifh0Var.i0(ti5.f), q5t0Var.a);
                                        q5t0 q5t0Var2 = q5t0VarH2;
                                        int i16 = q5t0Var2.a;
                                        z7f1 z7f1Var = this;
                                        era eraVar = z7f1Var.c;
                                        q5t0 q5t0Var3 = q5t0VarH3;
                                        int i17 = q5t0Var3.a;
                                        long j2 = j;
                                        int iA = eraVar.a(i17, hjl.i(j2), flb0.a);
                                        if (iA >= iMax3) {
                                            if (q5t0Var3.a + iA > hjl.i(j2) - i16) {
                                                i8 = (hjl.i(j2) - i16) - (q5t0Var3.a + iA);
                                            }
                                            g36Var = z7f1Var.b;
                                            if (g36Var.equals(h36.e)) {
                                                iMax2 = (i15 - q5t0Var3.b) / 2;
                                            } else if (g36Var.equals(h36.d)) {
                                                i9 = z7f1Var.d;
                                                i10 = q5t0Var3.b;
                                                if (i9 == 0) {
                                                    iMax2 = i15 - i10;
                                                } else {
                                                    i11 = i9 - (i10 - iU);
                                                    i12 = i11 + i10;
                                                    i13 = iMax;
                                                    if (i12 > i13) {
                                                        i11 -= i12 - i13;
                                                    }
                                                    iMax2 = (i15 - i10) - Math.max(0, i11);
                                                }
                                            }
                                            p5t0Var.k(q5t0Var3, iA, iMax2, 0.0f);
                                            p5t0Var.k(q5t0Var2, hjl.i(j2) - q5t0Var2.a, (i15 - q5t0Var2.b) / 2, 0.0f);
                                            return rih1.a;
                                        }
                                        i8 = iMax3 - iA;
                                        iA += i8;
                                        g36Var = z7f1Var.b;
                                        if (g36Var.equals(h36.e)) {
                                            iMax2 = (i15 - q5t0Var3.b) / 2;
                                        } else if (g36Var.equals(h36.d)) {
                                            i9 = z7f1Var.d;
                                            i10 = q5t0Var3.b;
                                            if (i9 == 0) {
                                                iMax2 = i15 - i10;
                                            } else {
                                                i11 = i9 - (i10 - iU);
                                                i12 = i11 + i10;
                                                i13 = iMax;
                                                if (i12 > i13) {
                                                    i11 -= i12 - i13;
                                                }
                                                iMax2 = (i15 - i10) - Math.max(0, i11);
                                            }
                                        }
                                        p5t0Var.k(q5t0Var3, iA, iMax2, 0.0f);
                                        p5t0Var.k(q5t0Var2, hjl.i(j2) - q5t0Var2.a, (i15 - q5t0Var2.b) / 2, 0.0f);
                                        return rih1.a;
                                    }
                                });
                            }
                            i6++;
                            this = this;
                        }
                        p5d0.c("Collection contains no element matching the predicate.");
                        jah.d();
                        return null;
                    }
                    i4++;
                    this = this;
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

    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        Integer numValueOf;
        int iI0 = p890Var.i0(this.e);
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(((afh0) list.get(0)).n(i));
            int iL = p7h.L(list);
            int i2 = 1;
            if (1 <= iL) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(((afh0) list.get(i2)).n(i));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i2 == iL) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            numValueOf = null;
        }
        return Math.max(iI0, numValueOf != null ? numValueOf.intValue() : 0);
    }

    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        int size = list.size();
        int iW = 0;
        for (int i2 = 0; i2 < size; i2++) {
            iW += ((afh0) list.get(i2)).w(i);
        }
        return iW;
    }
}
