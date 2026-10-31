package p;

import android.content.res.Configuration;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o3o0 implements xpw {
    public final /* synthetic */ byte a;
    public final vtp b;
    public final o4o0 c;
    public final Function0 d;
    public final js20 e;
    public final ia00 f;
    public final psw g;

    public o3o0(vtp vtpVar, o4o0 o4o0Var, twb twbVar, Function0 function0, byte b) {
        this.a = b;
        byte b2 = 0;
        switch (b) {
            case 1:
                this.b = vtpVar;
                this.c = o4o0Var;
                this.d = function0;
                this.e = x3p1.m(r6x.a, htn0.Y, b5n0.X0, (o8n) null, new y3o0(this, b2), 8);
                this.f = n3o1.q(this).a(new kds(this, (byte) 29), n3o0.c);
                j2i j2iVar = new j2i(429681987, new hmk0(this, (byte) 26), true);
                ien0 ien0Var = qsw.a;
                this.g = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = vtpVar;
                this.c = o4o0Var;
                this.d = function0;
                this.e = x3p1.m(r6x.a, htn0.X, b5n0.W0, (o8n) null, new xkm0(this, (byte) 29), 8);
                this.f = n3o1.q(this).a(new kds(this, (byte) 28), n3o0.b);
                j2i j2iVar2 = new j2i(-1318936918, new hmk0(this, (byte) 25), true);
                ien0 ien0Var2 = qsw.a;
                this.g = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.f;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.g;
    }

    public void e(boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1313846585);
        if ((i & 6) == 0) {
            i2 = (x340Var.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
            uwr uwrVar = cbx.a;
            qim0 qim0VarB = uyn1.B(qim0VarZ, 0.0f, cbx.b(x340Var).b.a, 0.0f, 0.0f, 13);
            gfh0 gfh0VarC = t1c.c(een.h, false);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            int i3 = i2 & 112;
            boolean z2 = i3 == 32;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                objT = new nfk0(iu30Var, (byte) 22);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z3 = i3 == 32;
            Object objT2 = x340Var.T();
            if (z3 || objT2 == m4cVar) {
                objT2 = new nfk0(iu30Var, (byte) 23);
                x340Var.s0(objT2);
            }
            otw.c(this.b.a(function0, (Function0) objT2, rrn1.B(x340Var)), new e1o0(z), (qim0) null, (ipb1) null, x340Var, 0, 12);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new e30(this, z, iu30Var, i, (byte) 21);
        }
    }

    public void f(int i, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2120888989);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (x340Var.Y(i3 & 1, (i3 & 3) != 2)) {
            int i4 = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).orientation;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarW = i4 == 2 ? u291.w(nim0Var, 0.0f, 400.0f) : u291.f(nim0Var, 1.0f);
            jmr0 jmr0VarN = i3o1.n(i, x340Var, i3 & 14);
            cbx.a.getClass();
            eso1.h(jmr0VarN, isl.a, hno1.f(qim0VarW, (ecx) uwr.g.getValue()), (p3v) null, (zvx) null, (ecx) null, mif1.S0, een.h, (ColorFilter) null, x340Var, 224312, 256);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl9(this, i, i2, (byte) 8);
        }
    }

    public void g(l3o0 l3o0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-477366213);
        int i2 = (x340Var.i(l3o0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.i(this) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var3, 1.0f), l6o1.C(0, 0, 1, x340Var), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarH);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarP);
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
            f(l3o0Var.a, x340Var, (i2 >> 6) & 112);
            uwr uwrVar = cbx.a;
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            int i3 = (i2 >> 3) & 896;
            h(l3o0Var.b, l3o0Var.c, x340Var, i3);
            e(l3o0Var.d, iu30Var, x340Var, (i2 & 112) | i3);
            x0d.s(qim0Var3, cbx.b(x340Var).b.e, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, this, l3o0Var, iu30Var, qim0Var2, (byte) 1);
        }
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public void h(String str, String str2, b0k b0kVar, int i) {
        String str3;
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1550456296);
        if ((i & 6) == 0) {
            str3 = str;
            i2 = i | (x340Var.g(str3) ? 4 : 2);
        } else {
            str3 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str2) ? 32 : 16;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 0);
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
            cvx cvxVar2 = cbx.b(x340Var).b;
            uwo1.e(str3, anm1.N(ContextTrack$Metadata.KEY_TITLE, uyn1.z(16.0f, 0.0f, 2, nim0Var)), cbx.d(x340Var).e, cbx.a(x340Var).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, i3 & 14, 0, 2016);
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str2, anm1.N("body", uyn1.z(16.0f, 0.0f, 2, nim0Var)), cbx.d(x340Var).g, cbx.a(x340Var).b.b, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, (i3 >> 3) & 14, 0, 2016);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(this, str, str2, i, (byte) 6);
        }
    }
}
