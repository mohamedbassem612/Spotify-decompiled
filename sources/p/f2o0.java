package p;

import android.content.res.Configuration;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.player.model.ContextTrack$Metadata;
import java.util.Iterator;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f2o0 implements xpw {
    public final /* synthetic */ byte a;
    public final Function0 b;
    public final rey0 c;
    public final ia00 d;
    public final psw e;

    public f2o0(Function0 function0, byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = function0;
                this.c = new rey0(new g2j1(this, (byte) 1));
                this.d = n3o1.q(this).a(ruh1.Y0, ruh1.Z0);
                j2i j2iVar = eqj.b;
                ien0 ien0Var = qsw.a;
                this.e = new psw(j2iVar, (byte) 0);
                break;
            default:
                this.b = function0;
                this.c = new rey0(new qsn0(this, (byte) 1));
                this.d = n3o1.q(this).a(fmk0.c1, fmk0.d1);
                j2i j2iVar2 = new j2i(-635087841, new hmk0(this, (byte) 24), true);
                ien0 ien0Var2 = qsw.a;
                this.e = new psw(j2iVar2, (byte) 0);
                break;
        }
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.d;
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.e;
    }

    public void e(int i, String str, b0k b0kVar, iu30 iu30Var) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-76647677);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
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
            gfx.g(13, apo.r(2076934256, new qgd((byte) 11, str, iu30Var, false), x340Var), x340Var, 54);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(this, str, iu30Var, i, (byte) 4);
        }
    }

    public void f(String str, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        String str2 = str;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1784842118);
        if ((i & 6) == 0) {
            i2 = i | (x340Var2.g(str2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(uyn1.z(16.0f, 0.0f, 2, nim0Var), 1.0f);
            jw31 jw31VarA = ew31.a(h36.a, een.Z, x340Var2, 0);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            uwo1.e("•", (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 6, 0, 2018);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            op71.g(x340Var2, u291.v(nim0Var, 8.0f));
            str2 = str;
            uwo1.e(str2, anm1.N("bulletPoint", nim0Var), cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, new a0e1(5), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i2 & 14, 0, 2016);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nbf0(this, str2, i, (byte) 21);
        }
    }

    public void g(int i, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(720433868);
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
            h311VarV.d = new hl9(this, i, i2, (byte) 6);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        return this.c;
    }

    public void h(c2o0 c2o0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(626180974);
        int i2 = (x340Var.g(c2o0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384 | (x340Var.i(this) ? 2048 : 1024);
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
            g(c2o0Var.a, x340Var, (i2 >> 6) & 112);
            uwr uwrVar = cbx.a;
            op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.a));
            int i3 = (i2 >> 3) & 896;
            i(c2o0Var.b, c2o0Var.c, x340Var, i3);
            e((i2 & 112) | i3, c2o0Var.d, x340Var, iu30Var);
            x0d.s(qim0Var3, cbx.b(x340Var).b.e, x340Var, true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new b2o0(i, this, c2o0Var, iu30Var, qim0Var2, (byte) 0);
        }
    }

    public void i(String str, c380 c380Var, b0k b0kVar, int i) {
        String str2;
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1266064092);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (x340Var2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(c380Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(this) ? 256 : 128;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var2).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, x340Var2, 0);
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
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            cvx cvxVar2 = cbx.b(x340Var2).b;
            int i3 = i2;
            uwo1.e(str2, anm1.N(ContextTrack$Metadata.KEY_TITLE, uyn1.z(16.0f, 0.0f, 2, nim0Var)), cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, i2 & 14, 0, 2016);
            x340Var = x340Var2;
            x340Var.i0(-278442145);
            Iterator it = c380Var.iterator();
            while (it.hasNext()) {
                f((String) it.next(), x340Var, (i3 >> 3) & 112);
            }
            x340Var.r(false);
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmk0(this, str, c380Var, i, (byte) 5);
        }
    }
}
