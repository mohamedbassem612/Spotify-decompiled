package p;

import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class x5f0 extends q5t0 implements fnm0, txq0, ifh0 {
    public static final pv40 S0 = new pv40((byte) 28);
    public static final pv40 T0 = new pv40((byte) 29);
    public boolean N0;
    public boolean O0;
    public final y5f0 P0 = new y5f0(this);
    public v170 Q0;
    public nen0 R0;
    public nen0 X;
    public boolean Y;
    public nen0 Z;
    public v5f0 f;
    public iu30 g;
    public vu30 h;
    public iu30 i;
    public s5t0 t;

    public static void I0(ndo0 ndo0Var) {
        imb0 imb0Var;
        ndo0 ndo0Var2 = ndo0Var.X0;
        hmb0 hmb0Var = ndo0Var.U0;
        if (!u890.j(ndo0Var2 != null ? ndo0Var2.U0 : null, hmb0Var)) {
            hmb0Var.f1.f68p.X0.j();
            return;
        }
        bm3 bm3VarE = hmb0Var.f1.f68p.e();
        if (bm3VarE == null || (imb0Var = ((ffh0) bm3VarE).X0) == null) {
            return;
        }
        imb0Var.j();
    }

    public abstract hfh0 A0();

    @Override // p.ifh0
    public final hfh0 B(int i, int i2, Map map, iu30 iu30Var, iu30 iu30Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            qf80.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new w5f0(i, i2, map, iu30Var, iu30Var2, this);
    }

    public boolean B0() {
        return z0().I();
    }

    public abstract x5f0 D0();

    public abstract long E0();

    public final v5f0 G0() {
        v5f0 v5f0Var = this.f;
        if (v5f0Var != null) {
            return v5f0Var;
        }
        v5f0 v5f0Var2 = new v5f0(this);
        this.f = v5f0Var2;
        return v5f0Var2;
    }

    public final void J0(oen0 oen0Var) {
        hmb0 hmb0Var;
        Object[] objArr = oen0Var.b;
        long[] jArr = oen0Var.a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i = 0;
        while (true) {
            long j = jArr[i];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i2 = 8 - ((~(i - length)) >>> 31);
                for (int i3 = 0; i3 < i2; i3++) {
                    if ((255 & j) < 128 && (hmb0Var = (hmb0) ((egl1) objArr[(i << 3) + i3]).get()) != null) {
                        if (W()) {
                            hmb0Var.T(false);
                        } else {
                            hmb0Var.V(false);
                        }
                    }
                    j >>= 8;
                }
                if (i2 != 8) {
                    return;
                }
            }
            if (i == length) {
                return;
            } else {
                i++;
            }
        }
    }

    public abstract void K0();

    /* JADX WARN: Code duplicated, block: B:23:0x0068 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:24:0x006a A[LOOP:1: B:14:0x0033->B:24:0x006a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:29:0x006d A[EDGE_INSN: B:29:0x006d->B:25:0x006d BREAK  A[LOOP:1: B:14:0x0033->B:24:0x006a], SYNTHETIC] */
    public final void L0() {
        v170 v170Var = this.Q0;
        if (v170Var != null) {
            int i = v170Var.a;
            for (int i2 = 0; i2 < i; i2++) {
                ((zy31[]) v170Var.b)[i2] = null;
                ((float[]) v170Var.c)[i2] = Float.NaN;
                ((byte[]) v170Var.d)[i2] = 0;
            }
            v170Var.a = 0;
        }
        nen0 nen0Var = this.R0;
        if (nen0Var == null) {
            return;
        }
        Object[] objArr = nen0Var.c;
        long[] jArr = nen0Var.a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i3 = 0;
            while (true) {
                long j = jArr[i3];
                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i3 != length) {
                        break;
                        break;
                    }
                    i3++;
                } else {
                    int i4 = 8 - ((~(i3 - length)) >>> 31);
                    for (int i5 = 0; i5 < i4; i5++) {
                        if ((255 & j) < 128) {
                            J0((oen0) objArr[(i3 << 3) + i5]);
                        }
                        j >>= 8;
                    }
                    if (i4 != 8) {
                        break;
                    } else if (i3 != length) {
                        break;
                    } else {
                        i3++;
                    }
                }
            }
        }
        nen0Var.a();
    }

    @Override // p.q5t0
    public final int U(ul3 ul3Var) {
        int iO0;
        if (!y0() || (iO0 = o0(ul3Var)) == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        boolean z = ul3Var instanceof k5j1;
        long j = this.e;
        return iO0 + ((int) (z ? j >> 32 : 4294967295L & j));
    }

    @Override // p.p890
    public boolean W() {
        return false;
    }

    @Override // p.fnm0
    public final void i(boolean z) {
        x5f0 x5f0VarD0 = D0();
        hmb0 hmb0VarZ0 = x5f0VarD0 != null ? x5f0VarD0.z0() : null;
        if (u890.j(hmb0VarZ0, z0())) {
            this.Y = z;
            return;
        }
        if ((hmb0VarZ0 != null ? hmb0VarZ0.f1.d : 0) != 3) {
            if ((hmb0VarZ0 != null ? hmb0VarZ0.f1.d : 0) != 4) {
                return;
            }
        }
        this.Y = z;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0108  */
    public final void l0(hmb0 hmb0Var, zy31 zy31Var) {
        char c;
        long j;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        long j4;
        int i;
        char c2;
        long j5;
        long j6;
        int i2;
        int i3;
        int i4;
        nen0 nen0Var = this.R0;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i5 = 8;
        if (nen0Var != null) {
            Object[] objArr = nen0Var.c;
            long[] jArr3 = nen0Var.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i6 = 0;
                long j8 = 128;
                while (true) {
                    long j9 = jArr3[i6];
                    j2 = 255;
                    if ((((~j9) << c3) & j9 & j7) != j7) {
                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                        int i8 = 0;
                        while (i8 < i7) {
                            if ((j9 & 255) < j8) {
                                c2 = c3;
                                oen0 oen0Var = (oen0) objArr[(i6 << 3) + i8];
                                j5 = j7;
                                Object[] objArr2 = oen0Var.b;
                                long[] jArr4 = oen0Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j6 = j8;
                                    int i9 = 0;
                                    int i10 = i5;
                                    while (true) {
                                        int i11 = length2;
                                        long j10 = jArr4[i9];
                                        jArr2 = jArr3;
                                        j4 = j9;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i12 = 8 - ((~(i9 - i11)) >>> 31);
                                            int i13 = 0;
                                            while (i13 < i12) {
                                                if ((j10 & 255) < j6) {
                                                    int i14 = (i9 << 3) + i13;
                                                    hmb0 hmb0Var2 = (hmb0) ((egl1) objArr2[i14]).get();
                                                    i3 = i13;
                                                    if (hmb0Var2 != null) {
                                                        boolean zI = hmb0Var2.I();
                                                        i4 = i8;
                                                        if (zI) {
                                                        }
                                                    } else {
                                                        i4 = i8;
                                                    }
                                                    oen0Var.m(i14);
                                                } else {
                                                    i3 = i13;
                                                    i4 = i8;
                                                }
                                                j10 >>= i10;
                                                i13 = i3 + 1;
                                                i8 = i4;
                                            }
                                            i = i8;
                                            if (i12 != i10) {
                                                break;
                                            }
                                        } else {
                                            i = i8;
                                        }
                                        length2 = i11;
                                        if (i9 == length2) {
                                            break;
                                        }
                                        i9++;
                                        jArr3 = jArr2;
                                        j9 = j4;
                                        i8 = i;
                                        i10 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    j4 = j9;
                                    i = i8;
                                    j6 = j8;
                                }
                                i2 = 8;
                            } else {
                                jArr2 = jArr3;
                                j4 = j9;
                                i = i8;
                                c2 = c3;
                                j5 = j7;
                                j6 = j8;
                                i2 = i5;
                            }
                            i5 = i2;
                            j9 = j4 >> i2;
                            c3 = c2;
                            j7 = j5;
                            j8 = j6;
                            i8 = i + 1;
                            jArr3 = jArr2;
                        }
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                        if (i7 != i5) {
                            break;
                        }
                    } else {
                        jArr = jArr3;
                        c = c3;
                        j = j7;
                        j3 = j8;
                    }
                    if (i6 == length) {
                        break;
                    }
                    i6++;
                    c3 = c;
                    j7 = j;
                    j8 = j3;
                    jArr3 = jArr;
                    i5 = 8;
                }
            } else {
                c = 7;
                j = -9187201950435737472L;
                j2 = 255;
                j3 = 128;
            }
        } else {
            c = 7;
            j = -9187201950435737472L;
            j2 = 255;
            j3 = 128;
        }
        nen0 nen0Var2 = this.R0;
        if (nen0Var2 != null) {
            long[] jArr5 = nen0Var2.a;
            int length3 = jArr5.length - 2;
            if (length3 >= 0) {
                int i15 = 0;
                while (true) {
                    long j11 = jArr5[i15];
                    if ((((~j11) << c) & j11 & j) != j) {
                        int i16 = 8 - ((~(i15 - length3)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((j11 & j2) < j3) {
                                int i18 = (i15 << 3) + i17;
                                if (((oen0) nen0Var2.c[i18]).g()) {
                                    nen0Var2.l(i18);
                                }
                            }
                            j11 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                    }
                    if (i15 == length3) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        nen0 nen0Var3 = this.R0;
        if (nen0Var3 == null) {
            nen0Var3 = new nen0();
            this.R0 = nen0Var3;
        }
        Object objG = nen0Var3.g(zy31Var);
        if (objG == null) {
            objG = new oen0();
            nen0Var3.m(zy31Var, objG);
        }
        ((oen0) objG).j(new egl1(hmb0Var));
    }

    public abstract int o0(ul3 ul3Var);

    public final void r0(final s5t0 s5t0Var, final long j, final long j2) {
        boolean z;
        char c;
        long j3;
        long j4;
        long j5;
        hmb0 hmb0Var;
        boolean z2;
        int i;
        char c2;
        long j6;
        uxq0 snapshotObserver;
        nen0 nen0Var = this.R0;
        v170 v170Var = this.Q0;
        if (v170Var == null) {
            v170Var = new v170();
            this.Q0 = v170Var;
        }
        v170 v170Var2 = v170Var;
        oxq0 oxq0Var = z0().O0;
        if (oxq0Var != null && (snapshotObserver = ((ha4) oxq0Var).getSnapshotObserver()) != null) {
            snapshotObserver.a.d(s5t0Var, S0, new Function0() { // from class: p.u5f0
                public final Object invoke() {
                    x5f0 x5f0Var = this.a;
                    x5f0Var.G0().a = false;
                    x5f0Var.G0().b = j;
                    x5f0Var.G0().c = j2;
                    iu30 iu30VarE = s5t0Var.a.e();
                    if (iu30VarE != null) {
                        iu30VarE.invoke(x5f0Var.G0());
                    }
                    return rih1.a;
                }
            });
        }
        boolean zW = W();
        oen0 oen0Var = (oen0) v170Var2.e;
        oen0 oen0Var2 = (oen0) v170Var2.f;
        int i2 = v170Var2.a;
        for (int i3 = 0; i3 < i2; i3++) {
            byte b = ((byte[]) v170Var2.d)[i3];
            if (b == 3) {
                zy31 zy31Var = ((zy31[]) v170Var2.b)[i3];
                zy31Var.getClass();
                oen0Var2.j(zy31Var);
            } else if (b != 0 && nen0Var != null) {
                zy31 zy31Var2 = ((zy31[]) v170Var2.b)[i3];
                zy31Var2.getClass();
                oen0 oen0Var3 = (oen0) nen0Var.k(zy31Var2);
                if (oen0Var3 != null) {
                    oen0Var.k(oen0Var3);
                }
            }
        }
        int i4 = v170Var2.a;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte[] bArr = (byte[]) v170Var2.d;
            if (bArr[i6] == 2) {
                i5++;
            } else if (i5 > 0) {
                zy31[] zy31VarArr = (zy31[]) v170Var2.b;
                zy31VarArr[i6 - i5] = zy31VarArr[i6];
            }
            bArr[i6] = 2;
        }
        int i7 = v170Var2.a;
        for (int i8 = i7 - i5; i8 < i7; i8++) {
            ((zy31[]) v170Var2.b)[i8] = null;
        }
        v170Var2.a -= i5;
        x5f0 x5f0VarD0 = D0();
        Object[] objArr = oen0Var2.b;
        long[] jArr = oen0Var2.a;
        int length = jArr.length - 2;
        char c3 = 7;
        long j7 = -9187201950435737472L;
        int i9 = 8;
        if (length >= 0) {
            j4 = 128;
            int i10 = 0;
            while (true) {
                long j8 = jArr[i10];
                j5 = 255;
                if ((((~j8) << c3) & j8 & j7) != j7) {
                    int i11 = 8 - ((~(i10 - length)) >>> 31);
                    int i12 = 0;
                    while (i12 < i11) {
                        if ((j8 & 255) < 128) {
                            c2 = c3;
                            zy31 zy31Var3 = (zy31) objArr[(i10 << 3) + i12];
                            j6 = j7;
                            x5f0 x5f0Var = x5f0VarD0 == null ? this : x5f0VarD0;
                            i = i9;
                            x5f0 x5f0Var2 = x5f0Var;
                            while (true) {
                                v170 v170Var3 = x5f0Var2.Q0;
                                if (v170Var3 != null) {
                                    z2 = zW;
                                    if (f46.M((zy31[]) v170Var3.b, zy31Var3)) {
                                        break;
                                    } else {
                                        break;
                                    }
                                }
                                z2 = zW;
                                x5f0 x5f0VarD1 = x5f0Var2.D0();
                                if (x5f0VarD1 == null) {
                                    break;
                                }
                                x5f0Var2 = x5f0VarD1;
                                zW = z2;
                            }
                            nen0 nen0Var2 = x5f0Var2.R0;
                            oen0 oen0Var4 = nen0Var2 != null ? (oen0) nen0Var2.k(zy31Var3) : null;
                            if (oen0Var4 != null) {
                                x5f0Var.J0(oen0Var4);
                            }
                        } else {
                            z2 = zW;
                            i = i9;
                            c2 = c3;
                            j6 = j7;
                        }
                        j8 >>= i;
                        i12++;
                        c3 = c2;
                        j7 = j6;
                        i9 = i;
                        zW = z2;
                    }
                    z = zW;
                    c = c3;
                    j3 = j7;
                    if (i11 != i9) {
                        break;
                    }
                } else {
                    z = zW;
                    c = c3;
                    j3 = j7;
                }
                if (i10 == length) {
                    break;
                }
                i10++;
                c3 = c;
                j7 = j3;
                zW = z;
                i9 = 8;
            }
        } else {
            z = zW;
            c = 7;
            j3 = -9187201950435737472L;
            j4 = 128;
            j5 = 255;
        }
        oen0Var2.b();
        Object[] objArr2 = oen0Var.b;
        long[] jArr2 = oen0Var.a;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i13 = 0;
            while (true) {
                long j9 = jArr2[i13];
                if ((((~j9) << c) & j9 & j3) != j3) {
                    int i14 = 8 - ((~(i13 - length2)) >>> 31);
                    for (int i15 = 0; i15 < i14; i15++) {
                        if ((j9 & j5) < j4 && (hmb0Var = (hmb0) ((egl1) objArr2[(i13 << 3) + i15]).get()) != null) {
                            if (z) {
                                hmb0Var.T(false);
                            } else {
                                hmb0Var.V(false);
                            }
                        }
                        j9 >>= 8;
                    }
                    if (i14 != 8) {
                        break;
                    }
                }
                if (i13 == length2) {
                    break;
                } else {
                    i13++;
                }
            }
        }
        oen0Var.b();
    }

    /* JADX WARN: Code duplicated, block: B:125:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:126:0x0138 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x0119  */
    /* JADX WARN: Code duplicated, block: B:66:0x011d  */
    /* JADX WARN: Code duplicated, block: B:69:0x0124  */
    /* JADX WARN: Code duplicated, block: B:70:0x012b  */
    /* JADX WARN: Code duplicated, block: B:72:0x012e  */
    public final void s0(hfh0 hfh0Var) {
        long jB;
        char c;
        long j;
        long j2;
        v5f0 v5f0Var;
        nen0 nen0Var;
        long[] jArr;
        Object[] objArr;
        int i;
        long[] jArr2;
        Object[] objArr2;
        boolean z;
        v170 v170Var;
        nen0 nen0Var2;
        oen0 oen0Var;
        v5f0 v5f0Var2;
        char c2;
        if (this.O0) {
            return;
        }
        iu30 iu30VarE = hfh0Var.e();
        vu30 vu30VarD = hfh0Var.d();
        iu30 iu30VarB = hfh0Var.b();
        if (vu30VarD == null) {
            long jC0 = 9223372034707292159L;
            if (iu30VarE == null) {
                L0();
                this.g = null;
                this.h = null;
                this.i = null;
                v5f0 v5f0Var3 = this.f;
                if (v5f0Var3 != null) {
                    v5f0Var3.a = false;
                }
                if (v5f0Var3 != null) {
                    v5f0Var3.b = 9223372034707292159L;
                    return;
                }
                return;
            }
            this.h = null;
            this.i = null;
            boolean z2 = this.g != iu30VarE;
            if (z2 || !G0().a) {
                jB = 0;
            } else {
                elb0 elb0VarX0 = x0();
                jC0 = dm5.c0(nho1.D(elb0VarX0));
                jB = elb0VarX0.b();
                z2 = (qr80.b(jC0, G0().b) && yr80.b(jB, G0().c)) ? false : true;
            }
            long j3 = jB;
            if (z2) {
                s5t0 s5t0Var = this.t;
                if (s5t0Var != null) {
                    s5t0Var.a = hfh0Var;
                } else {
                    s5t0Var = new s5t0(hfh0Var, this, null);
                    this.t = s5t0Var;
                }
                r0(s5t0Var, jC0, j3);
                this.g = hfh0Var.e();
                return;
            }
            return;
        }
        if (vu30VarD != this.h || iu30VarB != this.i) {
            this.h = vu30VarD;
            this.i = iu30VarB;
            L0();
            return;
        }
        nen0 nen0Var3 = this.Z;
        char c3 = 7;
        int i2 = 8;
        if (nen0Var3 != null) {
            Object[] objArr3 = nen0Var3.c;
            long[] jArr3 = nen0Var3.a;
            int length = jArr3.length - 2;
            if (length >= 0) {
                int i3 = 0;
                v5f0Var2 = null;
                j = 128;
                while (true) {
                    long j4 = jArr3[i3];
                    j2 = 255;
                    if ((((~j4) << c3) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i4 = 8 - ((~(i3 - length)) >>> 31);
                        int i5 = 0;
                        while (i5 < i4) {
                            if ((j4 & 255) < 128) {
                                v5f0 v5f0Var4 = (v5f0) objArr3[(i3 << 3) + i5];
                                c2 = c3;
                                if (v5f0Var4.a) {
                                    v5f0Var2 = v5f0Var4;
                                }
                            } else {
                                c2 = c3;
                            }
                            j4 >>= 8;
                            i5++;
                            c3 = c2;
                        }
                        c = c3;
                        if (i4 != 8) {
                            break;
                        }
                    } else {
                        c = c3;
                    }
                    if (i3 == length) {
                        break;
                    }
                    i3++;
                    c3 = c;
                }
            } else {
                c = 7;
                j = 128;
                j2 = 255;
                v5f0Var2 = null;
            }
            v5f0Var = v5f0Var2;
        } else {
            c = 7;
            j = 128;
            j2 = 255;
            v5f0Var = null;
        }
        if (v5f0Var == null) {
            return;
        }
        elb0 elb0VarX1 = x0();
        long jC1 = dm5.c0(nho1.D(elb0VarX1));
        long jB2 = elb0VarX1.b();
        if ((qr80.b(jC1, v5f0Var.b) && yr80.b(jB2, v5f0Var.c)) || (nen0Var = this.Z) == null) {
            return;
        }
        Object[] objArr4 = nen0Var.b;
        Object[] objArr5 = nen0Var.c;
        long[] jArr4 = nen0Var.a;
        int length2 = jArr4.length - 2;
        if (length2 < 0) {
            return;
        }
        long j5 = -9187201950435737472L;
        int i6 = 0;
        while (true) {
            long j6 = jArr4[i6];
            int i7 = i2;
            int i8 = length2;
            if ((((~j6) << c) & j6 & j5) != j5) {
                int i9 = 8 - ((~(i6 - i8)) >>> 31);
                int i10 = 0;
                while (i10 < i9) {
                    if ((j6 & j2) < j) {
                        int i11 = (i6 << 3) + i10;
                        Object obj = objArr4[i11];
                        v5f0 v5f0Var5 = (v5f0) objArr5[i11];
                        zy31 zy31Var = (zy31) obj;
                        jArr2 = jArr4;
                        if (v5f0Var5.a) {
                            objArr2 = objArr4;
                            z = (yr80.b(v5f0Var5.c, jB2) && qr80.b(v5f0Var5.b, jC1)) ? false : true;
                            v5f0Var5.c = jB2;
                            v5f0Var5.b = jC1;
                            v5f0Var5.a = false;
                            if (!z) {
                                v170Var = this.Q0;
                                if (v170Var != null) {
                                    v170Var.a(zy31Var);
                                }
                                nen0Var2 = this.R0;
                                if (nen0Var2 != null) {
                                    oen0Var = (oen0) nen0Var2.g(zy31Var);
                                } else {
                                    oen0Var = null;
                                }
                                if (oen0Var != null) {
                                    J0(oen0Var);
                                    oen0Var.b();
                                }
                            }
                        } else {
                            objArr2 = objArr4;
                        }
                        v5f0Var5.c = jB2;
                        v5f0Var5.b = jC1;
                        v5f0Var5.a = false;
                        if (!z) {
                            v170Var = this.Q0;
                            if (v170Var != null) {
                                v170Var.a(zy31Var);
                            }
                            nen0Var2 = this.R0;
                            if (nen0Var2 != null) {
                                oen0Var = (oen0) nen0Var2.g(zy31Var);
                            } else {
                                oen0Var = null;
                            }
                            if (oen0Var != null) {
                                J0(oen0Var);
                                oen0Var.b();
                            }
                        }
                    } else {
                        jArr2 = jArr4;
                        objArr2 = objArr4;
                    }
                    j6 >>= i7;
                    i10++;
                    objArr4 = objArr2;
                    jArr4 = jArr2;
                }
                jArr = jArr4;
                objArr = objArr4;
                i = i7;
                if (i9 != i) {
                    return;
                }
            } else {
                jArr = jArr4;
                objArr = objArr4;
                i = i7;
            }
            length2 = i8;
            if (i6 == length2) {
                return;
            }
            i6++;
            i2 = i;
            objArr4 = objArr;
            jArr4 = jArr;
            j5 = -9187201950435737472L;
        }
    }

    public abstract x5f0 t0();

    public abstract elb0 x0();

    public abstract boolean y0();

    public abstract hmb0 z0();
}
