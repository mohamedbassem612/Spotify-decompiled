package p;

import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public abstract class cqy {
    public static final cr31 a = er31.b(400.0f);
    public static final float b = 100.0f;

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    public static final void a(String str, lee1 lee1Var, long j, qim0 qim0Var, b0k b0kVar, int i, int i2) {
        String str2;
        int i3;
        qim0 qim0Var2;
        boolean z;
        b0k b0kVar2;
        qim0 qim0Var3;
        h311 h311VarV;
        qim0 qim0Var4;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1370296312);
        if ((i & 6) == 0) {
            str2 = str;
            i3 = (b0kVar3.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= b0kVar3.i(lee1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar3.f(j) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                qim0Var2 = qim0Var;
                i3 |= b0kVar3.i(qim0Var2) ? 2048 : 1024;
            }
            if ((i3 & 1171) != 1170) {
                z = true;
            } else {
                z = false;
            }
            if (b0kVar3.Y(i3 & 1, z)) {
                if (i4 != 0) {
                    qim0Var4 = nim0.a;
                } else {
                    qim0Var4 = qim0Var2;
                }
                int i5 = i3 & 14;
                int i6 = i3 << 3;
                b0kVar2 = b0kVar3;
                uwo1.e(str2, u291.f(qim0Var4, 1.0f), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i6 & 896) | i5 | (i6 & 7168), 0, 2016);
                qim0Var3 = qim0Var4;
            } else {
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                qim0Var3 = qim0Var2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new zpy(str, lee1Var, j, qim0Var3, i, i2);
            }
        }
        i3 |= 3072;
        qim0Var2 = qim0Var;
        if ((i3 & 1171) != 1170) {
            z = true;
        } else {
            z = false;
        }
        if (b0kVar3.Y(i3 & 1, z)) {
            if (i4 != 0) {
                qim0Var4 = nim0.a;
            } else {
                qim0Var4 = qim0Var2;
            }
            int i7 = i3 & 14;
            int i8 = i3 << 3;
            b0kVar2 = b0kVar3;
            uwo1.e(str2, u291.f(qim0Var4, 1.0f), lee1Var, j, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, (i8 & 896) | i7 | (i8 & 7168), 0, 2016);
            qim0Var3 = qim0Var4;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var3 = qim0Var2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new zpy(str, lee1Var, j, qim0Var3, i, i2);
        }
    }

    public static final void b(tpy tpyVar, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        int i2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1099863017);
        byte b2 = 2;
        int i3 = i | (b0kVar3.g(tpyVar) ? 4 : 2) | (b0kVar3.i(function0) ? 32 : 16) | 384;
        byte b3 = 0;
        byte b4 = 1;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            int iC = l1d.C(tpyVar.d);
            if (iC == 0) {
                i2 = 2131955553;
            } else if (iC == 1) {
                i2 = 2131955554;
            } else if (iC == 2) {
                i2 = 2131955562;
            } else {
                if (iC != 3 && iC != 4) {
                    eg.o();
                    return;
                }
                i2 = 2131955560;
            }
            String strO0 = cwl1.o0(b0kVar3, i2);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uvx uvxVar = new uvx(0, (pgx) null, 0, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (zzq0) null, (tvx) null, (hw61) null, 0, (p3v) null, 503);
            boolean z = (i3 & 112) == 32;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new ivw(function0, (byte) 8);
                b0kVar3.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            gbx gbxVar = new gbx(new y50(strO0), function1);
            if (tpyVar.d == 5) {
                gbxVar = null;
            }
            b0kVar2 = b0kVar3;
            jto1.b(qim0VarF, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, (xu30) null, apo.r(724204480, new aqy(tpyVar, b3), b0kVar3), (xu30) null, mmi.b, apo.r(1383517310, new aqy(tpyVar, b4), b0kVar3), (xu30) null, (xu30) null, apo.r(2146685531, new aqy(tpyVar, b2), b0kVar3), b0kVar2, 805306432, 197040, 26044);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(tpyVar, function0, qim0Var2, i, (byte) 22);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(802534320);
        int i2 = i | (b0kVar3.g(str) ? 4 : 2) | (b0kVar3.i(iu30Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | 3072;
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            lee1 lee1VarA = lee1.a(cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.a, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(new c8e1(0L, 6, str));
                b0kVar3.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Object objT2 = b0kVar3.T();
            if (objT2 == m4cVar) {
                objT2 = v8r.q(str);
                b0kVar3.s0(objT2);
            }
            ven0 ven0Var2 = (ven0) objT2;
            if (!u890.j(str, (String) ven0Var2.getValue())) {
                if (str.length() == 0) {
                    ven0Var.setValue(new c8e1(0L, 6, ""));
                }
                ven0Var2.setValue(str);
            }
            c8e1 c8e1Var = (c8e1) ven0Var.getValue();
            n6a1 n6a1Var = new n6a1(cbx.a(b0kVar3).b.c);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            boolean z = (i2 & 896) == 256;
            Object objT3 = b0kVar3.T();
            if (z || objT3 == m4cVar) {
                objT3 = new xet(function0, (byte) 7);
                b0kVar3.s0(objT3);
            }
            qim0 qim0VarG = cev0.G(qim0VarF, (iu30) objT3);
            boolean zI = ((i2 & 112) == 32) | ((i2 & 14) == 4) | b0kVar3.i(ven0Var);
            Object objT4 = b0kVar3.T();
            if (zI || objT4 == m4cVar) {
                objT4 = new djx((Object) str, (Object) iu30Var, (Object) ven0Var, (byte) 5);
                b0kVar3.s0(objT4);
            }
            b0kVar2 = b0kVar3;
            xea.d(c8e1Var, (iu30) objT4, qim0VarG, false, lee1VarA, (kua0) null, (bua0) null, true, 0, 0, (elk1) null, (iu30) null, n6a1Var, apo.r(-240644013, new z3y(str, (byte) 1), b0kVar3), b0kVar2, 100663296, 196608, 16088);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bqy(str, iu30Var, function0, qim0Var2, i);
        }
    }

    public static final void d(String str, String str2, b0k b0kVar, int i) {
        String str3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-838305345);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.g(str2) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            era eraVar = een.Q0;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarB = uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, b, 0.0f, 0.0f, 13);
            mbh mbhVarA = jbh.a(h36.c, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
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
            uwr uwrVar = cbx.a;
            a(str, cbx.d(x340Var).f, cbx.a(x340Var).b.a, null, x340Var, i2 & 14, 8);
            cvx cvxVar = cbx.b(x340Var).b;
            str3 = str2;
            a(str3, kk0.p(nim0Var, 4.0f, x340Var, x340Var).g, cbx.a(x340Var).b.b, null, x340Var, (i2 >> 3) & 14, 8);
            x340Var.r(true);
        } else {
            str3 = str2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b4((byte) 9, i, str, str3);
        }
    }
}
