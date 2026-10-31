package p;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.widget.ImageView;
import androidx.compose.ui.graphics.ColorFilter;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.mobius.Effects;
import com.spotify.mobius.Next;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class r2p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1460199920);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfx.b(18, apo.r(561668027, new b5(qim0Var, (byte) 2), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b5(qim0Var, i, (byte) 3);
        }
    }

    public static final void b(String str, long j, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var;
        qim0 qim0Var2;
        char c;
        m4c m4cVar = fkj0.X;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1797235322);
        j06 j06Var = x340Var2.a;
        int i2 = i | (x340Var2.g(str) ? 4 : 2) | (x340Var2.f(j) ? 32 : 16) | (x340Var2.i(function0) ? 256 : 128) | (x340Var2.i(function1) ? 2048 : 1024) | 24576;
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            float fM = dsa0.m(x340Var2, 2131165405);
            float fM2 = dsa0.m(x340Var2, 2131165404);
            yla.r(x340Var2);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = u291.h(u291.f(qim0Var3, 1.0f), fM);
            u5j1 u5j1Var = d4o1.a;
            qim0 qim0VarF = dug.f(qim0VarH, j, u5j1Var);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarF);
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
            qim0 qim0VarF2 = dug.f(i1p1.q(u291.d(qim0Var3, 1.0f), er31.d(fM2, fM2, 0.0f, 0.0f, 12)), cbx.a(x340Var2).a.c, u5j1Var);
            gfh0 gfh0VarC2 = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC2, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            String strO0 = cwl1.o0(x340Var2, 2131953073);
            boolean z2 = (i2 & 896) == 256;
            Object objT = x340Var2.T();
            if (z2 || objT == m4cVar) {
                objT = new pj8(function0, (byte) 3);
                x340Var2.s0(objT);
            }
            gbx gbxVar = new gbx(new y50(strO0), (Function0) objT);
            ldx ldxVar = ldx.c;
            gra graVar2 = een.g;
            h2c h2cVar = h2c.a;
            qim0 qim0VarA = h2cVar.a(qim0Var3, graVar2);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            qim0 qim0VarB = uyn1.B(qim0VarA, 16.0f, 0.0f, 0.0f, 0.0f, 14);
            boolean zG = x340Var2.g(strO0);
            Object objT2 = x340Var2.T();
            if (zG || objT2 == m4cVar) {
                c = 2;
                objT2 = new nb9(strO0, (byte) 2);
                x340Var2.s0(objT2);
            } else {
                c = 2;
            }
            qim0Var2 = qim0Var3;
            wro1.h(gbxVar, ldxVar, s161.b(qim0VarB, false, (iu30) objT2), null, null, null, false, null, null, r8i.b, x340Var2, 0, 6, 1016);
            uwo1.e(str, uyn1.z(64.0f, 0.0f, 2, h2cVar.a(u291.f(qim0Var2, 1.0f), een.h)), cbx.d(x340Var2).h, cbx.a(x340Var2).b.a, new a0e1(3), null, 2, false, new cjc0(1), 0, null, x340Var2, i2 & 14, 0, 1696);
            String strO1 = cwl1.o0(x340Var2, 2131953072);
            boolean z3 = (i2 & 7168) == 2048;
            Object objT3 = x340Var2.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new pj8(function1, (byte) 4);
                x340Var2.s0(objT3);
            }
            gbx gbxVar2 = new gbx(new y50(strO1), (Function0) objT3);
            qim0 qim0VarA2 = h2cVar.a(qim0Var2, een.i);
            cvx cvxVar3 = cbx.b(x340Var2).b;
            qim0 qim0VarB2 = uyn1.B(qim0VarA2, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            boolean zG2 = x340Var2.g(strO1);
            Object objT4 = x340Var2.T();
            if (zG2 || objT4 == m4cVar) {
                objT4 = new nb9(strO1, (byte) 3);
                x340Var2.s0(objT4);
            }
            wro1.h(gbxVar2, ldxVar, s161.b(qim0VarB2, false, (iu30) objT4), null, null, null, false, null, null, r8i.c, x340Var2, 0, 6, 1016);
            x340Var = x340Var2;
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new rb9(str, j, function0, function1, qim0Var2, i);
        }
    }

    public static final void c(nak0 nak0Var, iu30 iu30Var, qim0 qim0Var, boolean z, boolean z2, b0k b0kVar, int i) {
        qim0 qim0Var2;
        boolean z3;
        boolean z4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1921133223);
        int i2 = i | (x340Var.i(nak0Var) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.h(z) ? 2048 : 1024) | (x340Var.h(z2) ? 16384 : 8192);
        if (x340Var.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
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
            d(nak0Var, null, x340Var, i2 & 14);
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.b.c();
            cvx cvxVar = cbx.b(x340Var).b;
            hr80.d(uyn1.z(0.0f, 8.0f, 1, qim0Var3), 1.0f, jC, x340Var, 48, 0);
            if (z) {
                x340Var.i0(-66019268);
                uvx uvxVar = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26);
                String strO0 = cwl1.o0(x340Var, 2131958828);
                boolean z5 = (i2 & 112) == 32;
                Object objT = x340Var.T();
                if (z5 || objT == m4cVar) {
                    objT = new stj0(iu30Var, (byte) 18);
                    x340Var.s0(objT);
                }
                Function0 function0 = (Function0) objT;
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                qim0Var2 = qim0Var3;
                z3 = false;
                jto1.b(null, uvxVar, null, false, null, null, new gbx(new y50(strO0), function0), null, null, null, null, null, null, null, null, y1j.a, x340Var, 64, 196608, 32701);
                x340Var.r(false);
            } else {
                qim0Var2 = qim0Var3;
                z3 = false;
                x340Var.i0(-65191661);
                x340Var.r(false);
            }
            if (z2) {
                x340Var.i0(-65138093);
                uvx uvxVar2 = new uvx((pgx) null, 3, (tvx) null, (p3v) null, 26);
                String strO1 = cwl1.o0(x340Var, 2131958831);
                if ((i2 & 112) == 32) {
                    x340Var = x340Var;
                    z4 = true;
                } else {
                    x340Var = x340Var;
                    z4 = z3;
                }
                Object objT2 = x340Var.T();
                if (z4 || objT2 == m4cVar) {
                    objT2 = new stj0(iu30Var, (byte) 19);
                    x340Var.s0(objT2);
                }
                Function0 function1 = (Function0) objT2;
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                x340 x340Var2 = x340Var;
                jto1.b(null, uvxVar2, null, false, null, null, new gbx(new y50(strO1), function1), null, null, null, null, null, null, null, null, y1j.b, x340Var2, 64, 196608, 32701);
                x340Var = x340Var2;
                x340Var.r(z3);
            } else {
                x340Var = x340Var;
                x340Var.i0(-64332589);
                x340Var.r(z3);
            }
            cvx cvxVar2 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(qim0Var2, 16.0f));
            WeakHashMap weakHashMap = osl1.x;
            op71.g(x340Var, yoo1.D(qim0Var2, lhc.g(x340Var).g));
            x340Var.r(true);
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hy(nak0Var, iu30Var, qim0Var2, z, z2, i, (byte) 18);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void d(nak0 nak0Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        nak0 nak0Var2;
        byte b2;
        qim0 qim0Var2;
        boolean z;
        oak0 oak0Var = nak0Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-622340296);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(nak0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            oak0 oak0Var2 = nak0Var.c;
            qim0Var2 = nim0.a;
            if (oak0Var == null || oak0Var2 == null) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new rak0(nak0Var, qim0Var2, i, (byte) 0);
                    return;
                }
                return;
            }
            fra fraVar = een.N0;
            d36 d36Var = new d36(10.0f, true, new um5(false));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0Var2, 16.0f, 8.0f);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 54);
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
            qim0 qim0VarS = u291.s(qim0Var2, 52.0f, 48.0f);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarS);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            xkk1 xkk1Var = oak0Var.b;
            h2c h2cVar = h2c.a;
            e(xkk1Var, h2cVar.a(qim0Var2, graVar), x340Var, 0);
            e(oak0Var2.b, h2cVar.a(qim0Var2, een.Y), x340Var, 0);
            x340Var.r(true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var2);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            jo70 jo70Var = oak0Var != null ? oak0Var.a : null;
            jo70 jo70Var2 = oak0Var2.a;
            if (jo70Var != null) {
                x340Var.i0(-1841146571);
                z = true;
                uwo1.e(cwl1.n0(2131958830, new Object[]{jo70Var.a, jo70Var2.a}, x340Var), null, cbx.d(x340Var).g, 0L, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2042);
                x340Var.r(false);
            } else {
                z = true;
                x340Var.i0(-1840886140);
                x340Var.r(false);
            }
            uwo1.e(cwl1.o0(x340Var, 2131958829), null, cbx.d(x340Var).j, cbx.a(x340Var).b.b, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(z);
            x340Var.r(z);
            nak0Var2 = nak0Var;
            b2 = z;
        } else {
            nak0Var2 = nak0Var;
            b2 = 1;
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new rak0(nak0Var2, qim0Var2, i, b2);
        }
    }

    public static final void e(xkk1 xkk1Var, qim0 qim0Var, b0k b0kVar, int i) {
        String str;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-866701770);
        int i2 = i | (b0kVar2.i(xkk1Var) ? 4 : 2) | (b0kVar2.g(qim0Var) ? 32 : 16);
        if (b0kVar2.Y(i2 & 1, (i2 & 19) != 18)) {
            b0kVar2.i0(1431103121);
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            up70 up70VarA = xkk1Var.a.a(vp70.c);
            Uri uri = (up70VarA == null || (str = up70VarA.a.a) == null) ? Uri.EMPTY : Uri.parse(str);
            uri.getClass();
            fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, b0kVar2, ltx.d, 30);
            b0kVar2 = b0kVar2;
            eso1.e(uri, isl.a, qim0Var, new p3v(32.0f), (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, new pux(fwxVarG, fwxVarG), false, false, b0kVar2, ((i2 << 3) & 896) | 1075317808, 0, 3472);
            b0kVar2.r(false);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new loi0(xkk1Var, qim0Var, i, (byte) 10);
        }
    }

    public static final void f(String str, Function0 function0, Function0 function1, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1640937801);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(function0) ? 32 : 16) | (x340Var.i(function1) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            String strO0 = cwl1.o0(x340Var, 2131953601);
            String strO1 = cwl1.o0(x340Var, R.string.cancel);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.TRUE);
                x340Var.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            boolean zI = x340Var.i(ven0Var) | ((i2 & 896) == 256);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new swi0(function1, ven0Var, (byte) 10);
                x340Var.s0(objT2);
            }
            Function0 function2 = (Function0) objT2;
            if (((Boolean) ven0Var.getValue()).booleanValue()) {
                x340Var.i0(140172629);
                String strO2 = cwl1.o0(x340Var, 2131953603);
                String strN0 = cwl1.n0(2131953602, new Object[]{str}, x340Var);
                if (ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                zgx zgxVar = new zgx(strO0, new gbx(new y50(strO0), function0));
                if (ihc1.y0(strO1)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                } else {
                    mqo1.d(function2, null, null, strO2, strN0, zgxVar, new zgx(strO1, new gbx(new y50(strO1), function2)), x340Var, 2359296, 6);
                    x340Var.r(false);
                }
            } else {
                x340Var.i0(140716555);
                x340Var.r(false);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new bb(str, function0, function1, i, (byte) 7);
        }
    }

    public static final void g(int i, String str, Function0 function0, b0k b0kVar) {
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1360286866);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131953792);
            String strN0 = cwl1.n0(2131953791, new Object[]{str}, x340Var);
            String strO1 = cwl1.o0(x340Var, R.string.ok);
            if (ihc1.y0(strO1)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                function1 = function0;
                mqo1.d(function1, null, null, strO0, strN0, new zgx(strO1, new gbx(new y50(strO1), function0)), null, x340Var, 262150, 70);
            }
        } else {
            function1 = function0;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new s721(str, function1, i, (byte) 8);
        }
    }

    public static final int h(float f) {
        return Math.round((float) Math.ceil(f));
    }

    public static boolean i(izr0 izr0Var, xn20 xn20Var, int i, n4t n4tVar) {
        long jG = izr0Var.G();
        long j = jG >>> 16;
        if (j != i) {
            return false;
        }
        boolean z = (j & 1) == 1;
        int i2 = (int) ((jG >> 12) & 15);
        int i3 = (int) ((jG >> 8) & 15);
        int i4 = (int) ((jG >> 4) & 15);
        int i5 = (int) ((jG >> 1) & 7);
        boolean z2 = (jG & 1) == 1;
        if (i4 <= 7) {
            if (i4 != xn20Var.g - 1) {
                return false;
            }
        } else if (i4 > 10 || xn20Var.g != 2) {
            return false;
        }
        if (!(i5 == 0 || i5 == xn20Var.i) || z2) {
            return false;
        }
        try {
            long jM = izr0Var.M();
            if (!z) {
                jM *= (long) xn20Var.b;
            }
            long j2 = xn20Var.j;
            if (j2 != 0 && jM > j2) {
                return false;
            }
            n4tVar.b = jM;
            int iM = m(i2, izr0Var);
            long j3 = xn20Var.j;
            boolean z3 = j3 == 0 || jM + ((long) iM) >= j3;
            if (iM == -1) {
                return false;
            }
            if ((!z3 && iM < xn20Var.a) || iM > xn20Var.b) {
                return false;
            }
            int i6 = xn20Var.e;
            if (i3 != 0) {
                if (i3 <= 11) {
                    if (i3 != xn20Var.f) {
                        return false;
                    }
                } else if (i3 != 12) {
                    if (i3 > 14) {
                        return false;
                    }
                    int iL = izr0Var.L();
                    if (i3 == 14) {
                        iL *= 10;
                    }
                    if (iL != i6) {
                        return false;
                    }
                } else if (izr0Var.E() * 1000 != i6) {
                    return false;
                }
            }
            int iE = izr0Var.E();
            int i7 = izr0Var.b;
            byte[] bArr = izr0Var.a;
            int i8 = i7 - 1;
            int i9 = 0;
            for (int i10 = izr0Var.b; i10 < i8; i10++) {
                i9 = zoi1.l[i9 ^ (bArr[i10] & 255)];
            }
            String str = zoi1.a;
            if (iE != i9) {
                return false;
            }
            if (izr0Var.a() != 0) {
                int iN = izr0Var.n();
                if ((iN & 128) != 0) {
                    return false;
                }
                int i11 = (iN & 126) >> 1;
                if ((i11 >= 2 && i11 <= 7) || (i11 >= 13 && i11 <= 31)) {
                    oon1.A("Ignoring frame where first subframe has a reserved type: " + i11);
                    return false;
                }
            }
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static final Drawable j(Context context) {
        Drawable drawable = context.getDrawable(2131232857);
        if (drawable == null) {
            return new ShapeDrawable();
        }
        drawable.mutate().setTint(context.getColor(2131101504));
        return new ads(drawable, context, (byte) 2);
    }

    public static final void k(ImageView imageView) {
        eth.w(imageView).a();
    }

    public static final cuu0 l(cuu0 cuu0Var, cuu0 cuu0Var2) {
        return ((cuu0Var instanceof auu0) && (cuu0Var2 instanceof auu0)) ? auu0.k((auu0) cuu0Var2, ((auu0) cuu0Var).d) : cuu0Var2;
    }

    public static int m(int i, izr0 izr0Var) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return izr0Var.E() + 1;
            case 7:
                return izr0Var.L() + 1;
            case 8:
            case 9:
            case 10:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            case grn1.d /* 12 */:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static final Next n(uod0 uod0Var) {
        return Next.i(uod0.a(uod0Var, (rod0) null, (String) null, (dsa0) null, (jj40) null, (i5r) null, (List) null, false, (String) null, true, (Long) null, 767), Effects.a(new o4o1[]{new tf00(uod0Var.d, uod0Var.e, uod0Var.f)}));
    }

    public static final Set o(cuu0 cuu0Var, iu30 iu30Var, on71 on71Var) {
        if (cuu0Var instanceof auu0) {
            on71Var = new on71(new syg(((auu0) cuu0Var).d), new rn71(rc11.a.b(vyg.class)));
        }
        return dm61.A0(on71Var != null ? iu30Var.invoke(on71Var) : null);
    }
}
