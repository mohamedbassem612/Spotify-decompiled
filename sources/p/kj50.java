package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class kj50 {
    public final bk50 a;
    public final fk50 b;

    public kj50(bk50 bk50Var, fk50 fk50Var) {
        this.a = bk50Var;
        this.b = fk50Var;
    }

    public final void a(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-66006454);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            qim0 qim0VarF = u291.f(nim0.a, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("group-details-empty-test-tag", uyn1.x(qim0VarF, 16.0f));
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            uwo1.e(cwl1.o0(x340Var, 2131956477), (qim0) null, cbx.d(x340Var).g, cbx.a(x340Var).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ij50(this, i, (byte) 0);
        }
    }

    public final void b(b0k b0kVar, int i) {
        byte b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-95530285);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            fra fraVar = een.N0;
            qim0 qim0VarN = anm1.N("group-details-header-test-tag", u291.f(nim0.a, 1.0f));
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarX = uyn1.x(qim0VarN, 16.0f);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            b = 1;
            uwo1.e(cwl1.o0(x340Var, 2131956478), (qim0) null, cbx.d(x340Var).h, 0L, (a0e1) null, (iu30) null, 2, false, new zic0(1), 0, (qx8) null, x340Var, 0, 0, 1722);
            x340Var.r(true);
        } else {
            b = 1;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ij50(this, i, b);
        }
    }

    public final void c(zob1 zob1Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        String str = this.b.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-114244053);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(zob1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(vu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(this) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ven0 ven0VarH = rwq.h(zob1Var, x340Var, i2 & 14);
            boolean zG = x340Var.g(str);
            Object objT = x340Var.T();
            if (zG || objT == m4cVar) {
                String strM = l1d.m("spotify:chat:", str);
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-listening-activity-group-details";
                x6h1VarI.f = "0.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = strM;
                y6h1 y6h1VarA = x6h1VarI.a();
                Collections.singletonList("listeningactivity/group/details");
                r6h1 r6h1Var = r6h1.c;
                objT = new r6h1(kk0.l(y6h1VarA), (u8h1) null);
                x340Var.s0(objT);
            }
            r6h1 r6h1Var2 = (r6h1) objT;
            boolean zI = x340Var.i(r6h1Var2);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new cb1(r6h1Var2, (byte) 19);
                x340Var.s0(objT2);
            }
            dgo1.c("groupDetailsPage", (iu30) objT2, apo.r(1130616935, new xx00(this, ven0VarH, vu30Var, (byte) 27), x340Var), x340Var, 390);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(this, zob1Var, vu30Var, i, (byte) 19);
        }
    }
}
