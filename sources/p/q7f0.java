package p;

import com.spotify.betamax.player.VideoSurfaceView;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class q7f0 {
    public static final kiv a = new kiv(i0f0.h, (byte) 1);
    public static final kiv b = new kiv(i0f0.g, (byte) 1);

    public static final void a(String str, String str2, String str3, qim0 qim0Var, b3k1 b3k1Var, boolean z, b0k b0kVar, int i, int i2) {
        int i3;
        boolean z2;
        b0k b0kVar2;
        b3k1 b3k1Var2;
        boolean z3;
        int i4;
        int i5;
        woa woaVar;
        Object obj;
        boolean z4;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(611508427);
        if ((i & 6) == 0) {
            i3 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.g(str2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.g(str3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar3.i(qim0Var) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= b0kVar3.e(b3k1Var == null ? -1 : b3k1Var.ordinal()) ? 16384 : 8192;
        }
        int i7 = i2 & 32;
        if (i7 != 0) {
            i3 |= 196608;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 196608) == 0) {
                i3 |= b0kVar3.h(z2) ? 131072 : 65536;
            }
        }
        if (b0kVar3.Y(i3 & 1, (i3 & 74899) != 74898)) {
            b3k1Var2 = i6 != 0 ? b3k1.b : b3k1Var;
            boolean z5 = i7 != 0 ? false : z2;
            kiv kivVar = a;
            woa woaVar2 = (woa) b0kVar3.k(kivVar);
            int i8 = i3 & 112;
            woa woaVar3 = (woa) b0kVar3.k(kivVar);
            kma kmaVar = (kma) b0kVar3.k(b);
            byte b2 = 6;
            boolean zG = b0kVar3.g(woaVar3) | b0kVar3.g(kmaVar) | ((((i3 & 14) ^ 6) > 4 && b0kVar3.g(str)) || (i3 & 6) == 4) | (((i8 ^ 48) > 32 && b0kVar3.g(str2)) || (i3 & 48) == 32);
            Object objT = b0kVar3.T();
            if (zG || objT == m4cVar) {
                i4 = i8;
                i5 = i3;
                woaVar = woaVar2;
                uoa uoaVarA = woa.a(woaVar3, str, (o2u0) null, (w2k1) null, kmaVar, (List) null, false, (bas) null, (sn10) null, 1014);
                uoaVarA.q(true);
                uoaVarA.p(2);
                b0kVar3.s0(uoaVarA);
                obj = uoaVarA;
            } else {
                i5 = i3;
                obj = objT;
                woaVar = woaVar2;
                i4 = i8;
            }
            uoa uoaVar = (uoa) obj;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q((Object) null);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var = (ven0) objT2;
            boolean zI = b0kVar3.i(ven0Var);
            Object objT3 = b0kVar3.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new sqa0(ven0Var, b2);
                b0kVar3.s0(objT3);
            }
            ven0 ven0VarS = v8r.s(objT3, b0kVar3);
            woa woaVar4 = woaVar;
            boolean zI2 = b0kVar3.i(woaVar4) | b0kVar3.i(uoaVar);
            Object objT4 = b0kVar3.T();
            if (zI2 || objT4 == m4cVar) {
                objT4 = new m760(woaVar4, uoaVar, (byte) 1);
                b0kVar3.s0(objT4);
            }
            qxd0.i(uoaVar, (iu30) objT4, b0kVar3);
            boolean zI3 = b0kVar3.i(uoaVar) | (i4 == 32);
            Object objT5 = b0kVar3.T();
            if (zI3 || objT5 == m4cVar) {
                objT5 = new o760(uoaVar, str2, (byte) 1);
                b0kVar3.s0(objT5);
            }
            qxd0.h(uoaVar, str2, (iu30) objT5, b0kVar3);
            VideoSurfaceView videoSurfaceView = (VideoSurfaceView) ven0Var.getValue();
            boolean zI4 = b0kVar3.i(ven0Var) | b0kVar3.i(uoaVar);
            Object objT6 = b0kVar3.T();
            if (zI4 || objT6 == m4cVar) {
                z4 = true;
                objT6 = new q760(ven0Var, uoaVar, (byte) 1);
                b0kVar3.s0(objT6);
            } else {
                z4 = true;
            }
            qxd0.h(uoaVar, videoSurfaceView, (iu30) objT6, b0kVar3);
            boolean zI5 = ((458752 & i5) == 131072 ? z4 : false) | ((57344 & i5) == 16384 ? z4 : false) | ((i5 & 896) == 256 ? z4 : false) | b0kVar3.i(ven0VarS);
            Object objT7 = b0kVar3.T();
            if (zI5 || objT7 == m4cVar) {
                objT7 = new gh1(z5, b3k1Var2, str3, ven0VarS, (byte) 17);
                b0kVar3.s0(objT7);
            }
            iu30 iu30Var = (iu30) objT7;
            boolean zI6 = b0kVar3.i(ven0Var);
            Object objT8 = b0kVar3.T();
            if (zI6 || objT8 == m4cVar) {
                objT8 = new sqa0(ven0Var, (byte) 3);
                b0kVar3.s0(objT8);
            }
            iu30 iu30Var2 = (iu30) objT8;
            boolean zI7 = b0kVar3.i(ven0Var);
            Object objT9 = b0kVar3.T();
            if (zI7 || objT9 == m4cVar) {
                objT9 = new sqa0(ven0Var, (byte) 4);
                b0kVar3.s0(objT9);
            }
            iu30 iu30Var3 = (iu30) objT9;
            boolean zI8 = b0kVar3.i(ven0Var);
            Object objT10 = b0kVar3.T();
            if (zI8 || objT10 == m4cVar) {
                objT10 = new sqa0(ven0Var, (byte) 5);
                b0kVar3.s0(objT10);
            }
            b0kVar2 = b0kVar3;
            dm5.b(iu30Var, qim0Var, iu30Var2, iu30Var3, (iu30) objT10, b0kVar2, (i5 >> 6) & 112, 0);
            z3 = z5;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            b3k1Var2 = b3k1Var;
            z3 = z2;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new yc5(str, str2, str3, qim0Var, b3k1Var2, z3, i, i2);
        }
    }

    public static final kiv b() {
        return b;
    }

    public static final kiv c() {
        return a;
    }
}
