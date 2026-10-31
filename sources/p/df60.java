package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class df60 implements jsw {
    public final tsq a;
    public final ze60 b;
    public final idd1 c = new idd1(new g050(this, (byte) 15));
    public final idd1 d = new idd1(h050.Z);

    public df60(tsq tsqVar, ze60 ze60Var) {
        this.a = tsqVar;
        this.b = ze60Var;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final void a(ye60 ye60Var, iu30 iu30Var, ksw kswVar, b0k b0kVar, int i) {
        int i2;
        df60 df60Var;
        ye60 ye60Var2;
        h311 h311VarV;
        bf60 bf60Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-659112113);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(ye60Var) : x340Var.i(ye60Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1027) != 1026)) {
            if (ye60Var instanceof xe60) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    bf60Var = new bf60(this, ye60Var, iu30Var, kswVar, i, (byte) 0);
                }
            } else {
                ye60Var2 = ye60Var;
                Object objT = x340Var.T();
                m4c m4cVar = fkj0.X;
                if (objT == m4cVar) {
                    objT = (iuj) this.a.get();
                    x340Var.s0(objT);
                }
                iuj iujVar = (iuj) objT;
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                nim0 nim0Var = nim0.a;
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
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
                qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, nim0Var);
                gfh0 gfh0VarC = t1c.c(een.d, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
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
                iujVar.a(ye60Var2.b(), x340Var, 0);
                x340Var.r(true);
                x340Var.f0(-98077091, ye60Var2.a());
                qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
                int i3 = i2;
                d36 d36Var = new d36(16.0f, true, new um5(false));
                zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
                df60Var = this;
                boolean zI = ((i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.i(ye60Var2))) | x340Var.i(df60Var);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new fz40(ye60Var2, df60Var, (byte) 21);
                    x340Var.s0(objT2);
                }
                s3o1.e(qim0VarF2, (xtb0) null, zzq0VarH, d36Var, (pl3) null, (iq20) null, (h3h1) null, (iu30) objT2, x340Var, 0, 234);
                x340Var.r(false);
                x340Var.r(true);
            }
            h311VarV.d = bf60Var;
        }
        df60Var = this;
        ye60Var2 = ye60Var;
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            bf60Var = new bf60(df60Var, ye60Var2, iu30Var, kswVar, i, (byte) 1);
            h311VarV.d = bf60Var;
        }
    }
}
