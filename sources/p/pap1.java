package p;

import android.app.Dialog;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.navigation.fragment.NavHostFragment;
import defpackage.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class pap1 {
    public static b180 a;
    public static b180 b;

    public static Comparable A(p3v p3vVar, p3v p3vVar2, p3v p3vVar3) {
        return z(p3vVar, z(p3vVar2, p3vVar3));
    }

    public static final void B(zf30 zf30Var, int i, int i2, Bundle bundle) {
        gon0 gon0VarW = w(zf30Var);
        vnn0 vnn0VarI = gon0VarW.i();
        if (vnn0VarI == null || vnn0VarI.h != i) {
            return;
        }
        gon0VarW.p(i2, bundle, (qon0) null);
    }

    public static vuf0 C(lik1 lik1Var) {
        return new vuf0(lik1Var);
    }

    public static final ven0 D(boolean z, b0k b0kVar) {
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(1758323577);
        Object objT = x340Var.T();
        m4c m4cVar = fkj0.X;
        if (objT == m4cVar) {
            objT = v8r.q(new zje1());
            x340Var.s0(objT);
        }
        ven0 ven0Var = (ven0) objT;
        if (!z) {
            x340Var.r(false);
            return ven0Var;
        }
        Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
        boolean zI = x340Var.i(context) | x340Var.i(ven0Var);
        Object objT2 = x340Var.T();
        if (zI || objT2 == m4cVar) {
            objT2 = new vie1((byte) 1, context, ven0Var);
            x340Var.s0(objT2);
        }
        qxd0.i(rih1.a, (iu30) objT2, x340Var);
        x340Var.r(false);
        return ven0Var;
    }

    public static final View E(x4t x4tVar) {
        if (!((pim0) x4tVar).a.N0) {
            qf80.c("Cannot get View because the Modifier node is not currently attached.");
        }
        return kmb0.a(oap1.B(x4tVar));
    }

    public static final xxh F(wce wceVar, int i) {
        int iOrdinal = wceVar.ordinal();
        vxh vxhVar = vxh.a;
        if (iOrdinal == 0) {
            return vxhVar;
        }
        if (iOrdinal == 1) {
            return new wxh(i);
        }
        if (iOrdinal == 2) {
            return new txh(i);
        }
        if (iOrdinal == 3) {
            return uxh.a;
        }
        n57.s("Unknown change type, defaulting to None. ChangeType: " + wceVar);
        return vxhVar;
    }

    public static final void a(h52 h52Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(83293172);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(h52Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            Uri uri = Uri.parse(h52Var.e);
            as80 as80Var = mif1.P0;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            eso1.e(uri, isl.a, (qim0) null, new p3v(64.0f), (zvx) null, (ecx) null, as80Var, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4020);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0.a, 8.0f));
            uwo1.e(h52Var.f, null, cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            uwo1.e(h52Var.h, null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i52(h52Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void b(h52 h52Var, gw70 gw70Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1798672633);
        int i2 = (x340Var.g(h52Var) ? 4 : 2) | i | (x340Var.i(gw70Var) ? 32 : 16) | (x340Var.i(iu30Var) ? 256 : 128) | 3072;
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            mod.b(oi7.a.a(gw70Var), apo.r(-1308924985, new j52(iu30Var, h52Var, (byte) 1), x340Var), x340Var, 56);
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new x2(i, (Object) h52Var, (Object) gw70Var, (Object) iu30Var, (Object) qim0Var2, (byte) 17);
        }
    }

    public static final void c(String str, List list, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-275400746);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(list) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var).b.b;
            qim0 qim0VarA = uyn1.A(qim0Var, 8.0f, 12.0f, 8.0f, f);
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarA);
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
            nim0 nim0Var = nim0.a;
            uwo1.e(str, u291.j(f, 0.0f, 2, u291.f(nim0Var, 1.0f)), lee1.a(cbx.d(x340Var).o, 0L, fc11.G(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), ((yex) zex.a.d).g, null, null, 2, false, new cjc0(2), 0, null, x340Var, (i2 & 14) | 1572864, 0, 1712);
            x340Var = x340Var;
            x340Var.i0(2105548404);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                i((fi90) it.next(), x340Var, 0);
            }
            x340Var.r(false);
            qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
            uwr uwrVar2 = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            zpn1.f(u291.h(qim0VarB, 12.0f), 0L, x340Var, 0, 2);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new d5(str, list, qim0Var, i, (byte) 1);
        }
    }

    public static final void d(llw0 llw0Var, int i, String str, String str2, qim0 qim0Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-2086454231);
        j06 j06Var = x340Var2.a;
        if ((i2 & 6) == 0) {
            i3 = (x340Var2.g(llw0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= x340Var2.g(str) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var2.g(str2) ? 2048 : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= x340Var2.g(qim0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i3 & 1, (i3 & 9363) != 9362)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            h(llw0Var, i, x340Var2, i3 & 126);
            gra graVar = een.t;
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarY = uyn1.y(u291.f(h2cVar.a(nim0Var, graVar), 1.0f), 8.0f, 12.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarY);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            lee1 lee1Var = cbx.d(x340Var2).m;
            long j = u7h.f;
            uwo1.e(str, null, lee1Var, j, null, null, 2, false, new cjc0(1), 0, null, x340Var2, ((i3 >> 6) & 14) | 1575936, 0, 1714);
            uwo1.e(str2, null, kk0.p(nim0Var, 8.0f, x340Var2, x340Var2).e, j, null, null, 2, false, new cjc0(2), 0, null, x340Var2, ((i3 >> 9) & 14) | 1575936, 0, 1714);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lk0(llw0Var, i, str, str2, qim0Var, i2, (byte) 6);
        }
    }

    public static final void e(llw0 llw0Var, int i, String str, String str2, String str3, List list, qim0 qim0Var, b0k b0kVar, int i2) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(724588752);
        int i3 = i2 | (x340Var.g(llw0Var) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(str2) ? 2048 : 1024) | (x340Var.g(str3) ? 16384 : 8192) | (x340Var.i(list) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i3 & 1, (599187 & i3) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(zr7.i(d7e.r(((ez61) dz61.d).a, u291.f(qim0Var3, 1.0f), false), gce0.a1), u7h.b, d4o1.a);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
            pbh pbhVar = pbh.a;
            d(llw0Var, i, str, str2, pbhVar.a(0.43f, qim0VarF2, true), x340Var, i3 & 8190);
            c(str3, list, pbhVar.a(0.57f, u291.f(qim0Var3, 1.0f), true), x340Var, (i3 >> 12) & 126);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(llw0Var, i, str, str2, str3, list, qim0Var2, i2);
        }
    }

    public static final void f(h52 h52Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        boolean z;
        float f;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-843932048);
        int i2 = i | (x340Var.g(h52Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarH = l6o1.H(qim0Var, l6o1.C(0, 0, 1, x340Var), false, 14);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0Var3 = nim0.a;
            op71.g(x340Var, u291.r(qim0Var3, 8.0f));
            a(h52Var, u291.f(qim0Var3, 1.0f), x340Var, i2 & 14);
            if (h52Var.i.isEmpty() && h52Var.j.isEmpty()) {
                x340Var.i0(382571574);
                z = false;
                f = 0.0f;
                uwo1.e(cwl1.o0(x340Var, 2131955127), uyn1.z(0.0f, cbx.b(x340Var).e.a, 1, qim0Var3), cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2040);
                x340Var = x340Var;
                x340Var.r(false);
                qim0Var2 = qim0Var3;
            } else {
                z = false;
                f = 0.0f;
                x340Var.i0(382806957);
                qim0Var2 = qim0Var3;
                o(h52Var, iu30Var, uyn1.B(qim0Var2, 0.0f, 20.0f, 0.0f, 0.0f, 13), x340Var, i2 & 126);
                x340Var.r(false);
            }
            if (h52Var.l) {
                x340Var.i0(382932228);
                cvx cvxVar2 = cbx.b(x340Var).b;
                hr80.d(u291.f(uyn1.z(f, 16.0f, 1, qim0Var2), 1.0f), 1.0f, cbx.a(x340Var).d.b, x340Var, 0, 0);
                n((i2 >> 3) & 14, x340Var, iu30Var, null);
                x340Var.r(z);
            } else {
                x340Var.i0(383170556);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q1((byte) 25, i, (Object) h52Var, iu30Var, qim0Var);
        }
    }

    public static final void g(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(347972915);
        int i2 = i | (x340Var.i(iu30Var) ? 4 : 2) | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            String strO0 = cwl1.o0(x340Var, 2131955124);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).d, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(kk0.j(16.0f, 2131955123, x340Var, x340Var, nim0.a), null, cbx.d(x340Var).j, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            nyx.a(3, (wux) null, apo.r(-1428398980, new sm(iu30Var, (byte) 6), x340Var), x340Var, 3078, 6);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l52(iu30Var, qim0Var, i, (byte) 0);
        }
    }

    public static final void h(llw0 llw0Var, int i, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(224852186);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(llw0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = llw0Var instanceof jlw0;
            nim0 nim0Var = nim0.a;
            if (z) {
                x340Var.i0(-1577361940);
                eso1.e(Uri.parse(((jlw0) llw0Var).a), isl.a, u291.d(nim0Var, 1.0f), (p3v) null, (zvx) null, (ecx) null, mif1.P0, (tl3) null, (ColorFilter) null, oux.a, true, false, x340Var, 1797552, 6, 2432);
                x340Var.r(false);
            } else {
                x340Var.i0(1334602979);
                t1c.a(dug.f(u291.d(nim0Var, 1.0f), z4p1.e(i), d4o1.a), x340Var, 0);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl9((Object) llw0Var, i, i2, (byte) 1);
        }
    }

    public static final void i(fi90 fi90Var, b0k b0kVar, int i) {
        fi90 fi90Var2 = fi90Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1154654063);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.i(fi90Var2) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var, 48);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, nim0Var);
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
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            Uri uri = Uri.parse(fi90Var2.c);
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarQ = i1p1.q(nim0Var, er31.b(2.0f));
            zov0 zov0Var = cbx.b(x340Var).g;
            cbx.a.getClass();
            eso1.e(uri, isl.a, qim0VarQ, new p3v(32.0f), (zvx) null, uwr.a(), (j6m) null, (tl3) null, (ColorFilter) null, oux.a, true, false, x340Var, 24624, 6, 2496);
            op71.g(x340Var, u291.v(nim0Var, 8.0f));
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, nim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            fi90Var2 = fi90Var;
            uwo1.e(fi90Var2.a, null, cbx.d(x340Var).o, u7h.f, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1575936, 0, 1714);
            uwo1.e(fi90Var2.b, null, lee1.a(cbx.d(x340Var).o, 0L, fc11.G(8), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213), ((yex) zex.a.d).g, null, null, 2, false, new cjc0(1), 0, null, x340Var, 1572864, 0, 1714);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new tqa(fi90Var2, i, (byte) 0);
        }
    }

    public static final void j(h52 h52Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        byte b2;
        qim0 qim0Var2;
        int i3;
        qim0 qim0Var3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-96079977);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(h52Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if (x340Var.Y(i4 & 1, (i4 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var4);
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
            if (h52Var.i.isEmpty()) {
                i3 = 0;
                qim0Var3 = qim0Var4;
                x340Var.i0(-403786591);
                x340Var.r(false);
            } else {
                x340Var.i0(-404009543);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                qim0Var3 = qim0Var4;
                i3 = 0;
                uwo1.e(kk0.j(16.0f, 2131955126, x340Var, x340Var, qim0Var4), null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                x340Var.r(false);
            }
            k(mqo1.A(h52Var.j), uyn1.B(qim0Var3, 0.0f, 12.0f, 0.0f, 0.0f, 13), x340Var, i3);
            b2 = 1;
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            b2 = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new i52(h52Var, qim0Var2, i, b2);
        }
    }

    public static final void k(c380 c380Var, qim0 qim0Var, b0k b0kVar, int i) {
        float f;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1064949248);
        int i2 = (x340Var.g(c380Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            Iterator itN = kk0.n(x340Var, qim0VarE, y580.Y, 571427067, c380Var);
            int i3 = 0;
            while (itN.hasNext()) {
                Object next = itN.next();
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                wrd1 wrd1Var = (wrd1) next;
                hux huxVar = wrd1Var.a;
                String strO0 = cwl1.o0(x340Var, wrd1Var.b);
                qim0 qim0VarF = u291.f(nim0.a, 1.0f);
                if (i3 == 0) {
                    x340Var.i0(717874832);
                    x340Var.r(false);
                    f = 0.0f;
                } else {
                    x340Var.i0(717875954);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var).b;
                    x340Var.r(false);
                    f = 16.0f;
                }
                yoi1.f(huxVar, strO0, uyn1.B(qim0VarF, 0.0f, f, 0.0f, 0.0f, 13), x340Var, 8);
                i3 = i4;
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e(c380Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void l(h52 h52Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1131241733);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.g(h52Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            String strO0 = cwl1.o0(x340Var, 2131955129);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, null, cbx.d(x340Var).h, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            c380 c380VarA = mqo1.A(h52Var.i);
            cvx cvxVar = cbx.b(x340Var).b;
            k(c380VarA, uyn1.z(0.0f, 12.0f, 1, qim0Var3), x340Var, 0);
            uwo1.e(cwl1.o0(x340Var, 2131955128), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            String strO1 = cwl1.o0(x340Var, 2131955118);
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new k52(iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            yoi1.a(0, strO1, (Function0) objT, x340Var, (qim0) null);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m52(h52Var, iu30Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void m(n960 n960Var, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        byte b2;
        zvx zvxVar;
        int i2 = n960Var.b;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(117315115);
        int i3 = (b0kVar3.g(n960Var) ? 4 : 2) | i | (b0kVar3.i(qim0Var) ? 32 : 16);
        if (b0kVar3.Y(i3 & 1, (i3 & 19) != 18)) {
            boolean z = i2 == 1;
            qim0 qim0VarN = z ? anm1.N("single-artwork-highlight-tag", i1p1.q(u291.f(qim0Var, 1.0f), er31.a)) : anm1.N("single-artwork-highlight-tag", u291.f(qim0Var, 1.0f));
            Uri uri = Uri.parse(n960Var.a);
            if (z) {
                b0kVar3.i0(-1168253166);
                b0kVar3.r(false);
                zvxVar = null;
            } else {
                b0kVar3.i0(1070693938);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar3).f;
                cua cuaVar2 = cbx.b(b0kVar3).f;
                zvxVar = new zvx();
                b0kVar3.r(false);
            }
            zvx zvxVar2 = zvxVar;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            pux puxVarU = flo1.u(b0kVar3, i2);
            b2 = 1;
            b0kVar2 = b0kVar3;
            eso1.e(uri, isl.a, qim0VarN, (p3v) null, zvxVar2, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, puxVarU, false, false, b0kVar2, 1073744944, 0, 3520);
        } else {
            b0kVar2 = b0kVar3;
            b2 = 1;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lf50(n960Var, qim0Var, i, b2);
        }
    }

    public static final void n(int i, b0k b0kVar, iu30 iu30Var, qim0 qim0Var) {
        int i2;
        byte b2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1228404277);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(iu30Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            String strO0 = cwl1.o0(x340Var, 2131955132);
            uwr uwrVar = cbx.a;
            qim0Var2 = qim0Var3;
            uwo1.e(strO0, null, cbx.d(x340Var).e, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
            cvx cvxVar = cbx.b(x340Var).b;
            uwo1.e(kk0.j(16.0f, 2131955131, x340Var, x340Var, qim0Var2), null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            cvx cvxVar2 = cbx.b(x340Var).b;
            String strJ = kk0.j(12.0f, 2131955119, x340Var, x340Var, qim0Var2);
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new k52(iu30Var, (byte) 2);
                x340Var.s0(objT);
            }
            b2 = 0;
            yoi1.a(0, strJ, (Function0) objT, x340Var, (qim0) null);
            x340Var.r(true);
        } else {
            b2 = 0;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new n52(iu30Var, qim0Var2, i, b2);
        }
    }

    public static final void o(h52 h52Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        boolean z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1729791363);
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(h52Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0Var);
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
            String strO0 = cwl1.o0(x340Var2, 2131955137);
            uwr uwrVar = cbx.a;
            int i3 = i2;
            uwo1.e(strO0, null, cbx.d(x340Var2).e, 0L, null, null, 0, false, null, 0, null, x340Var2, 0, 0, 2042);
            x340Var = x340Var2;
            if (h52Var.i.isEmpty()) {
                z = false;
                x340Var.i0(-241554711);
                x340Var.r(false);
            } else {
                x340Var.i0(-241687329);
                cvx cvxVar = cbx.b(x340Var).b;
                op71.g(x340Var, u291.r(nim0.a, 16.0f));
                l(h52Var, iu30Var, null, x340Var, i3 & 126);
                z = false;
                x340Var.r(false);
            }
            if (h52Var.j.isEmpty()) {
                x340Var.i0(-241456503);
                x340Var.r(z);
            } else {
                x340Var.i0(-241500709);
                j(h52Var, null, x340Var, i3 & 14);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new m52(h52Var, iu30Var, qim0Var, i, (byte) 1);
        }
    }

    public static final void p(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1052231496);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ti5.a(apo.r(-636825677, new nl(str, (byte) 13), x340Var), qim0Var, apo.r(-1221597327, new wm(function0, (byte) 7), x340Var), (xu30) null, 0.0f, (erl1) null, (x7f1) null, x340Var, ((i2 >> 3) & 112) | 390, 248);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rl(str, function0, qim0Var, i, (byte) 3);
        }
    }

    public static final ArrayList q(ArrayList arrayList, ArrayList arrayList2) {
        int i = 0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((jn60) it.next()) instanceof a181) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        if (((jn60) it2.next()) instanceof a181) {
                            ArrayList arrayList3 = new ArrayList(arrayList);
                            arrayList3.addAll(i + 1, arrayList2);
                            return arrayList3;
                        }
                        i++;
                    }
                    i = -1;
                    ArrayList arrayList4 = new ArrayList(arrayList);
                    arrayList4.addAll(i + 1, arrayList2);
                    return arrayList4;
                }
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList);
        arrayList5.addAll(0, arrayList2);
        return arrayList5;
    }

    public static qim0 r(qim0 qim0Var, tob1 tob1Var, boolean z, int i) {
        return i541.C(qim0Var, new ake1(z, (i & 16) == 0, tob1Var, (i & 4) != 0 ? 8.0f : 4.0f, (i & 8) != 0 ? 5.0f : 2.0f));
    }

    public static yxh s(iu30... iu30VarArr) {
        if (iu30VarArr.length > 0) {
            return new yxh(iu30VarArr, (byte) 0);
        }
        hhg1.n("Failed requirement.");
        return null;
    }

    public static int t(Comparable comparable, Comparable comparable2) {
        if (comparable == comparable2) {
            return 0;
        }
        if (comparable == null) {
            return -1;
        }
        if (comparable2 == null) {
            return 1;
        }
        return comparable.compareTo(comparable2);
    }

    public static nrk0 u(Integer num, r6h1 r6h1Var) {
        return new nrk0(num, r6h1Var);
    }

    public static final boolean v(String str, String str2) {
        return u890.j(str, str2);
    }

    public static final gon0 w(zf30 zf30Var) {
        Dialog dialogA1;
        Window window;
        for (zf30 zf30Var2 = zf30Var; zf30Var2 != null; zf30Var2 = zf30Var2.X0) {
            if (zf30Var2 instanceof NavHostFragment) {
                return ((NavHostFragment) zf30Var2).Y0();
            }
            NavHostFragment navHostFragment = zf30Var2.j0().A;
            if (navHostFragment instanceof NavHostFragment) {
                return navHostFragment.Y0();
            }
        }
        View view = zf30Var.j1;
        if (view != null) {
            return kqn1.q(view);
        }
        t2u t2uVar = zf30Var instanceof t2u ? (t2u) zf30Var : null;
        View decorView = (t2uVar == null || (dialogA1 = t2uVar.a1()) == null || (window = dialogA1.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return kqn1.q(decorView);
        }
        eg.m(gvg.i("Fragment ", zf30Var, " does not have a NavController set"));
        return null;
    }

    public static int x(String str) {
        return str.hashCode();
    }

    public static Comparable y(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) >= 0 ? comparable : comparable2;
    }

    public static Comparable z(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2) <= 0 ? comparable : comparable2;
    }
}
