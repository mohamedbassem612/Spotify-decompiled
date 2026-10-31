package p;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import android.util.Base64;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.media3.common.ParserException;
import java.net.URL;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.Signature;
import java.security.spec.X509EncodedKeySpec;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class c8o {
    public static Context b;
    public static Bundle c;
    public static b180 f;
    public static b180 g;
    public static final Object a = new Object();
    public static final int[] d = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    public static final int[] e = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static final void a(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1325003555);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(iu30Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131960445);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).j;
            long j = cbx.a(x340Var).b.b;
            pm31 pm31Var = new pm31(0);
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new nc8(iu30Var, (byte) 16);
                x340Var.s0(objT);
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarX = bin.x(qim0Var3, false, (String) null, pm31Var, (idn0) null, (Function0) objT, 11);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(strO0, uyn1.B(qim0VarX, 16.0f, 16.0f, 16.0f, 0.0f, 8), lee1Var, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var2, i, (byte) 3);
        }
    }

    public static final void b(zxo zxoVar, pd2 pd2Var, vu30 vu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-725125339);
        int i2 = i | (x340Var.i(zxoVar) ? 4 : 2) | (x340Var.i(pd2Var) ? 32 : 16) | (x340Var.i(vu30Var) ? 256 : 128) | (x340Var.i(qim0Var) ? 2048 : 1024);
        byte b2 = 0;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            ven0 ven0VarS = v8r.s(vu30Var, x340Var);
            Object objT = x340Var.T();
            Object obj = fkj0.X;
            if (objT == obj) {
                objT = zxoVar.a(new xd2(ven0VarS, b2));
                x340Var.s0(objT);
            }
            bd71 bd71Var = (bd71) objT;
            iac0 iac0Var = (iac0) x340Var.k(jfe0.a);
            boolean zI = x340Var.i(iac0Var) | x340Var.i(pd2Var);
            Object objT2 = x340Var.T();
            if (zI || objT2 == obj) {
                objT2 = new q4(iac0Var, pd2Var, (lnm) null, (byte) 27);
                x340Var.s0(objT2);
            }
            qxd0.t(rih1.a, x340Var, (vu30) objT2);
            otw.c(bd71Var, new zc71(vur0.b), qim0Var, (ipb1) null, x340Var, 8 | ((i2 >> 3) & 896), 8);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, zxoVar, pd2Var, vu30Var, qim0Var, (byte) 19);
        }
    }

    public static final void c(r7x0 r7x0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        qim0 qim0Var2;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-61387748);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(r7x0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (!x340Var2.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        } else {
            if (r7x0Var.l) {
                h311 h311VarV = x340Var2.v();
                if (h311VarV != null) {
                    h311VarV.d = new mva(r7x0Var, iu30Var, i, (byte) 0);
                    return;
                }
                return;
            }
            String str = r7x0Var.r;
            if (str == null || str.length() == 0) {
                x340Var2.i0(853835295);
                if (r7x0Var.m && r7x0Var.s && r7x0Var.t) {
                    x340Var2.i0(853904983);
                    a((i3 >> 3) & 14, x340Var2, iu30Var, null);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(853950150);
                    x340Var2.r(false);
                }
                x340Var2.r(false);
                h311 h311VarV2 = x340Var2.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new mva(r7x0Var, iu30Var, i, (byte) 1);
                    return;
                }
                return;
            }
            x340Var2.i0(853965030);
            x340Var2.r(false);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(Boolean.FALSE);
                x340Var2.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            cvx cvxVar2 = cbx.b(x340Var2).b;
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarB = uyn1.B(qim0Var3, 16.0f, 16.0f, 16.0f, 0.0f, 8);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            cjc0 cjc0Var = ((Boolean) ven0Var.getValue()).booleanValue() ? new cjc0(Integer.MAX_VALUE) : new cjc0(2);
            lee1 lee1Var = cbx.d(x340Var2).j;
            long j = cbx.a(x340Var2).b.b;
            qim0 qim0VarD = o0c.d(qim0Var3, (ni20) null, 3);
            Object objT3 = x340Var2.T();
            if (objT3 == m4cVar) {
                objT3 = new cy7(ven0Var2, (byte) 8);
                x340Var2.s0(objT3);
            }
            qim0 qim0Var4 = qim0Var3;
            uwo1.e(str, qim0VarD, lee1Var, j, (a0e1) null, (iu30) objT3, 2, false, cjc0Var, 0, (qx8) null, x340Var2, 1769472, 0, 1680);
            x340Var = x340Var2;
            if (((Boolean) ven0Var2.getValue()).booleanValue() || ((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1183546135);
                String strO0 = cwl1.o0(x340Var, ((Boolean) ven0Var.getValue()).booleanValue() ? 2131960446 : 2131960447);
                lee1 lee1Var2 = cbx.d(x340Var).j;
                mta mtaVar = cbx.b(x340Var).d;
                qim0 qim0VarB2 = u291.b(0.0f, 32.0f, 1, qim0Var4);
                pm31 pm31Var = new pm31(0);
                boolean z = (i3 & 112) == 32;
                Object objT4 = x340Var.T();
                if (z || objT4 == m4cVar) {
                    objT4 = new wq9(iu30Var, ven0Var, (byte) 2);
                    x340Var.s0(objT4);
                }
                qim0Var4 = qim0Var4;
                uwo1.e(strO0, bin.x(qim0VarB2, false, (String) null, pm31Var, (idn0) null, (Function0) objT4, 11), lee1Var2, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1184037392);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var4;
        }
        h311 h311VarV3 = x340Var.v();
        if (h311VarV3 != null) {
            h311VarV3.d = new nva(r7x0Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void d(String str, cd90 cd90Var, boolean z, Function0 function0, b0k b0kVar, int i) {
        Function0 function1 = function0;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        era eraVar = een.P0;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-358634873);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(cd90Var) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.i(function1) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(u291.f(nim0Var, 1.0f), 16.0f, 16.0f);
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 6);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar4);
            nko1.H(xos0VarM2, x340Var, lljVar3);
            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar);
            uwr uwrVar = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i2 & 14, 0, 2034);
            qim0 qim0VarY2 = uyn1.y(nim0Var, 8.0f, 8.0f);
            mbh mbhVarA3 = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 6);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarY2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA3, x340Var, lljVar4);
            nko1.H(xos0VarM3, x340Var, lljVar3);
            x0d.q(iHashCode3, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar);
            x340Var.i0(-341912502);
            for (String str2 : cd90Var.a) {
                uwr uwrVar2 = cbx.a;
                ha71.a(str2, cbx.a(x340Var).b.a, x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
            mbh mbhVarA4 = jbh.a(new d36(4.0f, true, new um5(false)), eraVar, x340Var, 6);
            int iHashCode4 = Long.hashCode(x340Var.T);
            xos0 xos0VarM4 = x340Var.m();
            qim0 qim0VarE4 = zr7.E(x340Var, nim0Var);
            hzj.A.getClass();
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA4, x340Var, lljVar4);
            nko1.H(xos0VarM4, x340Var, lljVar3);
            x0d.q(iHashCode4, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE4, x340Var, lljVar);
            String strO0 = cwl1.o0(x340Var, 2131956905);
            uwr uwrVar3 = cbx.a;
            uwo1.e(strO0, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            String strO1 = cwl1.o0(x340Var, 2131956908);
            lee1 lee1VarA = lee1.a(cbx.d(x340Var).j, 0L, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, TextDecoration.c, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16773119);
            long j = cbx.a(x340Var).b.a;
            boolean z3 = (i2 & 7168) == 2048;
            Object objT = x340Var.T();
            if (z3 || objT == fkj0.X) {
                function1 = function0;
                objT = new z9t(function1, (byte) 1);
                x340Var.s0(objT);
            } else {
                function1 = function0;
            }
            uwo1.e(strO1, bin.x(nim0Var, false, (String) null, (pm31) null, (idn0) null, (Function0) objT, 15), lee1VarA, j, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2032);
            x340Var.r(true);
            x340Var.r(true);
            uwo1.e(cwl1.o0(x340Var, z ? 2131956907 : 2131956906), (qim0) null, cbx.d(x340Var).m, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bk0(str, cd90Var, z, function1, i, (byte) 20);
        }
    }

    public static final void e(jx11 jx11Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        u37 u37Var;
        float fX;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1829623643);
        int i2 = (b0kVar3.e(jx11Var.ordinal()) ? 4 : 2) | i;
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = jx11Var.ordinal();
            u37 u37Var2 = u37.a;
            if (iOrdinal == 0 || iOrdinal == 1) {
                u37Var = u37.b;
            } else {
                if (iOrdinal != 2) {
                    eg.o();
                    return;
                }
                u37Var = u37Var2;
            }
            boolean z = u37Var == u37Var2;
            tvx tvxVarB = gto1.B(1, b0kVar3, 2);
            if (z) {
                b0kVar3.i0(-1111363128);
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar3).g;
                b0kVar3.r(false);
                fX = 64.0f;
            } else {
                b0kVar3.i0(-1111293471);
                fX = gto1.x(1, b0kVar3, x(jx11Var));
                b0kVar3.r(false);
            }
            float f2 = z ? (16.0f * fX) / 9.0f : fX;
            boolean zG = b0kVar3.g(tvxVarB) | ((i2 & 14) == 4) | b0kVar3.d(fX);
            Object objT = b0kVar3.T();
            if (zG || objT == fkj0.X) {
                uvx uvxVar = new uvx(0, (pgx) null, x(jx11Var), (vzq0) null, (zzq0) null, tvxVarB, (hw61) null, z ? 2 : 1, z ? new p3v(fX) : null, 91);
                b0kVar3.s0(uvxVar);
                objT = uvxVar;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0Var, (uvx) objT, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, (xu30) null, apo.r(-103534574, new u6t0(f2, fX, (byte) 1), b0kVar3), (xu30) null, fij.b, fij.c, (xu30) null, (xu30) null, fij.d, b0kVar2, 805306438, 197040, 26108);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(jx11Var, qim0Var, i, (byte) 11);
        }
    }

    public static final void f(float f2, float f3, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2005852943);
        if ((i & 6) == 0) {
            i2 = (x340Var.d(f2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f3) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarS = u291.s(qim0Var3, f2, f3);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarL0 = cwl1.l0(qim0VarS, 0L, er31.b(8.0f), 13);
            cua cuaVar2 = cbx.b(x340Var).f;
            cwl1.b(qim0VarL0, (tl3) null, er31.b(8.0f), ogx.e, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, fij.e, x340Var, 3072, 48, 2034);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mu11(f2, f3, i, qim0Var2);
        }
    }

    public static final void g(float f2, int i, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-671893476);
        int i2 = (x340Var.d(f2) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            cwl1.b(cwl1.l0(u291.r(qim0Var, f2), 0L, er31.b(f2), 13), (tl3) null, er31.a, ogx.e, (vzq0) null, (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, fij.f, x340Var, 3072, 48, 2034);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ou(f2, qim0Var, i, (byte) 8);
        }
    }

    public static final void h(si1 si1Var, ztq ztqVar, fhi1 fhi1Var, ytq ytqVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(1844875311);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(si1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? b0kVar3.g(ztqVar) : b0kVar3.i(ztqVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(fhi1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.i(ytqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 16384 : 8192;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 9363) != 9362)) {
            b0kVar2 = b0kVar3;
            nyx.a(2, (wux) null, apo.r(610937282, new tte1(si1Var, iu30Var, ztqVar, fhi1Var, ytqVar, (byte) 0), b0kVar3), b0kVar2, 3078, 6);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ay71(si1Var, ztqVar, fhi1Var, false, ytqVar, iu30Var, i, (byte) 12);
        }
    }

    public static void i(Object obj) {
        obj.getClass();
    }

    public static void j(Object obj, String str) {
        if (obj != null) {
            return;
        }
        bhn0.i(str);
    }

    public static void k(dl4 dl4Var, String str, Class cls) {
        if (dl4Var == null) {
            if (!str.contains("%s")) {
                hhg1.n("errorMessageTemplate has no format specifiers");
            } else if (str.indexOf("%s") == str.lastIndexOf("%s")) {
                bhn0.i(str.replace("%s", String.valueOf(cls.getCanonicalName())));
            } else {
                hhg1.n("errorMessageTemplate has more than one format specifier");
            }
        }
    }

    public static void l(Object obj) {
        if (obj != null) {
            return;
        }
        bhn0.i("Cannot return null from a non-@Nullable component method");
    }

    public static void m(Object obj) {
        if (obj != null) {
            return;
        }
        bhn0.i("Cannot return null from a non-@Nullable @Provides method");
    }

    public static final ouk0 n(fpd fpdVar, utj utjVar) {
        return new ouk0(Integer.valueOf(utjVar.a), fpdVar.getId(), fpdVar.getUri(), utjVar.b);
    }

    public static Collection o(zpi0 zpi0Var, wgt wgtVar, int i) {
        if ((i & 1) != 0) {
            wgtVar = wgt.m;
        }
        zpi0.a.getClass();
        return zpi0Var.d(wgtVar, zqb0.f);
    }

    public static Bundle p(Context context) {
        Bundle bundle;
        ServiceInfo serviceInfo;
        Bundle bundle2;
        Context applicationContext = context.getApplicationContext();
        synchronized (a) {
            if (applicationContext != b) {
                eo41.a("CronetManifest#getMetaData fetching info");
                try {
                    try {
                        serviceInfo = applicationContext.getPackageManager().getServiceInfo(new ComponentName(applicationContext, "android.net.http.MetaDataHolder"), 787072);
                    } catch (Throwable th) {
                        try {
                            Trace.endSection();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
                    serviceInfo = null;
                }
                if (serviceInfo == null || (bundle2 = serviceInfo.metaData) == null) {
                    bundle2 = new Bundle();
                }
                c = bundle2;
                b = applicationContext;
                Trace.endSection();
            }
            bundle = c;
        }
        return bundle;
    }

    public static final PublicKey q(String str) {
        return KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(Base64.decode(nhc1.W(nhc1.W(nhc1.W(str, "\n", ""), "-----BEGIN PUBLIC KEY-----", ""), "-----END PUBLIC KEY-----", ""), 0)));
    }

    public static final String r(String str) {
        URL url = new URL("https", "www." + wf10.s, "/.well-known/oauth/openid/keys/");
        ReentrantLock reentrantLock = new ReentrantLock();
        Condition conditionNewCondition = reentrantLock.newCondition();
        p811 p811Var = new p811();
        wf10.c().execute(new lph0(url, p811Var, str, reentrantLock, conditionNewCondition, (byte) 2));
        reentrantLock.lock();
        try {
            conditionNewCondition.await(5000L, TimeUnit.MILLISECONDS);
            return (String) p811Var.a;
        } finally {
            reentrantLock.unlock();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static int s(bae baeVar) throws ParserException {
        int iG = baeVar.g(4);
        if (iG == 15) {
            if (baeVar.b() >= 24) {
                return baeVar.g(24);
            }
            throw ParserException.a((RuntimeException) null, "AAC header insufficient data");
        }
        if (iG < 13) {
            return d[iG];
        }
        throw ParserException.a((RuntimeException) null, "AAC header wrong Sampling Frequency Index");
    }

    public static hql0 t() {
        return new hql0();
    }

    public static op21 u(Context context) {
        it8 it8Var = new it8(new mta((byte) 13));
        ilh1 ilh1Var = new ilh1(context.getApplicationContext());
        d18 d18Var = new d18();
        d18Var.b = new LinkedHashMap(16, 0.75f, true);
        d18Var.a = 0L;
        d18Var.c = ilh1Var;
        op21 op21Var = new op21(d18Var, it8Var);
        bqc bqcVar = op21Var.i;
        if (bqcVar != null) {
            bqcVar.e = true;
            bqcVar.interrupt();
        }
        for (f7o0 f7o0Var : op21Var.h) {
            if (f7o0Var != null) {
                f7o0Var.e = true;
                f7o0Var.interrupt();
            }
        }
        bqc bqcVar2 = new bqc(op21Var.c, op21Var.d, op21Var.e, op21Var.g);
        op21Var.i = bqcVar2;
        bqcVar2.start();
        for (int i = 0; i < op21Var.h.length; i++) {
            f7o0 f7o0Var2 = new f7o0(op21Var.d, op21Var.f, op21Var.e, op21Var.g);
            op21Var.h[i] = f7o0Var2;
            f7o0Var2.start();
        }
        return op21Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    public static v v(bae baeVar, boolean z) throws ParserException {
        int iG = baeVar.g(5);
        if (iG == 31) {
            iG = baeVar.g(6) + 32;
        }
        int iS = s(baeVar);
        int iG2 = baeVar.g(4);
        String strC = f4i1.c(iG, "mp4a.40.");
        if (iG == 5 || iG == 29) {
            iS = s(baeVar);
            int iG3 = baeVar.g(5);
            if (iG3 == 31) {
                iG3 = baeVar.g(6) + 32;
            }
            iG = iG3;
            if (iG == 22) {
                iG2 = baeVar.g(4);
            }
        }
        if (z) {
            if (iG != 1 && iG != 2 && iG != 3 && iG != 4 && iG != 6 && iG != 7 && iG != 17) {
                switch (iG) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ParserException.d("Unsupported audio object type: " + iG);
                }
            }
            if (baeVar.f()) {
                oon1.H("Unexpected frameLengthFlag = 1");
            }
            if (baeVar.f()) {
                baeVar.o(14);
            }
            boolean zF = baeVar.f();
            if (iG2 == 0) {
                k220.c();
                return null;
            }
            if (iG == 6 || iG == 20) {
                baeVar.o(3);
            }
            if (zF) {
                if (iG == 22) {
                    baeVar.o(16);
                }
                if (iG == 17 || iG == 19 || iG == 20 || iG == 23) {
                    baeVar.o(3);
                }
                baeVar.o(1);
            }
            switch (iG) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int iG4 = baeVar.g(2);
                    if (iG4 == 2 || iG4 == 3) {
                        throw ParserException.d("Unsupported epConfig: " + iG4);
                    }
                    break;
            }
        }
        int i = e[iG2];
        if (i == -1) {
            throw ParserException.a((RuntimeException) null, (String) null);
        }
        v vVar = new v();
        vVar.a = iS;
        vVar.b = i;
        vVar.c = strC;
        return vVar;
    }

    public static final void w(Intent intent, son0 son0Var) {
        intent.putExtra("navigation_transaction_id", son0Var.a.toString());
    }

    public static final int x(jx11 jx11Var) {
        int i;
        int iOrdinal = jx11Var.ordinal();
        if (iOrdinal != 0) {
            i = 2;
            if (iOrdinal != 1 && iOrdinal != 2) {
                eg.o();
                return 0;
            }
        } else {
            i = 1;
        }
        int iC = l1d.C(i);
        if (iC == 0) {
            return 5;
        }
        if (iC == 1) {
            return 3;
        }
        eg.o();
        return 0;
    }

    public static final boolean y(PublicKey publicKey, String str, String str2) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            signature.initVerify(publicKey);
            signature.update(str.getBytes(nne.a));
            return signature.verify(Base64.decode(str2, 8));
        } catch (Exception unused) {
            return false;
        }
    }

    public static void z(ecp1 ecp1Var, boolean z, q0p1 q0p1Var) {
        ecp1Var.b(new svh0(z, (Object) q0p1Var, (byte) 26), r0p1.t);
    }
}
