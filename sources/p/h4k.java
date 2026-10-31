package p;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class h4k implements i311, j3k {
    public nen0 N0;
    public boolean O0;
    public n181 P0;
    public nas0 Q0;
    public h4k R0;
    public int S0;
    public final oi T0;
    public final h72 U0;
    public final x340 V0;
    public byte W0;
    public final xce X;
    public final xce Y;
    public final nen0 Z;
    public final v3k a;
    public final j06 b;
    public final AtomicReference c = new AtomicReference(null);
    public final Object d = new Object();
    public final qen0 e;
    public final ze91 f;
    public final nen0 g;
    public final oen0 h;
    public final oen0 i;
    public final nen0 t;

    public h4k(v3k v3kVar, j06 j06Var) {
        this.a = v3kVar;
        this.b = j06Var;
        qen0 qen0Var = new qen0(new oen0());
        this.e = qen0Var;
        ze91 ze91Var = new ze91();
        if (v3kVar.e()) {
            ze91Var.X = new fdn0();
        }
        if (v3kVar.g()) {
            ze91Var.c();
        }
        this.f = ze91Var;
        this.g = dm5.C();
        this.h = new oen0();
        this.i = new oen0();
        this.t = dm5.C();
        xce xceVar = new xce();
        this.X = xceVar;
        xce xceVar2 = new xce();
        this.Y = xceVar2;
        this.Z = dm5.C();
        this.N0 = dm5.C();
        oi oiVar = new oi(v3kVar);
        this.T0 = oiVar;
        this.U0 = new h72();
        x340 x340Var = new x340(j06Var, v3kVar, bf91.a(ze91Var), qen0Var, xceVar, xceVar2, oiVar, this);
        v3kVar.t(x340Var);
        this.V0 = x340Var;
    }

    public final void A(vu30 vu30Var) {
        boolean zL = l();
        s();
        v3k v3kVar = this.a;
        if (!zL) {
            v3kVar.a(this, vu30Var);
            return;
        }
        x340 x340Var = this.V0;
        x340Var.z = 0;
        x340Var.y = true;
        v3kVar.a(this, vu30Var);
        if (x340Var.F || x340Var.z != 0) {
            bmv0.a("Cannot disable reuse from root if it was caused by other groups");
        }
        x340Var.z = -1;
        x340Var.y = false;
    }

    public final void a() {
        this.c.set(null);
        this.X.c.y();
        this.Y.c.y();
        yl61 yl61Var = this.e;
        if (yl61Var.isEmpty()) {
            return;
        }
        h72 h72Var = this.U0;
        try {
            h72Var.L(yl61Var, this.V0.F());
            h72Var.z();
        } finally {
            h72Var.q();
        }
    }

    @Override // p.i311
    public final void b() {
        this.O0 = true;
        this.T0.y();
    }

    public final void c(Object obj, boolean z) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z2 = objG instanceof oen0;
        oen0 oen0Var = this.h;
        oen0 oen0Var2 = this.i;
        nen0 nen0Var = this.Z;
        if (!z2) {
            h311 h311Var = (h311) objG;
            if (dm5.Z(nen0Var, obj, h311Var) || h311Var.c(obj) == 1) {
                return;
            }
            if (h311Var.g == null || z) {
                oen0Var.a(h311Var);
                return;
            } else {
                oen0Var2.a(h311Var);
                return;
            }
        }
        oen0 oen0Var3 = (oen0) objG;
        Object[] objArr = oen0Var3.b;
        long[] jArr = oen0Var3.a;
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
                    if ((255 & j) < 128) {
                        h311 h311Var2 = (h311) objArr[(i << 3) + i3];
                        if (!dm5.Z(nen0Var, obj, h311Var2) && h311Var2.c(obj) != 1) {
                            if (h311Var2.g == null || z) {
                                oen0Var.a(h311Var2);
                            } else {
                                oen0Var2.a(h311Var2);
                            }
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

    /* JADX WARN: Code duplicated, block: B:220:0x0122 A[EDGE_INSN: B:220:0x0122->B:215:0x0122 BREAK  A[LOOP:13: B:63:0x0151->B:74:0x0185], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x0183 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0185 A[LOOP:13: B:63:0x0151->B:74:0x0185, LOOP_END] */
    public final void d(Set set, boolean z) {
        long j;
        long j2;
        long j3;
        char c;
        long[] jArr;
        long[] jArr2;
        long j4;
        boolean zC;
        long[] jArr3;
        long j5;
        long[] jArr4;
        long[] jArr5;
        long j6;
        boolean zG;
        long[] jArr6;
        long j7;
        long[] jArr7;
        long[] jArr8;
        char c2;
        long j8;
        int i;
        int i2;
        boolean z2 = set instanceof jj41;
        nen0 nen0Var = this.t;
        Object obj = null;
        int i3 = 8;
        if (z2) {
            oen0 oen0Var = ((jj41) set).a;
            Object[] objArr = oen0Var.b;
            long[] jArr9 = oen0Var.a;
            int length = jArr9.length - 2;
            if (length >= 0) {
                int i4 = 0;
                j = 128;
                j2 = 255;
                while (true) {
                    long j9 = jArr9[i4];
                    char c3 = 7;
                    j3 = -9187201950435737472L;
                    if ((((~j9) << 7) & j9 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i5 = 8 - ((~(i4 - length)) >>> 31);
                        int i6 = 0;
                        while (i6 < i5) {
                            if ((j9 & 255) < 128) {
                                Object obj2 = objArr[(i4 << 3) + i6];
                                c2 = c3;
                                if (obj2 instanceof h311) {
                                    ((h311) obj2).c(obj);
                                } else {
                                    c(obj2, z);
                                    Object objG = nen0Var.g(obj2);
                                    if (objG != null) {
                                        if (objG instanceof oen0) {
                                            oen0 oen0Var2 = (oen0) objG;
                                            Object[] objArr2 = oen0Var2.b;
                                            long[] jArr10 = oen0Var2.a;
                                            int length2 = jArr10.length - 2;
                                            if (length2 >= 0) {
                                                int i7 = i3;
                                                i = length;
                                                int i8 = 0;
                                                while (true) {
                                                    long j10 = jArr10[i8];
                                                    j8 = j9;
                                                    long[] jArr11 = jArr10;
                                                    if ((((~j10) << c2) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                                                        int i9 = 8 - ((~(i8 - length2)) >>> 31);
                                                        int i10 = 0;
                                                        while (i10 < i9) {
                                                            if ((j10 & 255) < 128) {
                                                                c((mdt) objArr2[(i8 << 3) + i10], z);
                                                            }
                                                            j10 >>= i7;
                                                            i10++;
                                                            jArr9 = jArr9;
                                                        }
                                                        jArr8 = jArr9;
                                                        if (i9 != i7) {
                                                            break;
                                                        }
                                                    } else {
                                                        jArr8 = jArr9;
                                                    }
                                                    if (i8 == length2) {
                                                        break;
                                                    }
                                                    i8++;
                                                    jArr10 = jArr11;
                                                    j9 = j8;
                                                    jArr9 = jArr8;
                                                    i7 = 8;
                                                }
                                            }
                                        } else {
                                            jArr8 = jArr9;
                                            j8 = j9;
                                            i = length;
                                            c((mdt) objG, z);
                                        }
                                    }
                                    i2 = 8;
                                }
                                jArr8 = jArr9;
                                j8 = j9;
                                i = length;
                                i2 = 8;
                            } else {
                                jArr8 = jArr9;
                                c2 = c3;
                                j8 = j9;
                                i = length;
                                i2 = i3;
                            }
                            j9 = j8 >> i2;
                            i6++;
                            length = i;
                            i3 = i2;
                            c3 = c2;
                            jArr9 = jArr8;
                            obj = null;
                        }
                        jArr7 = jArr9;
                        c = c3;
                        int i11 = length;
                        if (i5 != i3) {
                            break;
                        } else {
                            length = i11;
                        }
                    } else {
                        jArr7 = jArr9;
                        c = 7;
                    }
                    if (i4 == length) {
                        break;
                    }
                    i4++;
                    jArr9 = jArr7;
                    obj = null;
                    i3 = 8;
                }
            } else {
                j = 128;
                j2 = 255;
                j3 = -9187201950435737472L;
                c = 7;
            }
        } else {
            j = 128;
            j2 = 255;
            j3 = -9187201950435737472L;
            c = 7;
            for (Object obj3 : set) {
                if (obj3 instanceof h311) {
                    ((h311) obj3).c(null);
                } else {
                    c(obj3, z);
                    Object objG2 = nen0Var.g(obj3);
                    if (objG2 != null) {
                        if (objG2 instanceof oen0) {
                            oen0 oen0Var3 = (oen0) objG2;
                            Object[] objArr3 = oen0Var3.b;
                            long[] jArr12 = oen0Var3.a;
                            int length3 = jArr12.length - 2;
                            if (length3 >= 0) {
                                int i12 = 0;
                                while (true) {
                                    long j11 = jArr12[i12];
                                    if ((((~j11) << 7) & j11 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i12 != length3) {
                                            break;
                                            break;
                                        }
                                        i12++;
                                    } else {
                                        int i13 = 8 - ((~(i12 - length3)) >>> 31);
                                        for (int i14 = 0; i14 < i13; i14++) {
                                            if ((j11 & 255) < 128) {
                                                c((mdt) objArr3[(i12 << 3) + i14], z);
                                            }
                                            j11 >>= 8;
                                        }
                                        if (i13 != 8) {
                                            break;
                                        } else if (i12 != length3) {
                                            break;
                                        } else {
                                            i12++;
                                        }
                                    }
                                }
                            }
                        } else {
                            c((mdt) objG2, z);
                        }
                    }
                }
            }
        }
        nen0 nen0Var2 = this.g;
        oen0 oen0Var4 = this.h;
        if (z) {
            oen0 oen0Var5 = this.i;
            if (oen0Var5.h()) {
                long[] jArr13 = nen0Var2.a;
                int length4 = jArr13.length - 2;
                if (length4 >= 0) {
                    int i15 = 0;
                    while (true) {
                        long j12 = jArr13[i15];
                        if ((((~j12) << c) & j12 & j3) != j3) {
                            int i16 = 8 - ((~(i15 - length4)) >>> 31);
                            int i17 = 0;
                            while (i17 < i16) {
                                if ((j12 & j2) < j) {
                                    int i18 = (i15 << 3) + i17;
                                    Object obj4 = nen0Var2.b[i18];
                                    Object obj5 = nen0Var2.c[i18];
                                    if (obj5 instanceof oen0) {
                                        oen0 oen0Var6 = (oen0) obj5;
                                        Object[] objArr4 = oen0Var6.b;
                                        long[] jArr14 = oen0Var6.a;
                                        int length5 = jArr14.length - 2;
                                        if (length5 >= 0) {
                                            j6 = j12;
                                            int i19 = 0;
                                            while (true) {
                                                long j13 = jArr14[i19];
                                                Object[] objArr5 = objArr4;
                                                long[] jArr15 = jArr14;
                                                if ((((~j13) << c) & j13 & j3) != j3) {
                                                    int i20 = 8 - ((~(i19 - length5)) >>> 31);
                                                    int i21 = 0;
                                                    while (i21 < i20) {
                                                        if ((j13 & j2) < j) {
                                                            jArr6 = jArr13;
                                                            int i22 = (i19 << 3) + i21;
                                                            j7 = j13;
                                                            h311 h311Var = (h311) objArr5[i22];
                                                            if (oen0Var5.c(h311Var) || oen0Var4.c(h311Var)) {
                                                                oen0Var6.m(i22);
                                                            }
                                                        } else {
                                                            jArr6 = jArr13;
                                                            j7 = j13;
                                                        }
                                                        j13 = j7 >> 8;
                                                        i21++;
                                                        jArr13 = jArr6;
                                                    }
                                                    jArr5 = jArr13;
                                                    if (i20 != 8) {
                                                        break;
                                                    }
                                                } else {
                                                    jArr5 = jArr13;
                                                }
                                                if (i19 == length5) {
                                                    break;
                                                }
                                                i19++;
                                                objArr4 = objArr5;
                                                jArr14 = jArr15;
                                                jArr13 = jArr5;
                                            }
                                        } else {
                                            jArr5 = jArr13;
                                            j6 = j12;
                                        }
                                        zG = oen0Var6.g();
                                    } else {
                                        jArr5 = jArr13;
                                        j6 = j12;
                                        h311 h311Var2 = (h311) obj5;
                                        zG = oen0Var5.c(h311Var2) || oen0Var4.c(h311Var2);
                                    }
                                    if (zG) {
                                        nen0Var2.l(i18);
                                    }
                                } else {
                                    jArr5 = jArr13;
                                    j6 = j12;
                                }
                                j12 = j6 >> 8;
                                i17++;
                                jArr13 = jArr5;
                            }
                            jArr4 = jArr13;
                            if (i16 != 8) {
                                break;
                            }
                        } else {
                            jArr4 = jArr13;
                        }
                        if (i15 == length4) {
                            break;
                        }
                        i15++;
                        jArr13 = jArr4;
                    }
                }
                oen0Var5.b();
                k();
                return;
            }
        }
        if (oen0Var4.h()) {
            long[] jArr16 = nen0Var2.a;
            int length6 = jArr16.length - 2;
            if (length6 >= 0) {
                int i23 = 0;
                while (true) {
                    long j14 = jArr16[i23];
                    if ((((~j14) << c) & j14 & j3) != j3) {
                        int i24 = 8 - ((~(i23 - length6)) >>> 31);
                        int i25 = 0;
                        while (i25 < i24) {
                            if ((j14 & j2) < j) {
                                int i26 = (i23 << 3) + i25;
                                Object obj6 = nen0Var2.b[i26];
                                Object obj7 = nen0Var2.c[i26];
                                if (obj7 instanceof oen0) {
                                    oen0 oen0Var7 = (oen0) obj7;
                                    Object[] objArr6 = oen0Var7.b;
                                    long[] jArr17 = oen0Var7.a;
                                    int length7 = jArr17.length - 2;
                                    if (length7 >= 0) {
                                        j4 = j14;
                                        int i27 = 0;
                                        while (true) {
                                            long j15 = jArr17[i27];
                                            Object[] objArr7 = objArr6;
                                            long[] jArr18 = jArr17;
                                            if ((((~j15) << c) & j15 & j3) != j3) {
                                                int i28 = 8 - ((~(i27 - length7)) >>> 31);
                                                int i29 = 0;
                                                while (i29 < i28) {
                                                    if ((j15 & j2) < j) {
                                                        jArr3 = jArr16;
                                                        int i30 = (i27 << 3) + i29;
                                                        j5 = j15;
                                                        if (oen0Var4.c((h311) objArr7[i30])) {
                                                            oen0Var7.m(i30);
                                                        }
                                                    } else {
                                                        jArr3 = jArr16;
                                                        j5 = j15;
                                                    }
                                                    j15 = j5 >> 8;
                                                    i29++;
                                                    jArr16 = jArr3;
                                                }
                                                jArr2 = jArr16;
                                                if (i28 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr16;
                                            }
                                            if (i27 == length7) {
                                                break;
                                            }
                                            i27++;
                                            objArr6 = objArr7;
                                            jArr17 = jArr18;
                                            jArr16 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr16;
                                        j4 = j14;
                                    }
                                    zC = oen0Var7.g();
                                } else {
                                    jArr2 = jArr16;
                                    j4 = j14;
                                    zC = oen0Var4.c((h311) obj7);
                                }
                                if (zC) {
                                    nen0Var2.l(i26);
                                }
                            } else {
                                jArr2 = jArr16;
                                j4 = j14;
                            }
                            j14 = j4 >> 8;
                            i25++;
                            jArr16 = jArr2;
                        }
                        jArr = jArr16;
                        if (i24 != 8) {
                            break;
                        }
                    } else {
                        jArr = jArr16;
                    }
                    if (i23 == length6) {
                        break;
                    }
                    i23++;
                    jArr16 = jArr;
                }
            }
            k();
            oen0Var4.b();
        }
    }

    @Override // p.j3k
    public final void dispose() {
        synchronized (this.d) {
            try {
                if (this.V0.F) {
                    bmv0.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.W0 != 3) {
                    this.W0 = (byte) 3;
                    xce xceVar = this.V0.L;
                    if (xceVar != null) {
                        h(xceVar);
                    }
                    boolean z = this.f.b == 0;
                    if (!z || !this.e.isEmpty()) {
                        h72 h72Var = this.U0;
                        try {
                            h72Var.L(this.e, this.V0.F());
                            if (!z) {
                                this.b.getClass();
                                ze91 ze91Var = this.f;
                                h72 h72Var2 = this.U0;
                                hf91 hf91VarI = ze91Var.i();
                                try {
                                    hf91VarI.m(hf91VarI.t, new w9(h72Var2, (byte) 4));
                                    hf91VarI.I();
                                    hf91VarI.e(true);
                                    this.b.clear();
                                    this.b.f();
                                    h72Var.A();
                                } catch (Throwable th) {
                                    hf91VarI.e(false);
                                    throw th;
                                }
                            }
                            h72Var.z();
                            h72Var.q();
                        } catch (Throwable th2) {
                            h72Var.q();
                            throw th2;
                        }
                    }
                    this.Z.a();
                    x340 x340Var = this.V0;
                    x340Var.getClass();
                    hr80.l("Compose:Composer.dispose");
                    try {
                        x340Var.b.y(x340Var);
                        x340Var.E.clear();
                        x340Var.s.clear();
                        x340Var.e.c.y();
                        x340Var.v = null;
                        x340Var.a.clear();
                        hr80.m();
                    } catch (Throwable th3) {
                        hr80.m();
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        this.a.z(this);
    }

    public final void e() {
        synchronized (this.d) {
            try {
                h(this.X);
                q();
            } catch (Throwable th) {
                try {
                    if (!this.e.isEmpty()) {
                        h72 h72Var = this.U0;
                        try {
                            h72Var.L(this.e, this.V0.F());
                            h72Var.z();
                        } finally {
                            h72Var.q();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:44:0x00c3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x00c5 A[LOOP:0: B:30:0x0077->B:45:0x00c5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x00c8 A[EDGE_INSN: B:52:0x00c8->B:46:0x00c8 BREAK  A[LOOP:0: B:30:0x0077->B:45:0x00c5], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x001c  */
    @Override // p.i311
    public final void f(Object obj) {
        h311 h311VarD;
        int i;
        boolean z;
        x340 x340Var = this.V0;
        if (x340Var.A <= 0 && (h311VarD = x340Var.D()) != null) {
            int i2 = h311VarD.b | 1;
            h311VarD.b = i2;
            if ((i2 & 32) == 0) {
                sdn0 sdn0Var = h311VarD.f;
                if (sdn0Var == null) {
                    sdn0Var = new sdn0();
                    h311VarD.f = sdn0Var;
                }
                int i3 = h311VarD.e;
                int iC = sdn0Var.c(obj);
                if (iC < 0) {
                    iC = ~iC;
                    i = -1;
                } else {
                    i = sdn0Var.c[iC];
                }
                sdn0Var.b[iC] = obj;
                sdn0Var.c[iC] = i3;
                if (i == h311VarD.e) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            this.T0.y();
            if (z) {
                return;
            }
            if (obj instanceof zpb1) {
                ((zpb1) obj).r(1);
            }
            dm5.g(this.g, obj, h311VarD);
            if (obj instanceof mdt) {
                mdt mdtVar = (mdt) obj;
                ldt ldtVarT = mdtVar.t();
                nen0 nen0Var = this.t;
                dm5.a0(nen0Var, obj);
                sdn0 sdn0Var2 = ldtVarT.e;
                Object[] objArr = sdn0Var2.b;
                long[] jArr = sdn0Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                            if (i4 != length) {
                                break;
                                break;
                            }
                            i4++;
                        } else {
                            int i5 = 8;
                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                            int i7 = 0;
                            while (i7 < i6) {
                                if ((j & 255) < 128) {
                                    ypb1 ypb1Var = (ypb1) objArr[(i4 << 3) + i7];
                                    if (ypb1Var instanceof zpb1) {
                                        ((zpb1) ypb1Var).r(1);
                                    }
                                    dm5.g(nen0Var, ypb1Var, obj);
                                }
                                j >>= i5;
                                i7++;
                                i5 = i5;
                            }
                            if (i6 != i5) {
                                break;
                            } else if (i4 != length) {
                                break;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                Object obj2 = ldtVarT.f;
                nen0 nen0Var2 = h311VarD.g;
                if (nen0Var2 == null) {
                    nen0Var2 = new nen0();
                    h311VarD.g = nen0Var2;
                }
                nen0Var2.m(mdtVar, obj2);
            }
        }
    }

    @Override // p.i311
    public final int g(h311 h311Var, Object obj) {
        h4k h4kVar;
        int i = h311Var.b;
        if ((i & 2) != 0) {
            h311Var.b = i | 4;
        }
        s340 s340Var = h311Var.c;
        if (s340Var == null || !s340Var.a()) {
            return 1;
        }
        ze91 ze91Var = this.f;
        ze91Var.getClass();
        s340 s340Var2 = h311Var.c;
        if (s340Var2 != null && ze91Var.k(aym.k(s340Var2))) {
            if (h311Var.d == null) {
                return 1;
            }
            int iU = u(h311Var, s340Var, obj);
            if (iU != 1) {
                this.T0.y();
            }
            return iU;
        }
        synchronized (this.d) {
            h4kVar = this.R0;
        }
        if (h4kVar != null) {
            x340 x340Var = h4kVar.V0;
            if (x340Var.F && x340Var.o0(h311Var, obj)) {
                return 4;
            }
        }
        return 1;
    }

    /* JADX WARN: Code duplicated, block: B:161:0x0141 A[EDGE_INSN: B:161:0x0141->B:79:0x0141 BREAK  A[LOOP:2: B:145:0x00f4->B:77:0x0137], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x0135 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x0137 A[Catch: all -> 0x0127, LOOP:2: B:145:0x00f4->B:77:0x0137, LOOP_END, TryCatch #5 {all -> 0x0127, blocks: (B:61:0x00f4, B:63:0x0103, B:65:0x010d, B:67:0x0113, B:69:0x0123, B:73:0x012c, B:79:0x0141, B:87:0x0160, B:90:0x0173, B:77:0x0137, B:82:0x014b, B:96:0x0191, B:98:0x019d), top: B:145:0x00f4 }] */
    public final void h(xce xceVar) throws Throwable {
        h72 h72Var;
        long[] jArr;
        int i;
        long[] jArr2;
        h72 h72Var2;
        long j;
        char c;
        long j2;
        int i2;
        boolean zG;
        long j3;
        xce xceVar2 = this.Y;
        x340 x340Var = this.V0;
        y3k y3kVarF = x340Var.F();
        h72 h72Var3 = this.U0;
        h72Var3.L(this.e, y3kVarF);
        try {
            if (xceVar.c.A()) {
                try {
                    if (xceVar2.c.A() && this.Q0 == null) {
                        h72Var3.z();
                    }
                    return;
                } finally {
                    h72Var3.q();
                }
            }
            nas0 nas0Var = this.Q0;
            l0x0 l0x0VarD = nas0Var != null ? nas0Var.d() : this.b;
            nas0 nas0Var2 = this.Q0;
            try {
                hr80.l(u890.j(l0x0VarD, nas0Var2 != null ? nas0Var2.d() : null) ? "Compose:recordChanges" : "Compose:applyChanges");
                try {
                    nas0 nas0Var3 = this.Q0;
                    h72 h72VarE = nas0Var3 != null ? nas0Var3.e() : h72Var3;
                    l0x0VarD.getClass();
                    ze91 ze91Var = this.f;
                    y3k y3kVarF2 = x340Var.F();
                    hf91 hf91VarI = bf91.a(ze91Var).i();
                    int i3 = 0;
                    try {
                        xceVar.y(l0x0VarD, hf91VarI, h72VarE, y3kVarF2);
                        hf91VarI.e(true);
                        l0x0VarD.f();
                        hr80.m();
                        h72Var3.A();
                        h72Var3.B();
                        if (this.O0) {
                            hr80.l("Compose:unobserve");
                            try {
                                this.O0 = false;
                                nen0 nen0Var = this.g;
                                long[] jArr3 = nen0Var.a;
                                int length = jArr3.length - 2;
                                if (length >= 0) {
                                    int i4 = 0;
                                    while (true) {
                                        long j4 = jArr3[i4];
                                        char c2 = 7;
                                        long j5 = -9187201950435737472L;
                                        if ((((~j4) << 7) & j4 & (-9187201950435737472L)) != -9187201950435737472L) {
                                            int i5 = 8;
                                            int i6 = 8 - ((~(i4 - length)) >>> 31);
                                            int i7 = i3;
                                            while (i7 < i6) {
                                                if ((j4 & 255) < 128) {
                                                    c = c2;
                                                    int i8 = (i4 << 3) + i7;
                                                    j2 = j5;
                                                    Object obj = nen0Var.b[i8];
                                                    Object obj2 = nen0Var.c[i8];
                                                    if (obj2 instanceof oen0) {
                                                        oen0 oen0Var = (oen0) obj2;
                                                        Object[] objArr = oen0Var.b;
                                                        long[] jArr4 = oen0Var.a;
                                                        int i9 = i5;
                                                        int length2 = jArr4.length - 2;
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        h72Var2 = h72Var3;
                                                        if (length2 >= 0) {
                                                            int i10 = 0;
                                                            while (true) {
                                                                try {
                                                                    long j6 = jArr4[i10];
                                                                    j = j4;
                                                                    long[] jArr5 = jArr4;
                                                                    if ((((~j6) << c) & j6 & j2) == j2) {
                                                                        if (i10 != length2) {
                                                                            break;
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    } else {
                                                                        int i11 = 8 - ((~(i10 - length2)) >>> 31);
                                                                        for (int i12 = 0; i12 < i11; i12++) {
                                                                            if ((j6 & 255) < 128) {
                                                                                j3 = j6;
                                                                                int i13 = (i10 << 3) + i12;
                                                                                if (!((h311) objArr[i13]).a()) {
                                                                                    oen0Var.m(i13);
                                                                                }
                                                                            } else {
                                                                                j3 = j6;
                                                                            }
                                                                            j6 = j3 >> i9;
                                                                        }
                                                                        if (i11 != i9) {
                                                                            break;
                                                                        }
                                                                        if (i10 != length2) {
                                                                            break;
                                                                        }
                                                                        i10++;
                                                                        jArr4 = jArr5;
                                                                        j4 = j;
                                                                        i9 = 8;
                                                                    }
                                                                } catch (Throwable th) {
                                                                    th = th;
                                                                    hr80.m();
                                                                    throw th;
                                                                }
                                                            }
                                                        } else {
                                                            j = j4;
                                                        }
                                                        zG = oen0Var.g();
                                                    } else {
                                                        i = i7;
                                                        jArr2 = jArr3;
                                                        h72Var2 = h72Var3;
                                                        j = j4;
                                                        zG = !((h311) obj2).a();
                                                    }
                                                    if (zG) {
                                                        nen0Var.l(i8);
                                                    }
                                                    i2 = 8;
                                                } else {
                                                    i = i7;
                                                    jArr2 = jArr3;
                                                    h72Var2 = h72Var3;
                                                    j = j4;
                                                    c = c2;
                                                    j2 = j5;
                                                    i2 = i5;
                                                }
                                                j4 = j >> i2;
                                                i7 = i + 1;
                                                i5 = i2;
                                                c2 = c;
                                                j5 = j2;
                                                h72Var3 = h72Var2;
                                                jArr3 = jArr2;
                                            }
                                            jArr = jArr3;
                                            h72Var = h72Var3;
                                            if (i6 != i5) {
                                                break;
                                            }
                                        } else {
                                            jArr = jArr3;
                                            h72Var = h72Var3;
                                        }
                                        if (i4 == length) {
                                            break;
                                        }
                                        i4++;
                                        h72Var3 = h72Var;
                                        jArr3 = jArr;
                                        i3 = 0;
                                    }
                                } else {
                                    h72Var = h72Var3;
                                }
                                k();
                                hr80.m();
                            } catch (Throwable th2) {
                                th = th2;
                            }
                        } else {
                            h72Var = h72Var3;
                        }
                        try {
                            if (xceVar2.c.A() && this.Q0 == null) {
                                h72Var.z();
                            }
                            return;
                        } finally {
                            h72Var.q();
                        }
                    } catch (Throwable th3) {
                        try {
                            hf91VarI.e(false);
                            throw th3;
                        } catch (Throwable th4) {
                            th = th4;
                            hr80.m();
                            throw th;
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } catch (Throwable th7) {
            th = th7;
        }
        try {
            if (xceVar2.c.A() && this.Q0 == null) {
                h72Var3.z();
            }
            throw th;
        } finally {
            h72Var3.q();
        }
    }

    public final void i() {
        synchronized (this.d) {
            try {
                if (this.Y.z()) {
                    h(this.Y);
                }
            } catch (Throwable th) {
                try {
                    if (!this.e.isEmpty()) {
                        h72 h72Var = this.U0;
                        try {
                            h72Var.L(this.e, this.V0.F());
                            h72Var.z();
                        } finally {
                            h72Var.q();
                        }
                    }
                    throw th;
                } catch (Throwable th2) {
                    a();
                    throw th2;
                }
            }
        }
    }

    public final void j() {
        synchronized (this.d) {
            try {
                this.V0.v = null;
                if (!this.e.isEmpty()) {
                    h72 h72Var = this.U0;
                    try {
                        h72Var.L(this.e, this.V0.F());
                        h72Var.z();
                        h72Var.q();
                    } catch (Throwable th) {
                        h72Var.q();
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (!this.e.isEmpty()) {
                        h72 h72Var2 = this.U0;
                        try {
                            h72Var2.L(this.e, this.V0.F());
                            h72Var2.z();
                        } finally {
                            h72Var2.q();
                        }
                    }
                    throw th2;
                } catch (Throwable th3) {
                    a();
                    throw th3;
                }
            }
        }
    }

    public final void k() {
        long j;
        char c;
        long j2;
        long j3;
        long[] jArr;
        long[] jArr2;
        int i;
        int i2;
        long j4;
        char c2;
        long j5;
        long j6;
        int i3;
        boolean zG;
        int i4;
        int i5;
        nen0 nen0Var = this.t;
        long[] jArr3 = nen0Var.a;
        int length = jArr3.length - 2;
        long j7 = 255;
        char c3 = 7;
        long j8 = -9187201950435737472L;
        int i6 = 8;
        if (length >= 0) {
            int i7 = 0;
            while (true) {
                long j9 = jArr3[i7];
                j3 = 128;
                if ((((~j9) << c3) & j9 & j8) != j8) {
                    int i8 = 8 - ((~(i7 - length)) >>> 31);
                    int i9 = 0;
                    while (i9 < i8) {
                        if ((j9 & j7) < 128) {
                            j4 = j7;
                            int i10 = (i7 << 3) + i9;
                            Object obj = nen0Var.b[i10];
                            Object obj2 = nen0Var.c[i10];
                            c2 = c3;
                            boolean z = obj2 instanceof oen0;
                            j5 = j8;
                            nen0 nen0Var2 = this.g;
                            if (z) {
                                oen0 oen0Var = (oen0) obj2;
                                Object[] objArr = oen0Var.b;
                                long[] jArr4 = oen0Var.a;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    int i11 = i6;
                                    j6 = j9;
                                    int i12 = 0;
                                    while (true) {
                                        long j10 = jArr4[i12];
                                        jArr2 = jArr3;
                                        i = length;
                                        if ((((~j10) << c2) & j10 & j5) != j5) {
                                            int i13 = 8 - ((~(i12 - length2)) >>> 31);
                                            int i14 = 0;
                                            while (i14 < i13) {
                                                if ((j10 & j4) < 128) {
                                                    i4 = i14;
                                                    int i15 = (i12 << 3) + i4;
                                                    i5 = i9;
                                                    if (!nen0Var2.c((mdt) objArr[i15])) {
                                                        oen0Var.m(i15);
                                                    }
                                                } else {
                                                    i4 = i14;
                                                    i5 = i9;
                                                }
                                                j10 >>= i11;
                                                i14 = i4 + 1;
                                                i9 = i5;
                                            }
                                            i2 = i9;
                                            if (i13 != i11) {
                                                break;
                                            }
                                        } else {
                                            i2 = i9;
                                        }
                                        if (i12 == length2) {
                                            break;
                                        }
                                        i12++;
                                        jArr3 = jArr2;
                                        length = i;
                                        i9 = i2;
                                        i11 = 8;
                                    }
                                } else {
                                    jArr2 = jArr3;
                                    i = length;
                                    i2 = i9;
                                    j6 = j9;
                                }
                                zG = oen0Var.g();
                            } else {
                                jArr2 = jArr3;
                                i = length;
                                i2 = i9;
                                j6 = j9;
                                zG = !nen0Var2.c((mdt) obj2);
                            }
                            if (zG) {
                                nen0Var.l(i10);
                            }
                            i3 = 8;
                        } else {
                            jArr2 = jArr3;
                            i = length;
                            i2 = i9;
                            j4 = j7;
                            c2 = c3;
                            j5 = j8;
                            j6 = j9;
                            i3 = i6;
                        }
                        j9 = j6 >> i3;
                        i9 = i2 + 1;
                        i6 = i3;
                        c3 = c2;
                        j7 = j4;
                        j8 = j5;
                        jArr3 = jArr2;
                        length = i;
                    }
                    jArr = jArr3;
                    int i16 = length;
                    j = j7;
                    c = c3;
                    j2 = j8;
                    if (i8 != i6) {
                        break;
                    } else {
                        length = i16;
                    }
                } else {
                    jArr = jArr3;
                    j = j7;
                    c = c3;
                    j2 = j8;
                }
                if (i7 == length) {
                    break;
                }
                i7++;
                c3 = c;
                j7 = j;
                j8 = j2;
                jArr3 = jArr;
                i6 = 8;
            }
        } else {
            j = 255;
            c = 7;
            j2 = -9187201950435737472L;
            j3 = 128;
        }
        oen0 oen0Var2 = this.i;
        if (!oen0Var2.h()) {
            return;
        }
        Object[] objArr2 = oen0Var2.b;
        long[] jArr5 = oen0Var2.a;
        int length3 = jArr5.length - 2;
        if (length3 < 0) {
            return;
        }
        int i17 = 0;
        while (true) {
            long j11 = jArr5[i17];
            if ((((~j11) << c) & j11 & j2) != j2) {
                int i18 = 8 - ((~(i17 - length3)) >>> 31);
                for (int i19 = 0; i19 < i18; i19++) {
                    if ((j11 & j) < j3) {
                        int i20 = (i17 << 3) + i19;
                        if (((h311) objArr2[i20]).g == null) {
                            oen0Var2.m(i20);
                        }
                    }
                    j11 >>= 8;
                }
                if (i18 != 8) {
                    return;
                }
            }
            if (i17 == length3) {
                return;
            } else {
                i17++;
            }
        }
    }

    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (this.W0 != 1) {
                z = false;
            }
            if (z) {
                this.W0 = (byte) 0;
            }
        }
        return z;
    }

    public final void m(vu30 vu30Var) {
        try {
            synchronized (this.d) {
                p();
                nen0 nen0Var = this.N0;
                this.N0 = dm5.C();
                try {
                    x340 x340Var = this.V0;
                    n181 n181Var = this.P0;
                    if (!x340Var.e.c.A()) {
                        g0k.a("Expected applyChanges() to have been called");
                    }
                    x340Var.P = n181Var;
                    try {
                        x340Var.p(nen0Var, vu30Var);
                        x340Var.P = null;
                    } catch (Throwable th) {
                        x340Var.P = null;
                        throw th;
                    }
                } catch (Throwable th2) {
                    this.N0 = nen0Var;
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                if (!this.e.isEmpty()) {
                    h72 h72Var = this.U0;
                    try {
                        h72Var.L(this.e, this.V0.F());
                        h72Var.z();
                    } finally {
                        h72Var.q();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    public final nas0 n(boolean z, vu30 vu30Var) {
        if (this.Q0 != null) {
            bmv0.b("A pausable composition is in progress");
        }
        nas0 nas0Var = new nas0(this, this.a, this.V0, this.e, vu30Var, z, this.b, this.d);
        this.Q0 = nas0Var;
        return nas0Var;
    }

    public final void o() {
        synchronized (this.d) {
            try {
                if (this.Q0 != null) {
                    bmv0.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean z = this.f.b == 0;
                if (!z || !this.e.isEmpty()) {
                    hr80.l("Compose:deactivate");
                    try {
                        h72 h72Var = this.U0;
                        try {
                            h72Var.L(this.e, this.V0.F());
                            if (!z) {
                                this.b.getClass();
                                ze91 ze91Var = this.f;
                                h72 h72Var2 = this.U0;
                                hf91 hf91VarI = ze91Var.i();
                                try {
                                    ot11.z(hf91VarI, h72Var2);
                                    hf91VarI.e(true);
                                    this.b.f();
                                    h72Var.A();
                                } catch (Throwable th) {
                                    hf91VarI.e(false);
                                    throw th;
                                }
                            }
                            h72Var.z();
                            h72Var.q();
                            hr80.m();
                        } catch (Throwable th2) {
                            h72Var.q();
                            throw th2;
                        }
                    } catch (Throwable th3) {
                        hr80.m();
                        throw th3;
                    }
                }
                this.g.a();
                this.t.a();
                this.N0.a();
                this.X.c.y();
                this.Y.c.y();
                x340 x340Var = this.V0;
                x340Var.E.clear();
                x340Var.s.clear();
                x340Var.e.c.y();
                x340Var.v = null;
                this.W0 = (byte) 1;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void p() throws KotlinNothingValueException {
        AtomicReference atomicReference = this.c;
        Object obj = h7w.a;
        Object andSet = atomicReference.getAndSet(obj);
        if (andSet != null) {
            if (andSet.equals(obj)) {
                g0k.b("pending composition has not been applied");
                jah.d();
                return;
            }
            if (andSet instanceof Set) {
                d((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                g0k.b("corrupt pendingModifications drain: " + atomicReference);
                jah.d();
                return;
            }
            for (Set set : (Set[]) andSet) {
                d(set, true);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void q() throws KotlinNothingValueException {
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(null);
        if (u890.j(andSet, h7w.a)) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set set : (Set[]) andSet) {
                d(set, false);
            }
            return;
        }
        if (andSet == null) {
            if (this.Q0 == null) {
                g0k.a("calling recordModificationsOf and applyChanges concurrently is not supported");
            }
        } else {
            g0k.b("corrupt pendingModifications drain: " + atomicReference);
            jah.d();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public final void r() throws KotlinNothingValueException {
        w7x w7xVar = w7x.a;
        AtomicReference atomicReference = this.c;
        Object andSet = atomicReference.getAndSet(w7xVar);
        if (u890.j(andSet, h7w.a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            d((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            g0k.b("corrupt pendingModifications drain: " + atomicReference);
            jah.d();
            return;
        }
        for (Set set : (Set[]) andSet) {
            d(set, false);
        }
    }

    public final void s() {
        String str;
        byte b = this.W0;
        if (b != 0) {
            if (b == 1) {
                str = "The composition should be activated before setting content.";
            } else if (b != 2) {
                str = b != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            bmv0.b(str);
        }
        if (this.Q0 == null) {
            return;
        }
        bmv0.b("A pausable composition is in progress");
    }

    public final void t(ArrayList arrayList) {
        yl61 yl61Var = this.e;
        x340 x340Var = this.V0;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((znm0) ((mmr0) arrayList.get(i)).a).c != this) {
                g0k.a("Check failed");
                break;
            }
        }
        try {
            x340Var.getClass();
            hr80.l("Compose:insertMovableContent");
            try {
                try {
                    x340Var.I(arrayList);
                    x340Var.j();
                    hr80.m();
                } catch (Throwable th) {
                    hr80.m();
                    throw th;
                }
            } catch (Throwable th2) {
                x340Var.a();
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                if (!yl61Var.isEmpty()) {
                    h72 h72Var = this.U0;
                    try {
                        h72Var.L(yl61Var, x340Var.F());
                        h72Var.z();
                    } finally {
                        h72Var.q();
                    }
                }
                throw th3;
            } catch (Throwable th4) {
                a();
                throw th4;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0041  */
    /* JADX WARN: Code duplicated, block: B:70:0x00e9  */
    public final int u(h311 h311Var, s340 s340Var, Object obj) {
        int i;
        int i2;
        synchronized (this.d) {
            try {
                h4k h4kVar = this.R0;
                int i3 = 3;
                h4k h4kVar2 = null;
                if (h4kVar != null) {
                    ze91 ze91Var = this.f;
                    int i4 = this.S0;
                    if (ze91Var.g) {
                        g0k.a("Writer is active");
                    }
                    if (i4 < 0 || i4 >= ze91Var.b) {
                        g0k.a("Invalid group index");
                    }
                    s340 s340VarK = aym.k(s340Var);
                    if (ze91Var.k(s340VarK)) {
                        int i5 = ze91Var.a[(i4 * 5) + 3] + i4;
                        int i6 = s340VarK.a;
                        if (i4 > i6 || i6 >= i5) {
                            h4kVar = null;
                        }
                    } else {
                        h4kVar = null;
                    }
                    h4kVar2 = h4kVar;
                }
                int i7 = 2;
                if (h4kVar2 == null) {
                    x340 x340Var = this.V0;
                    if (x340Var.F && x340Var.o0(h311Var, obj)) {
                        return 4;
                    }
                    if (obj != null) {
                        boolean z = obj instanceof mdt;
                        nen0 nen0Var = this.N0;
                        if (z) {
                            Object objG = nen0Var.g(h311Var);
                            if (objG != null) {
                                if (!(objG instanceof oen0)) {
                                    i = 2;
                                    i2 = 3;
                                    if (objG != djx0.i) {
                                        dm5.g(this.N0, h311Var, obj);
                                        break;
                                    }
                                } else {
                                    oen0 oen0Var = (oen0) objG;
                                    Object[] objArr = oen0Var.b;
                                    long[] jArr = oen0Var.a;
                                    int length = jArr.length - 2;
                                    if (length >= 0) {
                                        int i8 = 0;
                                        loop0: while (true) {
                                            long j = jArr[i8];
                                            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                                int i9 = 8 - ((~(i8 - length)) >>> 31);
                                                i = i7;
                                                int i10 = 0;
                                                while (i10 < i9) {
                                                    if ((j & 255) < 128) {
                                                        i2 = i3;
                                                        if (objArr[(i8 << 3) + i10] == djx0.i) {
                                                            break loop0;
                                                        }
                                                    } else {
                                                        i2 = i3;
                                                    }
                                                    j >>= 8;
                                                    i10++;
                                                    i3 = i2;
                                                }
                                                i2 = i3;
                                                if (i9 == 8) {
                                                }
                                            } else {
                                                i = i7;
                                                i2 = i3;
                                            }
                                            if (i8 != length) {
                                                i8++;
                                                i7 = i;
                                                i3 = i2;
                                            }
                                        }
                                    } else {
                                        i = 2;
                                        i2 = 3;
                                    }
                                    dm5.g(this.N0, h311Var, obj);
                                    break;
                                }
                            } else {
                                i = 2;
                                i2 = 3;
                                dm5.g(this.N0, h311Var, obj);
                                break;
                            }
                        } else {
                            nen0Var.m(h311Var, djx0.i);
                        }
                    } else {
                        this.N0.m(h311Var, djx0.i);
                    }
                    i = 2;
                    i2 = 3;
                } else {
                    i = 2;
                    i2 = 3;
                }
                if (h4kVar2 != null) {
                    return h4kVar2.u(h311Var, s340Var, obj);
                }
                this.a.o(this);
                return this.V0.F ? i2 : i;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void v(Object obj) {
        Object objG = this.g.g(obj);
        if (objG == null) {
            return;
        }
        boolean z = objG instanceof oen0;
        nen0 nen0Var = this.Z;
        if (!z) {
            h311 h311Var = (h311) objG;
            if (h311Var.c(obj) != 4 || (obj instanceof mdt)) {
                return;
            }
            dm5.g(nen0Var, obj, h311Var);
            return;
        }
        oen0 oen0Var = (oen0) objG;
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
                    if ((255 & j) < 128) {
                        h311 h311Var2 = (h311) objArr[(i << 3) + i3];
                        if (h311Var2.c(obj) == 4 && !(obj instanceof mdt)) {
                            dm5.g(nen0Var, obj, h311Var2);
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

    /* JADX WARN: Code duplicated, block: B:20:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x005b A[LOOP:0: B:7:0x001c->B:21:0x005b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007b A[SYNTHETIC] */
    public final boolean w(Set set) {
        boolean z = set instanceof jj41;
        nen0 nen0Var = this.t;
        nen0 nen0Var2 = this.g;
        if (z) {
            oen0 oen0Var = ((jj41) set).a;
            Object[] objArr = oen0Var.b;
            long[] jArr = oen0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                loop0: while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                Object obj = objArr[(i << 3) + i3];
                                if (nen0Var2.c(obj) || nen0Var.c(obj)) {
                                    break loop0;
                                }
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : set) {
                if (nen0Var2.c(obj2) || nen0Var.c(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        synchronized (this.d) {
            nas0 nas0Var = this.Q0;
            boolean z = false;
            if (nas0Var != null && !nas0Var.g()) {
                nas0Var.i();
                nas0Var.d().u();
                return false;
            }
            p();
            try {
                nen0 nen0Var = this.N0;
                this.N0 = dm5.C();
                try {
                    x340 x340Var = this.V0;
                    n181 n181Var = this.P0;
                    xce xceVar = x340Var.e;
                    if (!xceVar.c.A()) {
                        g0k.a("Expected applyChanges() to have been called");
                    }
                    if (nen0Var.e > 0 || !x340Var.s.isEmpty()) {
                        x340Var.P = n181Var;
                        try {
                            x340Var.p(nen0Var, null);
                            x340Var.P = null;
                            z = xceVar.z();
                        } catch (Throwable th) {
                            x340Var.P = null;
                            throw th;
                        }
                    }
                    if (!z) {
                        q();
                    }
                    return z;
                } catch (Throwable th2) {
                    this.N0 = nen0Var;
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    if (!this.e.isEmpty()) {
                        h72 h72Var = this.U0;
                        try {
                            h72Var.L(this.e, this.V0.F());
                            h72Var.z();
                        } finally {
                            h72Var.q();
                        }
                    }
                    throw th3;
                } catch (Throwable th4) {
                    a();
                    throw th4;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void y(jj41 jj41Var) {
        Object obj;
        Object objZ0;
        do {
            obj = this.c.get();
            if (obj == null || obj.equals(h7w.a)) {
                objZ0 = jj41Var;
            } else if (obj instanceof Set) {
                objZ0 = new Set[]{obj, jj41Var};
            } else {
                if (!(obj instanceof Object[])) {
                    bhn0.B(this.c, "corrupt pendingModifications: ");
                    return;
                }
                objZ0 = f46.z0((Set[]) obj, jj41Var);
            }
        } while (!ydh.n(this.c, obj, objZ0));
        if (obj == null) {
            synchronized (this.d) {
                q();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c), top: B:29:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0061 A[EDGE_INSN: B:31:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    public final void z(Object obj) {
        synchronized (this.d) {
            try {
                v(obj);
                Object objG = this.t.g(obj);
                if (objG != null) {
                    if (objG instanceof oen0) {
                        oen0 oen0Var = (oen0) objG;
                        Object[] objArr = oen0Var.b;
                        long[] jArr = oen0Var.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i = 0;
                            while (true) {
                                long j = jArr[i];
                                if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                                    if (i != length) {
                                        break;
                                        break;
                                    }
                                    i++;
                                } else {
                                    int i2 = 8 - ((~(i - length)) >>> 31);
                                    for (int i3 = 0; i3 < i2; i3++) {
                                        if ((255 & j) < 128) {
                                            v((mdt) objArr[(i << 3) + i3]);
                                        }
                                        j >>= 8;
                                    }
                                    if (i2 != 8) {
                                        break;
                                    } else if (i != length) {
                                        break;
                                    } else {
                                        i++;
                                    }
                                }
                            }
                        }
                    } else {
                        v((mdt) objG);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
