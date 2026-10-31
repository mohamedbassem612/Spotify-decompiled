package p;

import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sa90 extends f311 {
    public final /* synthetic */ byte a = 1;
    public final qk41 b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final hab0 f;

    public sa90(j7s j7sVar, ard1 ard1Var, nda1 nda1Var, obf1 obf1Var) {
        List list = (List) j7sVar.f;
        this.c = j7sVar;
        this.d = ard1Var;
        this.e = nda1Var;
        this.f = obf1Var;
        this.b = (!j7sVar.a || list.isEmpty()) ? pk41.a : new ok41((p7h.L(list) * 100) + 900);
    }

    @Override // p.f311
    public final void d(i2c i2cVar, rk41 rk41Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var;
        int i3;
        b0k b0kVar2;
        h311 h311VarV;
        bcf1 bcf1Var;
        byte b = this.a;
        Object obj = this.d;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                m4c m4cVar = fkj0.X;
                x340 x340Var2 = (x340) b0kVar;
                x340Var2.k0(670759934);
                j06 j06Var = x340Var2.a;
                if ((i & 6) == 0) {
                    i2 = i | (x340Var2.g(i2cVar) ? 4 : 2);
                } else {
                    i2 = i;
                }
                if ((i & 48) == 0) {
                    i2 |= (i & 64) == 0 ? x340Var2.g(rk41Var) : x340Var2.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i2 |= x340Var2.i(this) ? 2048 : 1024;
                }
                if (x340Var2.Y(i2 & 1, (i2 & 1043) != 1042)) {
                    boolean zI = x340Var2.i(this);
                    Object objT = x340Var2.T();
                    if (zI || objT == m4cVar) {
                        objT = new ux70(this, (byte) 21);
                        x340Var2.s0(objT);
                    }
                    qxd0.i(rih1Var, (iu30) objT, x340Var2);
                    tob1 tob1Var = (tob1) obj;
                    boolean z = rk41Var.a;
                    ilv.a.getClass();
                    ven0 ven0VarO = mym.o(tob1Var, z, "titleReveal", 700, flv.g, (mim1) this.e, x340Var2, 0);
                    x340Var = x340Var2;
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                    gfh0 gfh0VarC = t1c.c(een.h, false);
                    int iHashCode = Long.hashCode(x340Var.T);
                    xos0 xos0VarM = x340Var.m();
                    qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
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
                    nko1.H(gfh0VarC, x340Var, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var, lljVar3);
                    nko1.F(x340Var);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var, lljVar4);
                    qim0 qim0VarU = qxy0.u(u291.j(0.0f, i2cVar.c() * 0.75f, 1, u291.f(nim0Var, 1.0f)), (idn0) null, 3);
                    Object objT2 = x340Var.T();
                    if (objT2 == m4cVar) {
                        objT2 = o390.g;
                        x340Var.s0(objT2);
                    }
                    qim0 qim0VarB = s161.b(qim0VarU, true, (iu30) objT2);
                    mbh mbhVarA = jbh.a(h36.e, een.Q0, x340Var, 54);
                    int iHashCode2 = Long.hashCode(x340Var.T);
                    xos0 xos0VarM2 = x340Var.m();
                    qim0 qim0VarE2 = zr7.E(x340Var, qim0VarB);
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
                    vnr0 vnr0Var = (vnr0) ((jb50) obj2).invoke(x340Var, 0);
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    boolean zG = x340Var.g(ven0VarO);
                    Object objT3 = x340Var.T();
                    if (zG || objT3 == m4cVar) {
                        objT3 = new pak(ven0VarO, (byte) 17);
                        x340Var.s0(objT3);
                    }
                    qgo1.f(vnr0Var, i541.C(qim0VarF, (iu30) objT3), new a0e1(3), 0, false, (iu30) null, x340Var, 8, 56);
                    x340Var.r(true);
                    x340Var.r(true);
                } else {
                    x340Var = x340Var2;
                    x340Var.b0();
                }
                h311 h311VarV2 = x340Var.v();
                if (h311VarV2 != null) {
                    h311VarV2.d = new ke20(i, this, i2cVar, rk41Var, function0, (byte) 26);
                    return;
                }
                return;
            default:
                m4c m4cVar2 = fkj0.X;
                j7s j7sVar = (j7s) obj2;
                List list = (List) j7sVar.f;
                b0k b0kVar3 = (x340) b0kVar;
                b0kVar3.k0(738222632);
                if ((i & 6) == 0) {
                    i3 = (b0kVar3.g(i2cVar) ? 4 : 2) | i;
                } else {
                    i3 = i;
                }
                if ((i & 48) == 0) {
                    i3 |= (i & 64) == 0 ? b0kVar3.g(rk41Var) : b0kVar3.i(rk41Var) ? 32 : 16;
                }
                if ((i & 3072) == 0) {
                    i3 |= b0kVar3.i(this) ? 2048 : 1024;
                }
                if (b0kVar3.Y(i3 & 1, (i3 & 1043) != 1042)) {
                    if (list.isEmpty()) {
                        h311VarV = b0kVar3.v();
                        if (h311VarV == null) {
                            return;
                        } else {
                            bcf1Var = new bcf1(this, i2cVar, rk41Var, function0, i, (byte) 0);
                        }
                    } else {
                        boolean zI2 = b0kVar3.i(this);
                        Object objT4 = b0kVar3.T();
                        if (zI2 || objT4 == m4cVar2) {
                            objT4 = new vbc1(this, (lnm) null, (byte) 6);
                            b0kVar3.s0(objT4);
                        }
                        qxd0.t(rih1Var, b0kVar3, (vu30) objT4);
                        Object objT5 = b0kVar3.T();
                        if (objT5 == m4cVar2) {
                            objT5 = v8r.q((Object) null);
                            b0kVar3.s0(objT5);
                        }
                        ven0 ven0Var = (ven0) objT5;
                        ven0 ven0VarS = v8r.s(b0kVar3.k(yhm1.a), b0kVar3);
                        b2u.i(list, (ard1) obj, b0kVar3, 8);
                        Integer num = (Integer) ven0Var.getValue();
                        Integer num2 = (Integer) ven0Var.getValue();
                        obf1 obf1Var = (obf1) this.f;
                        boolean zI3 = b0kVar3.i(this) | b0kVar3.g(ven0VarS);
                        Object objT6 = b0kVar3.T();
                        if (zI3 || objT6 == m4cVar2) {
                            objT6 = new rsc1(this, ven0VarS, ven0Var, (byte) 12);
                            b0kVar3.s0(objT6);
                        }
                        iu30 iu30Var = (iu30) objT6;
                        Object objT7 = b0kVar3.T();
                        if (objT7 == m4cVar2) {
                            objT7 = new aya1(ven0Var, (byte) 10);
                            b0kVar3.s0(objT7);
                        }
                        b0kVar2 = b0kVar3;
                        acf1.e(i2cVar, j7sVar, rk41Var, num, num2, 1.0f, obf1Var, iu30Var, (Function0) objT7, b0kVar2, (i3 & 14) | 100859968 | ((i3 << 3) & 896));
                    }
                    h311VarV.d = bcf1Var;
                    return;
                }
                b0kVar2 = b0kVar3;
                b0kVar2.b0();
                h311VarV = b0kVar2.v();
                if (h311VarV != null) {
                    bcf1Var = new bcf1(this, i2cVar, rk41Var, function0, i, (byte) 1);
                    h311VarV.d = bcf1Var;
                    return;
                }
                return;
        }
    }

    @Override // p.qj41
    public final qk41 getDuration() {
        byte b = this.a;
        return this.b;
    }

    public sa90(jb50 jb50Var, boolean z, ven0 ven0Var, long j, mim1 mim1Var, my2 my2Var) {
        qk41 ok41Var;
        this.c = jb50Var;
        this.d = ven0Var;
        this.e = mim1Var;
        this.f = my2Var;
        if (z) {
            ok41Var = new ok41((int) j);
        } else {
            ok41Var = pk41.a;
        }
        this.b = ok41Var;
    }
}
