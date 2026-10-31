package p;

import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.File;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class rpo1 {
    public static final pl10 a;
    public static final pl10 b;
    public static final pl10[] c;
    public static b180 d;

    static {
        pl10 pl10Var = new pl10("CLIENT_TELEMETRY", 1L);
        a = pl10Var;
        pl10 pl10Var2 = new pl10("CLIENT_NOTIFICATION_TELEMETRY", 1L);
        b = pl10Var2;
        c = new pl10[]{pl10Var, pl10Var2};
    }

    public static int A(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * (-862048943)), 15)) * 461845907);
    }

    public static final void a(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2136285757);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("artwork_preview", qim0Var);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            Uri uri = Uri.parse(str == null ? "" : str);
            ssx ssxVar = ssx.c;
            nux nuxVar = new nux(ssxVar, ssxVar);
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            cua cuaVar = cbx.b(x340Var).f;
            eso1.e(uri, isl.a, i1p1.q(nim0.a, er31.b(8.0f)), (p3v) null, (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, nuxVar, false, false, x340Var, 1073744944, 0, 3536);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rj(str, qim0Var, i, (byte) 7);
        }
    }

    public static final void b(Function0 function0, iu30 iu30Var, iu30 iu30Var2, qim0 qim0Var, boolean z, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-378354682);
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(iu30Var2) ? 256 : 128) | 3072 | (x340Var.h(z) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            nyx.a(2, (wux) null, apo.r(-983165037, new bk0(function0, z, iu30Var2, iu30Var), x340Var), x340Var, 3078, 6);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ey((Object) function0, (Object) iu30Var, (Object) iu30Var2, (Object) qim0Var2, z, i, (byte) 7);
        }
    }

    public static final void c(vnr0 vnr0Var, List list, qsq qsqVar, smc0 smc0Var, rsq rsqVar, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(946176116);
        int i2 = i | (x340Var.i(vnr0Var) ? 4 : 2) | (x340Var.g(list) ? 32 : 16) | (x340Var.i(qsqVar) ? 256 : 128) | (x340Var.i(smc0Var) ? 2048 : 1024) | (x340Var.i(rsqVar) ? 16384 : 8192) | (x340Var.h(z) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            x340Var.i0(-1257805341);
            float fO = 0.37f;
            if (z) {
                x340Var.i0(-337246048);
                Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
                fO = yoi1.o(((configuration.screenHeightDp * 0.6f) * 0.5625f) / configuration.screenWidthDp, 0.37f, 0.9f);
                x340Var.r(false);
            } else if (u1p1.y(x340Var)) {
                x340Var.i0(-336842118);
                Configuration configuration2 = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
                float f = ((configuration2.screenHeightDp * 0.4f) * 0.5625f) / configuration2.screenWidthDp;
                fO = 0.28f > f ? f : 0.28f;
                x340Var.r(false);
            } else {
                x340Var.i0(-336508403);
                x340Var.r(false);
            }
            x340Var.r(false);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0Var2 = qim0Var3;
            qgo1.f(vnr0Var, uyn1.z(16.0f, 0.0f, 2, qim0Var3), null, 0, false, null, x340Var, 8 | (i2 & 14), 60);
            qim0 qim0VarF = u291.f(qim0Var2, 1.0f);
            cvx cvxVar3 = cbx.b(x340Var).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            cvx cvxVar4 = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean zI = ((i2 & 7168) == 2048 || x340Var.i(smc0Var)) | x340Var.i(rsqVar) | x340Var.d(fO) | ((i2 & 112) == 32) | x340Var.i(qsqVar);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                lf60 lf60Var = new lf60(smc0Var, list, fO, rsqVar, qsqVar, (byte) 0);
                x340Var.s0(lf60Var);
                objT = lf60Var;
            }
            ujo1.e(qim0VarF, null, zzq0VarH, d36Var, null, null, false, null, (iu30) objT, x340Var, 0, 490);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(vnr0Var, list, qsqVar, smc0Var, rsqVar, z, qim0Var2, i);
        }
    }

    public static final void d(hob1 hob1Var, float f, iu30 iu30Var, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3, znb0 znb0Var4, znb0 znb0Var5, znb0 znb0Var6, znb0 znb0Var7, boolean z, i091 i091Var, yqg yqgVar, qim0 qim0Var, znb0 znb0Var8, xpw xpwVar, boolean z2, b0k b0kVar, int i, int i2) {
        int i3;
        float f2;
        znb0 znb0Var9;
        znb0 znb0Var10;
        int i4;
        int i5;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1078580074);
        if ((i & 6) == 0) {
            i3 = (b0kVar2.i(hob1Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i3 |= b0kVar2.d(f2) ? 32 : 16;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            znb0Var9 = znb0Var;
            i3 |= b0kVar2.i(znb0Var9) ? 2048 : 1024;
        } else {
            znb0Var9 = znb0Var;
        }
        if ((i & 24576) == 0) {
            znb0Var10 = znb0Var2;
            i3 |= b0kVar2.i(znb0Var10) ? 16384 : 8192;
        } else {
            znb0Var10 = znb0Var2;
        }
        if ((i & 196608) == 0) {
            i3 |= b0kVar2.i(znb0Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i3 |= b0kVar2.i(znb0Var4) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i3 |= b0kVar2.i(znb0Var5) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= b0kVar2.i(znb0Var6) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= b0kVar2.i(znb0Var7) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (b0kVar2.h(z) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= b0kVar2.i(i091Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= b0kVar2.g(yqgVar) ? 256 : 128;
        }
        int i6 = i4 | 3072;
        if ((i2 & 24576) == 0) {
            i5 = i6 | (b0kVar2.i(znb0Var8) ? 16384 : 8192);
        } else {
            i5 = i6;
        }
        if ((i2 & 196608) == 0) {
            i5 |= b0kVar2.i(xpwVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= b0kVar2.h(z2) ? 1048576 : 524288;
        }
        if (b0kVar2.Y(i3 & 1, ((i3 & 306783379) == 306783378 && (i5 & 599187) == 599186) ? false : true)) {
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            ven0 ven0VarS = v8r.s(i091Var, b0kVar2);
            boolean zI = ((i3 & 896) == 256) | b0kVar2.i(ven0VarS);
            Object objT2 = b0kVar2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new wq9(iu30Var, ven0VarS, (byte) 26);
                b0kVar2.s0(objT2);
            }
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar2;
            w2g0.c(u291.f(qim0Var3, 1.0f), (tl3) null, apo.r(-439304988, new zci0(hob1Var, iu30Var, i091Var, f2, z2, z, xpwVar, ven0Var, yqgVar, znb0Var6, znb0Var8, (Function0) objT2, znb0Var10, znb0Var3, znb0Var4, znb0Var5, znb0Var7, znb0Var9), b0kVar2), b0kVar2, 3072, 6);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wci0(hob1Var, f, iu30Var, znb0Var, znb0Var2, znb0Var3, znb0Var4, znb0Var5, znb0Var6, znb0Var7, z, i091Var, yqgVar, qim0Var2, znb0Var8, xpwVar, z2, i, i2);
        }
    }

    public static final void e(hob1 hob1Var, float f, iu30 iu30Var, iuj iujVar, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3, znb0 znb0Var4, boolean z, qim0 qim0Var, boolean z2, znb0 znb0Var5, znb0 znb0Var6, boolean z3, znb0 znb0Var7, znb0 znb0Var8, boolean z4, znb0 znb0Var9, znb0 znb0Var10, znb0 znb0Var11, yqg yqgVar, i091 i091Var, boolean z5, vu30 vu30Var, String str, iu30 iu30Var2, b0k b0kVar, int i, int i2, int i3) {
        qim0 qim0Var2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        x340 x340Var;
        boolean z6;
        znb0 znb0Var12;
        znb0 znb0Var13;
        znb0 znb0Var14;
        znb0 znb0Var15;
        boolean z7;
        znb0 znb0Var16;
        znb0 znb0Var17;
        znb0 znb0Var18;
        yqg yqgVar2;
        i091 i091Var2;
        boolean z8;
        vu30 vu30Var2;
        String str2;
        qim0 qim0Var3;
        boolean z9;
        boolean z10;
        znb0 znb0Var19;
        znb0 znb0Var20;
        znb0 znb0Var21;
        i091 i091Var3;
        boolean z11;
        qim0 qim0Var4;
        znb0 znb0Var22;
        boolean z12;
        znb0 znb0Var23;
        boolean z13;
        String str3;
        boolean z14;
        int i19;
        vu30 vu30Var3;
        znb0 znb0Var24;
        znb0 znb0Var25;
        yqg yqgVar3;
        xpw xpwVar;
        boolean z15;
        boolean z16;
        boolean z17;
        znb0 znb0Var26;
        yqg yqgVar4;
        boolean z18;
        znb0 znb0Var27;
        boolean z19;
        vu30 vu30Var4;
        znb0 znb0Var28;
        znb0 znb0Var29;
        znb0 znb0Var30;
        yqg yqgVar5;
        boolean z20;
        String str4;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1186883985);
        int i20 = i | (x340Var2.i(hob1Var) ? 4 : 2) | (x340Var2.d(f) ? 32 : 16) | (x340Var2.i(iu30Var) ? 256 : 128) | (x340Var2.i(iujVar) ? 2048 : 1024) | (x340Var2.i(znb0Var) ? 16384 : 8192) | (x340Var2.i(znb0Var2) ? 131072 : 65536) | (x340Var2.i(znb0Var3) ? 1048576 : 524288) | (x340Var2.i(znb0Var4) ? 8388608 : 4194304);
        if ((i & 100663296) == 0) {
            i20 |= x340Var2.h(z) ? 67108864 : 33554432;
        }
        int i21 = i3 & 512;
        if (i21 != 0) {
            i4 = i20 | 805306368;
            qim0Var2 = qim0Var;
        } else {
            qim0Var2 = qim0Var;
            i4 = i20 | (x340Var2.i(qim0Var2) ? 536870912 : 268435456);
        }
        int i22 = i4;
        int i23 = ((i3 & 1024) == 0 && x340Var2.h(z2)) ? 4 : 2;
        int i24 = i3 & 2048;
        if (i24 != 0) {
            i5 = i23 | 48;
        } else {
            i5 = i23 | (x340Var2.i(znb0Var5) ? 32 : 16);
        }
        int i25 = i5;
        int i26 = i3 & 4096;
        if (i26 != 0) {
            i6 = i25 | 384;
        } else {
            i6 = i25 | (x340Var2.i(znb0Var6) ? 256 : 128);
        }
        int i27 = i3 & 8192;
        if (i27 != 0) {
            i7 = i6 | 3072;
        } else {
            i7 = i6 | (x340Var2.h(z3) ? 2048 : 1024);
        }
        int i28 = i3 & 16384;
        if (i28 != 0) {
            i8 = i7 | 24576;
        } else {
            i8 = i7 | (x340Var2.i(znb0Var7) ? 16384 : 8192);
        }
        int i29 = i3 & 32768;
        if (i29 != 0) {
            i9 = i8 | 196608;
        } else {
            i9 = i8 | (x340Var2.i(znb0Var8) ? 131072 : 65536);
        }
        int i30 = i3 & 65536;
        if (i30 != 0) {
            i10 = i9 | 1572864;
        } else {
            i10 = i9 | (x340Var2.h(z4) ? 1048576 : 524288);
        }
        int i31 = i3 & 131072;
        if (i31 != 0) {
            i11 = i10 | 12582912;
        } else {
            i11 = i10 | (x340Var2.i(znb0Var9) ? 8388608 : 4194304);
        }
        int i32 = i3 & 262144;
        if (i32 != 0) {
            i12 = i11 | 100663296;
        } else {
            i12 = i11 | (x340Var2.i(znb0Var10) ? 67108864 : 33554432);
        }
        int i33 = i3 & 524288;
        if (i33 != 0) {
            i13 = i12 | 805306368;
        } else {
            i13 = i12 | (x340Var2.i(znb0Var11) ? 536870912 : 268435456);
        }
        int i34 = i3 & 1048576;
        if (i34 != 0) {
            i14 = i2 | 6;
        } else {
            i14 = i2 | (x340Var2.g(yqgVar) ? 4 : 2);
        }
        int i35 = i3 & 2097152;
        if (i35 != 0) {
            i15 = i14 | 48;
        } else {
            i15 = i14 | (x340Var2.i(i091Var) ? 32 : 16);
        }
        int i36 = i15;
        int i37 = i3 & 4194304;
        if (i37 != 0) {
            i16 = i36 | 384;
        } else {
            i16 = i36 | (x340Var2.h(z5) ? 256 : 128);
        }
        int i38 = i3 & 8388608;
        if (i38 != 0) {
            i17 = i16 | 3072;
        } else {
            i17 = i16 | (x340Var2.i(vu30Var) ? 2048 : 1024);
        }
        int i39 = i3 & 16777216;
        if (i39 != 0) {
            i18 = i17 | 24576;
        } else {
            i18 = i17 | (x340Var2.g(str) ? 16384 : 8192);
        }
        if ((i2 & 196608) == 0) {
            i18 |= x340Var2.i(iu30Var2) ? 131072 : 65536;
        }
        if (x340Var2.Y(i22 & 1, ((i22 & 306783379) == 306783378 && (i13 & 306783379) == 306783378 && (i18 & 74899) == 74898) ? false : true)) {
            x340Var2.d0();
            int i40 = i & 1;
            qim0 qim0Var5 = nim0.a;
            if (i40 == 0 || x340Var2.E()) {
                if (i21 != 0) {
                    qim0Var2 = qim0Var5;
                }
                if ((i3 & 1024) != 0) {
                    i13 &= -15;
                    z10 = z;
                } else {
                    z10 = z2;
                }
                znb0 znb0Var31 = i24 != 0 ? null : znb0Var5;
                znb0 znb0Var32 = i26 != 0 ? null : znb0Var6;
                boolean z21 = i27 != 0 ? false : z3;
                znb0 znb0Var33 = i28 != 0 ? null : znb0Var7;
                znb0 znb0Var34 = i29 != 0 ? null : znb0Var8;
                boolean z22 = i30 != 0 ? false : z4;
                znb0Var19 = i31 != 0 ? null : znb0Var9;
                znb0Var20 = i32 != 0 ? null : znb0Var10;
                znb0Var21 = i33 != 0 ? null : znb0Var11;
                yqg yqgVar6 = i34 != 0 ? null : yqgVar;
                i091Var3 = i35 != 0 ? null : i091Var;
                boolean z23 = i37 != 0 ? false : z5;
                vu30 vu30Var5 = i38 != 0 ? null : vu30Var;
                z11 = z10;
                qim0Var4 = qim0Var2;
                znb0Var22 = znb0Var33;
                z12 = z21;
                znb0Var23 = znb0Var34;
                z13 = z22;
                str3 = i39 != 0 ? null : str;
                z14 = z23;
                i19 = i13;
                vu30Var3 = vu30Var5;
                znb0Var24 = znb0Var31;
                znb0Var25 = znb0Var32;
                yqgVar3 = yqgVar6;
            } else {
                x340Var2.b0();
                if ((i3 & 1024) != 0) {
                    i13 &= -15;
                }
                z11 = z2;
                znb0Var25 = znb0Var6;
                z12 = z3;
                znb0Var22 = znb0Var7;
                znb0Var23 = znb0Var8;
                znb0Var19 = znb0Var9;
                znb0Var20 = znb0Var10;
                znb0Var21 = znb0Var11;
                yqgVar3 = yqgVar;
                i091Var3 = i091Var;
                z14 = z5;
                str3 = str;
                qim0Var4 = qim0Var2;
                i19 = i13;
                znb0Var24 = znb0Var5;
                z13 = z4;
                vu30Var3 = vu30Var;
            }
            x340Var2.s();
            laa laaVar = znb0Var19 != null ? (dzj) znb0Var19.getValue() : null;
            if (laaVar == null) {
                x340Var2.i0(-2003386603);
                x340Var2.r(false);
                z11 = z11;
                z12 = z12;
                xpwVar = null;
            } else {
                x340Var2.i0(-2003386602);
                boolean zG = x340Var2.g(laaVar);
                Object objT = x340Var2.T();
                if (zG || objT == m4cVar) {
                    objT = q1o1.u(laaVar, u291.f(qim0Var5, 1.0f), null, 4);
                    x340Var2.s0(objT);
                }
                xpwVar = (xpw) objT;
                x340Var2.r(false);
            }
            boolean zI = x340Var2.i(hob1Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new z6h0(hob1Var, (byte) 14);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarC = i541.C(qim0Var4, (iu30) objT2);
            qim0 qim0Var6 = qim0Var4;
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            xpw xpwVar2 = xpwVar;
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarC);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z24 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z24) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            znb0 znb0Var35 = znb0Var22;
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            x360 x360Var = hob1Var.G;
            if (x360Var == null) {
                x340Var2.i0(-203120986);
                z15 = false;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-203120985);
                qim0 qim0VarZ = uyn1.z(f, 0.0f, 2, qim0Var5);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarZ);
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, x340Var2, lljVar);
                nko1.H(xos0VarM2, x340Var2, lljVar2);
                x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar4);
                iujVar.a(x360Var, x340Var2, (i22 >> 6) & 112);
                x340Var2.r(true);
                z15 = false;
                x340Var2.r(false);
            }
            if (hob1Var.h instanceof dr00) {
                x340Var2.i0(-202901629);
                String str5 = (hob1Var.a() || z13) ? null : str3;
                int i41 = i22 >> 3;
                int i42 = (i22 & 1022) | (i41 & 7168) | (i41 & 57344) | (i41 & 458752) | ((i22 >> 6) & 3670016) | (i19 & 234881024) | (i19 & 1879048192);
                int i43 = i19 >> 6;
                int i44 = (i19 & 14) | (i43 & 112) | (i43 & 896) | (i43 & 7168) | (i43 & 57344);
                int i45 = i18 << 15;
                boolean z25 = z11;
                boolean z26 = z12;
                znb0 znb0Var36 = znb0Var23;
                boolean z27 = z13;
                yqgVar5 = yqgVar3;
                znb0 znb0Var37 = znb0Var21;
                f(hob1Var, f, iu30Var, znb0Var, znb0Var2, znb0Var3, z, null, znb0Var20, znb0Var37, z25, z26, znb0Var35, znb0Var36, z27, yqgVar5, i091Var3, xpwVar2, vu30Var3, str5, iu30Var2, x340Var2, i42, i44 | (i45 & 458752) | (i45 & 3670016) | (i45 & 234881024), (i18 >> 15) & 14);
                znb0Var21 = znb0Var37;
                z16 = z25;
                z17 = z26;
                znb0Var26 = znb0Var36;
                z18 = z27;
                x340Var = x340Var2;
                x340Var.r(false);
                znb0Var27 = znb0Var35;
                i091Var3 = i091Var3;
                znb0Var28 = znb0Var24;
                znb0Var29 = znb0Var25;
                z19 = z14;
                znb0Var30 = znb0Var20;
                vu30Var4 = vu30Var3;
            } else {
                z16 = z11;
                z17 = z12;
                znb0Var26 = znb0Var23;
                z18 = z13;
                x340Var2.i0(-201810088);
                if (hob1Var.A) {
                    x340Var2.i0(-201789907);
                    if (hob1Var.a()) {
                        yqgVar4 = yqgVar3;
                        str4 = null;
                    } else {
                        yqgVar4 = yqgVar3;
                        str4 = str3;
                    }
                    int i46 = i22 & 896;
                    boolean z28 = i46 == 256;
                    Object objT3 = x340Var2.T();
                    if (z28 || objT3 == m4cVar) {
                        objT3 = new msh0(iu30Var, (byte) 26);
                        x340Var2.s0(objT3);
                    }
                    Function0 function0 = (Function0) objT3;
                    boolean z29 = i46 == 256;
                    Object objT4 = x340Var2.T();
                    if (z29 || objT4 == m4cVar) {
                        objT4 = new msh0(iu30Var, (byte) 27);
                        x340Var2.s0(objT4);
                    }
                    int i47 = i22 >> 3;
                    int i48 = (i22 & 1022) | (i47 & 7168) | (i47 & 57344) | (i47 & 458752) | ((i22 >> 6) & 3670016) | ((i18 << 18) & 29360128) | ((i18 << 24) & 234881024) | ((i22 << 24) & 1879048192);
                    int i49 = i18 << 6;
                    vu30 vu30Var6 = vu30Var3;
                    boolean z30 = z14;
                    ppo1.g(hob1Var, f, iu30Var, znb0Var, znb0Var2, znb0Var3, z, i091Var3, yqgVar4, f, function0, null, znb0Var35, xpwVar2, z30, vu30Var6, str4, (Function0) objT4, x340Var2, i48, ((i19 >> 6) & 896) | (i49 & 57344) | (i49 & 458752));
                    znb0Var27 = znb0Var35;
                    z19 = z30;
                    vu30Var4 = vu30Var6;
                    x340Var = x340Var2;
                    yqgVar5 = yqgVar4;
                    x340Var.r(false);
                    z20 = false;
                    znb0Var28 = znb0Var24;
                    znb0Var29 = znb0Var25;
                    znb0Var30 = znb0Var20;
                } else {
                    yqgVar4 = yqgVar3;
                    znb0Var27 = znb0Var35;
                    i091 i091Var4 = i091Var3;
                    z19 = z14;
                    vu30Var4 = vu30Var3;
                    x340Var2.i0(-200770472);
                    int i50 = i22 >> 3;
                    int i51 = (i22 & 1022) | (i50 & 7168) | (i50 & 57344) | (i50 & 458752);
                    int i52 = i19 >> 6;
                    znb0Var28 = znb0Var24;
                    znb0Var29 = znb0Var25;
                    znb0Var30 = znb0Var20;
                    d(hob1Var, f, iu30Var, znb0Var, znb0Var2, znb0Var3, znb0Var30, znb0Var21, znb0Var28, znb0Var4, z, i091Var4, yqgVar4, null, znb0Var29, xpwVar2, z19, x340Var2, i51 | (i52 & 3670016) | (i52 & 29360128) | ((i19 << 21) & 234881024) | ((i22 << 6) & 1879048192), ((i22 >> 24) & 14) | (i18 & 112) | ((i18 << 6) & 896) | ((i19 << 6) & 57344) | ((i18 << 12) & 3670016));
                    i091Var3 = i091Var4;
                    yqgVar5 = yqgVar4;
                    x340Var = x340Var2;
                    z20 = false;
                    x340Var.r(false);
                }
                x340Var.r(z20);
            }
            x340Var.r(true);
            znb0 znb0Var38 = znb0Var27;
            yqgVar2 = yqgVar5;
            znb0Var14 = znb0Var38;
            znb0Var17 = znb0Var30;
            znb0Var12 = znb0Var28;
            znb0Var13 = znb0Var29;
            z7 = z18;
            znb0Var18 = znb0Var21;
            z6 = z16;
            vu30Var2 = vu30Var4;
            str2 = str3;
            qim0Var3 = qim0Var6;
            z9 = z17;
            znb0Var16 = znb0Var19;
            i091Var2 = i091Var3;
            z8 = z19;
            znb0Var15 = znb0Var26;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            z6 = z2;
            znb0Var12 = znb0Var5;
            znb0Var13 = znb0Var6;
            znb0Var14 = znb0Var7;
            znb0Var15 = znb0Var8;
            z7 = z4;
            znb0Var16 = znb0Var9;
            znb0Var17 = znb0Var10;
            znb0Var18 = znb0Var11;
            yqgVar2 = yqgVar;
            i091Var2 = i091Var;
            z8 = z5;
            vu30Var2 = vu30Var;
            str2 = str;
            qim0Var3 = qim0Var2;
            z9 = z3;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new adi0(hob1Var, f, iu30Var, iujVar, znb0Var, znb0Var2, znb0Var3, znb0Var4, z, qim0Var3, z6, znb0Var12, znb0Var13, z9, znb0Var14, znb0Var15, z7, znb0Var16, znb0Var17, znb0Var18, yqgVar2, i091Var2, z8, vu30Var2, str2, iu30Var2, i, i2, i3);
        }
    }

    public static final void f(hob1 hob1Var, float f, iu30 iu30Var, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3, boolean z, qim0 qim0Var, znb0 znb0Var4, znb0 znb0Var5, boolean z2, boolean z3, znb0 znb0Var6, znb0 znb0Var7, boolean z4, yqg yqgVar, i091 i091Var, xpw xpwVar, vu30 vu30Var, String str, iu30 iu30Var2, b0k b0kVar, int i, int i2, int i3) {
        hob1 hob1Var2;
        int i4;
        float f2;
        iu30 iu30Var3;
        znb0 znb0Var8;
        int i5;
        znb0 znb0Var9;
        int i6;
        qim0 qim0Var2;
        qim0 qim0Var3;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1224590584);
        if ((i & 6) == 0) {
            hob1Var2 = hob1Var;
            i4 = (b0kVar2.i(hob1Var2) ? 4 : 2) | i;
        } else {
            hob1Var2 = hob1Var;
            i4 = i;
        }
        if ((i & 48) == 0) {
            f2 = f;
            i4 |= b0kVar2.d(f2) ? 32 : 16;
        } else {
            f2 = f;
        }
        if ((i & 384) == 0) {
            iu30Var3 = iu30Var;
            i4 |= b0kVar2.i(iu30Var3) ? 256 : 128;
        } else {
            iu30Var3 = iu30Var;
        }
        if ((i & 3072) == 0) {
            i4 |= b0kVar2.i(znb0Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            znb0Var8 = znb0Var2;
            i4 |= b0kVar2.i(znb0Var8) ? 16384 : 8192;
        } else {
            znb0Var8 = znb0Var2;
        }
        if ((i & 196608) == 0) {
            i4 |= b0kVar2.i(znb0Var3) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i4 |= b0kVar2.h(z) ? 1048576 : 524288;
        }
        int i7 = i4 | 12582912;
        if ((i & 100663296) == 0) {
            i7 |= b0kVar2.i(znb0Var4) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i7 |= b0kVar2.i(znb0Var5) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i5 = i2 | (b0kVar2.h(z2) ? 4 : 2);
        } else {
            i5 = i2;
        }
        if ((i2 & 48) == 0) {
            i5 |= b0kVar2.h(z3) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            znb0Var9 = znb0Var6;
            i5 |= b0kVar2.i(znb0Var9) ? 256 : 128;
        } else {
            znb0Var9 = znb0Var6;
        }
        if ((i2 & 3072) == 0) {
            i5 |= b0kVar2.i(znb0Var7) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i5 |= b0kVar2.h(z4) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i5 |= b0kVar2.g(yqgVar) ? 131072 : 65536;
        }
        if ((i2 & 1572864) == 0) {
            i5 |= b0kVar2.i(i091Var) ? 1048576 : 524288;
        }
        if ((i2 & 12582912) == 0) {
            i5 |= b0kVar2.i(xpwVar) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i5 |= b0kVar2.i(vu30Var) ? 67108864 : 33554432;
        }
        if ((i2 & 805306368) == 0) {
            i5 |= b0kVar2.g(str) ? 536870912 : 268435456;
        }
        if ((i3 & 6) == 0) {
            i6 = i3 | (b0kVar2.i(iu30Var2) ? 4 : 2);
        } else {
            i6 = i3;
        }
        if (b0kVar2.Y(i7 & 1, ((i7 & 306783379) == 306783378 && (i5 & 306783379) == 306783378 && (i6 & 3) == 2) ? false : true)) {
            b0kVar2.d0();
            if ((i & 1) == 0 || b0kVar2.E()) {
                qim0Var3 = nim0.a;
            } else {
                b0kVar2.b0();
                qim0Var3 = qim0Var;
            }
            b0kVar2.s();
            i(hob1Var2, z, z2, i091Var, iu30Var2, iu30Var3, yqgVar, z3, znb0Var8, znb0Var9, znb0Var7, z4, znb0Var3, xpwVar, f2, znb0Var4, znb0Var5, vu30Var, str, b0kVar2, 0);
            b0kVar2 = b0kVar2;
            qim0 qim0Var4 = qim0Var3;
            h(f, znb0Var, hob1Var, i091Var, yqgVar, qim0Var4, iu30Var, b0kVar2, 0);
            qim0Var2 = qim0Var4;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bdi0(hob1Var, f, iu30Var, znb0Var, znb0Var2, znb0Var3, z, qim0Var2, znb0Var4, znb0Var5, z2, z3, znb0Var6, znb0Var7, z4, yqgVar, i091Var, xpwVar, vu30Var, str, iu30Var2, i, i2, i3);
        }
    }

    public static final void g(xzz0 xzz0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        String strN0;
        vzz0 vzz0Var = xzz0Var.a;
        String str = vzz0Var.a;
        String str2 = vzz0Var.b;
        vzz0 vzz0Var2 = xzz0Var.b;
        String str3 = vzz0Var2.b;
        String str4 = vzz0Var2.a;
        boolean z = xzz0Var.d;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-783581881);
        int i2 = (x340Var2.g(xzz0Var) ? 4 : 2) | i | 48;
        if (x340Var2.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            gfh0 gfh0VarC = t1c.c(xzz0Var.a() ? een.i : een.g, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            if (xzz0Var.a()) {
                x340Var2.i0(-2129836064);
                int i3 = z ? 2131960874 : 2131960873;
                if (str3 == null) {
                    str3 = str4;
                }
                strN0 = cwl1.n0(i3, new Object[]{str3}, x340Var2);
                x340Var2.r(false);
            } else if (u890.j(str4, xzz0Var.c)) {
                x340Var2.i0(-2129589645);
                int i4 = z ? 2131960869 : 2131960868;
                if (str2 != null) {
                    str = str2;
                }
                strN0 = cwl1.n0(i4, new Object[]{str}, x340Var2);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-2129346543);
                int i5 = z ? 2131960872 : 2131960871;
                if (str2 != null) {
                    str = str2;
                }
                if (str3 == null) {
                    str3 = str4;
                }
                strN0 = cwl1.n0(i5, new Object[]{str, str3}, x340Var2);
                x340Var2.r(false);
            }
            zic0 zic0Var = new zic0(2);
            uwr uwrVar = cbx.a;
            qim0Var2 = qim0Var3;
            uwo1.e(strN0, null, cbx.d(x340Var2).m, cbx.a(x340Var2).b.b, new a0e1(xzz0Var.a() ? 6 : 5), null, 0, false, zic0Var, 0, null, x340Var2, 0, 0, 1762);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kpw0(xzz0Var, qim0Var2, i, (byte) 15);
        }
    }

    public static final void h(float f, znb0 znb0Var, hob1 hob1Var, i091 i091Var, yqg yqgVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        Object cdi0Var;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-578357259);
        int i2 = i | (x340Var.d(f) ? 4 : 2) | (x340Var.i(znb0Var) ? 32 : 16) | (x340Var.i(hob1Var) ? 256 : 128) | (x340Var.i(i091Var) ? 2048 : 1024) | (x340Var.g(yqgVar) ? 16384 : 8192) | (x340Var.i(qim0Var) ? 131072 : 65536) | (x340Var.i(iu30Var2) ? 1048576 : 524288);
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0VarZ = uyn1.z(f, 0.0f, 2, qim0Var);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            maa maaVar = (maa) znb0Var.getValue();
            lfi0 lfi0Var = hob1Var.k;
            hfi0 hfi0VarM = bth.m(hob1Var, iu30Var2);
            boolean z = hob1Var.A;
            int i3 = 3670016 & i2;
            boolean zI = (i3 == 1048576) | x340Var.i(hob1Var) | x340Var.i(i091Var) | ((i2 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                cdi0Var = new cdi0(iu30Var, hob1Var, i091Var, yqgVar, (byte) 0);
                iu30Var2 = iu30Var;
                x340Var.s0(cdi0Var);
            } else {
                cdi0Var = objT;
            }
            Function0 function0 = (Function0) cdi0Var;
            boolean z2 = i3 == 1048576;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new msh0(iu30Var2, (byte) 28);
                x340Var.s0(objT2);
            }
            otw.c(maaVar, lfi0.a(lfi0Var, (wcm) null, z, function0, (Function0) objT2, hfi0VarM, 26177535), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xz2(f, znb0Var, hob1Var, i091Var, yqgVar, qim0Var, iu30Var2, i);
        }
    }

    public static final void i(hob1 hob1Var, boolean z, boolean z2, i091 i091Var, iu30 iu30Var, iu30 iu30Var2, yqg yqgVar, boolean z3, znb0 znb0Var, znb0 znb0Var2, znb0 znb0Var3, boolean z4, znb0 znb0Var4, xpw xpwVar, float f, znb0 znb0Var5, znb0 znb0Var6, vu30 vu30Var, String str, b0k b0kVar, int i) {
        x340 x340Var;
        iu30 iu30Var3;
        Object cdi0Var;
        int i2;
        int i3;
        boolean z5;
        hob1 hob1Var2 = hob1Var;
        iu30 iu30Var4 = iu30Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(522473595);
        int i4 = i | (x340Var2.i(hob1Var2) ? 4 : 2) | (x340Var2.h(z) ? 32 : 16) | (x340Var2.h(z2) ? 256 : 128) | (x340Var2.i(i091Var) ? 2048 : 1024) | (x340Var2.i(iu30Var) ? 16384 : 8192) | (x340Var2.i(iu30Var4) ? 131072 : 65536) | (x340Var2.g(yqgVar) ? 1048576 : 524288) | (x340Var2.h(z3) ? 8388608 : 4194304) | (x340Var2.i(znb0Var) ? 67108864 : 33554432) | (x340Var2.i(znb0Var2) ? 536870912 : 268435456);
        int i5 = (x340Var2.i(znb0Var3) ? 4 : 2) | (x340Var2.h(z4) ? 32 : 16) | (x340Var2.i(znb0Var4) ? 256 : 128) | (x340Var2.i(xpwVar) ? 2048 : 1024) | (x340Var2.d(f) ? 16384 : 8192) | (x340Var2.i(znb0Var5) ? 131072 : 65536) | (x340Var2.i(znb0Var6) ? 1048576 : 524288) | (x340Var2.i(vu30Var) ? 8388608 : 4194304) | (x340Var2.g(str) ? 67108864 : 33554432);
        if (x340Var2.Y(i4 & 1, ((i4 & 306783379) == 306783378 && (i5 & 38347923) == 38347922) ? false : true)) {
            qim0 qim0VarB = nim0.a;
            if (z3) {
                x340Var2.i0(52110704);
                if (str != null) {
                    qim0VarB = s161.b(qim0VarB, false, new atp0(str, (byte) 4));
                }
                qim0 qim0Var = qim0VarB;
                j2i j2iVarL = l(hob1Var2, x340Var2);
                j2i j2iVarR = apo.r(-1175120558, new q0g0(hob1Var2, vu30Var, (byte) 19), x340Var2);
                int i6 = i4 & 458752;
                boolean zI = (i6 == 131072) | x340Var2.i(hob1Var2) | x340Var2.i(i091Var) | ((i4 & 3670016) == 1048576);
                Object objT = x340Var2.T();
                if (zI || objT == m4cVar) {
                    i2 = i6;
                    i3 = 131072;
                    z5 = true;
                    cdi0Var = new cdi0(iu30Var4, hob1Var2, i091Var, yqgVar, (byte) 1);
                    iu30Var4 = iu30Var4;
                    x340Var2.s0(cdi0Var);
                } else {
                    i2 = i6;
                    cdi0Var = objT;
                    i3 = 131072;
                    z5 = true;
                }
                Function0 function0 = (Function0) cdi0Var;
                boolean z6 = i2 == i3 ? z5 : false;
                Object objT2 = x340Var2.T();
                if (z6 || objT2 == m4cVar) {
                    objT2 = new msh0(iu30Var4, (byte) 29);
                    x340Var2.s0(objT2);
                }
                u2o1.d(hob1Var, j2iVarR, function0, (Function0) objT2, apo.r(1588486869, new e9g0((Object) hob1Var, (Object) znb0Var6, (Object) znb0Var5, (Object) iu30Var4, (Object) znb0Var, (byte) 4), x340Var2), qim0Var, apo.r(1999236055, new uci0(hob1Var, znb0Var4, i091Var, yqgVar, iu30Var2, (byte) 2), x340Var2), f, j2iVarL, x340Var2, 1597488 | (i4 & 14) | ((i5 << 9) & 29360128));
                x340Var2.r(false);
                x340Var = x340Var2;
            } else {
                x340Var2.i0(52919029);
                if (str != null) {
                    qim0VarB = s161.b(qim0VarB, false, new atp0(str, (byte) 4));
                }
                qim0 qim0Var2 = qim0VarB;
                j2i j2iVarL2 = l(hob1Var2, x340Var2);
                j2i j2iVarR2 = apo.r(566460927, new zoe(hob1Var2, iu30Var, iu30Var2, z, yqgVar, znb0Var3, z4, i091Var, z2, vu30Var), x340Var2);
                int i7 = i4 & 458752;
                boolean zI2 = (i7 == 131072) | x340Var2.i(hob1Var2) | x340Var2.i(i091Var) | ((i4 & 3670016) == 1048576);
                Object objT3 = x340Var2.T();
                if (zI2 || objT3 == m4cVar) {
                    cdi0 cdi0Var2 = new cdi0(iu30Var2, hob1Var2, i091Var, yqgVar, (byte) 2);
                    iu30Var3 = iu30Var2;
                    hob1Var2 = hob1Var2;
                    x340Var2.s0(cdi0Var2);
                    objT3 = cdi0Var2;
                } else {
                    iu30Var3 = iu30Var2;
                }
                Function0 function1 = (Function0) objT3;
                boolean z7 = i7 == 131072;
                Object objT4 = x340Var2.T();
                if (z7 || objT4 == m4cVar) {
                    objT4 = new edi0(iu30Var3, (byte) 1);
                    x340Var2.s0(objT4);
                }
                x340Var = x340Var2;
                ob51.b(hob1Var, j2iVarR2, function1, (Function0) objT4, apo.r(-1116041572, new tci0(hob1Var2, znb0Var, iu30Var3, (byte) 5), x340Var2), apo.r(-245219973, new w0f0((Object) znb0Var2, (Object) hob1Var2, (Object) i091Var, (Object) iu30Var3, (byte) 11), x340Var2), apo.r(625601626, new ey((Object) hob1Var, (Object) i091Var, z, (Object) xpwVar, (Object) yqgVar, (byte) 29), x340Var2), z2, qim0Var2, i091Var, z4, apo.r(221704136, new uci0(hob1Var, znb0Var4, i091Var, yqgVar, iu30Var2, (byte) 1), x340Var2), f, j2iVarL2, x340Var, (i4 & 14) | 1794096 | ((i4 << 15) & 29360128) | ((i4 << 18) & 1879048192), ((i5 >> 3) & 14) | 48 | ((i5 >> 6) & 896));
                x340Var.r(false);
            }
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ddi0(hob1Var, z, z2, i091Var, iu30Var, iu30Var2, yqgVar, z3, znb0Var, znb0Var2, znb0Var3, z4, znb0Var4, xpwVar, f, znb0Var5, znb0Var6, vu30Var, str, i);
        }
    }

    public static final void j(hob1 hob1Var, znb0 znb0Var, iu30 iu30Var, x340 x340Var) {
        uho uhoVar = hob1Var.p;
        if (uhoVar == null) {
            x340Var.i0(2132237026);
            x340Var.r(false);
            return;
        }
        x340Var.i0(2132237027);
        maa maaVar = (maa) znb0Var.getValue();
        boolean zG = x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new edi0(iu30Var, (byte) 2);
            x340Var.s0(objT);
        }
        otw.c(maaVar, uho.a(uhoVar, (Function0) objT), (qim0) null, (ipb1) null, x340Var, 8, 12);
        x340Var.r(false);
    }

    public static final void k(hob1 hob1Var, znb0 znb0Var, i091 i091Var, yqg yqgVar, iu30 iu30Var, x340 x340Var) {
        if (!hob1Var.n.b) {
            x340Var.i0(477828383);
            x340Var.r(false);
            return;
        }
        x340Var.i0(477149917);
        maa maaVar = (maa) znb0Var.getValue();
        set0 set0Var = hob1Var.n;
        boolean z = hob1Var.E;
        boolean z2 = hob1Var.D;
        vm1 kks0Var = set0Var.h;
        sq51 sq51Var = hob1Var.K;
        if (z && i091Var != null) {
            kks0Var = new vm1(z2, i091Var, yqgVar, (byte) 18);
        } else if (sq51Var != null) {
            kks0Var = new kks0(sq51Var, (byte) 8);
        } else if (!z) {
            kks0Var = null;
        }
        boolean zG = x340Var.g(iu30Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new edi0(iu30Var, (byte) 3);
            x340Var.s0(objT);
        }
        otw.c(maaVar, set0.a(set0Var, (Function0) objT, kks0Var, 1903), (qim0) null, (ipb1) null, x340Var, 0, 12);
        x340Var.r(false);
    }

    public static final j2i l(hob1 hob1Var, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1069978319);
        String str = hob1Var.s;
        jiv0 jiv0Var = hob1Var.u;
        j2i j2iVarR = (str == null || jiv0Var == null) ? null : apo.r(-894355198, new q0g0(str, jiv0Var, (byte) 20), x340Var);
        x340Var.r(false);
        return j2iVarR;
    }

    public static final void m(File file, float f, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(949902486);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(file) ? 4 : 2) | (x340Var.d(f) ? 32 : 16) | 384 | (x340Var.i(function0) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.i0(-994376836);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            ni7 ni7VarA = oi7.a(Uri.fromFile(file), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, x340Var, 0, 0, 131070);
            jsl jslVar = new jsl(cwl1.o0(x340Var, 2131963562));
            qim0 qim0VarQ = i1p1.q(d7e.r(f, u291.h(qim0Var3, 100.0f), false), cr31VarB);
            avw0 avw0Var = cbx.b(x340Var).c;
            qim0 qim0VarE2 = d1u.E(1.0f, cbx.a(x340Var).c.b, qim0VarQ, cr31VarB);
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            eso1.h(ni7VarA, jslVar, qim0VarE2, (p3v) null, (zvx) null, new ecx(f), as80Var, (tl3) null, (ColorFilter) null, x340Var, 0, 408);
            x340Var = x340Var;
            qim0 qim0VarX = bin.x(dug.f(i1p1.q(u291.r(eqr0.C(h2c.a.a(qim0Var3, een.f), 8.0f, -8.0f), 16.0f), er31.a), ((vex) zex.a.b).a, d4o1.a), false, null, null, null, function0, 15);
            gfh0 gfh0VarC2 = t1c.c(een.h, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            w0h1.a(gux.c, new jsl(cwl1.o0(x340Var, 2131963570)), u291.r(qim0Var3, 16.0f), 0L, 0L, false, x340Var, gux.d, 56);
            us71.m(x340Var, true, true, false);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ys((Object) file, f, (Object) qim0Var2, (Object) function0, i, (byte) 14);
        }
    }

    public static final void n(soc1 soc1Var, lzn0 lzn0Var, ryf ryfVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-185060567);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(soc1Var) : x340Var.i(soc1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(lzn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(ryfVar) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            irn1.u(null, vlj.a, null, null, apo.r(1874351376, new nu31(soc1Var, lzn0Var, ryfVar), x340Var), x340Var, 24624, 13);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uoc1(i, soc1Var, lzn0Var, ryfVar, qim0Var2, (byte) 0);
        }
    }

    public static final void o(int i, Function0 function0, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(442209727);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(function0) ? 4 : 2) | (x340Var.h(z) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.z(0.0f, f, 1, qim0Var3), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            boolean z3 = (i2 & 14) == 4;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                objT = new sah1(function0, (byte) 11);
                x340Var.s0(objT);
            }
            qim0 qim0VarF3 = dug.f(bin.x(qim0VarF2, false, null, null, null, (Function0) objT, 15), cbx.a(x340Var).a.b.a(), d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarF3, 16.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            two1.b(z ? m061.a : o061.a, u291.h(qim0Var3, 24.0f), x340Var, 0, 0);
            uwo1.e(cwl1.o0(x340Var, 2131963561), null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new le3(i, function0, qim0Var2, z);
        }
    }

    public static final void p(w9i1 w9i1Var, Function0 function0, Function0 function1, n9i1 n9i1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(387611584);
        int i2 = i | (x340Var.i(w9i1Var) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128) | (x340Var.i(n9i1Var) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            two1.p(function0, qim0Var3, w9i1Var.Y0, null, false, false, apo.r(-676699476, new wpg1((Object) w9i1Var, (Object) function1, (Object) n9i1Var, (byte) 15), x340Var), x340Var, ((i2 >> 3) & 14) | 1572912, 56);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tte1((byte) 10, i, w9i1Var, function0, function1, n9i1Var, qim0Var2);
        }
    }

    public static final boolean q(n511 n511Var, float f, float f2) {
        float f3 = n511Var.a;
        if (f > n511Var.c || f3 > f) {
            return false;
        }
        return f2 <= n511Var.d && n511Var.b <= f2;
    }

    public static final qtw r(bh4 bh4Var, uxy0 uxy0Var) {
        sb7 sb7Var = (sb7) uxy0Var.c;
        jtl1 jtl1Var = (jtl1) uxy0Var.b;
        int iOrdinal = bh4Var.ordinal();
        if (iOrdinal == 0) {
            return null;
        }
        if (iOrdinal == 1) {
            return f6o1.A(new hf2(jtl1Var, sb7Var, true, "spotify:now-playing:queue"), null, null, 3);
        }
        if (iOrdinal == 2) {
            return f6o1.A(new hf2(jtl1Var, sb7Var, false, "spotify:now-playing:jam"), null, null, 3);
        }
        eg.o();
        return null;
    }

    public static final boolean s(ses0 ses0Var) {
        int i = ses0Var.a;
        for (int i2 = 0; i2 < i; i2++) {
            if (ses0Var.g(i2)) {
                return true;
            }
        }
        return false;
    }

    public static final go80 t(klm klmVar, ibp0 ibp0Var) {
        return klmVar.a("AbandonAudioFocusDaemon", new ivn0(ibp0Var, (byte) 27));
    }

    public static final zfx u(wfx wfxVar) {
        return new zfx(wfxVar, (byte) 18);
    }

    public static boolean v(vf4 vf4Var) {
        return vf4Var.b();
    }

    public static final xfn0 w(xfn0 xfn0Var, i091 i091Var, iu30 iu30Var, x340 x340Var, int i) {
        ven0 ven0VarS = v8r.s(i091Var, x340Var);
        ven0 ven0VarS2 = v8r.s(iu30Var, x340Var);
        boolean zG = x340Var.g(xfn0Var);
        Object objT = x340Var.T();
        if (zG || objT == fkj0.X) {
            objT = new xfn0(new dt90(xfn0Var, ven0VarS2, ven0VarS, (byte) 20));
            x340Var.s0(objT);
        }
        return (xfn0) objT;
    }

    public static final hji0 x(gji0 gji0Var) {
        zw zwVar = zw.e;
        String str = gji0Var.b;
        String str2 = gji0Var.d;
        boolean z = gji0Var.a;
        String str3 = gji0Var.f;
        String str4 = gji0Var.g;
        String str5 = gji0Var.h;
        String str6 = gji0Var.c;
        String str7 = gji0Var.i;
        String str8 = gji0Var.j;
        String str9 = gji0Var.k;
        int iC = l1d.C(gji0Var.e);
        if (iC != 0) {
            if (iC == 1) {
                zwVar = zw.d;
            } else if (iC != 2) {
                if (iC != 3) {
                    eg.o();
                    return null;
                }
                zwVar = zw.c;
            }
        }
        return new hji0(str, str2, zwVar, z, str3, str5, str6, str4, str7, str8, str9);
    }

    public static final m9g1 y(m9g1 m9g1Var, i091 i091Var, boolean z, yqg yqgVar) {
        return (m9g1Var == null || i091Var == null) ? m9g1Var : m9g1.a(m9g1Var, new w8g1(ebp1.q(i091Var), z, new dvg0(i091Var, yqgVar, (byte) 5)), (iu30) null, 239);
    }

    public static final Long z(hob1 hob1Var, i091 i091Var, yqg yqgVar) {
        Long l;
        if (hob1Var.D) {
            if (i091Var != null) {
                return Long.valueOf(ebp1.o(i091Var, yqgVar != null ? Long.valueOf(yqgVar.b()) : null));
            }
        } else if (i091Var != null) {
            Long lValueOf = yqgVar != null ? Long.valueOf(yqgVar.b()) : null;
            lsm0 lsm0Var = i091Var.a;
            if (lsm0Var == null) {
                return null;
            }
            jsm0 jsm0Var = lsm0Var.e;
            return Long.valueOf(ebp1.o(i091Var, lValueOf) + ((jsm0Var == null || (l = jsm0Var.a) == null) ? 0L : l.longValue()));
        }
        return null;
    }
}
