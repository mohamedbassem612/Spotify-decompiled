package p;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.graphics.Rect;
import android.opengl.Matrix;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Gravity;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class qpn1 {
    public static final float[][] a = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};
    public static b180 b;

    public static final void a(int i, String str, String str2, Function0 function0, b0k b0kVar, hux huxVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(175744402);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(huxVar) : b0kVar3.i(huxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(str2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(function0) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            boolean z = (i2 & 7168) == 2048;
            Object objT = b0kVar3.T();
            if (z || objT == m4cVar) {
                objT = new pj8(function0, (byte) 16);
                b0kVar3.s0(objT);
            }
            gbx gbxVar = new gbx(z50.c, (Function0) objT);
            gdx gdxVarS = yla.s(b0kVar3);
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = wnb.Y;
                b0kVar3.s0(objT2);
            }
            vu30 vu30Var = (vu30) objT2;
            Object objT3 = b0kVar3.T();
            if (objT3 == m4cVar) {
                objT3 = wnb.Z;
                b0kVar3.s0(objT3);
            }
            hdx hdxVar = new hdx(18, vu30Var, (vu30) objT3, (vu30) null, er31.b(45.0f), 8);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(12.0f, 6.0f, 12.0f, 6.0f);
            boolean z2 = (i2 & 896) == 256;
            Object objT4 = b0kVar3.T();
            if (z2 || objT4 == m4cVar) {
                objT4 = new w8c(str2, (byte) 3);
                b0kVar3.s0(objT4);
            }
            b0kVar2 = b0kVar3;
            foo1.c(gbxVar, hdxVar, s161.b(qim0Var, false, (iu30) objT4), null, gdxVarS, zzq0Var, null, null, apo.r(-1760872446, new f90(huxVar, (byte) 4), b0kVar3), null, apo.r(1333138961, new j3b(str, (byte) 10), b0kVar3), b0kVar2, 805306368, 48, 1432);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new h70(str, huxVar, str2, function0, qim0Var, i);
        }
    }

    public static final void b(hdg0 hdg0Var, Function0 function0, Function0 function1, Function0 function2, iu30 iu30Var, iu30 iu30Var2, iu30 iu30Var3, iu30 iu30Var4, iu30 iu30Var5, lzn0 lzn0Var, nwa nwaVar, ezc ezcVar, ezc ezcVar2, boolean z, boolean z2, qim0 qim0Var, boolean z3, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-569613045);
        if ((i & 6) == 0) {
            i2 = (x340Var2.i(hdg0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(function2) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var2.i(iu30Var2) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var2.i(iu30Var3) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var2.i(iu30Var4) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i2 |= x340Var2.i(iu30Var5) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i2 |= x340Var2.i(lzn0Var) ? 536870912 : 268435456;
        }
        int i3 = (x340Var2.i(nwaVar) ? 4 : 2) | (x340Var2.i(ezcVar) ? 32 : 16) | (x340Var2.i(ezcVar2) ? 256 : 128) | (x340Var2.h(z) ? 2048 : 1024) | (x340Var2.h(z2) ? 16384 : 8192) | 196608 | (x340Var2.h(z3) ? 1048576 : 524288);
        int i4 = i2;
        if (x340Var2.Y(i4 & 1, ((i2 & 306783379) == 306783378 && (i3 & 599187) == 599186) ? false : true)) {
            Boolean bool = Boolean.FALSE;
            ven0 ven0VarG = rwq.g(ezcVar, bool, null, x340Var2, ((i3 >> 3) & 14) | 48, 2);
            ven0 ven0VarG2 = rwq.g(ezcVar2, bool, null, x340Var2, ((i3 >> 6) & 14) | 48, 2);
            Object objT = x340Var2.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = new lb9();
                x340Var2.s0(objT);
            }
            lb9 lb9Var = (lb9) objT;
            boolean zG = x340Var2.g(lzn0Var) | ((i3 & 3670016) == 1048576);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == obj) {
                objT2 = new g2f0(lzn0Var, z3);
                x340Var2.s0(objT2);
            }
            g2f0 g2f0Var = (g2f0) objT2;
            Object objT3 = x340Var2.T();
            if (objT3 == obj) {
                objT3 = new ti51();
                x340Var2.s0(objT3);
            }
            ti51 ti51Var = (ti51) objT3;
            Object objT4 = x340Var2.T();
            if (objT4 == obj) {
                objT4 = new kjn0(lzn0Var);
                x340Var2.s0(objT4);
            }
            kjn0 kjn0Var = (kjn0) objT4;
            Object objT5 = x340Var2.T();
            if (objT5 == obj) {
                objT5 = new j6r(nwaVar, lzn0Var);
                x340Var2.s0(objT5);
            }
            j6r j6rVar = (j6r) objT5;
            Object objT6 = x340Var2.T();
            if (objT6 == obj) {
                objT6 = new fx();
                x340Var2.s0(objT6);
            }
            fx fxVar = (fx) objT6;
            Object objT7 = x340Var2.T();
            if (objT7 == obj) {
                objT7 = new gw3();
                x340Var2.s0(objT7);
            }
            gw3 gw3Var = (gw3) objT7;
            Object objT8 = x340Var2.T();
            if (objT8 == obj) {
                objT8 = new x4g0();
                x340Var2.s0(objT8);
            }
            x4g0 x4g0Var = (x4g0) objT8;
            boolean z4 = (i4 & 57344) == 16384;
            Object objT9 = x340Var2.T();
            if (z4 || objT9 == obj) {
                objT9 = new tr00(iu30Var);
                x340Var2.s0(objT9);
            }
            tr00 tr00Var = (tr00) objT9;
            boolean z5 = (i4 & 458752) == 131072;
            Object objT10 = x340Var2.T();
            if (z5 || objT10 == obj) {
                objT10 = new mij1(iu30Var2);
                x340Var2.s0(objT10);
            }
            mij1 mij1Var = (mij1) objT10;
            Object objT11 = x340Var2.T();
            if (objT11 == obj) {
                objT11 = new oyr0(lzn0Var);
                x340Var2.s0(objT11);
            }
            oyr0 oyr0Var = (oyr0) objT11;
            Object objT12 = x340Var2.T();
            if (objT12 == obj) {
                objT12 = new k1k1(lzn0Var);
                x340Var2.s0(objT12);
            }
            k1k1 k1k1Var = (k1k1) objT12;
            Object objT13 = x340Var2.T();
            if (objT13 == obj) {
                objT13 = new oex0(lzn0Var);
                x340Var2.s0(objT13);
            }
            oex0 oex0Var = (oex0) objT13;
            boolean z6 = (i4 & 29360128) == 8388608;
            Object objT14 = x340Var2.T();
            if (z6 || objT14 == obj) {
                objT14 = new u7j0(iu30Var4);
                x340Var2.s0(objT14);
            }
            u7j0 u7j0Var = (u7j0) objT14;
            boolean z7 = (i4 & 234881024) == 67108864;
            Object objT15 = x340Var2.T();
            if (z7 || objT15 == obj) {
                objT15 = new lhd0(iu30Var5);
                x340Var2.s0(objT15);
            }
            lhd0 lhd0Var = (lhd0) objT15;
            boolean z8 = (i4 & 3670016) == 1048576;
            Object objT16 = x340Var2.T();
            if (z8 || objT16 == obj) {
                objT16 = new b0v0(iu30Var3);
                x340Var2.s0(objT16);
            }
            b0v0 b0v0Var = (b0v0) objT16;
            Object objT17 = x340Var2.T();
            if (objT17 == obj) {
                objT17 = new a81(lzn0Var);
                x340Var2.s0(objT17);
            }
            a81 a81Var = (a81) objT17;
            Object objT18 = x340Var2.T();
            if (objT18 == obj) {
                objT18 = new o921(lzn0Var);
                x340Var2.s0(objT18);
            }
            o921 o921Var = (o921) objT18;
            Object objT19 = x340Var2.T();
            if (objT19 == obj) {
                objT19 = new c0c1(lzn0Var);
                x340Var2.s0(objT19);
            }
            c0c1 c0c1Var = (c0c1) objT19;
            g431 g431VarH = ((cir0) x340Var2.k(k2r0.a)).h();
            Object objT20 = x340Var2.T();
            if (objT20 == obj) {
                objT20 = g431VarH.a(uj1.x, new v9g0(function1, (byte) 3));
                x340Var2.s0(objT20);
            }
            b431 b431Var = (b431) objT20;
            Object objT21 = x340Var2.T();
            if (objT21 == obj) {
                objT21 = new ca50(new u9g0(b431Var, (byte) 4));
                x340Var2.s0(objT21);
            }
            ca50 ca50Var = (ca50) objT21;
            Object objT22 = x340Var2.T();
            if (objT22 == obj) {
                objT22 = new fa50(new u9g0(b431Var, (byte) 5));
                x340Var2.s0(objT22);
            }
            fa50 fa50Var = (fa50) objT22;
            Object objT23 = x340Var2.T();
            if (objT23 == obj) {
                objT23 = new lfs0(lzn0Var);
                x340Var2.s0(objT23);
            }
            lfs0 lfs0Var = (lfs0) objT23;
            Object objT24 = x340Var2.T();
            if (objT24 == obj) {
                objT24 = g431VarH.a(iwe.c, new v9g0(function2, (byte) 2));
                x340Var2.s0(objT24);
            }
            b431 b431Var2 = (b431) objT24;
            Object objT25 = x340Var2.T();
            if (objT25 == obj) {
                objT25 = new k6t(new u9g0(b431Var2, (byte) 3));
                x340Var2.s0(objT25);
            }
            k6t k6tVar = (k6t) objT25;
            Integer num = hdg0Var.e;
            long jE = num != null ? z4p1.e(num.intValue() | (-16777216)) : u7h.j;
            k2t0 k2t0VarV = kkn.v(ti5.g(x340Var2), x340Var2);
            xtb0 xtb0VarA = aub0.a(0, x340Var2, 3);
            Object objT26 = x340Var2.T();
            if (objT26 == obj) {
                objT26 = yv91.a(new nxb0(xtb0VarA, (byte) 5));
                x340Var2.s0(objT26);
            }
            tob1 tob1Var = (tob1) objT26;
            Object objT27 = x340Var2.T();
            if (objT27 == obj) {
                objT27 = yv91.a(new nxb0(xtb0VarA, (byte) 7));
                x340Var2.s0(objT27);
            }
            tob1 tob1Var2 = (tob1) objT27;
            Object objT28 = x340Var2.T();
            if (objT28 == obj) {
                objT28 = yv91.a(new nxb0(xtb0VarA, (byte) 6));
                x340Var2.s0(objT28);
            }
            tob1 tob1Var3 = (tob1) objT28;
            wat watVar = (wat) x340Var2.k(t4k.h);
            float fMax = 1.0f;
            if (((Number) tob1Var.getValue()).intValue() <= 0 && !((Boolean) tob1Var3.getValue()).booleanValue()) {
                fMax = Math.max(0.0f, Math.min(1.0f, (((Number) tob1Var2.getValue()).intValue() - 200.0f) / 150.0f));
            }
            j2t0 j2t0Var = k2t0VarV.c;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarL = bmq0.L(qim0Var3, j2t0Var, (g6o0) null);
            WeakHashMap weakHashMap = osl1.x;
            long j = jE;
            irn1.u(qim0VarL, apo.r(-376952648, new r9g0(j, fMax, k2t0VarV, (Object) hdg0Var, function0, (byte) 1), x340Var2), null, new bgc0(lhc.g(x340Var2).g, 32), apo.r(389190322, new lbg0(watVar, xtb0VarA, hdg0Var, j, g2f0Var, z2, ven0VarG2, z, tr00Var, mij1Var, ven0VarG, u7j0Var, lhd0Var, b0v0Var, lb9Var, ca50Var, ti51Var, fa50Var, lfs0Var, oyr0Var, k1k1Var, oex0Var, kjn0Var, j6rVar, fxVar, gw3Var, x4g0Var, a81Var, o921Var, k6tVar, c0c1Var), x340Var2), x340Var2, 24624, 4);
            x340Var = x340Var2;
            qim0Var2 = qim0Var3;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mbg0(hdg0Var, function0, function1, function2, iu30Var, iu30Var2, iu30Var3, iu30Var4, iu30Var5, lzn0Var, nwaVar, ezcVar, ezcVar2, z, z2, qim0Var2, z3, i);
        }
    }

    public static final void c(fhm0 fhm0Var, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2122584767);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(fhm0Var) : x340Var.i(fhm0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            w3d1.a((qim0) null, (hw61) null, 0L, 0L, 0.0f, 0.0f, (qqb) null, apo.r(-1704561914, new xaf1(fhm0Var, iu30Var, (byte) 16), x340Var), x340Var, 12582912, 127);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(fhm0Var, iu30Var, i, (byte) 17);
        }
    }

    public static final void d(jkr0 jkr0Var, qim0 qim0Var, float f, float f2, float f3, float f4, long j, long j2, b0k b0kVar, int i) {
        float f5;
        float f6;
        float f7;
        float f8;
        long j3;
        long j4;
        int i2;
        long j5;
        long j6;
        float f9;
        float f10;
        float f11;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-242332593);
        int i3 = i | (x340Var.i(jkr0Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16) | 4793472;
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                zsc zscVar = zex.a;
                long j7 = ((vex) zscVar.b).b;
                i2 = i3 & (-33554305);
                j5 = ((vex) zscVar.e).j;
                j6 = j7;
                f9 = 4.0f;
                f5 = 6.0f;
                f10 = 24.0f;
                f11 = 6.0f;
            } else {
                x340Var.b0();
                i2 = i3 & (-33554305);
                f5 = f;
                f11 = f2;
                f10 = f3;
                f9 = f4;
                j6 = j;
                j5 = j2;
            }
            int i4 = i2;
            x340Var.s();
            boolean zD = x340Var.d(f10) | x340Var.d(f11) | x340Var.d(f5) | x340Var.i(jkr0Var) | x340Var.d(f9) | x340Var.f(j6) | x340Var.f(j5);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                t6r0 t6r0Var = new t6r0(f10, f11, f5, jkr0Var, f9, j6, j5);
                x340Var.s0(t6r0Var);
                objT = t6r0Var;
            }
            j0o1.b((i4 >> 3) & 14, x340Var, (iu30) objT, qim0Var);
            f6 = f11;
            j4 = j5;
            j3 = j6;
            f8 = f9;
            f7 = f10;
        } else {
            x340Var.b0();
            f5 = f;
            f6 = f2;
            f7 = f3;
            f8 = f4;
            j3 = j;
            j4 = j2;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new u6r0(jkr0Var, qim0Var, f5, f6, f7, f8, j3, j4, i);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0043  */
    /* JADX WARN: Code duplicated, block: B:25:0x0049  */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:53:? A[RETURN, SYNTHETIC] */
    public static final void e(Function0 function0, qim0 qim0Var, boolean z, j2i j2iVar, b0k b0kVar, int i, int i2) {
        Function0 function1;
        int i3;
        qim0 qim0Var2;
        boolean z2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        long j;
        int i4;
        int i5;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1881754456);
        if ((i & 6) == 0) {
            function1 = function0;
            i3 = (x340Var.i(function1) ? 4 : 2) | i;
        } else {
            function1 = function0;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                qim0Var2 = qim0Var;
                i3 |= x340Var.i(qim0Var2) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                if (x340Var.h(z)) {
                    i5 = 256;
                } else {
                    i5 = 128;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (x340Var.i(j2iVar)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i3 |= i4;
            }
            if ((i3 & 1171) != 1170) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (x340Var.Y(i3 & 1, z2)) {
                if (i6 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                if (z) {
                    j = u7h.f;
                } else {
                    j = u7h.c;
                }
                int i7 = i3 & 1022;
                qim0 qim0Var5 = qim0Var4;
                zno1.a(function1, qim0Var5, z, 0, (hw61) null, 0L, 0L, (qqb) null, (vzq0) null, apo.r(741601464, new hz80(j, j2iVar, (byte) 1), x340Var), x340Var, i7);
                qim0Var3 = qim0Var5;
            } else {
                x340Var.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new ilf(function0, qim0Var3, z, j2iVar, i, i2);
            }
        }
        i3 |= 48;
        qim0Var2 = qim0Var;
        if ((i & 384) == 0) {
            if (x340Var.h(z)) {
                i5 = 256;
            } else {
                i5 = 128;
            }
            i3 |= i5;
        }
        if ((i & 3072) == 0) {
            if (x340Var.i(j2iVar)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i3 |= i4;
        }
        if ((i3 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (x340Var.Y(i3 & 1, z2)) {
            if (i6 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            if (z) {
                j = u7h.f;
            } else {
                j = u7h.c;
            }
            int i8 = i3 & 1022;
            qim0 qim0Var6 = qim0Var4;
            zno1.a(function1, qim0Var6, z, 0, (hw61) null, 0L, 0L, (qqb) null, (vzq0) null, apo.r(741601464, new hz80(j, j2iVar, (byte) 1), x340Var), x340Var, i8);
            qim0Var3 = qim0Var6;
        } else {
            x340Var.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ilf(function0, qim0Var3, z, j2iVar, i, i2);
        }
    }

    public static final boolean f(char c, char c2) {
        return Character.isHighSurrogate(c) && Character.isLowSurrogate(c2);
    }

    public static void g(int i, int i2, int i3, Rect rect, Rect rect2, int i4) {
        Gravity.apply(i, i2, i3, rect, rect2, i4);
    }

    public static float[] h(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        dm5.n(fArr2.length == 4, "Expecting 4 plane parameters");
        float f = fArr[0];
        float f2 = fArr3[0];
        float f3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr2[1];
        float f7 = fArr[2];
        float f8 = fArr3[2];
        float f9 = fArr2[2];
        float f10 = ((f7 - f8) * f9) + ((f4 - f5) * f6) + ((f - f2) * f3);
        float f11 = fArr4[0] - f2;
        float f12 = fArr4[1] - f5;
        float f13 = fArr4[2] - f8;
        float f14 = f10 / ((f9 * f13) + ((f6 * f12) + (f3 * f11)));
        return new float[]{(f11 * f14) + f2, (f12 * f14) + f5, (f13 * f14) + f8, 1.0f};
    }

    public static l291 i(int i, int i2, List list) {
        dm5.n(i > 0, "inputWidth must be positive");
        dm5.n(i2 > 0, "inputHeight must be positive");
        l291 l291Var = new l291(i, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            l291Var = ((mch0) list.get(i3)).d(l291Var.a, l291Var.b);
        }
        return l291Var;
    }

    public static apn0 j(String str, String str2) {
        if ("integer".equals(str)) {
            return apn0.b;
        }
        if ("integer[]".equals(str)) {
            return apn0.d;
        }
        if ("List<Int>".equals(str)) {
            return apn0.e;
        }
        if ("long".equals(str)) {
            return apn0.f;
        }
        if ("long[]".equals(str)) {
            return apn0.g;
        }
        if ("List<Long>".equals(str)) {
            return apn0.h;
        }
        if ("boolean".equals(str)) {
            return apn0.l;
        }
        if ("boolean[]".equals(str)) {
            return apn0.m;
        }
        if ("List<Boolean>".equals(str)) {
            return apn0.n;
        }
        if (!"string".equals(str)) {
            if ("string[]".equals(str)) {
                return apn0.p;
            }
            if ("List<String>".equals(str)) {
                return apn0.q;
            }
            if ("float".equals(str)) {
                return apn0.i;
            }
            if ("float[]".equals(str)) {
                return apn0.j;
            }
            if ("List<Float>".equals(str)) {
                return apn0.k;
            }
            if ("reference".equals(str)) {
                return apn0.c;
            }
            if (str.length() != 0) {
                try {
                    String strConcat = (!nhc1.Y(str, ".", false) || str2 == null) ? str : str2.concat(str);
                    boolean zR = nhc1.R(str, "[]", false);
                    if (zR) {
                        strConcat = strConcat.substring(0, strConcat.length() - 2);
                    }
                    apn0 apn0VarS = s(Class.forName(strConcat), zR);
                    if (apn0VarS != null) {
                        return apn0VarS;
                    }
                    throw new IllegalArgumentException(strConcat.concat(" is not Serializable or Parcelable.").toString());
                } catch (ClassNotFoundException e) {
                    eg.j(e);
                    return null;
                }
            }
        }
        return apn0.o;
    }

    public static int k(int i, int i2) {
        return Gravity.getAbsoluteGravity(i, i2);
    }

    public static rka0 l() {
        return rka0.i;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002d  */
    public static byte[] m(Context context, String str) throws PackageManager.NameNotFoundException {
        MessageDigest messageDigest;
        PackageInfo packageInfo = mjm1.a(context).a.getPackageManager().getPackageInfo(str, 64);
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null && signatureArr.length == 1) {
            for (int i = 0; i < 2; i++) {
                try {
                    messageDigest = MessageDigest.getInstance("SHA1");
                    if (messageDigest != null) {
                        if (messageDigest != null) {
                            return messageDigest.digest(packageInfo.signatures[0].toByteArray());
                        }
                    }
                } catch (NoSuchAlgorithmException unused) {
                }
            }
            messageDigest = null;
            if (messageDigest != null) {
                return messageDigest.digest(packageInfo.signatures[0].toByteArray());
            }
        }
        return null;
    }

    public static final mmr0 n(jkr0 jkr0Var) {
        Float fValueOf = Float.valueOf(0.0f);
        if (jkr0Var.l() <= 5) {
            return new mmr0(fValueOf, Float.valueOf(jkr0Var.l() - 1.0f));
        }
        float fN = u2o1.n(jkr0Var) - 2.0f;
        if (fN < 0.0f) {
            return new mmr0(fValueOf, Float.valueOf(4.0f));
        }
        float fL = jkr0Var.l() - 5;
        if (fN > fL) {
            fN = fL;
        }
        return new mmr0(Float.valueOf(fN), Float.valueOf((fN + 5.0f) - 1.0f));
    }

    public static final ia00 o(iox0 iox0Var) {
        return n3o1.q(iox0Var).a(bnx0.c, cnx0.f);
    }

    public static boolean p(float[] fArr, float[] fArr2) {
        dm5.n(fArr2.length == 4, "Expecting 4 plane parameters");
        return (fArr2[2] * fArr[2]) + ((fArr2[1] * fArr[1]) + (fArr2[0] * fArr[0])) <= fArr2[3];
    }

    public static final eyl q(int i, iu30 iu30Var) {
        ArrayList arrayList = new ArrayList(i);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            arrayList.add(iu30Var.invoke(Integer.valueOf(i3)));
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((y3h1) it.next()).a.getId());
        }
        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(upn1.i(((y3h1) it2.next()).a.getItem()));
        }
        ptj ptjVar = new ptj(1, arrayList2, List.class, "get", "get(I)Ljava/lang/Object;", 0, (byte) 8);
        ptj ptjVar2 = new ptj(1, arrayList3, List.class, "get", "get(I)Ljava/lang/Object;", 0, (byte) 9);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList) {
            int i4 = i2 + 1;
            if (i2 < 0) {
                p7h.T();
                throw null;
            }
            xu30 xu30Var = ((y3h1) obj).c;
            mmr0 mmr0Var = xu30Var != null ? new mmr0(Integer.valueOf(i2), xu30Var) : null;
            if (mmr0Var != null) {
                arrayList4.add(mmr0Var);
            }
            i2 = i4;
        }
        return new eyl(i, ptjVar, ptjVar2, sqg0.T(arrayList4));
    }

    public static final eyl r(v3h1 v3h1Var) {
        eyl eylVarF = v3h1Var.f();
        return eylVarF == null ? q(v3h1Var.a(), new ptj(1, v3h1Var, v3h1.class, "itemAt", "itemAt(I)Lcom/spotify/contentdsl/core/uicontent/UIContentItem;", 0, (byte) 10)) : eylVarF;
    }

    public static apn0 s(Class cls, boolean z) {
        if (Parcelable.class.isAssignableFrom(cls)) {
            return z ? new won0(cls) : new xon0(cls);
        }
        if (Enum.class.isAssignableFrom(cls) && !z) {
            return new von0(cls);
        }
        if (Serializable.class.isAssignableFrom(cls)) {
            return z ? new yon0(cls) : new zon0(cls);
        }
        return null;
    }

    public static final List t(d441 d441Var) {
        int iM = d9y0.m(d441Var, "id");
        int iM2 = d9y0.m(d441Var, "seq");
        int iM3 = d9y0.m(d441Var, "from");
        int iM4 = d9y0.m(d441Var, "to");
        smc0 smc0VarN = k4p1.n();
        while (d441Var.f1()) {
            smc0VarN.add(new xd30((int) d441Var.getLong(iM), d441Var.P0(iM3), (int) d441Var.getLong(iM2), d441Var.P0(iM4)));
        }
        return o7h.Z0(k4p1.k(smc0VarN));
    }

    public static final okd1 u(y341 y341Var, String str, boolean z) {
        d441 d441VarG1 = y341Var.g1("PRAGMA index_xinfo(`" + str + "`)");
        try {
            int iM = d9y0.m(d441VarG1, "seqno");
            int iM2 = d9y0.m(d441VarG1, "cid");
            int iM3 = d9y0.m(d441VarG1, "name");
            int iM4 = d9y0.m(d441VarG1, "desc");
            if (iM != -1 && iM2 != -1 && iM3 != -1 && iM4 != -1) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                while (d441VarG1.f1()) {
                    if (((int) d441VarG1.getLong(iM2)) >= 0) {
                        int i = (int) d441VarG1.getLong(iM);
                        String strP0 = d441VarG1.P0(iM3);
                        String str2 = d441VarG1.getLong(iM4) > 0 ? "DESC" : "ASC";
                        linkedHashMap.put(Integer.valueOf(i), strP0);
                        linkedHashMap2.put(Integer.valueOf(i), str2);
                    }
                }
                List listA1 = o7h.a1(linkedHashMap.entrySet(), new be21((byte) 3));
                ArrayList arrayList = new ArrayList(q7h.U(listA1, 10));
                Iterator it = listA1.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Map.Entry) it.next()).getValue());
                }
                List listL1 = o7h.l1(arrayList);
                List listA2 = o7h.a1(linkedHashMap2.entrySet(), new be21((byte) 4));
                ArrayList arrayList2 = new ArrayList(q7h.U(listA2, 10));
                Iterator it2 = listA2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((String) ((Map.Entry) it2.next()).getValue());
                }
                okd1 okd1Var = new okd1(str, z, listL1, o7h.l1(arrayList2));
                o0c.v(d441VarG1, (Throwable) null);
                return okd1Var;
            }
            o0c.v(d441VarG1, (Throwable) null);
            return null;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                o0c.v(d441VarG1, th);
                throw th2;
            }
        }
    }

    public static final float v(jkr0 jkr0Var, int i, float f, float f2) {
        Float fValueOf = Float.valueOf(0.0f);
        int iL = jkr0Var.l();
        Float[] fArr = new Float[iL];
        for (int i2 = 0; i2 < iL; i2++) {
            fArr[i2] = Float.valueOf(1.0f);
        }
        if (jkr0Var.l() >= 5) {
            mmr0 mmr0VarN = n(jkr0Var);
            float fFloatValue = ((Number) mmr0VarN.a).floatValue();
            float fFloatValue2 = ((Number) mmr0VarN.b).floatValue();
            double d = fFloatValue;
            int iCeil = (int) Math.ceil(d);
            int iFloor = (int) Math.floor(d);
            for (int i3 = 0; i3 < iFloor; i3++) {
                fArr[i3] = fValueOf;
            }
            if (iCeil != iFloor) {
                float f3 = fFloatValue - iFloor;
                if (iFloor > 0 || iCeil > 0) {
                    float f4 = 1.0f - f3;
                    fArr[iFloor] = Float.valueOf(f4);
                    fArr[iCeil] = Float.valueOf(f4);
                }
            } else if (iCeil > 0) {
                fArr[iCeil] = fValueOf;
            }
            double d2 = fFloatValue2;
            int iFloor2 = (int) Math.floor(d2);
            int iCeil2 = (int) Math.ceil(d2);
            int iL2 = jkr0Var.l();
            for (int i4 = iCeil2 + 1; i4 < iL2; i4++) {
                fArr[i4] = fValueOf;
            }
            if (iFloor2 != iCeil2) {
                float f5 = iCeil2 - fFloatValue2;
                if (iCeil2 < jkr0Var.l() - 1 || iFloor2 < jkr0Var.l() - 1) {
                    float f6 = 1.0f - f5;
                    fArr[iCeil2] = Float.valueOf(f6);
                    fArr[iFloor2] = Float.valueOf(f6);
                }
            } else if (iFloor2 < jkr0Var.l() - 1) {
                fArr[iFloor2] = fValueOf;
            }
        }
        float fFloatValue3 = fArr[i].floatValue();
        float fFloatValue4 = ((Number) n(jkr0Var).a).floatValue();
        float fFloatValue5 = ((Number) n(jkr0Var).b).floatValue();
        float f7 = i;
        if (fFloatValue4 > f7 || f7 > fFloatValue5) {
            return (i == 0 || i == jkr0Var.l() + (-1)) ? fFloatValue3 * f2 : fFloatValue3 * f;
        }
        return l1d.e(f2, f, fFloatValue3, f);
    }

    public static bg11 w(float[] fArr, b380 b380Var) {
        n3p1.j(4, "initialCapacity");
        Object[] objArrCopyOf = new Object[4];
        int i = 0;
        int i2 = 0;
        while (i < b380Var.size()) {
            float[] fArr2 = new float[4];
            float[] fArr3 = fArr;
            Matrix.multiplyMV(fArr2, 0, fArr3, 0, (float[]) b380Var.get(i), 0);
            float f = fArr2[0];
            float f2 = fArr2[3];
            fArr2[0] = f / f2;
            fArr2[1] = fArr2[1] / f2;
            fArr2[2] = fArr2[2] / f2;
            fArr2[3] = 1.0f;
            int i3 = i2 + 1;
            int iB = o280.b(objArrCopyOf.length, i3);
            if (iB > objArrCopyOf.length) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iB);
            }
            objArrCopyOf[i2] = fArr2;
            i++;
            i2 = i3;
            fArr = fArr3;
        }
        return b380.l(i2, objArrCopyOf);
    }

    public static void x(s4b1 s4b1Var, Parcel parcel) {
        parcel.writeString(s4b1Var != null ? s4b1Var.z() : null);
    }
}
