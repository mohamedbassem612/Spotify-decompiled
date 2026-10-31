package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class boe implements nk90 {
    public final /* synthetic */ byte a;
    public final yd91 b;
    public final n381 c;

    public boe(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new yd91(3, new fe81(this, (byte) 27));
                this.c = p381.a;
                break;
            default:
                this.b = new yd91(3, new ptb(this, (byte) 26));
                this.c = p381.a;
                break;
        }
    }

    @Override // p.pk90
    public final m381 c() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.c;
    }

    @Override // p.pk90
    public final yd91 d() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public void e(aoe aoeVar, b0k b0kVar, int i) {
        nim0 nim0Var;
        boolean z;
        float f;
        tne tneVar = aoeVar.b;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1313988134);
        int i2 = i | (x340Var.g(aoeVar) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarC = u291.c(u291.v(nim0Var2, 24.0f), 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (tneVar == tne.b) {
                x340Var.i0(-713876429);
                qim0 qim0VarR = u291.r(nim0Var2, 16.0f);
                glx glxVar = glx.c;
                uwr uwrVar = cbx.a;
                nim0Var = nim0Var2;
                z = false;
                w0h1.a(glxVar, new jsl(cwl1.o0(x340Var, 2131953545)), qim0VarR, cbx.a(x340Var).b.f, 0L, false, x340Var, glx.d, 48);
                x340Var.r(false);
                f = 16.0f;
            } else {
                nim0Var = nim0Var2;
                z = false;
                f = 16.0f;
                v8i0.i(16.0f, -713584564, x340Var, x340Var, nim0Var);
                x340Var.r(false);
            }
            String strValueOf = String.valueOf(aoeVar.a);
            uwr uwrVar2 = cbx.a;
            float f2 = f;
            uwo1.e(strValueOf, (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            if (tneVar == tne.c) {
                x340Var.i0(-713289041);
                w0h1.a(elx.c, new jsl(cwl1.o0(x340Var, 2131953543)), u291.r(nim0Var, f2), cbx.a(x340Var).b.d, 0L, false, x340Var, elx.d, 48);
                x340Var.r(false);
            } else if (tneVar == tne.d) {
                x340Var.i0(-712930929);
                long j = cbx.a(x340Var).b.g;
                String strO0 = cwl1.o0(x340Var, 2131953544);
                qim0 qim0VarR2 = u291.r(uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13), 8.0f);
                boolean zG = x340Var.g(strO0);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    objT = new w8c(strO0, (byte) 20);
                    x340Var.s0(objT);
                }
                qim0 qim0VarB = s161.b(qim0VarR2, false, (iu30) objT);
                boolean zF = x340Var.f(j);
                Object objT2 = x340Var.T();
                if (zF || objT2 == m4cVar) {
                    objT2 = new ps((byte) 5, j);
                    x340Var.s0(objT2);
                }
                j0o1.b(0, x340Var, (iu30) objT2, qim0VarB);
                x340Var.r(false);
            } else {
                v8i0.i(f2, -712550900, x340Var, x340Var, nim0Var);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new a7e(this, aoeVar, i, (byte) 2);
        }
    }

    public void f(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2116216857);
        int i2 = i & 1;
        if (x340Var.Y(i2, i2 != 0)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarC = u291.c(u291.v(nim0Var, 24.0f), 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var2 = cbx.b(x340Var).g;
            w0h1.a(wpx.c, new jsl(cwl1.o0(x340Var, 2131962777)), u291.r(nim0Var, 12.0f), cbx.a(x340Var).b.a, 0L, false, x340Var, wpx.d, 48);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wh91(this, i, (byte) 9);
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x01ab  */
    public void g(jaa1 jaa1Var, b0k b0kVar, int i) {
        nim0 nim0Var;
        float f;
        boolean z;
        m4c m4cVar;
        boolean zF;
        Object objT;
        qdn qdnVar = jaa1Var.b;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-795332296);
        int i2 = i | (x340Var.g(jaa1Var) ? 4 : 2);
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            zov0 zov0Var2 = cbx.b(x340Var).g;
            nim0 nim0Var2 = nim0.a;
            qim0 qim0VarC = u291.c(u291.v(nim0Var2, 24.0f), 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (qdnVar == qdn.b) {
                x340Var.i0(-633339678);
                nim0Var = nim0Var2;
                f = 16.0f;
                z = false;
                w0h1.a(glx.c, new jsl(cwl1.o0(x340Var, 2131962776)), u291.r(nim0Var2, 16.0f), cbx.a(x340Var).b.f, 0L, false, x340Var, glx.d, 48);
                x340Var.r(false);
            } else {
                nim0Var = nim0Var2;
                f = 16.0f;
                z = false;
                v8i0.i(16.0f, -633049022, x340Var, x340Var, nim0Var);
                x340Var.r(false);
            }
            uwo1.e(String.valueOf(jaa1Var.a), (qim0) null, cbx.d(x340Var).j, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var, 0, 0, 2042);
            x340Var = x340Var;
            if (qdnVar == qdn.c) {
                x340Var.i0(-632839710);
                w0h1.a(elx.c, new jsl(cwl1.o0(x340Var, 2131962774)), u291.r(nim0Var, f), cbx.a(x340Var).b.d, 0L, false, x340Var, elx.d, 48);
                x340Var.r(false);
            } else if (qdnVar == qdn.d) {
                x340Var.i0(-632462502);
                long j = cbx.a(x340Var).b.g;
                String strO0 = cwl1.o0(x340Var, 2131962775);
                cvx cvxVar = cbx.b(x340Var).b;
                qim0 qim0VarB = uyn1.B(nim0Var, 0.0f, 4.0f, 0.0f, 0.0f, 13);
                cvx cvxVar2 = cbx.b(x340Var).b;
                qim0 qim0VarR = u291.r(qim0VarB, 8.0f);
                boolean zG = x340Var.g(strO0);
                Object objT2 = x340Var.T();
                if (zG) {
                    m4cVar = m4cVar2;
                } else {
                    m4cVar = m4cVar2;
                    if (objT2 == m4cVar) {
                    }
                    qim0 qim0VarB2 = s161.b(qim0VarR, false, (iu30) objT2);
                    zF = x340Var.f(j);
                    objT = x340Var.T();
                    if (zF || objT == m4cVar) {
                        objT = new ps((byte) 26, j);
                        x340Var.s0(objT);
                    }
                    j0o1.b(0, x340Var, (iu30) objT, qim0VarB2);
                    x340Var.r(false);
                }
                objT2 = new pg61(strO0, (byte) 27);
                x340Var.s0(objT2);
                qim0 qim0VarB3 = s161.b(qim0VarR, false, (iu30) objT2);
                zF = x340Var.f(j);
                objT = x340Var.T();
                if (zF) {
                    objT = new ps((byte) 26, j);
                    x340Var.s0(objT);
                } else {
                    objT = new ps((byte) 26, j);
                    x340Var.s0(objT);
                }
                j0o1.b(0, x340Var, (iu30) objT, qim0VarB3);
                x340Var.r(false);
            } else {
                v8i0.i(f, -631987582, x340Var, x340Var, nim0Var);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new q081(this, jaa1Var, i, (byte) 20);
        }
    }
}
