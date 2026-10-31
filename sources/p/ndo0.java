package p;

import android.os.Build;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.contentdelivery.mediaprocessing.NativeMediaProcessor;
import java.util.Map;
import kotlin.KotlinNothingValueException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class ndo0 extends x5f0 implements afh0, elb0 {
    public final hmb0 U0;
    public boolean V0;
    public boolean W0;
    public ndo0 X0;
    public ndo0 Y0;
    public boolean Z0;
    public boolean a1;
    public iu30 b1;
    public wat c1;
    public flb0 d1;
    public hfh0 f1;
    public sdn0 g1;
    public float i1;
    public ken0 j1;
    public tkb0 k1;
    public n511 m1;
    public n511 n1;
    public boolean o1;
    public boolean p1;
    public be50 q1;
    public fid r1;
    public f14 s1;
    public final g24 t1;
    public boolean u1;
    public mxq0 v1;
    public be50 w1;
    public static final ia4 x1 = new ia4(11);
    public static final ia4 y1 = new ia4(12);
    public static final kd31 z1 = new kd31();
    public static final tkb0 A1 = new tkb0();
    public static final float[] B1 = kch0.a();
    public static final kuw0 C1 = new kuw0((byte) 16);
    public static final q3c D1 = new q3c();
    public float e1 = 0.8f;
    public long h1 = 0;
    public hw61 l1 = d4o1.a;

    public ndo0(hmb0 hmb0Var) {
        this.U0 = hmb0Var;
        this.c1 = hmb0Var.Z0;
        this.d1 = hmb0Var.a1;
        n511 n511Var = n511.e;
        this.m1 = n511Var;
        this.n1 = n511Var;
        this.t1 = new g24(this, (byte) 5);
    }

    public static ndo0 I1(elb0 elb0Var) {
        ndo0 ndo0VarQ0;
        a6f0 a6f0Var = elb0Var instanceof a6f0 ? (a6f0) elb0Var : null;
        return (a6f0Var == null || (ndo0VarQ0 = a6f0Var.a.Q0()) == null) ? (ndo0) elb0Var : ndo0VarQ0;
    }

    @Override // p.x5f0
    public final hfh0 A0() {
        hfh0 hfh0Var = this.f1;
        if (hfh0Var != null) {
            return hfh0Var;
        }
        eg.m("Asking for measurement result of unmeasured layout modifier");
        return null;
    }

    public final void A1() {
        boolean zG = odo0.g(1048576);
        pim0 pim0VarM1 = m1(zG);
        if (pim0VarM1 == null || !oap1.m(pim0VarM1, 1048576)) {
            return;
        }
        pim0 pim0VarF1 = f1();
        if (!zG && (pim0VarF1 = pim0VarF1.e) == null) {
            return;
        }
        for (pim0 pim0VarM2 = m1(zG); pim0VarM2 != null && (pim0VarM2.d & 1048576) != 0; pim0VarM2 = pim0VarM2.f) {
            if ((pim0VarM2.c & 1048576) != 0) {
                pim0 pim0VarE = pim0VarM2;
                bfn0 bfn0Var = null;
                while (pim0VarE != null) {
                    if (pim0VarE instanceof wjh1) {
                        ((wjh1) pim0VarE).u1();
                    } else if ((pim0VarE.c & 1048576) != 0 && (pim0VarE instanceof l5t)) {
                        int i = 0;
                        for (pim0 pim0Var = ((l5t) pim0VarE).P0; pim0Var != null; pim0Var = pim0Var.f) {
                            if ((pim0Var.c & 1048576) != 0) {
                                i++;
                                if (i == 1) {
                                    pim0VarE = pim0Var;
                                } else {
                                    if (bfn0Var == null) {
                                        bfn0Var = new bfn0(0, new pim0[16]);
                                    }
                                    if (pim0VarE != null) {
                                        bfn0Var.b(pim0VarE);
                                        pim0VarE = null;
                                    }
                                    bfn0Var.b(pim0Var);
                                }
                            }
                        }
                        if (i == 1) {
                        }
                    }
                    pim0VarE = oap1.e(bfn0Var);
                }
            }
            if (pim0VarM2 == pim0VarF1) {
                return;
            }
        }
    }

    @Override // p.x5f0, p.txq0
    public final boolean B0() {
        return (this.v1 == null || this.Z0 || !this.U0.I()) ? false : true;
    }

    /* JADX WARN: Code duplicated, block: B:60:0x018e A[PHI: r3
      0x018e: PHI (r3v22 ??) = (r3v1 ??), (r3v1 ??), (r3v24 ??) binds: [B:42:0x0159, B:44:0x015d, B:58:0x0188] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r2v11, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v22, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r3v23 */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v25 */
    /* JADX WARN: Type inference failed for: r3v26, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r4v13 */
    public final void B1(pim0 pim0Var, mdo0 mdo0Var, long j, gk60 gk60Var, int i, boolean z, float f, boolean z2) {
        ?? E;
        if (pim0Var == null) {
            t1(mdo0Var, j, gk60Var, i, z);
            return;
        }
        if (!mdo0Var.k(pim0Var)) {
            B1(f6o1.i(pim0Var, mdo0Var.b()), mdo0Var, j, gk60Var, i, z, f, z2);
            return;
        }
        int i2 = i;
        if (rav0.b(i2, 3) || rav0.b(i2, 4)) {
            ?? r2 = pim0Var;
            ?? bfn0Var = 0;
            while (r2 != 0) {
                if (r2 instanceof mav0) {
                    long jZ0 = ((mav0) r2).z0();
                    int i3 = (int) (j >> 32);
                    float fIntBitsToFloat = Float.intBitsToFloat(i3);
                    hmb0 hmb0Var = this.U0;
                    if (fIntBitsToFloat < (-xhf1.b(jZ0, hmb0Var.a1))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i3) >= xhf1.c(jZ0, hmb0Var.a1) + Y()) {
                        break;
                    }
                    int i4 = (int) (4294967295L & j);
                    if (Float.intBitsToFloat(i4) < (-xhf1.e(jZ0))) {
                        break;
                    }
                    if (Float.intBitsToFloat(i4) >= xhf1.d(jZ0) + X()) {
                        break;
                    }
                    kdo0 kdo0Var = new kdo0(this, pim0Var, mdo0Var, j, gk60Var, i2, z, f, z2);
                    ldn0 ldn0Var = gk60Var.b;
                    wdn0 wdn0Var = gk60Var.a;
                    if (gk60Var.c == p7h.L(gk60Var)) {
                        int i5 = gk60Var.c;
                        gk60Var.c(i5 + 1, wdn0Var.b);
                        gk60Var.c++;
                        wdn0Var.b(pim0Var);
                        ldn0Var.a(ila0.a(0.0f, z, true));
                        kdo0Var.invoke();
                        gk60Var.c = i5;
                        return;
                    }
                    long jB = gk60Var.b();
                    int i6 = gk60Var.c;
                    if (!x760.x(jB)) {
                        if (x760.s(jB) > 0.0f) {
                            int i7 = gk60Var.c;
                            gk60Var.c(i7 + 1, wdn0Var.b);
                            gk60Var.c++;
                            wdn0Var.b(pim0Var);
                            ldn0Var.a(ila0.a(0.0f, z, true));
                            kdo0Var.invoke();
                            gk60Var.c = i7;
                            return;
                        }
                        return;
                    }
                    int iL = p7h.L(gk60Var);
                    gk60Var.c = iL;
                    gk60Var.c(iL + 1, wdn0Var.b);
                    gk60Var.c++;
                    wdn0Var.b(pim0Var);
                    ldn0Var.a(ila0.a(0.0f, z, true));
                    kdo0Var.invoke();
                    gk60Var.c = iL;
                    if (x760.s(gk60Var.b()) < 0.0f) {
                        gk60Var.c(i6 + 1, gk60Var.c + 1);
                    }
                    gk60Var.c = i6;
                    return;
                }
                if ((r2.c & 16) == 0 || !(r2 instanceof l5t)) {
                    E = r2;
                    bfn0Var = bfn0Var;
                    E = oap1.e((bfn0) bfn0Var);
                } else {
                    pim0 pim0Var2 = ((l5t) r2).P0;
                    int i8 = 0;
                    while (pim0Var2 != null) {
                        if ((pim0Var2.c & 16) != 0) {
                            i8++;
                            if (i8 == 1) {
                                E = r2;
                                bfn0Var = bfn0Var;
                                bfn0Var = bfn0Var;
                                E = pim0Var2;
                            } else {
                                if (bfn0Var == 0) {
                                    bfn0Var = new bfn0(0, new pim0[16]);
                                }
                                if (E != 0) {
                                    bfn0Var.b(E);
                                    E = 0;
                                }
                                bfn0Var.b(pim0Var2);
                            }
                        } else {
                            E = r2;
                            bfn0Var = bfn0Var;
                        }
                        pim0Var2 = pim0Var2.f;
                        E = E;
                        bfn0Var = bfn0Var;
                    }
                    if (i8 == 1) {
                        E = r2;
                        bfn0Var = bfn0Var;
                    } else {
                        E = r2;
                        bfn0Var = bfn0Var;
                        E = oap1.e((bfn0) bfn0Var);
                    }
                }
                i2 = i;
                r2 = E;
                bfn0Var = bfn0Var;
            }
        }
        if (z2) {
            q1(pim0Var, mdo0Var, j, gk60Var, i, z, f);
        } else {
            H1(pim0Var, mdo0Var, j, gk60Var, i, z, f);
        }
    }

    public void C1(fid fidVar, be50 be50Var) throws Throwable {
        hmb0 hmb0Var = this.U0;
        oxq0 oxq0VarA = kmb0.a(hmb0Var);
        bfn0 bfn0VarZ = hmb0Var.z();
        Object[] objArr = bfn0VarZ.a;
        int i = bfn0VarZ.c;
        for (int i2 = 0; i2 < i; i2++) {
            hmb0 hmb0Var2 = (hmb0) objArr[i2];
            if (hmb0Var2.J()) {
                hmb0Var2.j(fidVar, be50Var);
            }
        }
        if (((ha4) oxq0VarA).getShowLayoutBounds()) {
            lw4 lw4Var = sh80.G1;
            long j = this.c;
            fidVar.d(0.5f, 0.5f, ((int) (j >> 32)) - 0.5f, ((int) (j & 4294967295L)) - 0.5f, lw4Var);
        }
    }

    @Override // p.x5f0
    public final x5f0 D0() {
        return this.Y0;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void D1(long j, float f, iu30 iu30Var, be50 be50Var) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        hmb0 hmb0Var = this.U0;
        if (be50Var != null) {
            if (iu30Var != null) {
                qf80.a("both ways to create layers shouldn't be used together");
            }
            if (this.w1 != be50Var) {
                this.w1 = null;
                M1(null, false);
                this.w1 = be50Var;
            }
            if (this.v1 == null) {
                oxq0 oxq0VarA = kmb0.a(hmb0Var);
                vu30 vu30Var = this.s1;
                if (vu30Var == null) {
                    vu30 f14Var = new f14(this, new g030(this, (byte) 23), (byte) 22);
                    this.s1 = f14Var;
                    vu30Var = f14Var;
                }
                g24 g24Var = this.t1;
                mxq0 mxq0VarF = ((ha4) oxq0VarA).f(vu30Var, g24Var, be50Var);
                ge50 ge50Var = (ge50) mxq0VarF;
                ge50Var.e(this.c);
                ge50Var.d(j);
                this.v1 = mxq0VarF;
                hmb0Var.i1 = true;
                g24Var.invoke();
            }
        } else {
            if (this.w1 != null) {
                this.w1 = null;
                M1(null, false);
            }
            M1(iu30Var, false);
        }
        if (!qr80.b(this.h1, j)) {
            ((ha4) kmb0.a(hmb0Var)).O(-4.0f);
            this.h1 = j;
            mxq0 mxq0Var = this.v1;
            if (mxq0Var != null) {
                ((ge50) mxq0Var).d(j);
            } else {
                ndo0 ndo0Var = this.Y0;
                if (ndo0Var != null) {
                    ndo0Var.u1();
                }
            }
            hmb0Var.O(this);
            x5f0.I0(this);
            oxq0 oxq0Var = hmb0Var.O0;
            if (oxq0Var != null) {
                ((ha4) oxq0Var).x(hmb0Var);
            }
        }
        this.i1 = f;
        if (this == ((ndo0) hmb0Var.e1.e)) {
            ((ha4) kmb0.a(hmb0Var)).getRectManager().g(hmb0Var);
        }
        if (this.O0) {
            return;
        }
        s0(A0());
    }

    @Override // p.elb0
    public final long E(long j) {
        if (!f1().N0) {
            qf80.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return ((ha4) kmb0.a(this.U0)).s(O(j));
    }

    @Override // p.x5f0
    public final long E0() {
        return this.h1;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0082  */
    public final void E1(ken0 ken0Var, boolean z, boolean z2) {
        long jFloatToRawIntBits;
        mxq0 mxq0Var = this.v1;
        if (mxq0Var != null) {
            if (this.a1) {
                if (z2) {
                    long jD1 = d1();
                    float f = ken0Var.a;
                    float f2 = ken0Var.b;
                    if (ken0Var.c >= 0.0f) {
                        long j = this.c;
                        if (f > ((int) (j >> 32)) || ken0Var.d < 0.0f || f2 > ((int) (j & 4294967295L))) {
                            jFloatToRawIntBits = 0;
                        } else {
                            float fIntBitsToFloat = Float.intBitsToFloat((int) (jD1 >> 32));
                            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jD1 & 4294967295L));
                            float f3 = (fIntBitsToFloat - (ken0Var.c - ken0Var.a)) / 2.0f;
                            if (f3 > 0.0f) {
                                f -= f3;
                            } else {
                                float f4 = (-fIntBitsToFloat) / 2.0f;
                                if (f < f4) {
                                    f = f4;
                                }
                            }
                            float f5 = (fIntBitsToFloat2 - (ken0Var.d - ken0Var.b)) / 2.0f;
                            if (f5 > 0.0f) {
                                f2 -= f5;
                            } else {
                                float f6 = (-fIntBitsToFloat2) / 2.0f;
                                if (f2 < f6) {
                                    f2 = f6;
                                }
                            }
                            jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
                        }
                    } else {
                        jFloatToRawIntBits = 0;
                    }
                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
                    long j2 = this.c;
                    float f7 = (int) (j2 >> 32);
                    int i = (int) (jD1 >> 32);
                    float f8 = (int) (j2 & 4294967295L);
                    int i2 = (int) (jD1 & 4294967295L);
                    ken0Var.a(fIntBitsToFloat3, fIntBitsToFloat4, Math.min(Float.intBitsToFloat(i) + f7, Math.max(f7, Float.intBitsToFloat(i) + fIntBitsToFloat3)), Math.min(Float.intBitsToFloat(i2) + f8, Math.max(f8, Float.intBitsToFloat(i2) + fIntBitsToFloat4)));
                } else if (z) {
                    long j3 = this.c;
                    ken0Var.a(0.0f, 0.0f, (int) (j3 >> 32), (int) (j3 & 4294967295L));
                }
                if (ken0Var.b()) {
                    return;
                }
            }
            ge50 ge50Var = (ge50) mxq0Var;
            float[] fArrB = ge50Var.b();
            if (!ge50Var.S0) {
                if (fArrB == null) {
                    ken0Var.a = 0.0f;
                    ken0Var.b = 0.0f;
                    ken0Var.c = 0.0f;
                    ken0Var.d = 0.0f;
                } else {
                    kch0.d(fArrB, ken0Var);
                }
            }
        }
        long j4 = this.h1;
        float f9 = (int) (j4 >> 32);
        ken0Var.a += f9;
        ken0Var.c += f9;
        float f10 = (int) (j4 & 4294967295L);
        ken0Var.b += f10;
        ken0Var.d += f10;
    }

    public final void F1() {
        if (this.v1 != null) {
            if (this.w1 != null) {
                this.w1 = null;
            }
            M1(null, false);
            this.U0.V(false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r6v6, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r8v4 */
    public final void G1(hfh0 hfh0Var) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        ndo0 ndo0Var;
        hfh0 hfh0Var2 = this.f1;
        if (hfh0Var != hfh0Var2) {
            this.f1 = hfh0Var;
            hmb0 hmb0Var = this.U0;
            if (hfh0Var2 == null || hfh0Var.getWidth() != hfh0Var2.getWidth() || hfh0Var.getHeight() != hfh0Var2.getHeight()) {
                int width = hfh0Var.getWidth();
                int height = hfh0Var.getHeight();
                mxq0 mxq0Var = this.v1;
                if (mxq0Var != null) {
                    ((ge50) mxq0Var).e((((long) width) << 32) | (((long) height) & 4294967295L));
                } else if (hmb0Var.J() && (ndo0Var = this.Y0) != null) {
                    ndo0Var.u1();
                }
                h0((((long) height) & 4294967295L) | (((long) width) << 32));
                if (this.b1 != null) {
                    N1(false);
                }
                boolean zG = odo0.g(4);
                pim0 pim0VarF1 = f1();
                if (zG || (pim0VarF1 = pim0VarF1.e) != null) {
                    for (pim0 pim0VarM1 = m1(zG); pim0VarM1 != null && (pim0VarM1.d & 4) != 0; pim0VarM1 = pim0VarM1.f) {
                        if ((pim0VarM1.c & 4) != 0) {
                            ?? E = pim0VarM1;
                            ?? bfn0Var = 0;
                            while (E != 0) {
                                if (E instanceof m7v) {
                                    ((m7v) E).L0();
                                } else if ((E.c & 4) != 0 && (E instanceof l5t)) {
                                    pim0 pim0Var = ((l5t) E).P0;
                                    int i = 0;
                                    E = E;
                                    bfn0Var = bfn0Var;
                                    while (pim0Var != null) {
                                        if ((pim0Var.c & 4) != 0) {
                                            i++;
                                            if (i == 1) {
                                                bfn0Var = bfn0Var;
                                                E = pim0Var;
                                            } else {
                                                if (bfn0Var == 0) {
                                                    bfn0Var = new bfn0(0, new pim0[16]);
                                                }
                                                if (E != 0) {
                                                    bfn0Var.b(E);
                                                    E = 0;
                                                }
                                                bfn0Var.b(pim0Var);
                                            }
                                        }
                                        pim0Var = pim0Var.f;
                                        E = E;
                                        bfn0Var = bfn0Var;
                                    }
                                    if (i == 1) {
                                    }
                                }
                                E = oap1.e((bfn0) bfn0Var);
                            }
                        }
                        if (pim0VarM1 == pim0VarF1) {
                            break;
                        }
                    }
                }
                oxq0 oxq0Var = hmb0Var.O0;
                if (oxq0Var != null) {
                    ((ha4) oxq0Var).x(hmb0Var);
                }
                hmb0Var.O(this);
            }
            sdn0 sdn0Var = this.g1;
            if (((sdn0Var == null || sdn0Var.e == 0) && hfh0Var.c().isEmpty()) || f6o1.h(this.g1, hfh0Var.c())) {
                return;
            }
            hmb0Var.f1.f68p.X0.j();
            sdn0 sdn0Var2 = this.g1;
            if (sdn0Var2 == null) {
                sdn0 sdn0Var3 = kfp0.a;
                sdn0Var2 = new sdn0();
                this.g1 = sdn0Var2;
            }
            sdn0Var2.a();
            for (Map.Entry entry : hfh0Var.c().entrySet()) {
                sdn0Var2.g(((Number) entry.getValue()).intValue(), entry.getKey());
            }
        }
    }

    public final void H1(pim0 pim0Var, mdo0 mdo0Var, long j, gk60 gk60Var, int i, boolean z, float f) {
        int i2;
        if (pim0Var == null) {
            t1(mdo0Var, j, gk60Var, i, z);
            return;
        }
        if (!mdo0Var.k(pim0Var)) {
            H1(f6o1.i(pim0Var, mdo0Var.b()), mdo0Var, j, gk60Var, i, z, f);
            return;
        }
        if (!mdo0Var.m(pim0Var)) {
            B1(f6o1.i(pim0Var, mdo0Var.b()), mdo0Var, j, gk60Var, i, z, f, false);
            return;
        }
        ldo0 ldo0Var = new ldo0(this, pim0Var, mdo0Var, j, gk60Var, i, z, f);
        ldn0 ldn0Var = gk60Var.b;
        wdn0 wdn0Var = gk60Var.a;
        if (gk60Var.c != p7h.L(gk60Var)) {
            long jB = gk60Var.b();
            int i3 = gk60Var.c;
            int iL = p7h.L(gk60Var);
            gk60Var.c = iL;
            gk60Var.c(iL + 1, wdn0Var.b);
            gk60Var.c++;
            wdn0Var.b(pim0Var);
            ldn0Var.a(ila0.a(f, z, false));
            ldo0Var.invoke();
            gk60Var.c = iL;
            long jB2 = gk60Var.b();
            if (gk60Var.c + 1 >= p7h.L(gk60Var) || x760.r(jB, jB2) <= 0) {
                gk60Var.c(gk60Var.c + 1, wdn0Var.b);
            } else {
                int i4 = i3 + 1;
                boolean zX = x760.x(jB2);
                int i5 = gk60Var.c;
                gk60Var.c(i4, zX ? i5 + 2 : i5 + 1);
            }
            gk60Var.c = i3;
            return;
        }
        int i6 = gk60Var.c;
        int i7 = i6 + 1;
        gk60Var.c(i7, wdn0Var.b);
        gk60Var.c++;
        wdn0Var.b(pim0Var);
        ldn0Var.a(ila0.a(f, z, false));
        ldo0Var.invoke();
        gk60Var.c = i6;
        if (i7 == p7h.L(gk60Var) || x760.x(gk60Var.b())) {
            int i8 = gk60Var.c;
            int i9 = i8 + 1;
            wdn0Var.l(i9);
            if (i9 < 0 || i9 >= (i2 = ldn0Var.b)) {
                eqr0.O("Index must be between 0 and size");
                throw null;
            }
            long[] jArr = ldn0Var.a;
            long j2 = jArr[i9];
            if (i9 != i2 - 1) {
                f46.T(jArr, jArr, i9, i8 + 2, i2);
            }
            ldn0Var.b--;
        }
    }

    @Override // p.elb0
    public final elb0 J() {
        boolean z = f1().N0;
        hmb0 hmb0Var = this.U0;
        if (!z) {
            StringBuilder sb = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (hmb0 hmb0VarV = hmb0Var; hmb0VarV != null; hmb0VarV = hmb0VarV.v()) {
                sb.append("\n|");
                sb.append(hmb0VarV);
                sb.append(" isAttached=");
                sb.append(hmb0VarV.I());
                sb.append(" modifier=");
                sb.append(hmb0VarV.j1);
                sb.append(" tail=");
                sb.append(f1());
            }
            qf80.c(sb.toString());
        }
        w1();
        return ((ndo0) hmb0Var.e1.e).Y0;
    }

    public final n511 J1() {
        if (f1().N0) {
            elb0 elb0VarV = nho1.v(this);
            ken0 ken0Var = this.j1;
            if (ken0Var == null) {
                ken0Var = new ken0();
                this.j1 = ken0Var;
            }
            long jQ0 = Q0(d1());
            float f = h1() ? this.m1.a : 0.0f;
            float f2 = h1() ? this.m1.b : 0.0f;
            float fY = h1() ? this.m1.c : Y();
            float fX = h1() ? this.m1.d : X();
            int i = (int) (jQ0 >> 32);
            ken0Var.a = f - Float.intBitsToFloat(i);
            int i2 = (int) (jQ0 & 4294967295L);
            ken0Var.b = f2 - Float.intBitsToFloat(i2);
            ken0Var.c = Float.intBitsToFloat(i) + fY;
            ken0Var.d = Float.intBitsToFloat(i2) + fX;
            while (this != elb0VarV) {
                this.E1(ken0Var, false, true);
                if (!ken0Var.b()) {
                    this = this.Y0;
                    this.getClass();
                }
            }
            return j1e1.B(ken0Var);
        }
        return n511.e;
    }

    @Override // p.elb0
    public final long K(elb0 elb0Var, long j) {
        return q(elb0Var, j, true);
    }

    @Override // p.x5f0
    public final void K0() {
        be50 be50Var = this.w1;
        long j = this.h1;
        if (be50Var != null) {
            f0(j, this.i1, be50Var);
        } else {
            e0(j, this.i1, this.b1);
        }
    }

    public final void K1(ndo0 ndo0Var, float[] fArr) {
        float[] fArrA;
        if (u890.j(ndo0Var, this)) {
            return;
        }
        ndo0 ndo0Var2 = this.Y0;
        ndo0Var2.getClass();
        ndo0Var2.K1(ndo0Var, fArr);
        if (!qr80.b(this.h1, 0L)) {
            float[] fArr2 = B1;
            kch0.e(fArr2);
            long j = this.h1;
            kch0.k(-((int) (j >> 32)), -((int) (j & 4294967295L)), fArr2);
            kch0.j(fArr, fArr2);
        }
        mxq0 mxq0Var = this.v1;
        if (mxq0Var == null || (fArrA = ((ge50) mxq0Var).a()) == null) {
            return;
        }
        kch0.j(fArr, fArrA);
    }

    public final void L1(ndo0 ndo0Var, float[] fArr) {
        while (!this.equals(ndo0Var)) {
            mxq0 mxq0Var = this.v1;
            if (mxq0Var != null) {
                kch0.j(fArr, ((ge50) mxq0Var).b());
            }
            long j = this.h1;
            if (!qr80.b(j, 0L)) {
                float[] fArr2 = B1;
                kch0.e(fArr2);
                kch0.k((int) (j >> 32), (int) (j & 4294967295L), fArr2);
                kch0.j(fArr, fArr2);
            }
            this = this.Y0;
            this.getClass();
        }
    }

    @Override // p.elb0
    public final n511 M(elb0 elb0Var, boolean z) {
        if (!f1().N0) {
            qf80.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!elb0Var.a()) {
            qf80.c("LayoutCoordinates " + elb0Var + " is not attached!");
        }
        ndo0 ndo0VarI1 = I1(elb0Var);
        ndo0VarI1.w1();
        ndo0 ndo0VarZ0 = Z0(ndo0VarI1);
        ken0 ken0Var = this.j1;
        if (ken0Var == null) {
            ken0Var = new ken0();
            this.j1 = ken0Var;
        }
        ken0Var.a = 0.0f;
        ken0Var.b = 0.0f;
        ken0Var.c = (int) (elb0Var.b() >> 32);
        ken0Var.d = (int) (elb0Var.b() & 4294967295L);
        while (ndo0VarI1 != ndo0VarZ0) {
            ndo0VarI1.E1(ken0Var, z, false);
            if (ken0Var.b()) {
                return n511.e;
            }
            ndo0VarI1 = ndo0VarI1.Y0;
            ndo0VarI1.getClass();
        }
        O0(ndo0VarZ0, ken0Var, z);
        return j1e1.B(ken0Var);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void M1(iu30 iu30Var, boolean z) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        oxq0 oxq0Var;
        if (iu30Var != null && this.w1 != null) {
            qf80.a("layerBlock can't be provided when explicitLayer is provided");
        }
        hmb0 hmb0Var = this.U0;
        boolean z2 = (!z && this.b1 == iu30Var && u890.j(this.c1, hmb0Var.Z0) && this.d1 == hmb0Var.a1) ? false : true;
        this.c1 = hmb0Var.Z0;
        this.d1 = hmb0Var.a1;
        boolean zI = hmb0Var.I();
        g24 g24Var = this.t1;
        if (zI && iu30Var != null) {
            this.b1 = iu30Var;
            if (this.v1 != null) {
                if (z2) {
                    N1(true);
                    return;
                }
                return;
            }
            oxq0 oxq0VarA = kmb0.a(hmb0Var);
            vu30 vu30Var = this.s1;
            if (vu30Var == null) {
                vu30 f14Var = new f14(this, new g030(this, (byte) 23), (byte) 22);
                this.s1 = f14Var;
                vu30Var = f14Var;
            }
            mxq0 mxq0VarF = ((ha4) oxq0VarA).f(vu30Var, g24Var, null);
            ge50 ge50Var = (ge50) mxq0VarF;
            ge50Var.e(this.c);
            ge50Var.d(this.h1);
            this.v1 = mxq0VarF;
            N1(true);
            hmb0Var.i1 = true;
            g24Var.invoke();
            return;
        }
        this.b1 = null;
        mxq0 mxq0Var = this.v1;
        if (mxq0Var != null) {
            ge50 ge50Var2 = (ge50) mxq0Var;
            if (!zgo1.t(ge50Var2.b())) {
                hmb0Var.O(this);
            }
            ge50Var2.d = null;
            ge50Var2.e = null;
            ge50Var2.g = true;
            ge50Var2.f(false);
            yd50 yd50Var = ge50Var2.b;
            if (yd50Var != null) {
                yd50Var.c(ge50Var2.a);
                ha4 ha4Var = ge50Var2.c;
                ha4Var.P1.m(ge50Var2);
                ha4Var.d1.k(ge50Var2);
            }
            this.v1 = null;
            hmb0Var.i1 = true;
            g24Var.invoke();
            if (f1().N0 && hmb0Var.J() && (oxq0Var = hmb0Var.O0) != null) {
                ((ha4) oxq0Var).x(hmb0Var);
            }
        }
        this.u1 = false;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void N1(boolean z) throws NoWhenBranchMatchedException, KotlinNothingValueException {
        char c;
        long j;
        boolean z2;
        hmb0 hmb0Var;
        Function0 function0;
        int i;
        Function0 function1;
        if (this.w1 != null) {
            return;
        }
        mxq0 mxq0Var = this.v1;
        iu30 iu30Var = this.b1;
        if (mxq0Var == null) {
            if (iu30Var == null) {
                return;
            }
            qf80.c("null layer with a non-null layerBlock");
            return;
        }
        if (iu30Var == null) {
            throw l1d.w("updateLayerParameters requires a non-null layerBlock");
        }
        kd31 kd31Var = z1;
        kd31Var.a();
        hmb0 hmb0Var2 = this.U0;
        kd31Var.T0 = hmb0Var2.Z0;
        kd31Var.U0 = hmb0Var2.a1;
        kd31Var.R0 = o0c.R(this.c);
        l811 l811Var = new l811();
        ((ha4) kmb0.a(hmb0Var2)).getSnapshotObserver().a.d(this, x1, new uc9(iu30Var, this, l811Var, (byte) 9));
        tkb0 tkb0Var = this.k1;
        if (tkb0Var == null) {
            tkb0Var = new tkb0();
            this.k1 = tkb0Var;
        }
        tkb0 tkb0Var2 = A1;
        tkb0Var2.getClass();
        tkb0Var2.a = tkb0Var.a;
        tkb0Var2.b = tkb0Var.b;
        tkb0Var2.c = tkb0Var.c;
        tkb0Var2.d = tkb0Var.d;
        tkb0Var2.e = tkb0Var.e;
        tkb0Var2.f = tkb0Var.f;
        tkb0Var2.g = tkb0Var.g;
        tkb0Var2.h = tkb0Var.h;
        tkb0Var2.i = tkb0Var.i;
        tkb0Var.a = kd31Var.b;
        tkb0Var.b = kd31Var.c;
        tkb0Var.c = kd31Var.e;
        tkb0Var.d = kd31Var.f;
        tkb0Var.e = kd31Var.t;
        tkb0Var.f = kd31Var.X;
        tkb0Var.g = kd31Var.Y;
        tkb0Var.h = kd31Var.Z;
        tkb0Var.i = kd31Var.N0;
        ge50 ge50Var = (ge50) mxq0Var;
        ha4 ha4Var = ge50Var.c;
        int i2 = kd31Var.a | ge50Var.N0;
        ge50Var.Y = kd31Var.U0;
        wat watVar = kd31Var.T0;
        ge50Var.X = watVar;
        if ((1048576 & i2) != 0) {
            be50 be50Var = ge50Var.a;
            kd31Var.S0.getClass();
            int iI0 = watVar.i0(0.0f);
            kd31Var.S0.getClass();
            int iI1 = watVar.i0(0.0f);
            kd31Var.S0.getClass();
            int iI2 = watVar.i0(0.0f);
            kd31Var.S0.getClass();
            int iI3 = watVar.i0(0.0f);
            be50Var.v = iI0;
            be50Var.w = iI1;
            be50Var.x = iI2;
            be50Var.y = iI3;
            be50Var.a.r(iI0, iI1, iI2, iI3);
            ge50Var.c();
        }
        int i3 = i2 & 4096;
        if (i3 != 0) {
            ge50Var.O0 = kd31Var.N0;
        }
        if ((i2 & 1) != 0) {
            be50 be50Var2 = ge50Var.a;
            float f = kd31Var.b;
            fe50 fe50Var = be50Var2.a;
            if (fe50Var.c() != f) {
                fe50Var.a(f);
            }
        }
        if ((i2 & 2) != 0) {
            be50 be50Var3 = ge50Var.a;
            float f2 = kd31Var.c;
            fe50 fe50Var2 = be50Var3.a;
            if (fe50Var2.e() != f2) {
                fe50Var2.d(f2);
            }
        }
        if ((i2 & 4) != 0) {
            ge50Var.a.g(kd31Var.d);
        }
        if ((i2 & 8) != 0) {
            be50 be50Var4 = ge50Var.a;
            float f3 = kd31Var.e;
            fe50 fe50Var3 = be50Var4.a;
            if (fe50Var3.L() != f3) {
                fe50Var3.O(f3);
            }
        }
        if ((i2 & 16) != 0) {
            be50 be50Var5 = ge50Var.a;
            float f4 = kd31Var.f;
            fe50 fe50Var4 = be50Var5.a;
            if (fe50Var4.K() != f4) {
                fe50Var4.g(f4);
            }
        }
        if ((i2 & 32) != 0) {
            be50 be50Var6 = ge50Var.a;
            float f5 = kd31Var.g;
            fe50 fe50Var5 = be50Var6.a;
            if (fe50Var5.P() != f5) {
                fe50Var5.D(f5);
                be50Var6.g = true;
                be50Var6.a();
            }
            if (kd31Var.g > 0.0f && !ge50Var.T0 && (function1 = ge50Var.e) != null) {
                function1.invoke();
            }
        }
        if ((i2 & 64) != 0) {
            be50 be50Var7 = ge50Var.a;
            long j2 = kd31Var.h;
            fe50 fe50Var6 = be50Var7.a;
            long jQ = fe50Var6.q();
            int i4 = u7h.l;
            if (!z4h1.b(j2, jQ)) {
                fe50Var6.t(j2);
            }
        }
        if ((i2 & 128) != 0) {
            be50 be50Var8 = ge50Var.a;
            long j3 = kd31Var.i;
            fe50 fe50Var7 = be50Var8.a;
            long jS = fe50Var7.s();
            int i5 = u7h.l;
            if (!z4h1.b(j3, jS)) {
                fe50Var7.w(j3);
            }
        }
        if ((i2 & 1024) != 0) {
            be50 be50Var9 = ge50Var.a;
            float f6 = kd31Var.Y;
            fe50 fe50Var8 = be50Var9.a;
            if (fe50Var8.p() != f6) {
                fe50Var8.E(f6);
            }
        }
        if ((i2 & 256) != 0) {
            be50 be50Var10 = ge50Var.a;
            float f7 = kd31Var.t;
            fe50 fe50Var9 = be50Var10.a;
            if (fe50Var9.M() != f7) {
                fe50Var9.A(f7);
            }
        }
        if ((i2 & NativeMediaProcessor.PROCESS_SAMPLE_RESULT_SAMPLE_OFFSET_OUT_OF_BOUNDS) != 0) {
            be50 be50Var11 = ge50Var.a;
            float f8 = kd31Var.X;
            fe50 fe50Var10 = be50Var11.a;
            if (fe50Var10.m() != f8) {
                fe50Var10.C(f8);
            }
        }
        if ((i2 & 2048) != 0) {
            be50 be50Var12 = ge50Var.a;
            float f9 = kd31Var.Z;
            fe50 fe50Var11 = be50Var12.a;
            if (fe50Var11.u() != f9) {
                fe50Var11.z(f9);
            }
        }
        if (i3 != 0) {
            j = 4294967295L;
            long j4 = ge50Var.O0;
            int i6 = ofg1.c;
            boolean zA = ofg1.a(j4, wpb1.v());
            be50 be50Var13 = ge50Var.a;
            if (zA) {
                c = ' ';
                if (!Offset.c(be50Var13.z, 9205357640488583168L)) {
                    be50Var13.z = 9205357640488583168L;
                    be50Var13.a.I(9205357640488583168L);
                }
            } else {
                c = ' ';
                long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ge50Var.O0 & 4294967295L)) * ((int) (ge50Var.f & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (ge50Var.O0 >> 32)) * ((int) (ge50Var.f >> 32)))) << 32);
                if (!Offset.c(be50Var13.z, jFloatToRawIntBits)) {
                    be50Var13.z = jFloatToRawIntBits;
                    be50Var13.a.I(jFloatToRawIntBits);
                }
            }
        } else {
            c = ' ';
            j = 4294967295L;
        }
        if ((i2 & 16384) != 0) {
            be50 be50Var14 = ge50Var.a;
            boolean z3 = kd31Var.P0;
            if (be50Var14.A != z3) {
                be50Var14.A = z3;
                be50Var14.g = true;
                be50Var14.a();
            }
        }
        if ((131072 & i2) != 0) {
            be50 be50Var15 = ge50Var.a;
            vc21 vc21Var = kd31Var.V0;
            fe50 fe50Var12 = be50Var15.a;
            if (!u890.j(fe50Var12.f(), vc21Var)) {
                fe50Var12.G(vc21Var);
            }
        }
        if ((262144 & i2) != 0) {
            be50 be50Var16 = ge50Var.a;
            ColorFilter colorFilter = kd31Var.W0;
            fe50 fe50Var13 = be50Var16.a;
            if (!u890.j(fe50Var13.l(), colorFilter)) {
                fe50Var13.H(colorFilter);
            }
        }
        if ((524288 & i2) != 0) {
            be50 be50Var17 = ge50Var.a;
            int i7 = kd31Var.X0;
            fe50 fe50Var14 = be50Var17.a;
            if (!jm5.j(fe50Var14.B(), i7)) {
                fe50Var14.h(i7);
            }
        }
        if ((32768 & i2) != 0) {
            be50 be50Var18 = ge50Var.a;
            int i8 = kd31Var.Q0;
            if (t0c.h(i8, 0)) {
                i = 0;
            } else if (t0c.h(i8, 1)) {
                i = 1;
            } else {
                i = 2;
                if (!t0c.h(i8, 2)) {
                    eg.m("Not supported composition strategy");
                    return;
                }
            }
            fe50 fe50Var15 = be50Var18.a;
            if (!kbb.w(fe50Var15.k(), i)) {
                fe50Var15.N(i);
            }
        }
        if ((i2 & 7963) != 0) {
            ge50Var.Q0 = true;
            ge50Var.R0 = true;
        }
        if (u890.j(ge50Var.P0, kd31Var.Y0)) {
            hmb0Var2 = hmb0Var2;
            l811Var = l811Var;
            z2 = false;
        } else {
            z1a1 z1a1Var = kd31Var.Y0;
            ge50Var.P0 = z1a1Var;
            if (z1a1Var == null) {
                hmb0Var2 = hmb0Var2;
                l811Var = l811Var;
            } else {
                be50 be50Var19 = ge50Var.a;
                if (z1a1Var instanceof itq0) {
                    n511 n511Var = ((itq0) z1a1Var).c;
                    char c2 = c;
                    float f10 = n511Var.a;
                    float f11 = n511Var.b;
                    be50Var19.h(0.0f, (((long) Float.floatToRawIntBits(f10)) << c2) | (((long) Float.floatToRawIntBits(f11)) & j), (((long) Float.floatToRawIntBits(n511Var.c - f10)) << c2) | (((long) Float.floatToRawIntBits(n511Var.d - f11)) & j));
                } else {
                    char c3 = c;
                    if (z1a1Var instanceof htq0) {
                        u8s0 u8s0Var = ((htq0) z1a1Var).c;
                        be50Var19.k = null;
                        be50Var19.i = 9205357640488583168L;
                        be50Var19.h = 0L;
                        be50Var19.j = 0.0f;
                        be50Var19.g = true;
                        be50Var19.n = false;
                        be50Var19.l = u8s0Var;
                        be50Var19.a();
                    } else {
                        if (!(z1a1Var instanceof jtq0)) {
                            eg.o();
                            return;
                        }
                        jtq0 jtq0Var = (jtq0) z1a1Var;
                        tw4 tw4Var = jtq0Var.d;
                        if (tw4Var != null) {
                            be50Var19.k = null;
                            be50Var19.i = 9205357640488583168L;
                            be50Var19.h = 0L;
                            be50Var19.j = 0.0f;
                            be50Var19.g = true;
                            be50Var19.n = false;
                            be50Var19.l = tw4Var;
                            be50Var19.a();
                        } else {
                            vq31 vq31Var = jtq0Var.c;
                            be50Var19.h(Float.intBitsToFloat((int) (vq31Var.h >> c3)), (((long) Float.floatToRawIntBits(vq31Var.a)) << c3) | (((long) Float.floatToRawIntBits(vq31Var.b)) & j), (((long) Float.floatToRawIntBits(vq31Var.b())) << c3) | (((long) Float.floatToRawIntBits(vq31Var.a())) & j));
                        }
                    }
                    if (Build.VERSION.SDK_INT < 33 && (((z1a1Var instanceof htq0) || ((z1a1Var instanceof jtq0) && !ila0.w(((jtq0) z1a1Var).c))) && (function0 = ge50Var.e) != null)) {
                        function0.invoke();
                    }
                }
                if (Build.VERSION.SDK_INT < 33) {
                    function0.invoke();
                }
            }
            z2 = true;
        }
        ge50Var.N0 = kd31Var.a;
        if (i2 != 0 || z2) {
            if (Build.VERSION.SDK_INT >= 26) {
                kw7.B(ha4Var);
            } else {
                ha4Var.invalidate();
            }
            if (ha4.m()) {
                ha4Var.O(0.0f);
            }
        }
        boolean z4 = this.a1;
        this.a1 = kd31Var.P0;
        this.e1 = kd31Var.d;
        boolean z5 = tkb0Var2.a == tkb0Var.a && tkb0Var2.b == tkb0Var.b && tkb0Var2.c == tkb0Var.c && tkb0Var2.d == tkb0Var.d && tkb0Var2.e == tkb0Var.e && tkb0Var2.f == tkb0Var.f && tkb0Var2.g == tkb0Var.g && tkb0Var2.h == tkb0Var.h && ofg1.a(tkb0Var2.i, tkb0Var.i);
        if (!z || (z5 && z4 == this.a1 && !l811Var.a)) {
            hmb0Var = hmb0Var2;
        } else {
            hmb0Var = hmb0Var2;
            oxq0 oxq0Var = hmb0Var.O0;
            if (oxq0Var != null) {
                ((ha4) oxq0Var).x(hmb0Var);
            }
        }
        if (z5) {
            return;
        }
        hmb0Var.O(this);
        if (hmb0Var.o1 > 0) {
            ha4 ha4Var2 = (ha4) kmb0.a(hmb0Var);
            ((rok0) ha4Var2.t1.f).q(hmb0Var);
            ha4Var2.H(null);
        }
    }

    @Override // p.elb0
    public final long O(long j) {
        if (!f1().N0) {
            qf80.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        w1();
        while (this != null) {
            hmb0 hmb0Var = this.U0;
            if (this == ((ndo0) hmb0Var.e1.e) && !hmb0Var.c) {
                long jB = ((ha4) kmb0.a(hmb0Var)).getRectManager().b(hmb0Var);
                if (!qr80.b(jB, 9223372034707292159L)) {
                    return dm5.X(j, jB);
                }
            }
            mxq0 mxq0Var = this.v1;
            if (mxq0Var != null) {
                ge50 ge50Var = (ge50) mxq0Var;
                float[] fArrB = ge50Var.b();
                if (!ge50Var.S0) {
                    j = kch0.b(j, fArrB);
                }
            }
            j = dm5.X(j, this.h1);
            this = this.Y0;
        }
        return j;
    }

    public final void O0(ndo0 ndo0Var, ken0 ken0Var, boolean z) {
        if (ndo0Var == this) {
            return;
        }
        ndo0 ndo0Var2 = this.Y0;
        if (ndo0Var2 != null) {
            ndo0Var2.O0(ndo0Var, ken0Var, z);
        }
        long j = this.h1;
        float f = (int) (j >> 32);
        ken0Var.a -= f;
        ken0Var.c -= f;
        float f2 = (int) (j & 4294967295L);
        ken0Var.b -= f2;
        ken0Var.d -= f2;
        mxq0 mxq0Var = this.v1;
        if (mxq0Var != null) {
            ge50 ge50Var = (ge50) mxq0Var;
            float[] fArrA = ge50Var.a();
            if (!ge50Var.S0) {
                if (fArrA == null) {
                    ken0Var.a = 0.0f;
                    ken0Var.b = 0.0f;
                    ken0Var.c = 0.0f;
                    ken0Var.d = 0.0f;
                } else {
                    kch0.d(fArrA, ken0Var);
                }
            }
            if (this.a1 && z) {
                long j2 = this.c;
                ken0Var.a(0.0f, 0.0f, (int) (j2 >> 32), (int) (j2 & 4294967295L));
            }
        }
    }

    public final boolean O1(long j) {
        if ((((9187343241974906880L ^ (j & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        mxq0 mxq0Var = this.v1;
        if (mxq0Var != null && this.a1) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
            be50 be50Var = ((ge50) mxq0Var).a;
            if (!(be50Var.A ? tto1.n(be50Var.e(), fIntBitsToFloat, fIntBitsToFloat2) : true)) {
                return false;
            }
        }
        return true;
    }

    public final long P0(ndo0 ndo0Var, long j, boolean z) {
        if (ndo0Var == this) {
            return j;
        }
        ndo0 ndo0Var2 = this.Y0;
        return (ndo0Var2 == null || u890.j(ndo0Var, ndo0Var2)) ? b1(j, z) : b1(ndo0Var2.P0(ndo0Var, j, z), z);
    }

    public final long Q0(long j) {
        float fY;
        float fX;
        if (h1()) {
            n511 n511Var = this.m1;
            fY = n511Var.c - n511Var.a;
        } else {
            fY = Y();
        }
        if (h1()) {
            n511 n511Var2 = this.m1;
            fX = n511Var2.d - n511Var2.b;
        } else {
            fX = X();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - fY;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L)) - fX;
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    @Override // p.elb0
    public final void R(elb0 elb0Var, float[] fArr) {
        ndo0 ndo0VarI1 = I1(elb0Var);
        ndo0VarI1.w1();
        ndo0 ndo0VarZ0 = Z0(ndo0VarI1);
        kch0.e(fArr);
        ndo0VarI1.L1(ndo0VarZ0, fArr);
        K1(ndo0VarZ0, fArr);
    }

    public final float T0(long j, long j2) {
        if (Y() >= Float.intBitsToFloat((int) (j2 >> 32)) && X() >= Float.intBitsToFloat((int) (j2 & 4294967295L))) {
            return Float.POSITIVE_INFINITY;
        }
        long jQ0 = Q0(j2);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ0 & 4294967295L));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (j >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat3 < 0.0f ? -fIntBitsToFloat3 : fIntBitsToFloat3 - Y());
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (j & 4294967295L));
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat4 < 0.0f ? -fIntBitsToFloat4 : fIntBitsToFloat4 - X()))) & 4294967295L);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L)) <= fIntBitsToFloat2) {
            return Offset.e(jFloatToRawIntBits);
        }
        return Float.POSITIVE_INFINITY;
    }

    @Override // p.wat
    public final float U0() {
        return this.U0.Z0.U0();
    }

    public final void V0(fid fidVar, be50 be50Var) throws Throwable {
        mxq0 mxq0Var = this.v1;
        if (mxq0Var == null) {
            long j = this.h1;
            float f = (int) (j >> 32);
            float f2 = (int) (j & 4294967295L);
            fidVar.h(f, f2);
            W0(fidVar, be50Var);
            fidVar.h(-f, -f2);
            return;
        }
        ge50 ge50Var = (ge50) mxq0Var;
        vid vidVar = ge50Var.Z;
        ge50Var.g();
        ge50Var.T0 = ge50Var.a.a.P() > 0.0f;
        cab cabVar = vidVar.b;
        cabVar.z(fidVar);
        cabVar.B(be50Var);
        m5n1.r(vidVar, ge50Var.a);
    }

    public final void W0(fid fidVar, be50 be50Var) throws Throwable {
        ndo0 ndo0Var;
        fid fidVar2;
        be50 be50Var2;
        pim0 pim0VarL1 = l1(4);
        if (pim0VarL1 == null) {
            C1(fidVar, be50Var);
            return;
        }
        hmb0 hmb0Var = this.U0;
        hmb0Var.getClass();
        jmb0 sharedDrawScope = ((ha4) kmb0.a(hmb0Var)).getSharedDrawScope();
        long jR = o0c.R(this.c);
        sharedDrawScope.getClass();
        bfn0 bfn0Var = null;
        while (pim0VarL1 != null) {
            if (pim0VarL1 instanceof m7v) {
                ndo0Var = this;
                fidVar2 = fidVar;
                be50Var2 = be50Var;
                sharedDrawScope.a(fidVar2, jR, ndo0Var, (m7v) pim0VarL1, be50Var2);
            } else {
                ndo0Var = this;
                fidVar2 = fidVar;
                be50Var2 = be50Var;
                if ((pim0VarL1.c & 4) != 0 && (pim0VarL1 instanceof l5t)) {
                    int i = 0;
                    for (pim0 pim0Var = ((l5t) pim0VarL1).P0; pim0Var != null; pim0Var = pim0Var.f) {
                        if ((pim0Var.c & 4) != 0) {
                            i++;
                            if (i == 1) {
                                pim0VarL1 = pim0Var;
                            } else {
                                if (bfn0Var == null) {
                                    bfn0Var = new bfn0(0, new pim0[16]);
                                }
                                if (pim0VarL1 != null) {
                                    bfn0Var.b(pim0VarL1);
                                    pim0VarL1 = null;
                                }
                                bfn0Var.b(pim0Var);
                            }
                        }
                    }
                    if (i == 1) {
                    }
                }
                fidVar = fidVar2;
                this = ndo0Var;
                be50Var = be50Var2;
            }
            pim0VarL1 = oap1.e(bfn0Var);
            fidVar = fidVar2;
            this = ndo0Var;
            be50Var = be50Var2;
        }
    }

    public abstract void Y0();

    public final ndo0 Z0(ndo0 ndo0Var) {
        hmb0 hmb0VarV = ndo0Var.U0;
        hmb0 hmb0Var = this.U0;
        if (hmb0VarV == hmb0Var) {
            pim0 pim0VarF1 = ndo0Var.f1();
            pim0 pim0VarF2 = f1();
            if (!pim0VarF2.a.N0) {
                qf80.c("visitLocalAncestors called on an unattached node");
            }
            for (pim0 pim0Var = pim0VarF2.a.e; pim0Var != null; pim0Var = pim0Var.e) {
                if ((pim0Var.c & 2) != 0 && pim0Var == pim0VarF1) {
                    return ndo0Var;
                }
            }
            return this;
        }
        while (hmb0VarV.Q0 > hmb0Var.Q0) {
            hmb0VarV = hmb0VarV.v();
            hmb0VarV.getClass();
        }
        hmb0 hmb0VarV2 = hmb0Var;
        while (hmb0VarV2.Q0 > hmb0VarV.Q0) {
            hmb0VarV2 = hmb0VarV2.v();
            hmb0VarV2.getClass();
        }
        while (hmb0VarV != hmb0VarV2) {
            hmb0VarV = hmb0VarV.v();
            hmb0VarV2 = hmb0VarV2.v();
            if (hmb0VarV == null || hmb0VarV2 == null) {
                hhg1.n("layouts are not part of the same hierarchy");
                return null;
            }
        }
        if (hmb0VarV2 != hmb0Var) {
            if (hmb0VarV != ndo0Var.U0) {
                return (sh80) hmb0VarV.e1.d;
            }
            return ndo0Var;
        }
        return this;
    }

    @Override // p.elb0
    public final boolean a() {
        return f1().N0;
    }

    @Override // p.elb0
    public final long b() {
        return this.c;
    }

    public final long b1(long j, boolean z) {
        if (z || !this.Y) {
            long j2 = this.h1;
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) - ((int) (j2 >> 32));
            j = (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) - ((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
        }
        mxq0 mxq0Var = this.v1;
        if (mxq0Var != null) {
            ge50 ge50Var = (ge50) mxq0Var;
            float[] fArrA = ge50Var.a();
            if (fArrA == null) {
                return 9187343241974906880L;
            }
            if (!ge50Var.S0) {
                return kch0.b(j, fArrA);
            }
        }
        return j;
    }

    public abstract z5f0 c1();

    public final long d1() {
        return this.c1.k1(this.U0.b1.e());
    }

    @Override // p.elb0
    public final long f(long j) {
        if (!f1().N0) {
            qf80.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        elb0 elb0VarV = nho1.v(this);
        ha4 ha4Var = (ha4) kmb0.a(this.U0);
        ha4Var.C();
        return q(elb0VarV, Offset.f(kch0.b(j, ha4Var.z1), nho1.B(elb0VarV)), true);
    }

    @Override // p.q5t0
    public abstract void f0(long j, float f, be50 be50Var);

    public abstract pim0 f1();

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v5 */
    @Override // p.q5t0, p.afh0
    public final Object g() {
        hmb0 hmb0Var = this.U0;
        if (!hmb0Var.e1.k(64)) {
            return null;
        }
        f1();
        Object objE = null;
        for (pim0 pim0Var = (gpd1) hmb0Var.e1.f; pim0Var != null; pim0Var = pim0Var.e) {
            if ((pim0Var.c & 64) != 0) {
                ?? E = pim0Var;
                ?? bfn0Var = 0;
                while (E != 0) {
                    if (E instanceof csr0) {
                        objE = ((csr0) E).e(hmb0Var.Z0, objE);
                    } else if ((E.c & 64) != 0 && (E instanceof l5t)) {
                        pim0 pim0Var2 = ((l5t) E).P0;
                        int i = 0;
                        E = E;
                        bfn0Var = bfn0Var;
                        while (pim0Var2 != null) {
                            if ((pim0Var2.c & 64) != 0) {
                                i++;
                                if (i == 1) {
                                    bfn0Var = bfn0Var;
                                    E = pim0Var2;
                                } else {
                                    if (bfn0Var == 0) {
                                        bfn0Var = new bfn0(0, new pim0[16]);
                                    }
                                    if (E != 0) {
                                        bfn0Var.b(E);
                                        E = 0;
                                    }
                                    bfn0Var.b(pim0Var2);
                                }
                            }
                            pim0Var2 = pim0Var2.f;
                            E = E;
                            bfn0Var = bfn0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    E = oap1.e((bfn0) bfn0Var);
                }
            }
        }
        return objE;
    }

    @Override // p.p890
    public final flb0 getLayoutDirection() {
        return this.U0.a1;
    }

    @Override // p.wat
    public final float h() {
        return this.U0.Z0.h();
    }

    public final boolean h1() {
        return this.o1 && !this.m1.k();
    }

    @Override // p.elb0
    public final long l(long j) {
        if (!f1().N0) {
            qf80.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return q(nho1.v(this), ((ha4) kmb0.a(this.U0)).I(j), true);
    }

    public final pim0 l1(int i) {
        boolean zG = odo0.g(i);
        pim0 pim0VarF1 = f1();
        if (!zG && (pim0VarF1 = pim0VarF1.e) == null) {
            return null;
        }
        for (pim0 pim0VarM1 = m1(zG); pim0VarM1 != null && (pim0VarM1.d & i) != 0; pim0VarM1 = pim0VarM1.f) {
            if ((pim0VarM1.c & i) != 0) {
                return pim0VarM1;
            }
            if (pim0VarM1 == pim0VarF1) {
                return null;
            }
        }
        return null;
    }

    public final pim0 m1(boolean z) {
        pim0 pim0VarF1;
        jdo0 jdo0Var = this.U0.e1;
        if (((ndo0) jdo0Var.e) == this) {
            return (pim0) jdo0Var.g;
        }
        ndo0 ndo0Var = this.Y0;
        if (!z) {
            if (ndo0Var != null) {
                return ndo0Var.f1();
            }
            return null;
        }
        if (ndo0Var == null || (pim0VarF1 = ndo0Var.f1()) == null) {
            return null;
        }
        return pim0VarF1.f;
    }

    public final void n1(pim0 pim0Var, mdo0 mdo0Var, long j, gk60 gk60Var, int i, boolean z) {
        if (pim0Var == null) {
            t1(mdo0Var, j, gk60Var, i, z);
            return;
        }
        if (!mdo0Var.k(pim0Var)) {
            n1(f6o1.i(pim0Var, mdo0Var.b()), mdo0Var, j, gk60Var, i, z);
            return;
        }
        int i2 = gk60Var.c;
        wdn0 wdn0Var = gk60Var.a;
        gk60Var.c(i2 + 1, wdn0Var.b);
        gk60Var.c++;
        wdn0Var.b(pim0Var);
        gk60Var.b.a(ila0.a(-1.0f, z, false));
        n1(f6o1.i(pim0Var, mdo0Var.b()), mdo0Var, j, gk60Var, i, z);
        gk60Var.c = i2;
    }

    @Override // p.elb0
    public final long p(long j) {
        long jO = O(j);
        ha4 ha4Var = (ha4) kmb0.a(this.U0);
        ha4Var.C();
        return kch0.b(jO, ha4Var.y1);
    }

    @Override // p.elb0
    public final long q(elb0 elb0Var, long j, boolean z) {
        if (elb0Var instanceof a6f0) {
            a6f0 a6f0Var = (a6f0) elb0Var;
            a6f0Var.a.Q0().w1();
            return a6f0Var.q(this, j ^ (-9223372034707292160L), z) ^ (-9223372034707292160L);
        }
        ndo0 ndo0VarI1 = I1(elb0Var);
        ndo0VarI1.w1();
        ndo0 ndo0VarZ0 = Z0(ndo0VarI1);
        while (ndo0VarI1 != ndo0VarZ0) {
            mxq0 mxq0Var = ndo0VarI1.v1;
            if (mxq0Var != null) {
                ge50 ge50Var = (ge50) mxq0Var;
                float[] fArrB = ge50Var.b();
                if (!ge50Var.S0) {
                    j = kch0.b(j, fArrB);
                }
            }
            if (z || !ndo0VarI1.Y) {
                j = dm5.X(j, ndo0VarI1.h1);
            }
            ndo0VarI1 = ndo0VarI1.Y0;
            ndo0VarI1.getClass();
        }
        return P0(ndo0VarZ0, j, z);
    }

    public final void q1(pim0 pim0Var, mdo0 mdo0Var, long j, gk60 gk60Var, int i, boolean z, float f) {
        if (pim0Var == null) {
            t1(mdo0Var, j, gk60Var, i, z);
            return;
        }
        if (!mdo0Var.k(pim0Var)) {
            q1(f6o1.i(pim0Var, mdo0Var.b()), mdo0Var, j, gk60Var, i, z, f);
            return;
        }
        int i2 = gk60Var.c;
        wdn0 wdn0Var = gk60Var.a;
        gk60Var.c(i2 + 1, wdn0Var.b);
        gk60Var.c++;
        wdn0Var.b(pim0Var);
        gk60Var.b.a(ila0.a(f, z, false));
        B1(f6o1.i(pim0Var, mdo0Var.b()), mdo0Var, j, gk60Var, i, z, f, true);
        gk60Var.c = i2;
    }

    public final void r1(mdo0 mdo0Var, long j, gk60 gk60Var, int i, boolean z) {
        boolean z2;
        boolean z3;
        pim0 pim0VarL1 = l1(mdo0Var.b());
        if (!O1(j)) {
            if (rav0.b(i, 1)) {
                float fT0 = T0(j, d1());
                if ((Float.floatToRawIntBits(fT0) & Integer.MAX_VALUE) < 2139095040) {
                    if (gk60Var.c != p7h.L(gk60Var)) {
                        if (x760.r(gk60Var.b(), ila0.a(fT0, false, false)) <= 0) {
                            return;
                        }
                    }
                    q1(pim0VarL1, mdo0Var, j, gk60Var, i, false, fT0);
                    return;
                }
                return;
            }
            return;
        }
        if (pim0VarL1 == null) {
            t1(mdo0Var, j, gk60Var, i, z);
            return;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j & 4294967295L));
        if (fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < Y() && fIntBitsToFloat2 < X()) {
            n1(pim0VarL1, mdo0Var, j, gk60Var, i, z);
            return;
        }
        float fT1 = !rav0.b(i, 1) ? Float.POSITIVE_INFINITY : T0(j, d1());
        if ((Float.floatToRawIntBits(fT1) & Integer.MAX_VALUE) < 2139095040) {
            if (gk60Var.c != p7h.L(gk60Var)) {
                z2 = z;
                if (x760.r(gk60Var.b(), ila0.a(fT1, z2, false)) > 0) {
                }
                B1(pim0VarL1, mdo0Var, j, gk60Var, i, z2, fT1, z3);
            }
            z2 = z;
            z3 = true;
            B1(pim0VarL1, mdo0Var, j, gk60Var, i, z2, fT1, z3);
        }
        z2 = z;
        z3 = false;
        B1(pim0VarL1, mdo0Var, j, gk60Var, i, z2, fT1, z3);
    }

    @Override // p.x5f0
    public final x5f0 t0() {
        return this.X0;
    }

    public void t1(mdo0 mdo0Var, long j, gk60 gk60Var, int i, boolean z) {
        ndo0 ndo0Var = this.X0;
        if (ndo0Var != null) {
            ndo0Var.r1(mdo0Var, ndo0Var.b1(j, true), gk60Var, i, z);
        }
    }

    @Override // p.elb0
    public final void u(float[] fArr) {
        oxq0 oxq0VarA = kmb0.a(this.U0);
        ndo0 ndo0VarI1 = I1(nho1.v(this));
        L1(ndo0VarI1, fArr);
        if (oxq0VarA instanceof lch0) {
            ((ha4) ((lch0) oxq0VarA)).r(fArr);
            return;
        }
        long jD = nho1.D(ndo0VarI1);
        if ((9223372034707292159L & jD) != 9205357640488583168L) {
            kch0.k(Float.intBitsToFloat((int) (jD >> 32)), Float.intBitsToFloat((int) (jD & 4294967295L)), fArr);
        }
    }

    public final void u1() {
        mxq0 mxq0Var = this.v1;
        if (mxq0Var != null) {
            ((ge50) mxq0Var).c();
            return;
        }
        ndo0 ndo0Var = this.Y0;
        if (ndo0Var != null) {
            ndo0Var.u1();
        }
    }

    public final boolean v1() {
        if (this.v1 != null && this.e1 <= 0.0f) {
            return true;
        }
        ndo0 ndo0Var = this.Y0;
        if (ndo0Var != null) {
            return ndo0Var.v1();
        }
        return false;
    }

    public final void w1() {
        this.U0.f1.b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r8v7, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public final void x1() {
        pim0 pim0VarF1;
        boolean zG = odo0.g(128);
        pim0 pim0VarM1 = m1(zG);
        if (pim0VarM1 == null || !oap1.m(pim0VarM1, 128)) {
            return;
        }
        jv91 jv91VarO = ekb.o();
        iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
        jv91 jv91VarU = ekb.u(jv91VarO);
        try {
            if (!zG) {
                pim0VarF1 = f1().e;
                if (pim0VarF1 == null) {
                }
                ekb.C(jv91VarO, jv91VarU, iu30VarE);
            }
            pim0VarF1 = f1();
            for (pim0 pim0VarM2 = m1(zG); pim0VarM2 != null && (pim0VarM2.d & 128) != 0; pim0VarM2 = pim0VarM2.f) {
                if ((pim0VarM2.c & 128) != 0) {
                    ?? E = pim0VarM2;
                    ?? bfn0Var = 0;
                    while (E != 0) {
                        if (E instanceof ofh0) {
                            ((ofh0) E).f(this.c);
                        } else if ((E.c & 128) != 0 && (E instanceof l5t)) {
                            pim0 pim0Var = ((l5t) E).P0;
                            int i = 0;
                            while (pim0Var != null) {
                                if ((pim0Var.c & 128) != 0) {
                                    i++;
                                    if (i == 1) {
                                        E = E;
                                        bfn0Var = bfn0Var;
                                        bfn0Var = bfn0Var;
                                        E = pim0Var;
                                    } else {
                                        if (bfn0Var == 0) {
                                            bfn0Var = new bfn0(0, new pim0[16]);
                                        }
                                        if (E != 0) {
                                            bfn0Var.b(E);
                                            E = 0;
                                        }
                                        bfn0Var.b(pim0Var);
                                    }
                                } else {
                                    E = E;
                                    bfn0Var = bfn0Var;
                                }
                                pim0Var = pim0Var.f;
                                E = E;
                                bfn0Var = bfn0Var;
                            }
                            if (i == 1) {
                                E = E;
                                bfn0Var = bfn0Var;
                            } else {
                                E = E;
                                bfn0Var = bfn0Var;
                            }
                        }
                        E = oap1.e((bfn0) bfn0Var);
                    }
                }
                if (pim0VarM2 == pim0VarF1) {
                    break;
                }
            }
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
        } catch (Throwable th) {
            ekb.C(jv91VarO, jv91VarU, iu30VarE);
            throw th;
        }
    }

    @Override // p.x5f0
    public final boolean y0() {
        return this.f1 != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [p.pim0] */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [p.bfn0] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void y1() {
        boolean zG = odo0.g(4194304);
        pim0 pim0VarF1 = f1();
        if (!zG && (pim0VarF1 = pim0VarF1.e) == null) {
            return;
        }
        for (pim0 pim0VarM1 = m1(zG); pim0VarM1 != null && (pim0VarM1.d & 4194304) != 0; pim0VarM1 = pim0VarM1.f) {
            if ((pim0VarM1.c & 4194304) != 0) {
                ?? E = pim0VarM1;
                ?? bfn0Var = 0;
                while (E != 0) {
                    if (E instanceof zkb0) {
                        ((zkb0) E).d1(this);
                    } else if ((E.c & 4194304) != 0 && (E instanceof l5t)) {
                        pim0 pim0Var = ((l5t) E).P0;
                        int i = 0;
                        E = E;
                        bfn0Var = bfn0Var;
                        while (pim0Var != null) {
                            if ((pim0Var.c & 4194304) != 0) {
                                i++;
                                if (i == 1) {
                                    bfn0Var = bfn0Var;
                                    E = pim0Var;
                                } else {
                                    if (bfn0Var == 0) {
                                        bfn0Var = new bfn0(0, new pim0[16]);
                                    }
                                    if (E != 0) {
                                        bfn0Var.b(E);
                                        E = 0;
                                    }
                                    bfn0Var.b(pim0Var);
                                }
                            }
                            pim0Var = pim0Var.f;
                            E = E;
                            bfn0Var = bfn0Var;
                        }
                        if (i == 1) {
                        }
                    }
                    E = oap1.e((bfn0) bfn0Var);
                }
            }
            if (pim0VarM1 == pim0VarF1) {
                return;
            }
        }
    }

    @Override // p.x5f0
    public final hmb0 z0() {
        return this.U0;
    }

    public final void z1() {
        this.Z0 = true;
        this.t1.invoke();
        F1();
        if (qr80.b(this.h1, 0L)) {
            return;
        }
        this.U0.O(this);
    }

    @Override // p.x5f0
    public final elb0 x0() {
        return this;
    }
}
