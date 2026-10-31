package p;

import androidx.car.app.model.Alert;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kv20 implements lqm0, ht31 {
    public final c36 a;
    public final g36 b;
    public final float c;
    public final n8o d;
    public final float e;
    public final int f;
    public final iv20 g;

    public kv20(c36 c36Var, g36 g36Var, float f, n8o n8oVar, float f2, int i, iv20 iv20Var) {
        this.a = c36Var;
        this.b = g36Var;
        this.c = f;
        this.d = n8oVar;
        this.e = f2;
        this.f = i;
        this.g = iv20Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int f(List list, int i, int i2, int i3, int i4, iv20 iv20Var) {
        long jA;
        int i5 = 0;
        if (list.isEmpty()) {
            jA = jr80.a(0, 0);
        } else {
            int i6 = Alert.DURATION_SHOW_INDEFINITELY;
            eev eevVar = new eev(i4, iv20Var, jjl.a(0, i, 0, Alert.DURATION_SHOW_INDEFINITELY), i2, i3);
            afh0 afh0Var = (afh0) o7h.t0(0, list);
            int iN = afh0Var != null ? afh0Var.n(i) : 0;
            int iW = afh0Var != null ? afh0Var.w(iN) : 0;
            int i7 = 0;
            if (eevVar.b(list.size() > 1, 0, jr80.a(i, Alert.DURATION_SHOW_INDEFINITELY), afh0Var == null ? null : new jr80(jr80.a(iW, iN)), 0, 0, 0, false, false).b) {
                jr80 jr80VarA = iv20Var.a(0, 0, afh0Var != null);
                jA = jr80.a(jr80VarA != null ? (int) (jr80VarA.a & 4294967295L) : 0, 0);
            } else {
                int size = list.size();
                int i8 = i;
                int i9 = 0;
                int i10 = 0;
                int i11 = 0;
                int i12 = 0;
                int i13 = 0;
                while (i9 < size) {
                    int i14 = i8 - iW;
                    int i15 = i9 + 1;
                    int iMax = Math.max(i13, iN);
                    afh0 afh0Var2 = (afh0) o7h.t0(i15, list);
                    int iN2 = afh0Var2 != null ? afh0Var2.n(i) : i5;
                    int iW2 = afh0Var2 != null ? afh0Var2.w(iN2) + i2 : i5;
                    int i16 = i15 - i11;
                    boolean z = i9 + 2 < list.size() ? 1 : i5;
                    int i17 = i12;
                    int i18 = iN2;
                    int i19 = iW2;
                    ju8 ju8VarB = eevVar.b(z, i16, jr80.a(i14, i6), afh0Var2 == null ? null : new jr80(jr80.a(iW2, iN2)), i17, i7, iMax, false, false);
                    if (ju8VarB.a) {
                        int i20 = iMax + i3 + i7;
                        bv20 bv20VarA = eevVar.a(ju8VarB, afh0Var2 != null, i17, i20, i14, i16);
                        int i21 = i19 - i2;
                        i12 = i17 + 1;
                        if (ju8VarB.b) {
                            if (bv20VarA != null) {
                                long j = bv20VarA.c;
                                if (!bv20VarA.d) {
                                    i20 += ((int) (j & 4294967295L)) + i3;
                                }
                            }
                            i7 = i20;
                            i10 = i15;
                            break;
                        }
                        i11 = i15;
                        i7 = i20;
                        iW = i21;
                        i13 = 0;
                        i8 = i;
                    } else {
                        iW = i19;
                        i8 = i14;
                        i12 = i17;
                        i13 = iMax;
                    }
                    i9 = i15;
                    i10 = i9;
                    iN = i18;
                    i6 = Alert.DURATION_SHOW_INDEFINITELY;
                    i5 = 0;
                }
                jA = jr80.a(i7 - i3, i10);
            }
        }
        return (int) (jA >> 32);
    }

    public final int a(q5t0 q5t0Var) {
        return q5t0Var.X();
    }

    public final void b(int i, int[] iArr, int[] iArr2, ifh0 ifh0Var) {
        this.a.e(ifh0Var, i, iArr, ifh0Var.getLayoutDirection(), iArr2);
    }

    public final hfh0 c(final q5t0[] q5t0VarArr, ifh0 ifh0Var, final int i, final int[] iArr, int i2, final int i3, final int[] iArr2, final int i4, final int i5, final int i6) {
        final flb0 flb0Var = flb0.a;
        return ifh0Var.S(i2, i3, b7x.a, new iu30() { // from class: p.jv20
            public final Object invoke(Object obj) {
                buo1 buo1Var;
                p5t0 p5t0Var = (p5t0) obj;
                int[] iArr3 = iArr2;
                int i7 = iArr3 != null ? iArr3[i4] : 0;
                int i8 = i5;
                for (int i9 = i8; i9 < i6; i9++) {
                    q5t0 q5t0Var = q5t0VarArr[i9];
                    q5t0Var.getClass();
                    it31 it31VarU = x760.u(q5t0Var);
                    if (it31VarU == null || (buo1Var = it31VarU.c) == null) {
                        buo1Var = this.d;
                    }
                    p5t0.g(iArr[i9 - i8], buo1Var.r(i3, q5t0Var.X(), flb0Var, q5t0Var, i) + i7, p5t0Var, q5t0Var);
                }
                return rih1.a;
            }
        });
    }

    public final long d(boolean z, int i, int i2, int i3, int i4) {
        jw31 jw31Var = ew31.a;
        return !z ? jjl.a(i, i3, i2, i4) : m5n1.v(i, i3, i2, i4);
    }

    public final int e(q5t0 q5t0Var) {
        return q5t0Var.Y();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kv20)) {
            return false;
        }
        kv20 kv20Var = (kv20) obj;
        return this.a.equals(kv20Var.a) && this.b.equals(kv20Var.b) && p3v.c(this.c, kv20Var.c) && this.d.equals(kv20Var.d) && p3v.c(this.e, kv20Var.e) && this.f == kv20Var.f && u890.j(this.g, kv20Var.g);
    }

    public final int hashCode() {
        return this.g.hashCode() + kaa0.f(Alert.DURATION_SHOW_INDEFINITELY, kaa0.f(this.f, x0d.f((this.d.b.hashCode() + x0d.f((this.b.hashCode() + ((this.a.hashCode() + (Boolean.hashCode(true) * 31)) * 31)) * 31, 31, this.c)) * 31, 31, this.e), 31), 31);
    }

    @Override // p.lqm0
    public final int maxIntrinsicHeight(p890 p890Var, List list, int i) {
        List list2 = (List) o7h.t0(1, list);
        afh0 afh0Var = list2 != null ? (afh0) o7h.s0(list2) : null;
        List list3 = (List) o7h.t0(2, list);
        this.g.b(afh0Var, list3 != null ? (afh0) o7h.s0(list3) : null, jjl.b(0, i, 0, 0, 13));
        z6x z6xVar = (List) o7h.s0(list);
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        return f(z6xVar, i, p890Var.i0(this.c), p890Var.i0(this.e), this.f, this.g);
    }

    @Override // p.lqm0
    public final int maxIntrinsicWidth(p890 p890Var, List list, int i) {
        List list2 = (List) o7h.t0(1, list);
        afh0 afh0Var = list2 != null ? (afh0) o7h.s0(list2) : null;
        List list3 = (List) o7h.t0(2, list);
        this.g.b(afh0Var, list3 != null ? (afh0) o7h.s0(list3) : null, jjl.b(0, 0, 0, i, 7));
        z6x z6xVar = (List) o7h.s0(list);
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        int iI0 = p890Var.i0(this.c);
        int size = ((Collection) z6xVar).size();
        int i2 = 0;
        int iMax = 0;
        int i3 = 0;
        int i4 = 0;
        while (i2 < size) {
            int iC = ((afh0) z6xVar.get(i2)).C(i) + iI0;
            int i5 = i2 + 1;
            if (i5 - i3 == this.f || i5 == z6xVar.size()) {
                iMax = Math.max(iMax, (i4 + iC) - iI0);
                i3 = i2;
                i4 = 0;
            } else {
                i4 += iC;
            }
            i2 = i5;
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012b  */
    /* JADX WARN: Code duplicated, block: B:93:0x0284  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p.lqm0
    /* JADX INFO: renamed from: measure-3p2s80s */
    public final hfh0 mo604measure3p2s80s(ifh0 ifh0Var, List list, long j) {
        afh0 afh0Var;
        q5t0 q5t0VarH;
        jr80 jr80Var;
        ju8 ju8Var;
        bv20 bv20VarA;
        char c;
        int iH;
        afh0 afh0Var2;
        jr80 jr80Var2;
        jr80 jr80Var3;
        ju8 ju8Var2;
        int i;
        long jA;
        cv20 cv20Var;
        cv20 cv20Var2;
        long jA2;
        cv20 cv20Var3;
        int i2 = this.f;
        b7x b7xVar = b7x.a;
        final byte b = 0;
        if (i2 != 0 && !((ArrayList) list).isEmpty()) {
            int iH2 = hjl.h(j);
            final iv20 iv20Var = this.g;
            if (iH2 != 0) {
                List list2 = (List) o7h.q0(list);
                if (list2.isEmpty()) {
                    return ifh0Var.S(0, 0, b7xVar, new u1c((byte) 26));
                }
                final byte b2 = 1;
                List list3 = (List) o7h.t0(1, list);
                afh0 afh0Var3 = list3 != null ? (afh0) o7h.s0(list3) : null;
                List list4 = (List) o7h.t0(2, list);
                afh0 afh0Var4 = list4 != null ? (afh0) o7h.s0(list4) : null;
                list2.size();
                iv20Var.getClass();
                long jT = w361.t(w361.i(10, w361.h(1, j)));
                if (afh0Var3 != null) {
                    k5p1.q(afh0Var3, this, jT, new iu30(iv20Var, this, b) { // from class: p.hv20
                        public final /* synthetic */ byte a;
                        public final /* synthetic */ iv20 b;

                        {
                            this.a = b;
                        }

                        public final Object invoke(Object obj) {
                            int iX;
                            int iX2;
                            byte b3 = this.a;
                            rih1 rih1Var = rih1.a;
                            int iY = 0;
                            iv20 iv20Var2 = this.b;
                            q5t0 q5t0Var = (q5t0) obj;
                            switch (b3) {
                                case 0:
                                    if (q5t0Var != null) {
                                        iY = q5t0Var.Y();
                                        iX = q5t0Var.X();
                                    } else {
                                        iX = 0;
                                    }
                                    iv20Var2.e = new jr80(jr80.a(iY, iX));
                                    iv20Var2.b = q5t0Var;
                                    break;
                                default:
                                    if (q5t0Var != null) {
                                        iY = q5t0Var.Y();
                                        iX2 = q5t0Var.X();
                                    } else {
                                        iX2 = 0;
                                    }
                                    iv20Var2.f = new jr80(jr80.a(iY, iX2));
                                    iv20Var2.d = q5t0Var;
                                    break;
                            }
                            return rih1Var;
                        }
                    });
                    iv20Var.a = afh0Var3;
                }
                if (afh0Var4 != null) {
                    k5p1.q(afh0Var4, this, jT, new iu30(iv20Var, this, b2) { // from class: p.hv20
                        public final /* synthetic */ byte a;
                        public final /* synthetic */ iv20 b;

                        {
                            this.a = b2;
                        }

                        public final Object invoke(Object obj) {
                            int iX;
                            int iX2;
                            byte b3 = this.a;
                            rih1 rih1Var = rih1.a;
                            int iY = 0;
                            iv20 iv20Var2 = this.b;
                            q5t0 q5t0Var = (q5t0) obj;
                            switch (b3) {
                                case 0:
                                    if (q5t0Var != null) {
                                        iY = q5t0Var.Y();
                                        iX = q5t0Var.X();
                                    } else {
                                        iX = 0;
                                    }
                                    iv20Var2.e = new jr80(jr80.a(iY, iX));
                                    iv20Var2.b = q5t0Var;
                                    break;
                                default:
                                    if (q5t0Var != null) {
                                        iY = q5t0Var.Y();
                                        iX2 = q5t0Var.X();
                                    } else {
                                        iX2 = 0;
                                    }
                                    iv20Var2.f = new jr80(jr80.a(iY, iX2));
                                    iv20Var2.d = q5t0Var;
                                    break;
                            }
                            return rih1Var;
                        }
                    });
                    iv20Var.c = afh0Var4;
                }
                Iterator it = list2.iterator();
                long jH = w361.h(1, j);
                bfn0 bfn0Var = new bfn0(0, new hfh0[16]);
                int i3 = hjl.i(jH);
                int iK = hjl.k(jH);
                int iH3 = hjl.h(jH);
                fdn0 fdn0Var = pr80.a;
                fdn0 fdn0Var2 = new fdn0();
                ArrayList arrayList = new ArrayList();
                int iCeil = (int) Math.ceil(ifh0Var.X0(this.c));
                int iCeil2 = (int) Math.ceil(ifh0Var.X0(this.e));
                long jA3 = jjl.a(0, i3, 0, iH3);
                long jT2 = w361.t(w361.i(14, jA3));
                if (it.hasNext()) {
                    try {
                        afh0Var = (afh0) it.next();
                    } catch (IndexOutOfBoundsException unused) {
                        afh0Var = null;
                    }
                } else {
                    afh0Var = null;
                }
                if (afh0Var != null) {
                    if (x760.v(x760.t(afh0Var)) != 0.0f) {
                        int iW = afh0Var.w(Alert.DURATION_SHOW_INDEFINITELY);
                        jA2 = jr80.a(iW, afh0Var.n(iW));
                        q5t0VarH = null;
                    } else {
                        it31 it31VarT = x760.t(afh0Var);
                        if (((it31VarT == null || (cv20Var3 = it31VarT.d) == null) ? null : Float.valueOf(cv20Var3.a)) == null) {
                            q5t0VarH = afh0Var.H(jT2);
                            jA2 = jr80.a(q5t0VarH.Y(), q5t0VarH.X());
                        } else {
                            int iW2 = afh0Var.w(Alert.DURATION_SHOW_INDEFINITELY);
                            jA2 = jr80.a(iW2, afh0Var.n(iW2));
                            q5t0VarH = null;
                        }
                    }
                    jr80Var = new jr80(jA2);
                } else {
                    jA3 = jA3;
                    q5t0VarH = null;
                    jr80Var = null;
                }
                Integer numValueOf = jr80Var != null ? Integer.valueOf((int) (jr80Var.a >> 32)) : null;
                Integer numValueOf2 = jr80Var != null ? Integer.valueOf((int) (jr80Var.a & 4294967295L)) : null;
                edn0 edn0Var = new edn0();
                jr80 jr80Var4 = jr80Var;
                edn0 edn0Var2 = new edn0();
                Integer numValueOf3 = numValueOf2;
                gdn0 gdn0Var = new gdn0();
                int i4 = this.f;
                iv20 iv20Var2 = this.g;
                eev eevVar = new eev(i4, iv20Var2, jH, iCeil, iCeil2);
                ju8 ju8VarB = eevVar.b(it.hasNext(), 0, jr80.a(i3, iH3), jr80Var4, 0, 0, 0, false, false);
                if (ju8VarB.b) {
                    ju8Var = ju8VarB;
                    bv20VarA = eevVar.a(ju8Var, jr80Var4 != null, -1, 0, i3, 0);
                } else {
                    ju8Var = ju8VarB;
                    bv20VarA = null;
                }
                int i5 = i3;
                int i6 = iCeil;
                ju8 ju8Var3 = ju8Var;
                int i7 = iK;
                int i8 = 0;
                int i9 = 0;
                int i10 = 0;
                boolean z = false;
                int i11 = 0;
                int i12 = 0;
                int i13 = iH3;
                afh0 afh0Var5 = afh0Var;
                q5t0 q5t0Var = q5t0VarH;
                int i14 = 0;
                while (!ju8Var3.b && afh0Var5 != null) {
                    numValueOf.getClass();
                    int iIntValue = numValueOf.intValue();
                    numValueOf3.getClass();
                    bv20 bv20Var = bv20VarA;
                    int i15 = i9 + iIntValue;
                    int iMax = Math.max(i8, numValueOf3.intValue());
                    int i16 = i5 - iIntValue;
                    int i17 = i14 + 1;
                    iv20Var2.getClass();
                    arrayList.add(afh0Var5);
                    fdn0Var2.i(i14, q5t0Var);
                    Object objG = afh0Var5.g();
                    it31 it31Var = objG instanceof it31 ? (it31) objG : null;
                    boolean z2 = ((it31Var == null || (cv20Var2 = it31Var.d) == null) ? null : Float.valueOf(cv20Var2.a)) != null ? true : z;
                    int i18 = i17 - i10;
                    if (it.hasNext()) {
                        try {
                            afh0Var2 = (afh0) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            afh0Var2 = null;
                        }
                    } else {
                        afh0Var2 = null;
                    }
                    if (afh0Var2 != null) {
                        if (x760.v(x760.t(afh0Var2)) != 0.0f) {
                            int iW3 = afh0Var2.w(Alert.DURATION_SHOW_INDEFINITELY);
                            jA = jr80.a(iW3, afh0Var2.n(iW3));
                            q5t0Var = null;
                        } else {
                            it31 it31VarT2 = x760.t(afh0Var2);
                            if (((it31VarT2 == null || (cv20Var = it31VarT2.d) == null) ? null : Float.valueOf(cv20Var.a)) == null) {
                                q5t0 q5t0VarH2 = afh0Var2.H(jT2);
                                jA = jr80.a(q5t0VarH2.Y(), q5t0VarH2.X());
                                q5t0Var = q5t0VarH2;
                            } else {
                                int iW4 = afh0Var2.w(Alert.DURATION_SHOW_INDEFINITELY);
                                jA = jr80.a(iW4, afh0Var2.n(iW4));
                                q5t0Var = null;
                            }
                        }
                        jr80Var2 = new jr80(jA);
                    } else {
                        z2 = z2;
                        jr80Var2 = null;
                        q5t0Var = null;
                    }
                    Integer numValueOf4 = jr80Var2 != null ? Integer.valueOf(((int) (jr80Var2.a >> 32)) + i6) : null;
                    numValueOf3 = jr80Var2 != null ? Integer.valueOf((int) (jr80Var2.a & 4294967295L)) : null;
                    boolean zHasNext = it.hasNext();
                    long jA4 = jr80.a(i16, i13);
                    if (jr80Var2 == null) {
                        jr80Var3 = null;
                    } else {
                        numValueOf4.getClass();
                        int iIntValue2 = numValueOf4.intValue();
                        numValueOf3.getClass();
                        jr80Var3 = new jr80(jr80.a(iIntValue2, numValueOf3.intValue()));
                    }
                    ju8 ju8VarB2 = eevVar.b(zHasNext, i18, jA4, jr80Var3, i11, i12, iMax, false, false);
                    int i19 = iMax;
                    if (ju8VarB2.a) {
                        int iMin = Math.min(Math.max(i7, i15), i3);
                        int i20 = i12 + i19;
                        ju8Var2 = ju8VarB2;
                        int i21 = i11;
                        bv20 bv20VarA2 = eevVar.a(ju8Var2, jr80Var2 != null, i21, i20, i16, i18);
                        edn0Var2.a(i19);
                        if (z2) {
                            gdn0Var.b[gdn0Var.d(i21)] = i21;
                        }
                        i13 = (iH3 - i20) - iCeil2;
                        edn0Var.a(i17);
                        i11 = i21 + 1;
                        i12 = i20 + iCeil2;
                        i5 = i3;
                        i10 = i17;
                        numValueOf = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i6) : null;
                        i19 = 0;
                        z = false;
                        i7 = iMin;
                        bv20VarA = bv20VarA2;
                        i = 0;
                    } else {
                        ju8Var2 = ju8VarB2;
                        i = i15;
                        i5 = i16;
                        bv20VarA = bv20Var;
                        z = z2;
                        numValueOf = numValueOf4;
                    }
                    ju8 ju8Var4 = ju8Var2;
                    i9 = i;
                    ju8Var3 = ju8Var4;
                    afh0Var5 = afh0Var2;
                    i14 = i17;
                    i8 = i19;
                    jT2 = jT2;
                }
                bv20 bv20Var2 = bv20VarA;
                if (bv20Var2 != null) {
                    long j2 = bv20Var2.c;
                    arrayList.add(bv20Var2.a);
                    fdn0Var2.i(arrayList.size() - 1, bv20Var2.b);
                    int i22 = edn0Var.b - 1;
                    if (bv20Var2.d) {
                        edn0Var2.f(i22, Math.max(edn0Var2.c(i22), (int) (j2 & 4294967295L)));
                        edn0Var.f(i22, edn0Var.d() + 1);
                    } else {
                        edn0Var2.a((int) (j2 & 4294967295L));
                        edn0Var.a(edn0Var.d() + 1);
                    }
                }
                int size = arrayList.size();
                q5t0[] q5t0VarArr = new q5t0[size];
                for (int i23 = 0; i23 < size; i23++) {
                    q5t0VarArr[i23] = fdn0Var2.b(i23);
                }
                int i24 = edn0Var.b;
                int iMax2 = i7;
                int[] iArr = new int[i24];
                int[] iArr2 = new int[i24];
                int[] iArr3 = edn0Var.a;
                int i25 = 0;
                int i26 = 0;
                int i27 = 0;
                while (i26 < i24) {
                    int i28 = iArr3[i26];
                    int iC = edn0Var2.c(i26);
                    if (gdn0Var.c(i26)) {
                        iH = iC;
                        c = 65535;
                    } else {
                        c = 65535;
                        iH = hjl.h(jA3) == Integer.MAX_VALUE ? Integer.MAX_VALUE : hjl.h(jA3) - i27;
                    }
                    int i29 = i6;
                    gdn0 gdn0Var2 = gdn0Var;
                    int i30 = iMax2;
                    hfh0 hfh0VarD = c680.D(this, i30, hjl.j(jA3), hjl.i(jA3), iH, i29, ifh0Var, arrayList, q5t0VarArr, i25, i28, iArr, i26);
                    int width = hfh0VarD.getWidth();
                    int height = hfh0VarD.getHeight();
                    iArr2[i26] = height;
                    i27 += height;
                    iMax2 = Math.max(i30, width);
                    bfn0Var.b(hfh0VarD);
                    i26++;
                    i25 = i28;
                    gdn0Var = gdn0Var2;
                    iArr3 = iArr3;
                    edn0Var2 = edn0Var2;
                    i6 = i29;
                }
                int i31 = iMax2;
                if (bfn0Var.c == 0) {
                    i31 = 0;
                    i27 = 0;
                }
                g36 g36Var = this.b;
                int iI0 = ((bfn0Var.c - 1) * ifh0Var.i0(g36Var.a())) + i27;
                int iJ = hjl.j(jH);
                int iH4 = hjl.h(jH);
                if (iI0 < iJ) {
                    iI0 = iJ;
                }
                if (iI0 <= iH4) {
                    iH4 = iI0;
                }
                g36Var.b(ifh0Var, iH4, iArr2, iArr);
                int iK2 = hjl.k(jH);
                int i32 = hjl.i(jH);
                if (i31 < iK2) {
                    i31 = iK2;
                }
                if (i31 <= i32) {
                    i32 = i31;
                }
                return ifh0Var.S(i32, iH4, b7xVar, new gv20(bfn0Var, (byte) 0));
            }
            iv20Var.getClass();
        }
        return ifh0Var.S(0, 0, b7xVar, new u1c((byte) 25));
    }

    @Override // p.lqm0
    public final int minIntrinsicHeight(p890 p890Var, List list, int i) {
        List list2 = (List) o7h.t0(1, list);
        afh0 afh0Var = list2 != null ? (afh0) o7h.s0(list2) : null;
        List list3 = (List) o7h.t0(2, list);
        this.g.b(afh0Var, list3 != null ? (afh0) o7h.s0(list3) : null, jjl.b(0, i, 0, 0, 13));
        z6x z6xVar = (List) o7h.s0(list);
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        return f(z6xVar, i, p890Var.i0(this.c), p890Var.i0(this.e), this.f, this.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p.lqm0
    public final int minIntrinsicWidth(p890 p890Var, List list, int i) {
        int i2;
        long jA;
        this = this;
        int i3 = 1;
        List list2 = (List) o7h.t0(1, list);
        afh0 afh0Var = list2 != null ? (afh0) o7h.s0(list2) : null;
        List list3 = (List) o7h.t0(2, list);
        int i4 = 0;
        this.g.b(afh0Var, list3 != null ? (afh0) o7h.s0(list3) : null, jjl.b(0, 0, 0, i, 7));
        z6x z6xVar = (List) o7h.s0(list);
        if (z6xVar == null) {
            z6xVar = z6x.a;
        }
        int iI0 = p890Var.i0(this.c);
        int iI1 = p890Var.i0(this.e);
        if (z6xVar.isEmpty()) {
            return 0;
        }
        int size = z6xVar.size();
        int[] iArr = new int[size];
        int size2 = z6xVar.size();
        int[] iArr2 = new int[size2];
        List list4 = (Collection) z6xVar;
        int size3 = list4.size();
        for (int i5 = 0; i5 < size3; i5++) {
            afh0 afh0Var2 = (afh0) z6xVar.get(i5);
            int iW = afh0Var2.w(i);
            iArr[i5] = iW;
            iArr2[i5] = afh0Var2.n(iW);
        }
        int size4 = z6xVar.size();
        iv20 iv20Var = this.g;
        int i6 = Alert.DURATION_SHOW_INDEFINITELY;
        if (Integer.MAX_VALUE < size4) {
            iv20Var.getClass();
        }
        if (Integer.MAX_VALUE >= z6xVar.size()) {
            iv20Var.getClass();
        }
        int iMin = Math.min(Alert.DURATION_SHOW_INDEFINITELY, z6xVar.size());
        int i7 = 0;
        for (int i8 = 0; i8 < size; i8++) {
            i7 += iArr[i8];
        }
        int size5 = ((z6xVar.size() - 1) * iI0) + i7;
        if (size2 == 0) {
            hhg1.k();
            return 0;
        }
        int i9 = iArr2[0];
        int i10 = size2 - 1;
        if (1 <= i10) {
            int i11 = 1;
            while (true) {
                int i12 = iArr2[i11];
                if (i9 < i12) {
                    i9 = i12;
                }
                if (i11 == i10) {
                    break;
                }
                i11++;
            }
        }
        if (size == 0) {
            hhg1.k();
            return 0;
        }
        int i13 = iArr[0];
        int i14 = size - 1;
        if (1 <= i14) {
            int i15 = 1;
            while (true) {
                int i16 = iArr[i15];
                if (i13 < i16) {
                    i13 = i16;
                }
                if (i15 == i14) {
                    break;
                }
                i15++;
            }
        }
        int i17 = size5;
        while (i13 <= i17 && i9 != i) {
            size5 = (i13 + i17) / 2;
            if (z6xVar.isEmpty()) {
                jA = jr80.a(i4, i4);
                z6xVar = z6xVar;
                iArr = iArr;
                i4 = i4;
                iMin = iMin;
                i17 = i17;
            } else {
                iMin = iMin;
                eev eevVar = new eev(this.f, iv20Var, jjl.a(i4, size5, i4, i6), iI0, iI1);
                afh0 afh0Var3 = (afh0) o7h.t0(i4, z6xVar);
                int i18 = afh0Var3 != null ? iArr2[i4] : i4;
                int i19 = afh0Var3 != null ? iArr[i4] : i4;
                iArr = iArr;
                int i20 = 0;
                int i21 = 0;
                if (eevVar.b(z6xVar.size() > i3 ? i3 : i4, 0, jr80.a(size5, Alert.DURATION_SHOW_INDEFINITELY), afh0Var3 == null ? null : new jr80(jr80.a(i19, i18)), 0, 0, 0, false, false).b) {
                    jr80 jr80VarA = iv20Var.a(i4, i4, afh0Var3 != null ? 1 : i4);
                    jA = jr80.a(jr80VarA != null ? (int) (jr80VarA.a & 4294967295L) : i4, i4);
                    i17 = i17;
                    z6xVar = z6xVar;
                    i4 = i4;
                } else {
                    int size6 = list4.size();
                    int i22 = size5;
                    int i23 = i4;
                    int i24 = i23;
                    int i25 = i24;
                    int i26 = 0;
                    while (true) {
                        if (i23 >= size6) {
                            i17 = i17;
                            z6xVar = z6xVar;
                            i4 = i4;
                            i2 = i24;
                            break;
                        }
                        i22 -= i19;
                        i2 = i23 + 1;
                        int iMax = Math.max(i26, i18);
                        afh0 afh0Var4 = (afh0) o7h.t0(i2, z6xVar);
                        i18 = afh0Var4 != null ? iArr2[i2] : i4;
                        if (afh0Var4 != null) {
                            i4 = iArr[i2] + iI0;
                        }
                        int i27 = i2 - i25;
                        ju8 ju8VarB = eevVar.b(i23 + 2 < z6xVar.size() ? 1 : i4, i27, jr80.a(i22, Alert.DURATION_SHOW_INDEFINITELY), afh0Var4 == null ? null : new jr80(jr80.a(i4, i18)), i20, i21, iMax, false, false);
                        if (ju8VarB.a) {
                            int i28 = iMax + iI1 + i21;
                            int i29 = i20;
                            bv20 bv20VarA = eevVar.a(ju8VarB, afh0Var4 != null ? 1 : i4, i29, i28, i22, i27);
                            i4 -= iI0;
                            i20 = i29 + 1;
                            if (ju8VarB.b) {
                                if (bv20VarA != null) {
                                    long j = bv20VarA.c;
                                    if (!bv20VarA.d) {
                                        i28 = ((int) (j & 4294967295L)) + iI1 + i28;
                                    }
                                }
                                i21 = i28;
                                break;
                            }
                            i22 = size5;
                            i25 = i2;
                            i21 = i28;
                            i26 = i4;
                        } else {
                            i26 = iMax;
                        }
                        i17 = i17;
                        i23 = i2;
                        i24 = i23;
                        z6xVar = z6xVar;
                        i19 = i4;
                        i4 = i4;
                    }
                    jA = jr80.a(i21 - iI1, i2);
                }
            }
            i9 = (int) (jA >> 32);
            int i30 = (int) (jA & 4294967295L);
            if (i9 > i || i30 < iMin) {
                i13 = size5 + 1;
                if (i13 > i17) {
                    return i13;
                }
                i17 = i17;
                i3 = 1;
                i6 = Alert.DURATION_SHOW_INDEFINITELY;
            } else {
                if (i9 >= i) {
                    return size5;
                }
                i17 = size5 - 1;
                i3 = 1;
                i6 = Alert.DURATION_SHOW_INDEFINITELY;
            }
        }
        return size5;
    }

    public final String toString() {
        return "FlowMeasurePolicy(isHorizontal=true, horizontalArrangement=" + this.a + ", verticalArrangement=" + this.b + ", mainAxisSpacing=" + p3v.d(this.c) + ", crossAxisAlignment=" + this.d + ", crossAxisArrangementSpacing=" + p3v.d(this.e) + ", maxItemsInMainAxis=" + this.f + ", maxLines=2147483647, overflow=" + this.g + ")";
    }
}
