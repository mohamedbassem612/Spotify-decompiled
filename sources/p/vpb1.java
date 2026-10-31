package p;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.util.SparseArray;
import android.util.TypedValue;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.graphics.Brush;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.graphics.drawscope.DrawStyle;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class vpb1 {
    public static final jc10 a = new jc10(-1);
    public static final jc10 b = new jc10((Object) null);
    public static final jc10 c = new jc10((Object) null);
    public static final jc10 d = new jc10((Object) null);
    public static b180 e;

    public static final xtb0 A(b0k b0kVar) {
        xtb0 xtb0VarA = aub0.a(0, b0kVar, 3);
        x340 x340Var = (x340) b0kVar;
        Object objT = x340Var.T();
        Object obj = fkj0.X;
        if (objT == obj) {
            objT = Integer.valueOf(((err0) xtb0VarA.e.b).s());
            x340Var.s0(objT);
        }
        int iIntValue = ((Number) objT).intValue();
        Object objT2 = x340Var.T();
        if (objT2 == obj) {
            objT2 = Integer.valueOf(((err0) xtb0VarA.e.c).s());
            x340Var.s0(objT2);
        }
        int iIntValue2 = ((Number) objT2).intValue();
        Integer numValueOf = Integer.valueOf(iIntValue);
        Integer numValueOf2 = Integer.valueOf(iIntValue2);
        boolean zI = x340Var.i(xtb0VarA);
        Object objT3 = x340Var.T();
        if (zI || objT3 == obj) {
            fl9 fl9Var = new fl9(xtb0VarA, iIntValue, iIntValue2, (lnm) null, (byte) 3);
            x340Var.s0(fl9Var);
            objT3 = fl9Var;
        }
        qxd0.r(xtb0VarA, numValueOf, numValueOf2, (vu30) objT3, x340Var);
        return xtb0VarA;
    }

    public static final long B(n511 n511Var) {
        float f = n511Var.c - n511Var.a;
        return (((long) Float.floatToRawIntBits(n511Var.d - n511Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void a(xrd xrdVar, qim0 qim0Var, iu30 iu30Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        qim0 qim0VarZ;
        String str = xrdVar.d;
        ArrayList arrayList = xrdVar.g;
        ArrayList arrayList2 = xrdVar.f;
        vex0 vex0Var = xrdVar.e;
        String str2 = xrdVar.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(411563682);
        int i2 = i | (x340Var.g(xrdVar) ? 4 : 2) | 48 | (x340Var.i(iu30Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            d36 d36Var = new d36(8.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.a.a();
            cr31 cr31VarB = er31.b(8.0f);
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarX = uyn1.x(u291.f(dug.f(qim0Var4, jA, cr31VarB), 1.0f), 16.0f);
            mbh mbhVarA = jbh.a(d36Var, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            qim0 qim0Var5 = qim0Var4;
            uwo1.e(xrdVar.a, (qim0) null, cbx.d(x340Var).e, cbx.a(x340Var).b.a, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            uwo1.e(xrdVar.b, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var = x340Var;
            if (vex0Var.c.isEmpty()) {
                x340Var.i0(1540979254);
                x340Var.r(false);
            } else {
                x340Var.i0(1540918711);
                j1e1.c(vex0Var, (qim0) null, x340Var, 0);
                x340Var.r(false);
            }
            if (str2.length() > 0) {
                x340Var.i0(1541025072);
                y9g1.b(0, str2, x340Var, (qim0) null);
                x340Var.r(false);
            } else {
                x340Var.i0(1541092342);
                x340Var.r(false);
            }
            if (arrayList2.isEmpty()) {
                x340Var.i0(1541239158);
                x340Var.r(false);
            } else {
                x340Var.i0(1541139214);
                sgc1.a(i2 & 896, x340Var, iu30Var, mqo1.A(arrayList2), null);
                x340Var.r(false);
            }
            if (str.length() > 0) {
                x340Var.i0(1541287921);
                long jC = cbx.a(x340Var).a.b.c();
                if (str2.length() > 0) {
                    qim0Var3 = qim0Var5;
                    z = true;
                    qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0Var3);
                } else {
                    qim0Var3 = qim0Var5;
                    z = true;
                    qim0VarZ = qim0Var3;
                }
                hr80.d(qim0VarZ, 1.0f, jC, x340Var, 0, 0);
                qim0Var5 = qim0Var3;
                uwo1.e(str, (qim0) null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
                x340Var = x340Var;
                x340Var.r(false);
            } else {
                x340Var.i0(1541661750);
                x340Var.r(false);
            }
            if (arrayList.isEmpty()) {
                x340Var.i0(1541792694);
                x340Var.r(false);
            } else {
                x340Var.i0(1541702360);
                z1a1.a(i2 & 896, x340Var, iu30Var, mqo1.A(arrayList), (qim0) 0);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var5;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mzj(xrdVar, qim0Var2, iu30Var, i, (byte) 13);
        }
    }

    public static final void b(q220 q220Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        Object next;
        long j;
        Function0 function0;
        String str;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2097458035);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.g(q220Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Iterator it = q220Var.c.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!u890.j(((z9v) next).b, q220Var.d));
            z9v z9vVar = (z9v) next;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function1 = hmb0.t1;
            if (z) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            nim0 nim0Var = nim0.a;
            uwo1.e(q220Var.a, uyn1.B(nim0Var, 0.0f, 0.0f, 0.0f, 8.0f, 7), cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2040);
            float f = ((Boolean) ven0Var.getValue()).booleanValue() ? 2.0f : 1.0f;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(2037566631);
                j = cbx.a(x340Var).c.a;
            } else {
                x340Var.i0(2037567786);
                j = cbx.a(x340Var).c.b;
            }
            x340Var.r(false);
            qqb qqbVarD = k1u.d(f, j);
            qim0 qim0VarF2 = u291.f(uyn1.x(dug.f(d1u.F(nim0Var, qqbVarD.a, qqbVarD.b, px61.b(x340Var, 5)), cbx.a(x340Var).a.c, px61.b(x340Var, 5)), 16.0f), 1.0f);
            boolean zI = x340Var.i(ven0Var) | ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new ssm(iu30Var, q220Var, ven0Var, (byte) 19);
                x340Var.s0(objT2);
            }
            qim0 qim0VarX = bin.x(qim0VarF2, false, (String) null, (pm31) null, (idn0) null, (Function0) objT2, 15);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarX);
            x340Var.m0();
            if (x340Var.S) {
                function0 = function1;
                x340Var.l(function0);
            } else {
                function0 = function1;
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (z9vVar == null || (str = z9vVar.a) == null) {
                str = "";
            }
            Function0 function2 = function0;
            uwo1.e(str, (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2046);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            gfh0 gfh0VarC2 = t1c.c(een.i, false);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            w0h1.a(((Boolean) ven0Var.getValue()).booleanValue() ? qlx.c : mlx.c, isl.a, (qim0) null, cbx.a(x340Var).c.b, 0L, false, x340Var, 56, 52);
            x340Var.r(true);
            x340Var.r(true);
            boolean zBooleanValue = ((Boolean) ven0Var.getValue()).booleanValue();
            boolean zI2 = x340Var.i(ven0Var);
            Object objT3 = x340Var.T();
            if (zI2 || objT3 == m4cVar) {
                objT3 = new iwr(ven0Var, (byte) 8);
                x340Var.s0(objT3);
            }
            gt4.a(zBooleanValue, (Function0) objT3, (qim0) null, 0L, (es41) null, (nfv0) null, (hw61) null, 0L, 0.0f, apo.r(836498280, new nzd(q220Var, iu30Var, ven0Var, (byte) 22), x340Var), x340Var, 0, 2044);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new won(q220Var, iu30Var, qim0Var, i, (byte) 24);
        }
    }

    public static final void c(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1629329250);
        int i2 = (x340Var.i(function0) ? 4 : 2) | i | (x340Var.i(function1) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131953627);
            String strO1 = cwl1.o0(x340Var, R.string.cancel);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb(function1, ven0Var, (byte) 19);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(1922670681);
                String strO2 = cwl1.o0(x340Var, 2131953629);
                String strO3 = cwl1.o0(x340Var, 2131953628);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, (i3u) null, (hux) null, strO2, strO3, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(1923200192);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n4d(function0, function1, i, (byte) 27);
        }
    }

    public static final void d(String str, ibl1 ibl1Var, c380 c380Var, tob1 tob1Var, iu30 iu30Var, qim0 qim0Var, kbl1 kbl1Var, Function0 function0, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-658641008);
        int i2 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(ibl1Var) ? 32 : 16) | (x340Var.g(c380Var) ? 256 : 128) | (x340Var.g(tob1Var) ? 2048 : 1024) | (x340Var.i(iu30Var) ? 16384 : 8192) | 196608 | (x340Var.g(kbl1Var) ? 1048576 : 524288) | (x340Var.i(function0) ? 8388608 : 4194304);
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.d(qim0Var3, 1.0f));
            mbh mbhVarA = jbh.a(new d36(12.0f, true, new um5(false)), een.Q0, x340Var, 54);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            op71.g(x340Var, u291.h(qim0Var3, 56.0f));
            tw70.a(ibl1Var.a, ibl1Var.c, null, x340Var, 0);
            kiv kivVar = t4k.h;
            mod.b(kivVar.a(new xat(((wat) x340Var.k(kivVar)).h(), 1.0f)), apo.r(-875223654, new uuy(str, c380Var, kbl1Var, tob1Var, iu30Var, function0), x340Var), x340Var, 56);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n(str, ibl1Var, c380Var, tob1Var, iu30Var, qim0Var2, kbl1Var, function0, i, (byte) 13);
        }
    }

    public static final void e(lob1 lob1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        qim0 qim0Var2;
        h311 h311VarV;
        uan0 uan0Var;
        m4c m4cVar = fkj0.X;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1910066780);
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? b0kVar3.g(lob1Var) : b0kVar3.i(lob1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (b0kVar3.Y(i3 & 1, (i3 & 147) != 146)) {
            boolean z = lob1Var.a;
            qim0 qim0Var3 = nim0.a;
            if (z) {
                boolean z2 = (i3 & 14) == 4 || ((i3 & 8) != 0 && b0kVar3.i(lob1Var));
                Object objT = b0kVar3.T();
                if (z2 || objT == m4cVar) {
                    objT = new xkm0(lob1Var, (byte) 16);
                    b0kVar3.s0(objT);
                }
                qim0 qim0VarC = i541.C(qim0Var3, (iu30) objT);
                uvx uvxVar = new uvx(0, (pgx) null, 0, (vzq0) null, (zzq0) null, (tvx) null, (hw61) null, 2, (p3v) null, 383);
                int i4 = i3 & 112;
                boolean z3 = i4 == 32;
                Object objT2 = b0kVar3.T();
                if (z3 || objT2 == m4cVar) {
                    objT2 = new nfk0(iu30Var, (byte) 11);
                    b0kVar3.s0(objT2);
                }
                z50 z50Var = z50.c;
                gbx gbxVar = new gbx(z50Var, (Function0) objT2);
                boolean z4 = i4 == 32;
                Object objT3 = b0kVar3.T();
                if (z4 || objT3 == m4cVar) {
                    objT3 = new nfk0(iu30Var, (byte) 12);
                    b0kVar3.s0(objT3);
                }
                b0kVar2 = b0kVar3;
                jto1.b(qim0VarC, uvxVar, (max) null, false, (idn0) null, (ga80) null, gbxVar, new gbx(z50Var, (Function0) objT3), (xu30) null, apo.r(-1410037363, new van0(lob1Var, (byte) 0), b0kVar3), (xu30) null, apo.r(-1652471956, new van0(lob1Var, (byte) 1), b0kVar3), apo.r(-1784795701, new ipy(iu30Var, (byte) 23), b0kVar3), (xu30) null, (xu30) null, apo.r(2113200360, new van0(lob1Var, (byte) 2), b0kVar3), b0kVar2, 805306432, 197040, 25916);
                qim0Var2 = qim0Var3;
            } else {
                h311VarV = b0kVar3.v();
                if (h311VarV == null) {
                    return;
                } else {
                    uan0Var = new uan0(lob1Var, iu30Var, qim0Var3, i, (byte) 0);
                }
            }
            h311VarV.d = uan0Var;
        }
        b0kVar2 = b0kVar3;
        b0kVar2.b0();
        qim0Var2 = qim0Var;
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            uan0Var = new uan0(lob1Var, iu30Var, qim0Var2, i, (byte) 1);
            h311VarV.d = uan0Var;
        }
    }

    public static final void f(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1925158249);
        int i2 = i | (x340Var.g(str) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            cjc0 cjc0Var = new cjc0(1);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = k1x0.W0;
                x340Var.s0(objT);
            }
            uwo1.e(str, s161.b(nim0.a, false, (iu30) objT), lee1Var, 0L, (a0e1) null, (iu30) null, 2, false, cjc0Var, 0, (qx8) null, x340Var, (i2 & 14) | 1572864, 0, 1720);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new psr0(str, i, (byte) 26);
        }
    }

    public static final void g(lob1 lob1Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-866774302);
        int i2 = 2;
        int i3 = (x340Var.g(lob1Var) ? 4 : 2) | i;
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int iC = l1d.C(lob1Var.f);
            if (iC == 0) {
                i2 = 0;
            } else if (iC != 1) {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                i2 = 1;
            }
            if (i2 != 0) {
                x340Var.i0(192478684);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                kqn1.d(i2, 0, 0, x340Var, uyn1.B(nim0Var, 0.0f, 0.0f, 4.0f, 0.0f, 11));
                x340Var.r(false);
            } else {
                x340Var.i0(192638396);
                x340Var.r(false);
            }
            String str = lob1Var.c;
            uwr uwrVar2 = cbx.a;
            uwo1.e(str, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 2, false, new cjc0(1), 0, (qx8) null, x340Var, 0, 0, 1722);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wan0(lob1Var, i, (byte) 0);
        }
    }

    public static final void h(lob1 lob1Var, b0k b0kVar, int i) {
        qim0 qim0Var;
        boolean z;
        h2c h2cVar;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2118942634);
        int i2 = i | (x340Var.g(lob1Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String str = lob1Var.d;
            int length = str.length();
            qim0 qim0Var2 = nim0.a;
            h2c h2cVar2 = h2c.a;
            if (length > 0) {
                x340Var.i0(-2009202518);
                boolean zG = x340Var.g(str);
                Object objT = x340Var.T();
                if (zG || objT == fkj0.X) {
                    objT = Uri.parse(str);
                    x340Var.s0(objT);
                }
                Uri uri = (Uri) objT;
                qim0 qim0VarA = h2cVar2.a(u291.f(qim0Var2, 1.0f), een.h);
                uri.getClass();
                xtx xtxVar = xtx.c;
                qim0Var = qim0Var2;
                z = false;
                h2cVar = h2cVar2;
                eso1.e(uri, isl.a, qim0VarA, null, null, null, null, null, null, new nux(xtxVar, xtxVar), false, false, x340Var, 1073966128, 0, 3520);
                x340Var.r(false);
            } else {
                qim0Var = qim0Var2;
                z = false;
                h2cVar = h2cVar2;
                x340Var.i0(-2008812941);
                i(x340Var, 0);
                x340Var.r(false);
            }
            String str2 = lob1Var.e;
            if (str2 != null) {
                x340Var.i0(-2008692010);
                uwr uwrVar = cbx.a;
                lee1 lee1Var = cbx.d(x340Var).j;
                cjc0 cjc0Var = new cjc0(1);
                qim0 qim0VarA2 = h2cVar.a(qim0Var, een.d);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarX = uyn1.x(qim0VarA2, 4.0f);
                long jB = u7h.b(cbx.a(x340Var).a.c, 0.7f, 0.0f, 0.0f, 0.0f, 14);
                cua cuaVar = cbx.b(x340Var).f;
                qim0 qim0VarF = dug.f(qim0VarX, jB, er31.b(2.0f));
                cvx cvxVar2 = cbx.b(x340Var).b;
                cvx cvxVar3 = cbx.b(x340Var).b;
                uwo1.e(str2, uyn1.y(qim0VarF, 4.0f, 2.0f), lee1Var, 0L, (a0e1) null, (iu30) null, 0, false, cjc0Var, 0, (qx8) null, x340Var, 0, 0, 1784);
                x340Var.r(z);
            } else {
                x340Var.i0(-2008132584);
                x340Var.r(z);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wan0(lob1Var, i, (byte) 1);
        }
    }

    public static final void i(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1586990797);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarC = u291.c(u291.f(nim0Var, 1.0f), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            qim0 qim0VarA = h2c.a.a(nim0Var, een.h);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xtx.c, isl.a, u291.r(qim0VarA, 24.0f), 0L, 0L, false, x340Var, xtx.d | 48, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new afm0(i, (byte) 14);
        }
    }

    public static final Typeface j(yw21 yw21Var, Context context) {
        Typeface typefaceB = qx21.b(context, yw21Var.a);
        typefaceB.getClass();
        return typefaceB;
    }

    public static final Object k(yw21 yw21Var, Context context, nj4 nj4Var) {
        ohd ohdVar = new ohd(1, aym.t(nj4Var));
        ohdVar.t();
        int i = yw21Var.a;
        oj4 oj4Var = new oj4(ohdVar, yw21Var);
        ThreadLocal threadLocal = qx21.a;
        if (context.isRestricted()) {
            oj4Var.e(-4);
        } else {
            qx21.c(context, i, new TypedValue(), 0, oj4Var, false, false);
        }
        return ohdVar.r();
    }

    public static final void l(tw4 tw4Var, z1a1 z1a1Var) {
        if (z1a1Var instanceof itq0) {
            u8s0.c(tw4Var, ((itq0) z1a1Var).c);
            return;
        }
        if (z1a1Var instanceof jtq0) {
            tw4Var.e(((jtq0) z1a1Var).c, 1);
        } else if (z1a1Var instanceof htq0) {
            u8s0.a(tw4Var, ((htq0) z1a1Var).c);
        } else {
            eg.o();
        }
    }

    public static final float m(long j) {
        int i = (int) (j >> 32);
        if (Float.intBitsToFloat(i) == 0.0f && Float.intBitsToFloat((int) (j & 4294967295L)) == 0.0f) {
            return 0.0f;
        }
        return ((-((float) Math.atan2(Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j & 4294967295L))))) * 180.0f) / 3.1415927f;
    }

    public static Map n(Bundle bundle) {
        String string;
        String str;
        if (bundle != null && (string = bundle.toString()) != null) {
            Matcher matcher = Pattern.compile("Bundle\\[\\{(.*?)\\}\\]").matcher(string);
            mbh0 mbh0Var = !matcher.matches() ? null : new mbh0(matcher, string);
            if (mbh0Var != null && (str = (String) o7h.A0(mbh0Var.a())) != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                Iterator it = ihc1.Q0(str, new String[]{", "}, 0, 6).iterator();
                while (it.hasNext()) {
                    List listQ0 = ihc1.Q0((String) it.next(), new String[]{"="}, 0, 6);
                    if (listQ0.size() == 2) {
                        linkedHashMap.put(listQ0.get(0), listQ0.get(1));
                    }
                }
                return linkedHashMap;
            }
        }
        return b7x.a;
    }

    public static final long o(bav0 bav0Var, boolean z, iu30 iu30Var) {
        List list = bav0Var.a;
        int size = list.size();
        long jG = 0;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            hav0 hav0Var = (hav0) list.get(i2);
            if (((Boolean) iu30Var.invoke(hav0Var)).booleanValue()) {
                jG = Offset.g(jG, z ? hav0Var.c : hav0Var.g);
                i++;
            }
        }
        if (i == 0) {
            return 9205357640488583168L;
        }
        return Offset.b(i, jG);
    }

    public static final float p(bav0 bav0Var, boolean z) {
        long jO = o(bav0Var, z, new p5e1((byte) 17));
        float fD = 0.0f;
        if (Offset.c(jO, 9205357640488583168L)) {
            return 0.0f;
        }
        List list = bav0Var.a;
        int size = list.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            hav0 hav0Var = (hav0) list.get(i2);
            if (hav0Var.d && hav0Var.h) {
                i++;
                fD = Offset.d(Offset.f(z ? hav0Var.c : hav0Var.g, jO)) + fD;
            }
        }
        return fD / i;
    }

    public static final long q(bav0 bav0Var) {
        long jO = o(bav0Var, true, new p5e1((byte) 17));
        if (Offset.c(jO, 9205357640488583168L)) {
            return 0L;
        }
        return Offset.f(jO, o(bav0Var, false, new p5e1((byte) 17)));
    }

    public static final float r(bav0 bav0Var) {
        List list = bav0Var.a;
        int size = list.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = 1;
            if (i >= size) {
                break;
            }
            hav0 hav0Var = (hav0) list.get(i);
            if (!hav0Var.h || !hav0Var.d) {
                i3 = 0;
            }
            i2 += i3;
            i++;
        }
        if (i2 >= 2) {
            long jO = o(bav0Var, true, new p5e1((byte) 17));
            long jO2 = o(bav0Var, false, new p5e1((byte) 17));
            int size2 = list.size();
            float f = 0.0f;
            float f2 = 0.0f;
            for (int i4 = 0; i4 < size2; i4++) {
                hav0 hav0Var2 = (hav0) list.get(i4);
                if (hav0Var2.d && hav0Var2.h) {
                    long j = hav0Var2.c;
                    long jF = Offset.f(hav0Var2.g, jO2);
                    long jF2 = Offset.f(j, jO);
                    float fM = m(jF2) - m(jF);
                    float fD = Offset.d(Offset.g(jF2, jF)) / 2.0f;
                    if (fM > 180.0f) {
                        fM -= 360.0f;
                    } else if (fM < -180.0f) {
                        fM += 360.0f;
                    }
                    f2 += fM * fD;
                    f += fD;
                }
            }
            if (f != 0.0f) {
                return f2 / f;
            }
        }
        return 0.0f;
    }

    public static final float s(bav0 bav0Var) {
        float fP = p(bav0Var, true);
        float fP2 = p(bav0Var, false);
        if (fP == 0.0f || fP2 == 0.0f) {
            return 1.0f;
        }
        return fP / fP2;
    }

    public static final void t(fid fidVar, z1a1 z1a1Var, lw4 lw4Var) {
        if (z1a1Var instanceof itq0) {
            n511 n511Var = ((itq0) z1a1Var).c;
            fidVar.d(n511Var.a, n511Var.b, n511Var.c, n511Var.d, lw4Var);
            return;
        }
        if (!(z1a1Var instanceof jtq0)) {
            if (z1a1Var instanceof htq0) {
                fidVar.u(((htq0) z1a1Var).c, lw4Var);
                return;
            } else {
                eg.o();
                return;
            }
        }
        jtq0 jtq0Var = (jtq0) z1a1Var;
        vq31 vq31Var = jtq0Var.c;
        long j = vq31Var.h;
        tw4 tw4Var = jtq0Var.d;
        if (tw4Var != null) {
            fidVar.u(tw4Var, lw4Var);
        } else {
            fidVar.l(vq31Var.a, vq31Var.b, vq31Var.c, vq31Var.d, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)), lw4Var);
        }
    }

    public static void u(DrawScope drawScope, z1a1 z1a1Var, Brush brush, float f, int i, int i2) {
        float f2 = (i2 & 4) != 0 ? 1.0f : f;
        int i3 = (i2 & 32) != 0 ? 3 : i;
        boolean z = z1a1Var instanceof itq0;
        z520 z520Var = z520.a;
        if (z) {
            n511 n511Var = ((itq0) z1a1Var).c;
            float f3 = n511Var.a;
            drawScope.C0(brush, (((long) Float.floatToRawIntBits(n511Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f3)) << 32), B(n511Var), f2, z520Var, (ColorFilter) null, i3);
            return;
        }
        if (!(z1a1Var instanceof jtq0)) {
            if (z1a1Var instanceof htq0) {
                drawScope.n0(((htq0) z1a1Var).c, brush, f2, z520Var, i3);
                return;
            } else {
                eg.o();
                return;
            }
        }
        jtq0 jtq0Var = (jtq0) z1a1Var;
        tw4 tw4Var = jtq0Var.d;
        if (tw4Var != null) {
            drawScope.n0(tw4Var, brush, f2, z520Var, i3);
            return;
        }
        vq31 vq31Var = jtq0Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (vq31Var.h >> 32));
        float f4 = vq31Var.a;
        float f5 = f2;
        drawScope.m0(brush, (((long) Float.floatToRawIntBits(vq31Var.b)) & 4294967295L) | (((long) Float.floatToRawIntBits(f4)) << 32), (((long) Float.floatToRawIntBits(vq31Var.b())) << 32) | (((long) Float.floatToRawIntBits(vq31Var.a())) & 4294967295L), (4294967295L & ((long) Float.floatToRawIntBits(fIntBitsToFloat))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32), f5, z520Var, i3);
    }

    public static final void v(DrawScope drawScope, z1a1 z1a1Var, long j, DrawStyle drawStyle, int i) {
        if (z1a1Var instanceof itq0) {
            n511 n511Var = ((itq0) z1a1Var).c;
            float f = n511Var.a;
            drawScope.F0(j, (((long) Float.floatToRawIntBits(n511Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32), B(n511Var), 1.0f, drawStyle, (ColorFilter) null, i);
            return;
        }
        if (!(z1a1Var instanceof jtq0)) {
            if (z1a1Var instanceof htq0) {
                drawScope.j0(((htq0) z1a1Var).c, j, 1.0f, drawStyle, i);
                return;
            } else {
                eg.o();
                return;
            }
        }
        jtq0 jtq0Var = (jtq0) z1a1Var;
        tw4 tw4Var = jtq0Var.d;
        if (tw4Var != null) {
            drawScope.j0(tw4Var, j, 1.0f, drawStyle, i);
            return;
        }
        vq31 vq31Var = jtq0Var.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (vq31Var.h >> 32));
        float f2 = vq31Var.a;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(vq31Var.b)) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
        float fB = vq31Var.b();
        drawScope.F(j, jFloatToRawIntBits, (((long) Float.floatToRawIntBits(vq31Var.a())) & 4294967295L) | (Float.floatToRawIntBits(fB) << 32), (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & 4294967295L), drawStyle, 1.0f, i);
    }

    public static void w(DrawScope drawScope, z1a1 z1a1Var, long j, phc1 phc1Var, int i) {
        if ((i & 8) != 0) {
            phc1Var = z520.a;
        }
        v(drawScope, z1a1Var, j, phc1Var, 3);
    }

    public static o9n1 x(Context context, GoogleSignInOptions googleSignInOptions) {
        zod.s(googleSignInOptions);
        return new o9n1(context, (Activity) null, nf8.a, googleSignInOptions, new jz40(new s9x0((byte) 28), Looper.getMainLooper()));
    }

    public static final jna1 y(SparseArray sparseArray) {
        return new jna1(sparseArray, (byte) 0);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    public static final t1m1 z(List list) {
        Integer numValueOf;
        Integer numC0;
        List list2 = list;
        int iS = zno1.s(q7h.U(list2, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Object obj : list2) {
            linkedHashMap.put(((wwx0) obj).a, obj);
        }
        wwx0 wwx0Var = (wwx0) linkedHashMap.get("target_bpm");
        wwx0 wwx0Var2 = (wwx0) linkedHashMap.get("duration");
        if (wwx0Var2 == null || (numC0 = nhc1.c0(wwx0Var2.b)) == null) {
            numValueOf = null;
        } else {
            int iIntValue = numC0.intValue();
            if (1 > iIntValue || iIntValue >= 35792) {
                numC0 = null;
            }
            if (numC0 != null) {
                numValueOf = Integer.valueOf(numC0.intValue() * 60000);
            } else {
                numValueOf = null;
            }
        }
        gzl1.Companion.getClass();
        gzl1 gzl1VarA = fzl1.a(linkedHashMap);
        wwx0 wwx0Var3 = (wwx0) linkedHashMap.get("beat_matching");
        Boolean boolValueOf = wwx0Var3 != null ? Boolean.valueOf(wwx0Var3.b.equals("on")) : null;
        wwx0 wwx0Var4 = (wwx0) linkedHashMap.get("adjust_speed");
        return new t1m1(numValueOf, gzl1VarA, boolValueOf, wwx0Var4 != null ? Boolean.valueOf(wwx0Var4.b.equals("on")) : null, wwx0Var != null ? nhc1.c0(wwx0Var.b) : null, 32);
    }
}
