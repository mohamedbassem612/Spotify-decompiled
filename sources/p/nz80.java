package p;

import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class nz80 {
    public static final Set a;

    static {
        int i = toa0.P;
        a = f46.S0(new toa0[]{new toa0(toa0.s), new toa0(toa0.F), new toa0(toa0.i), new toa0(toa0.r)});
    }

    public static final void a(String str, long j, hux huxVar, long j2, Function0 function0, qim0 qim0Var, boolean z, float f, float f2, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        boolean z2;
        float f3;
        float f4;
        float f5;
        int i3;
        float f6;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1006428182);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.f(j2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 131072 : 65536;
        }
        int i4 = 1572864 | i2;
        if ((i & 12582912) == 0) {
            i4 = 5767168 | i2;
        }
        if ((100663296 & i) == 0) {
            i4 |= 33554432;
        }
        if (b0kVar3.Y(i4 & 1, (38347923 & i4) != 38347922)) {
            b0kVar3.d0();
            if ((i & 1) == 0 || b0kVar3.E()) {
                f5 = 40.0f;
                i3 = i4 & (-264241153);
                f6 = 24.0f;
                z2 = true;
            } else {
                b0kVar3.b0();
                int i5 = i4 & (-264241153);
                z2 = z;
                f5 = f2;
                i3 = i5;
                f6 = f;
            }
            b0kVar3.s();
            boolean z3 = (i3 & 57344) == 16384;
            Object objT = b0kVar3.T();
            if (z3 || objT == m4cVar) {
                objT = new j160(function0, (byte) 15);
                b0kVar3.s0(objT);
            }
            float f7 = f6;
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            boolean z4 = (i3 & 7168) == 2048;
            Object objT2 = b0kVar3.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new sre((byte) 25, j2);
                b0kVar3.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            boolean z5 = (i3 & 112) == 32;
            Object objT3 = b0kVar3.T();
            if (z5 || objT3 == m4cVar) {
                objT3 = new sre((byte) 26, j);
                b0kVar3.s0(objT3);
            }
            f4 = f5;
            b0kVar2 = b0kVar3;
            wro1.h(gbxVar, new hdx(0, vu30Var, (vu30) objT3, (vu30) null, (hw61) null, 25), u291.m(u291.a(qim0Var, 48.0f, 48.0f), f5), z2 ? jax.a : new hax(str), (gdx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), false, (idn0) null, (ga80) null, apo.r(826955999, new nd6(huxVar, str, f7, j2), b0kVar3), b0kVar2, 12582912, 6, 808);
            f3 = f7;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            z2 = z;
            f3 = f;
            f4 = f2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new gz80(str, j, huxVar, j2, function0, qim0Var, z2, f3, f4, i);
        }
    }

    public static final void b(tra0 tra0Var, w9u0 w9u0Var, boolean z, String str, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1099557646);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(tra0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(w9u0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.i(function0) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zG = x340Var.g(tra0Var) | x340Var.g(w9u0Var);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                objT = (tra0Var == null || w9u0Var == null) ? null : tra0Var.a(w9u0Var, function0);
                x340Var.s0(objT);
            }
            wra0 wra0Var = (wra0) objT;
            if (wra0Var != null) {
                x340Var.i0(794405479);
                otw.c(wra0Var, new ura0(z, null, "home_dj", 0, str, null, "spotify:home", 42), (qim0) null, (ipb1) null, x340Var, 0, 12);
                x340Var.r(false);
            } else {
                x340Var.i0(794752400);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(tra0Var, w9u0Var, z, str, function0, i);
        }
    }

    public static final void c(qim0 qim0Var, long j, boolean z, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1291206532);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.h(z) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        byte b = 0;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                j = ((vex) zex.a.e).i;
            } else {
                x340Var.b0();
            }
            int i3 = i2 & (-113);
            x340Var.s();
            oq2.a((i3 & 14) | 3072 | ((i3 >> 3) & 112), apo.r(576951707, new hz80(j, j2iVar, b), x340Var), x340Var, qim0Var, z, false);
        } else {
            x340Var.b0();
        }
        long j2 = j;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new iz80(qim0Var, j2, z, j2iVar, i);
        }
    }

    public static final void d(String str, Function0 function0, iu30 iu30Var, qim0 qim0Var, max maxVar, tra0 tra0Var, w9u0 w9u0Var, boolean z, String str2, Function0 function1, boolean z2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        String strK;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-767440932);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072 | (x340Var.i(maxVar) ? 16384 : 8192) | (x340Var.i(tra0Var) ? 131072 : 65536) | (x340Var.i(w9u0Var) ? 1048576 : 524288) | (x340Var.h(z) ? 8388608 : 4194304) | (x340Var.g(str2) ? 67108864 : 33554432) | (x340Var.i(function1) ? 536870912 : 268435456);
        int i3 = x340Var.h(z2) ? 4 : 2;
        if (x340Var.Y(i2 & 1, ((306783379 & i2) == 306783378 && (i3 & 3) == 2) ? false : true)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                qim0Var3 = nim0.a;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var;
            }
            x340Var.s();
            b(tra0Var, w9u0Var, z, str2, function1, x340Var, (i2 >> 15) & 65534);
            if (str == null) {
                strK = x0d.k(x340Var, 1223666139, 2131956726, x340Var, false);
            } else {
                x340Var.i0(1223665736);
                x340Var.r(false);
                strK = str;
            }
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = lx70.h;
                x340Var.s0(objT);
            }
            int i4 = (57344 & i2) | 12583350 | ((i3 << 18) & 3670016);
            qim0 qim0Var4 = qim0Var3;
            f((Function0) objT, qim0Var4, false, strK, maxVar, 0.0f, z2, apo.r(790125464, new cy00(function0, strK, iu30Var, false, (byte) 17), x340Var), x340Var, i4, 0);
            x340Var = x340Var;
            qim0Var2 = qim0Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new seb(str, function0, iu30Var, qim0Var2, maxVar, tra0Var, w9u0Var, z, str2, function1, z2, i);
        }
    }

    public static final void e(String str, Function0 function0, qim0 qim0Var, boolean z, boolean z2, boolean z3, boolean z4, Function0 function1, Function0 function2, tra0 tra0Var, w9u0 w9u0Var, boolean z5, boolean z6, boolean z7, boolean z8, Function0 function3, String str2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        int i2;
        qim0 qim0VarF;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-22845958);
        int i3 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | 128 | (x340Var.h(z) ? 2048 : 1024) | (x340Var.h(z2) ? 16384 : 8192) | (x340Var.h(z3) ? 131072 : 65536) | (x340Var.h(z4) ? 1048576 : 524288) | (x340Var.i(function1) ? 8388608 : 4194304) | (x340Var.i(function2) ? 67108864 : 33554432) | (x340Var.i(tra0Var) ? 536870912 : 268435456);
        int i4 = 8192;
        int i5 = (x340Var.h(z6) ? 256 : 128) | (x340Var.i(w9u0Var) ? 4 : 2) | (x340Var.h(z5) ? 32 : 16) | (x340Var.h(z7) ? 2048 : 1024);
        if (x340Var.h(z8)) {
            i4 = 16384;
        }
        int i6 = i5 | i4 | (x340Var.i(function3) ? 131072 : 65536) | (x340Var.g(str2) ? 1048576 : 524288);
        if (x340Var.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (599187 & i6) == 599186) ? false : true)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                i2 = i3 & (-897);
                qim0VarF = u291.f(nim0.a, 1.0f);
            } else {
                x340Var.b0();
                i2 = i3 & (-897);
                qim0VarF = qim0Var;
            }
            int i7 = i2;
            x340Var.s();
            b(tra0Var, w9u0Var, z8, str2, function3, x340Var, ((i7 >> 27) & 14) | ((i6 << 3) & 112) | ((i6 >> 6) & 896) | ((i6 >> 9) & 7168) | (57344 & (i6 >> 3)));
            qim0 qim0Var3 = qim0VarF;
            c(qim0Var3, 0L, z4, apo.r(328989246, new jz80(str, z, z2, z3, function0, function1, function2, z5, z6, z7), x340Var), x340Var, 3072 | ((i7 >> 12) & 896));
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kz80(str, function0, qim0Var2, z, z2, z3, z4, function1, function2, tra0Var, w9u0Var, z5, z6, z7, z8, function3, str2, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:86:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:94:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:96:0x013e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    public static final void f(Function0 function0, qim0 qim0Var, boolean z, String str, max maxVar, float f, boolean z2, j2i j2iVar, b0k b0kVar, int i, int i2) {
        int i3;
        qim0 qim0Var2;
        float f2;
        j2i j2iVar2;
        boolean z3;
        float f3;
        h311 h311VarV;
        qim0 qim0Var3;
        float f4;
        float f5;
        qim0 qim0Var4;
        float f6;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(434469365);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var.h(z)) {
                    i8 = 256;
                } else {
                    i8 = 128;
                }
                i3 |= i8;
            }
            if ((i & 3072) == 0) {
                if (x340Var.g(str)) {
                    i7 = 2048;
                } else {
                    i7 = 1024;
                }
                i3 |= i7;
            }
            if ((i & 24576) == 0) {
                if (x340Var.i(maxVar)) {
                    i6 = 16384;
                } else {
                    i6 = 8192;
                }
                i3 |= i6;
            }
            if ((196608 & i) == 0) {
                if ((i2 & 32) == 0) {
                    f2 = f;
                    int i10 = x340Var.d(f2) ? 131072 : 65536;
                    i3 |= i10;
                } else {
                    f2 = f;
                }
                i3 |= i10;
            } else {
                f2 = f;
            }
            if ((1572864 & i) == 0) {
                if (x340Var.h(z2)) {
                    i5 = 1048576;
                } else {
                    i5 = 524288;
                }
                i3 |= i5;
            }
            if ((12582912 & i) == 0) {
                j2iVar2 = j2iVar;
                if (x340Var.i(j2iVar2)) {
                    i4 = 8388608;
                } else {
                    i4 = 4194304;
                }
                i3 |= i4;
            } else {
                j2iVar2 = j2iVar;
            }
            if ((4793491 & i3) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (x340Var.Y(i3 & 1, z3)) {
                x340Var.d0();
                if ((i & 1) != 0 || x340Var.E()) {
                    if (i9 != 0) {
                        qim0Var3 = nim0.a;
                    } else {
                        qim0Var3 = qim0Var2;
                    }
                    if ((i2 & 32) != 0) {
                        f4 = 48.0f;
                    } else {
                        f4 = f2;
                    }
                    f5 = f4;
                    qim0Var4 = qim0Var3;
                } else {
                    x340Var.b0();
                    qim0Var4 = qim0Var2;
                    f5 = f2;
                }
                x340Var.s();
                if (!(maxVar instanceof hax) || z2) {
                    f6 = 0.3f;
                } else {
                    f6 = 1.0f;
                }
                float f7 = f6;
                uwr uwrVar = cbx.a;
                float f8 = f5;
                nyx.a(2, (wux) null, apo.r(-1180532728, new lz80(qim0Var4, f5, z95.b(f7, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6), "interactiveEntrypointAlpha", (iu30) null, x340Var, 3072, 20), maxVar, str, z, function0, j2iVar2), x340Var), x340Var, 3078, 6);
                qim0Var2 = qim0Var4;
                f3 = f8;
            } else {
                x340Var.b0();
                f3 = f2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new c750(function0, qim0Var2, z, str, maxVar, f3, z2, j2iVar, i, i2);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (x340Var.h(z)) {
                i8 = 256;
            } else {
                i8 = 128;
            }
            i3 |= i8;
        }
        if ((i & 3072) == 0) {
            if (x340Var.g(str)) {
                i7 = 2048;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i & 24576) == 0) {
            if (x340Var.i(maxVar)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            i3 |= i6;
        }
        if ((196608 & i) == 0) {
            if ((i2 & 32) == 0) {
                f2 = f;
                if (x340Var.d(f2)) {
                }
                i3 |= i10;
            } else {
                f2 = f;
            }
            i3 |= i10;
        } else {
            f2 = f;
        }
        if ((1572864 & i) == 0) {
            if (x340Var.h(z2)) {
                i5 = 1048576;
            } else {
                i5 = 524288;
            }
            i3 |= i5;
        }
        if ((12582912 & i) == 0) {
            j2iVar2 = j2iVar;
            if (x340Var.i(j2iVar2)) {
                i4 = 8388608;
            } else {
                i4 = 4194304;
            }
            i3 |= i4;
        } else {
            j2iVar2 = j2iVar;
        }
        if ((4793491 & i3) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (x340Var.Y(i3 & 1, z3)) {
            x340Var.d0();
            if ((i & 1) != 0) {
                if (i9 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i2 & 32) != 0) {
                    f4 = 48.0f;
                } else {
                    f4 = f2;
                }
                f5 = f4;
                qim0Var4 = qim0Var3;
            } else {
                if (i9 != 0) {
                    qim0Var3 = nim0.a;
                } else {
                    qim0Var3 = qim0Var2;
                }
                if ((i2 & 32) != 0) {
                    f4 = 48.0f;
                } else {
                    f4 = f2;
                }
                f5 = f4;
                qim0Var4 = qim0Var3;
            }
            x340Var.s();
            if (maxVar instanceof hax) {
                f6 = 0.3f;
            } else {
                f6 = 0.3f;
            }
            float f9 = f6;
            uwr uwrVar2 = cbx.a;
            float f10 = f5;
            nyx.a(2, (wux) null, apo.r(-1180532728, new lz80(qim0Var4, f5, z95.b(f9, irn1.o0((int) jfv.h(cbx.c(x340Var).b.a), 0, (dlv) null, 6), "interactiveEntrypointAlpha", (iu30) null, x340Var, 3072, 20), maxVar, str, z, function0, j2iVar2), x340Var), x340Var, 3078, 6);
            qim0Var2 = qim0Var4;
            f3 = f10;
        } else {
            x340Var.b0();
            f3 = f2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new c750(function0, qim0Var2, z, str, maxVar, f3, z2, j2iVar, i, i2);
        }
    }

    public static final void g(int i, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        x340 x340Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(650251791);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 32 : 16;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var2, 2131956728);
            qim0 qim0VarS = u291.s(u291.A(u291.v(u291.h(qim0Var, 40.0f), 48.0f), een.g, true), 40.0f, 48.0f);
            boolean zG = x340Var2.g(strO0);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new ry40(strO0, (byte) 18);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarS, false, (iu30) objT);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = ktd.n(x340Var2);
            }
            qim0 qim0VarV = bin.v(qim0VarB, (idn0) objT2, jtr.f, false, (String) null, new pm31(0), function0, 12);
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarV);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            wox woxVar = wox.c;
            qim0 qim0VarN = anm1.N("Entrypoint.MicIcon", u291.r(eqr0.D(4.0f, 0.0f, 2, nim0.a), 16.0f));
            uwr uwrVar = cbx.a;
            w0h1.a(woxVar, isl.a, qim0VarN, cbx.a(x340Var2).b.b, 0L, false, x340Var2, wox.d | 48, 48);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tx1(function0, qim0Var, i, (byte) 15);
        }
    }

    public static final void h(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1626051243);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(32.0f, 0.0f, 2, qim0Var);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarJ, er31.b(4.0f)), cbx.a(x340Var).a.b.a(), d4o1.a);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ktd.n(x340Var);
            }
            qim0 qim0VarV = bin.v(qim0VarF, (idn0) objT, jtr.f, false, (String) null, new pm31(0), function0, 12);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("InteractiveEntrypoint.PromptCta", uyn1.y(qim0VarV, 12.0f, 6.0f));
            gfh0 gfh0VarC = t1c.c(een.g, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            uwo1.e(str, (qim0) null, cbx.d(x340Var).k, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, i2 & 14, 0, 1714);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var, i, (byte) 11);
        }
    }

    public static final void i(Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1913161154);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            wro1.h(new gbx(z50.c, function0), ldx.c, anm1.N("RealtimeVoice.Start", u291.r(u291.A(u291.v(u291.h(nim0.a, 40.0f), 40.0f), een.h, true), 48.0f)), (max) null, yla.s(x340Var), new zzq0(0.0f, 0.0f, 0.0f, 0.0f), false, (idn0) null, (ga80) null, apo.r(-1566862439, new dz40(cwl1.o0(x340Var, 2131956729), (byte) 18), x340Var), x340Var, 12582912, 6, 792);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wk1((byte) 10, i, function0, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v7 */
    public static final void j(String str, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, Function0 function2, qim0 qim0Var, boolean z4, boolean z5, boolean z6, b0k b0kVar, int i) {
        Function0 function3;
        qim0 qim0Var2;
        ?? r13;
        float f;
        float f2;
        Function0 function4;
        float f3;
        float f4;
        ?? r2;
        ?? r6;
        float f5;
        boolean z7;
        Integer numValueOf;
        Function0 function5 = function2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1269217897);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | (x340Var.h(z2) ? 256 : 128) | (x340Var.h(z3) ? 2048 : 1024) | (x340Var.i(function0) ? 16384 : 8192) | (x340Var.i(function1) ? 131072 : 65536) | (x340Var.i(function5) ? 1048576 : 524288) | 12582912 | (x340Var.h(z4) ? 67108864 : 33554432) | (x340Var.h(z5) ? 536870912 : 268435456);
        if (x340Var.Y(i2 & 1, ((i2 & 306783379) == 306783378 && ((x340Var.h(z6) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.n(x340Var);
            }
            idn0 idn0Var = (idn0) objT;
            qim0Var2 = nim0.a;
            qim0 qim0VarJ = u291.j(40.0f, 0.0f, 2, u291.f(qim0Var2, 1.0f));
            if (z4) {
                x340Var.i0(52335295);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                r13 = 0;
                x340Var.r(false);
                f = 4.0f;
            } else {
                r13 = 0;
                x340Var.i0(52336987);
                uwr uwrVar2 = cbx.a;
                cvx cvxVar2 = cbx.b(x340Var).b;
                x340Var.r(false);
                f = 16.0f;
            }
            if (z || z2) {
                x340Var.i0(52339609);
                x340Var.r((boolean) r13);
                f2 = 0.0f;
            } else {
                x340Var.i0(52340731);
                cvx cvxVar3 = cbx.b(x340Var).b;
                x340Var.r((boolean) r13);
                f2 = 16.0f;
            }
            qim0 qim0VarB = uyn1.B(qim0VarJ, f, 0.0f, f2, 0.0f, 10);
            fra fraVar = een.N0;
            gex0 gex0Var = h36.a;
            jw31 jw31VarA = ew31.a(gex0Var, fraVar, x340Var, (int) r13);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z8 = x340Var.S;
            Function0 function6 = hmb0.t1;
            if (z8) {
                x340Var.l(function6);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf2 = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf2, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarV = bin.v(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), idn0Var, jtr.f, false, (String) null, new pm31(0), function0, 12);
            jw31 jw31VarA2 = ew31.a(gex0Var, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarV);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function6);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (z4) {
                x340Var.i0(-1967489999);
                cvx cvxVar4 = cbx.b(x340Var).b;
                f3 = 4.0f;
                qim0 qim0VarX = uyn1.x(qim0Var2, 4.0f);
                if (z6) {
                    x340Var.i0(352182391);
                    int iG = z4p1.G(cbx.a(x340Var).b.a);
                    z7 = false;
                    x340Var.r(false);
                    numValueOf = Integer.valueOf(iG);
                } else {
                    z7 = false;
                    x340Var.i0(-1967234002);
                    x340Var.r(false);
                    numValueOf = null;
                }
                function4 = function6;
                boolean z9 = z7;
                f4 = 1.0f;
                r2 = 1;
                k4k.b(qim0VarX, 2, z5, false, numValueOf, x340Var, ((i2 >> 21) & 896) | 48, 8);
                x340Var = x340Var;
                x340Var.r(z9);
                r6 = z9;
            } else {
                function4 = function6;
                f3 = 4.0f;
                f4 = 1.0f;
                r2 = 1;
                r6 = 0;
                x340Var.i0(-1967211309);
                x340Var.r(false);
            }
            ?? r14 = (i2 & 14) == 4 ? r2 : r6;
            Object objT2 = x340Var.T();
            if (r14 != 0 || objT2 == m4cVar) {
                objT2 = mqo1.s(new String[]{str});
                x340Var.s0(objT2);
            }
            c380 c380Var = (c380) objT2;
            if (f4 <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            wnb0 wnb0Var = new wnb0(f4 > Float.MAX_VALUE ? Float.MAX_VALUE : f4, (boolean) r2);
            if (z4) {
                x340Var.i0(352190583);
                cvx cvxVar5 = cbx.b(x340Var).b;
                x340Var.r((boolean) r6);
                f5 = f3;
            } else {
                x340Var.i0(352191089);
                x340Var.r((boolean) r6);
                f5 = 0.0f;
            }
            x340 x340Var2 = x340Var;
            up31.a(c380Var, uyn1.B(wnb0Var, f5, 0.0f, 0.0f, 0.0f, 14), false, null, 0L, new cjc0((int) r2), 0, "rotatingPromptTransition", x340Var2, 12582912);
            x340Var = x340Var2;
            if (z3) {
                x340Var.i0(-1966845230);
                cvx cvxVar6 = cbx.b(x340Var).b;
                float f6 = 8.0f;
                op71.g(x340Var, u291.v(qim0Var2, 8.0f));
                if (!z) {
                    f6 = z2 ? -4.0f : 0.0f;
                }
                p9p1.b(anm1.N("Entrypoint.Beta", eqr0.D(f6, 0.0f, 2, qim0Var2)), 2, 1, x340Var, 432, 0);
                x340Var.r((boolean) r6);
            } else {
                x340Var.i0(-1966352237);
                x340Var.r((boolean) r6);
            }
            x340Var.r((boolean) r2);
            if (z || z2) {
                x340Var.i0(1275892328);
                jw31 jw31VarA3 = ew31.a(new d36(-12.0f, (boolean) r2, new um5((boolean) r6)), een.Z, x340Var, (int) r6);
                int iHashCode3 = Long.hashCode(x340Var.T);
                xos0 xos0VarM3 = x340Var.m();
                qim0 qim0VarE3 = zr7.E(x340Var, qim0Var2);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(function4);
                } else {
                    x340Var.v0();
                }
                nko1.H(jw31VarA3, x340Var, lljVar);
                nko1.H(xos0VarM3, x340Var, lljVar2);
                x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE3, x340Var, lljVar4);
                if (z) {
                    x340Var.i0(348916083);
                    function3 = function1;
                    g((i2 >> 15) & 14, function3, x340Var, lrn1.x(qim0Var2, f4));
                } else {
                    function3 = function1;
                    x340Var.i0(-2068442770);
                }
                x340Var.r((boolean) r6);
                if (z2) {
                    x340Var.i0(348919303);
                    function5 = function2;
                    i(function5, x340Var, (i2 >> 18) & 14);
                } else {
                    function5 = function2;
                    x340Var.i0(-2068354482);
                }
                x340Var.r((boolean) r6);
                x340Var.r((boolean) r2);
                x340Var.r((boolean) r6);
            } else {
                x340Var.i0(1276145071);
                x340Var.r((boolean) r6);
                function3 = function1;
                function5 = function2;
            }
            x340Var.r((boolean) r2);
        } else {
            function3 = function1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mz80(str, z, z2, z3, function0, function3, function5, qim0Var2, z4, z5, z6, i);
        }
    }
}
