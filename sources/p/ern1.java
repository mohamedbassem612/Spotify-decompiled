package p;

import android.appwidget.AppWidgetManager;
import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.concertcampaignview.v1.CtaType;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class ern1 {
    public static hpn1 a;
    public static b180 b;

    /* JADX WARN: Multi-variable type inference failed */
    public static final List A(sxg1 sxg1Var, b0k b0kVar) {
        return p7h.M(new vnr0[]{sxg1Var.a.invoke(b0kVar, 0), sxg1Var.b.invoke(b0kVar, 0)});
    }

    public static final xyv B(s0w s0wVar) {
        String str;
        Integer num;
        hb9 hb9Var;
        String str2 = s0wVar.d ? s0wVar.c : null;
        boolean z = s0wVar.f;
        if (!z || (str = s0wVar.h) == null) {
            str = null;
        }
        String str3 = (!z || (hb9Var = s0wVar.i) == null) ? null : hb9Var.a;
        if (!z || (num = s0wVar.j) == null) {
            num = null;
        }
        return new xyv((Boolean) null, num, str2, str, str3, s0wVar.p ? s0wVar.o : null, s0wVar.r ? s0wVar.q : null);
    }

    public static final ven0 C(String str, int i, int i2, dlv dlvVar, boolean z, boolean z2, Function0 function0, b0k b0kVar, int i3, int i4) {
        Function0 function1;
        if ((i4 & 64) != 0) {
            x340 x340Var = (x340) b0kVar;
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = q9f1.a1;
                x340Var.s0(objT);
            }
            function1 = (Function0) objT;
        } else {
            function1 = function0;
        }
        hsi1 hsi1Var = new hsi1(str, Float.valueOf(1.0f), Float.valueOf(0.0f), new pxg1(i, i2, dlvVar), rno1.a);
        int i5 = i3 >> 9;
        return zod.S(hsi1Var, z, z2, function1, b0kVar, (i5 & 112) | 8 | (i5 & 896) | (i5 & 7168), 0);
    }

    public static final void a(nbh nbhVar, wj31 wj31Var, List list, boolean z, tob1 tob1Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-303978440);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(nbhVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(wj31Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(list) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(tob1Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarA = nbhVar.a(1.0f, u291.f(nim0.a, 1.0f), false);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ppg1.a1;
                x340Var.s0(objT);
            }
            w2g0.c(s161.a(qim0VarA, (iu30) objT), (tl3) null, apo.r(-551493726, new k1f1(tob1Var, wj31Var, z, list), x340Var), x340Var, 3072, 6);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cnr0(nbhVar, wj31Var, list, z, tob1Var, i, (byte) 11);
        }
    }

    public static final void b(qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-213058287);
        int i2 = i | 6;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            long j = ((vex) zex.a.e).i;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(4.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var3, j, cr31VarB);
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 8.0f, 2.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            uwo1.e(cwl1.o0(x340Var, 2131955636), null, lee1.a(cbx.d(x340Var).j, 0L, fc11.G(11), FontWeight.Z, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777209), 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i, (byte) 22);
        }
    }

    public static final void c(List list, qim0 qim0Var, float f, b0k b0kVar, int i, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(897526196);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(list) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= x340Var.d(f) ? 256 : 128;
        }
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            } else if (i4 != 0) {
                qim0Var = nim0.a;
            }
            x340Var.s();
            List listD1 = o7h.d1(list, 5);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = z4m.Z;
                x340Var.s0(objT);
            }
            qim0 qim0VarC = i541.C(qim0Var, (iu30) objT);
            boolean z = (((i3 & 896) ^ 384) > 256 && x340Var.d(f)) || (i3 & 384) == 256;
            Object objT2 = x340Var.T();
            if (z || objT2 == m4cVar) {
                objT2 = new j37((byte) 1, f);
                x340Var.s0(objT2);
            }
            gfh0 gfh0Var = (gfh0) objT2;
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
            nko1.H(gfh0Var, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            x340Var.i0(-573700339);
            Iterator it = listD1.iterator();
            while (it.hasNext()) {
                d((p6m) it.next(), x340Var, 0);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h57(list, qim0Var2, f, i, i2, (byte) 1);
        }
    }

    public static final void d(p6m p6mVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2013305373);
        int i2 = (x340Var.i(p6mVar) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            boolean z = p6mVar.b == 1;
            float f = z ? 78.0f : 68.0f;
            cr31 cr31VarB = z ? er31.a : er31.b(4.0f);
            float f2 = z ? 0.0f : 10.0f;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(nim0Var, f);
            boolean zD = x340Var.d(f2);
            Object objT = x340Var.T();
            if (zD || objT == fkj0.X) {
                objT = new jc5((byte) 13, f2);
                x340Var.s0(objT);
            }
            qim0 qim0VarQ = i1p1.q(exd0.r(i541.C(qim0VarR, (iu30) objT), new o6m(cr31VarB, (byte) 0)), cr31VarB);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
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
            eso1.e(Uri.parse(p6mVar.a), isl.a, i1p1.q(u291.d(nim0Var, 1.0f), cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 224304, 0, 4032);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new h1m(p6mVar, i, (byte) 2);
        }
    }

    public static final void e(int i, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var, boolean z) {
        x340 x340Var;
        Function0 function2;
        qim0 qim0Var2;
        int i2;
        int i3;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1628579041);
        j06 j06Var = x340Var2.a;
        int i4 = i | (x340Var2.i(function0) ? 4 : 2) | (x340Var2.i(function1) ? 32 : 16) | 384 | (x340Var2.h(z) ? 2048 : 1024);
        if (x340Var2.Y(i4 & 1, (i4 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            if (z) {
                i2 = 1696371607;
                i3 = 2131955637;
            } else {
                i2 = 1696373651;
                i3 = 2131955638;
            }
            String strK = x0d.k(x340Var2, i2, i3, x340Var2, false);
            String strO0 = cwl1.o0(x340Var2, 2131955639);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("ereader_playback_gate_content", uyn1.B(uyn1.z(cbx.b(x340Var2).e.b, 0.0f, 2, u291.f(qim0Var3, 1.0f)), 0.0f, 16.0f, 0.0f, cvxVar.e, 5));
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            b(null, x340Var2, 0);
            qim0Var2 = qim0Var3;
            uwo1.e(ydh.g(8.0f, 2131955641, x340Var2, x340Var2, qim0Var3), null, cbx.d(x340Var2).e, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2026);
            uwo1.e(ydh.g(8.0f, 2131955640, x340Var2, x340Var2, qim0Var2), null, cbx.d(x340Var2).j, 0L, new a0e1(3), null, 0, false, null, 0, null, x340Var2, 0, 0, 2026);
            op71.g(x340Var2, u291.h(qim0Var2, cvxVar.a));
            mbh mbhVarA2 = jbh.a(new d36(12.0f, true, new um5(false)), een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0Var2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            qim0 qim0VarN2 = anm1.N("ereader_playback_gate_keep_reading", u291.f(qim0Var2, 1.0f));
            idx idxVar = new idx(4);
            boolean z3 = (i4 & 14) == 4;
            Object objT = x340Var2.T();
            if (z3 || objT == m4cVar) {
                objT = new ivw(function0, (byte) 13);
                x340Var2.s0(objT);
            }
            Function0 function3 = (Function0) objT;
            if (ihc1.y0(strK)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strK), function3), idxVar, qim0VarN2, null, null, null, null, null, null, null, apo.r(-715542314, new qeu(strK, (byte) 25), x340Var2), x340Var2, 0, 48, 2040);
            qim0 qim0VarN3 = anm1.N("ereader_playback_gate_listen", u291.f(qim0Var2, 1.0f));
            idx idxVar2 = new idx(6);
            boolean z4 = (i4 & 112) == 32;
            Object objT2 = x340Var2.T();
            if (z4 || objT2 == m4cVar) {
                function2 = function1;
                objT2 = new ivw(function2, (byte) 14);
                x340Var2.s0(objT2);
            } else {
                function2 = function1;
            }
            Function0 function4 = (Function0) objT2;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function4), idxVar2, qim0VarN3, null, null, null, null, null, null, null, apo.r(-1492285313, new qeu(strO0, (byte) 26), x340Var2), x340Var2, 0, 48, 2040);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            function2 = function1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rfz(function0, function2, qim0Var2, z, i);
        }
    }

    public static final void f(w5q0 w5q0Var, boolean z, qim0 qim0Var, b0k b0kVar, int i) {
        w5q0 w5q0Var2;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-2085779537);
        int i2 = (x340Var.g(w5q0Var) ? 4 : 2) | i | (x340Var.h(z) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            w5q0Var2 = w5q0Var;
            z2 = z;
            c4p1.k(w5q0Var2, z2, anm1.N("group", qim0Var), apo.r(-513784835, new jb50(w5q0Var, (byte) 5), x340Var), x340Var, (i2 & 14) | 3072 | (i2 & 112));
        } else {
            w5q0Var2 = w5q0Var;
            z2 = z;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new kn50(w5q0Var2, z2, qim0Var, i);
        }
    }

    public static final void g(gyg1 gyg1Var, qim0 qim0Var, qim0 qim0Var2, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-84226680);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(gyg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var2) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 2.0f, 1, qim0VarF);
            era eraVar = een.Q0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 48);
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
            qgo1.f((vnr0) gyg1Var.a.a.invoke(x340Var, 0), u291.f(qim0Var, 1.0f), null, 0, false, null, x340Var, 8, 60);
            qgo1.f((vnr0) gyg1Var.a.b.invoke(x340Var, 0), u291.f(qim0Var2, 1.0f), null, 0, false, null, x340Var, 8, 60);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new um81(gyg1Var, qim0Var, qim0Var2, i, (byte) 22);
        }
    }

    public static final void h(stn0 stn0Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1907039381);
        int i2 = (x340Var.g(stn0Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            w2g0.c((qim0) null, (tl3) null, apo.r(-812807339, new ukm0(stn0Var, qim0Var, (byte) 6), x340Var), x340Var, 3072, 7);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(stn0Var, qim0Var, i, (byte) 24);
        }
    }

    public static final void i(sxg1 sxg1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1411717597);
        int i2 = (x340Var.g(sxg1Var) ? 4 : 2) | i | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 8.0f, 1, qim0Var);
            era eraVar = een.Q0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(4.0f, true, new um5(false)), eraVar, x340Var, 48);
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
            vnr0 vnr0Var = (vnr0) sxg1Var.a.invoke(x340Var, 0);
            nim0 nim0Var = nim0.a;
            qgo1.f(vnr0Var, u291.f(nim0Var, 1.0f), null, 0, false, null, x340Var, 56, 60);
            qgo1.f((vnr0) sxg1Var.b.invoke(x340Var, 0), u291.f(nim0Var, 1.0f), null, 0, false, null, x340Var, 56, 60);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xaf1(sxg1Var, qim0Var, i, (byte) 18);
        }
    }

    public static final void j(gyg1 gyg1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-616308176);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(gyg1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            sxg1 sxg1Var = gyg1Var.e;
            qim0 qim0VarF = u291.f(qim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarZ = uyn1.z(0.0f, 2.0f, 1, qim0VarF);
            era eraVar = een.Q0;
            cvx cvxVar2 = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarF2 = u291.f(qim0Var2, 1.0f);
            d36 d36Var = new d36(cbx.b(x340Var).b.b, true, new um5(false));
            fra fraVar = een.Z;
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF2);
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
            sxg1 sxg1Var2 = gyg1Var.b;
            pw31 pw31Var = pw31.a;
            i(sxg1Var2, pw31Var.a(1.0f, qim0Var2, true), x340Var, 0);
            i(gyg1Var.c, pw31Var.a(1.0f, qim0Var2, true), x340Var, 0);
            x340Var.r(true);
            qim0 qim0VarF3 = u291.f(qim0Var2, 1.0f);
            jw31 jw31VarA2 = ew31.a(new d36(cbx.b(x340Var).b.b, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0VarF3);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            i(gyg1Var.d, pw31Var.a(1.0f, qim0Var2, true), x340Var, 0);
            if (sxg1Var != null) {
                x340Var.i0(772526538);
                i(sxg1Var, pw31Var.a(1.0f, qim0Var2, true), x340Var, 0);
                x340Var.r(false);
            } else {
                x340Var.i0(772612067);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(gyg1Var, qim0Var, i, (byte) 18);
        }
    }

    public static final hrd1 k(fe5 fe5Var, tzg1 tzg1Var, Object obj, Object obj2, Object obj3) {
        return new hrd1(fe5Var, tzg1Var, obj, obj2, (oe5) tzg1Var.a.invoke(obj3));
    }

    public static final void l(gyg1 gyg1Var, float f, iu30 iu30Var, j2i j2iVar, qim0 qim0Var, qim0 qim0Var2, qim0 qim0Var3, qim0 qim0Var4, b0k b0kVar, int i) {
        int i2;
        gyg1 gyg1Var2;
        List listA;
        char c;
        qim0 qim0Var5 = qim0Var2;
        qim0 qim0Var6 = qim0Var3;
        qim0 qim0Var7 = qim0Var4;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(283866409);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(gyg1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.g(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.g(qim0Var5) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= x340Var.g(qim0Var6) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= x340Var.g(qim0Var7) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (4793491 & i2) != 4793490)) {
            List listA2 = A(gyg1Var.a, x340Var);
            List listA3 = A(gyg1Var.b, x340Var);
            List listA4 = A(gyg1Var.c, x340Var);
            List listA5 = A(gyg1Var.d, x340Var);
            sxg1 sxg1Var = gyg1Var.e;
            if (sxg1Var == null) {
                x340Var.i0(-125853398);
                x340Var.r(false);
                c = 0;
                listA = null;
            } else {
                x340Var.i0(-2082269769);
                listA = A(sxg1Var, x340Var);
                x340Var.r(false);
                c = 0;
            }
            List[] listArr = new List[5];
            listArr[c] = listA2;
            listArr[1] = listA3;
            listArr[2] = listA4;
            listArr[3] = listA5;
            listArr[4] = listA;
            ArrayList arrayListV = q7h.V(f46.i0(listArr));
            boolean zG = x340Var.g(arrayListV);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = o7h.y0(arrayListV, ", ", (String) null, (String) null, ppg1.b1, 30);
                x340Var.s0(objT);
            }
            String str = (String) objT;
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).b.b, 0.0f, 2, qim0Var);
            era eraVar = een.Q0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 54);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            nim0 nim0Var = nim0.a;
            op71.g(x340Var, u291.h(nim0Var, f));
            j2iVar.invoke(pbh.a, x340Var, Integer.valueOf(6 | ((i2 >> 6) & 112)));
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            if ((i2 & 896) == 256) {
                c = 1;
            }
            Object objT2 = x340Var.T();
            if (c != 0 || objT2 == obj) {
                objT2 = new ceg1(iu30Var, (byte) 2);
                x340Var.s0(objT2);
            }
            qim0 qim0VarU = qxy0.u(x(qim0VarF, (iu30) objT2), (idn0) null, 3);
            boolean zG2 = x340Var.g(str);
            Object objT3 = x340Var.T();
            if (zG2 || objT3 == obj) {
                objT3 = new ysf1(str, (byte) 12);
                x340Var.s0(objT3);
            }
            qim0 qim0VarA = s161.a(qim0VarU, (iu30) objT3);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            int i3 = i2 & 14;
            int i4 = i2 >> 12;
            gyg1Var2 = gyg1Var;
            qim0Var5 = qim0Var2;
            qim0Var6 = qim0Var3;
            g(gyg1Var2, qim0Var5, qim0Var6, x340Var, (i4 & 896) | (i4 & 112) | i3);
            op71.g(x340Var, u291.h(nim0Var, cbx.b(x340Var).b.b));
            qim0Var7 = qim0Var4;
            j(gyg1Var2, qim0Var7, x340Var, i3 | ((i2 >> 18) & 112));
            x340Var.r(true);
            x340Var.r(true);
        } else {
            gyg1Var2 = gyg1Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hyg1(gyg1Var2, f, iu30Var, j2iVar, qim0Var, qim0Var5, qim0Var6, qim0Var7, i);
        }
    }

    public static final void m(i2c i2cVar, gyg1 gyg1Var, wj31 wj31Var, List list, boolean z, boolean z2, boolean z3, rk41 rk41Var, iu30 iu30Var, Function0 function0, iu30 iu30Var2, b0k b0kVar, int i) {
        int i2;
        int i3;
        i2c i2cVar2;
        x340 x340Var;
        float f;
        float fO;
        Object du2Var;
        int i4;
        int i5;
        qim0 qim0VarA;
        m4c m4cVar = fkj0.X;
        boolean z4 = rk41Var.a;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(933597476);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(i2cVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(gyg1Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(wj31Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(list) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.h(z) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var2.h(z2) ? 131072 : 65536;
        }
        int i6 = i2;
        if ((i & 1572864) == 0) {
            i3 = i6 | (x340Var2.h(z3) ? 1048576 : 524288);
        } else {
            i3 = i6;
        }
        if ((i & 12582912) == 0) {
            i3 |= (i & 16777216) == 0 ? x340Var2.g(rk41Var) : x340Var2.i(rk41Var) ? 8388608 : 4194304;
        }
        if ((i & 100663296) == 0) {
            i3 |= x340Var2.i(iu30Var) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= x340Var2.i(function0) ? 536870912 : 268435456;
        }
        int i7 = i3;
        if (x340Var2.Y(i7 & 1, ((i7 & 306783379) == 306783378 && ((x340Var2.i(iu30Var2) ? (char) 4 : (char) 2) & 3) == 2) ? false : true)) {
            x340Var2.d0();
            if ((i & 1) != 0 && !x340Var2.E()) {
                x340Var2.b0();
            }
            x340Var2.s();
            wat watVar = (wat) x340Var2.k(t4k.h);
            int iI0 = watVar.i0(i2cVar.c());
            float fC = i2cVar.c() * 0.125f;
            boolean zE = x340Var2.e(iI0);
            Object objT = x340Var2.T();
            if (zE || objT == m4cVar) {
                objT = bb00.h(0, x340Var2);
            }
            err0 err0Var = (hdn0) objT;
            int iS = err0Var.s();
            float fU0 = watVar.U0();
            float fT = 0.0f;
            if (iI0 <= 0) {
                f = 1.0f;
            } else {
                if (iI0 <= 0) {
                    fO = 0.0f;
                    f = 1.0f;
                } else {
                    float f2 = iS / iI0;
                    f = 1.0f;
                    fO = yoi1.o(f2, 0.0f, 1.0f);
                }
                fT = dm5.T(fO, fO < 0.875f ? 0.875f : fO, yoi1.o((fU0 - 1.5f) / 0.5f, 0.0f, f));
            }
            boolean z5 = (z4 == 0 && z3) ? false : true;
            qam1 qam1Var = (qam1) x340Var2.k(sam1.a);
            ilv.a.getClass();
            ceo ceoVar = flv.g;
            int i8 = ((i7 << 3) & 458752) | 438;
            ven0 ven0VarC = C("avatarIn", CtaType.SEE_ALL_SHOWS_FIELD_NUMBER, CtaType.CTA_CANT_ATTEND_FIELD_NUMBER, ceoVar, z5, z, null, x340Var2, i8, 64);
            boolean zG = x340Var2.g(ven0VarC);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                objT2 = yv91.a(new bu2(ven0VarC, (byte) 28));
                x340Var2.s0(objT2);
            }
            tob1 tob1Var = (tob1) objT2;
            Boolean boolValueOf = Boolean.valueOf(z3);
            float f3 = fT;
            Boolean bool = (Boolean) tob1Var.getValue();
            bool.getClass();
            Boolean boolValueOf2 = Boolean.valueOf(z4);
            int i9 = i7 & 3670016;
            boolean zG2 = (i9 == 1048576) | x340Var2.g(tob1Var) | ((i7 & 29360128) == 8388608 || ((i7 & 16777216) != 0 && x340Var2.i(rk41Var))) | x340Var2.i(iu30Var2);
            Object objT3 = x340Var2.T();
            if (zG2 || objT3 == m4cVar) {
                i4 = 1048576;
                i5 = i9;
                du2Var = new du2(z3, rk41Var, iu30Var2, tob1Var, (lnm) null, (byte) 21);
                x340Var2.s0(du2Var);
            } else {
                du2Var = objT3;
                i4 = 1048576;
                i5 = i9;
            }
            qxd0.r(boolValueOf, bool, boolValueOf2, (vu30) du2Var, x340Var2);
            Boolean boolValueOf3 = Boolean.valueOf(z3);
            boolean zI = (i5 == i4) | ((i7 & 458752) == 131072) | ((i7 & 57344) == 16384) | x340Var2.i((Object) 
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x02a1: ARITH (r1v8 'zI' boolean) = (wrap boolean:0x029c: ARITH (wrap boolean:0x028e: ARITH (wrap boolean:?: TERNARY null = ((r13v6 'i5' int) == (r1v3 'i4' int)) ? true : false) | (wrap boolean:?: TERNARY null = ((wrap int:0x0284: ARITH (r31v0 'i7' int) & (458752 int) A[WRAPPED] (LINE:645)) == (131072 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:655)) | (wrap boolean:?: TERNARY null = ((wrap int:0x0292: ARITH (r31v0 'i7' int) & (57344 int) A[WRAPPED] (LINE:659)) == (16384 int)) ? true : false) A[DONT_WRAP, WRAPPED] (LINE:669)) | (wrap boolean:0x029d: INVOKE (r6v1 'x340Var2' p.x340), (wrap java.lang.Object:?: CAST (java.lang.Object) (r36v2 ?? I:??[OBJECT, ARRAY])) VIRTUAL call: p.x340.i(java.lang.Object):boolean A[WRAPPED] (LINE:670)) A[DECLARE_VAR] (LINE:674) in method: p.ern1.m(p.i2c, p.gyg1, p.wj31, java.util.List, boolean, boolean, boolean, p.rk41, p.iu30, kotlin.jvm.functions.Function0, p.iu30, p.b0k, int):void, file: /workspace/spotify-analysis/dex-input/classes4.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r36v2 ??
                	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                */
            /*
                Method dump skipped, instruction units count: 1113
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: p.ern1.m(p.i2c, p.gyg1, p.wj31, java.util.List, boolean, boolean, boolean, p.rk41, p.iu30, kotlin.jvm.functions.Function0, p.iu30, p.b0k, int):void");
        }

        public static final qim0 n(float f, Function0 function0, boolean z) {
            return zr7.i(nim0.a, new ltn0(f, function0, z));
        }

        public static final u7b1 o(ywv0 ywv0Var) {
            Flowable flowable = (Flowable) ywv0Var.a;
            c8o.l(flowable);
            Scheduler scheduler = (Scheduler) ywv0Var.i;
            c8o.l(scheduler);
            Context context = (Context) ywv0Var.e;
            c8o.l(context);
            gw70 gw70Var = (gw70) ywv0Var.d;
            c8o.l(gw70Var);
            xs80 xs80Var = (xs80) ywv0Var.f;
            c8o.l(xs80Var);
            luk lukVar = (luk) ywv0Var.h;
            c8o.l(lukVar);
            e26 e26Var = new e26(false, false, lukVar);
            c8o.l(lukVar);
            e26 e26Var2 = new e26(false, false, lukVar);
            c8o.l(context);
            AppWidgetManager appWidgetManager = AppWidgetManager.getInstance(context);
            Scheduler scheduler2 = (Scheduler) ywv0Var.c;
            c8o.l(scheduler2);
            i8h1 i8h1Var = (i8h1) ywv0Var.g;
            c8o.l(i8h1Var);
            qpj1 qpj1Var = new qpj1(i8h1Var);
            c8o.l(context);
            wpt wptVar = new wpt(context);
            c8o.l(context);
            rx5 rx5Var = new rx5(context, appWidgetManager, scheduler2, qpj1Var, wptVar, new uxy0(context, AppWidgetManager.getInstance(context), (byte) 11));
            c8o.l(context);
            zrj1 zrj1Var = new zrj1((Object) e26Var2, (Object) rx5Var, (Object) new em3(context, AppWidgetManager.getInstance(context), (byte) 12), (byte) 15);
            u8g u8gVar = new u8g(context);
            c8o.l(context);
            r2a1 r2a1Var = new r2a1(u8gVar, new wpt(context), (byte) 12);
            Scheduler scheduler3 = (Scheduler) ywv0Var.b;
            c8o.l(scheduler3);
            return new u7b1(flowable, scheduler, context, gw70Var, new mxa1(context, xs80Var, e26Var, zrj1Var, r2a1Var, scheduler3));
        }

        public static final Next p(s0w s0wVar) {
            mmr0 mmr0Var;
            if (!s0wVar.y) {
                return Next.a(Effects.a(new zyv[]{new zyv(s0wVar.E)}));
            }
            hb9 hb9Var = s0wVar.i;
            if (hb9Var != null) {
                mmr0Var = new mmr0(hb9Var.b, (Object) null);
            } else {
                Integer num = s0wVar.j;
                if (num != null) {
                    mmr0Var = new mmr0((Object) null, num);
                } else {
                    String str = s0wVar.g;
                    if (str != null) {
                        mmr0Var = new mmr0(str, (Object) null);
                    } else {
                        int i = s0wVar.l;
                        mmr0Var = i != 0 ? new mmr0((Object) null, Integer.valueOf(i)) : new mmr0((Object) null, (Object) null);
                    }
                }
            }
            return Next.a(Effects.a(new azv[]{new azv(s0wVar.c, s0wVar.a, (Integer) mmr0Var.b, (String) mmr0Var.a)}));
        }

        public static final long q(hrd1 hrd1Var) {
            return hrd1Var.e() / 1000000;
        }

        public static final long r(KeyEvent keyEvent) {
            return mno1.d(keyEvent.getKeyCode());
        }

        public static df41 s() {
            return hwx0.c;
        }

        public static final int t(KeyEvent keyEvent) {
            int action = keyEvent.getAction();
            if (action != 0) {
                return action != 1 ? 0 : 1;
            }
            return 2;
        }

        public static final Integer u(bw91 bw91Var, btn0 btn0Var) {
            if (btn0Var == null) {
                return null;
            }
            ek60 ek60VarListIterator = bw91Var.listIterator();
            int i = 0;
            while (true) {
                ek60 ek60Var = ek60VarListIterator;
                if (!ek60Var.hasNext()) {
                    i = -1;
                    break;
                }
                if (u890.j(((btn0) ek60Var.next()).c, btn0Var.c)) {
                    break;
                }
                i++;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (i >= 0) {
                return numValueOf;
            }
            return null;
        }

        public static final boolean v(KeyEvent keyEvent) {
            return keyEvent.isCtrlPressed();
        }

        public static final boolean w(KeyEvent keyEvent) {
            return keyEvent.isShiftPressed();
        }

        public static final qim0 x(qim0 qim0Var, iu30 iu30Var) {
            return qim0Var.then(new h5q0(iu30Var));
        }

        public static mly0 y(Map map) {
            return new mly0(map, b7x.a);
        }

        public static boolean z(flb0 flb0Var, qqq0 qqq0Var, boolean z) {
            return (flb0Var != flb0.b || qqq0Var == qqq0.a) ? !z : z;
        }
    }
