package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pme0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;
    public final /* synthetic */ Function0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pme0(ven0 ven0Var, Function0 function0, byte b) {
        super(3);
        this.a = b;
        this.b = ven0Var;
        this.c = function0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.c;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                vu30 vu30Var = (vu30) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.i(vu30Var) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
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
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    llj lljVar2 = y580.N0;
                    nko1.H(xos0VarM, x340Var2, lljVar2);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    llj lljVar3 = y580.R0;
                    nko1.H(numValueOf, x340Var2, lljVar3);
                    nko1.F(x340Var2);
                    llj lljVar4 = y580.Y;
                    nko1.H(qim0VarE, x340Var2, lljVar4);
                    esx esxVar = esx.c;
                    qim0 qim0VarZ = uyn1.z(8.0f, 0.0f, 2, nim0Var);
                    uwr uwrVar = cbx.a;
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    w0h1.a(esxVar, isl.a, u291.r(qim0VarZ, 16.0f), 0L, 0L, false, x340Var2, esx.d | 48, 56);
                    wnb0 wnb0Var = new wnb0(1.0f, true);
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, wnb0Var);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(gfh0VarC, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE2, x340Var2, lljVar4);
                    if (((CharSequence) ven0Var.getValue()).length() == 0) {
                        x340Var2.i0(1995356820);
                        uwo1.e(cwl1.o0(x340Var2, 2131957656), (qim0) null, cbx.d(x340Var2).g, cbx.a(x340Var2).b.b, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2034);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1995580733);
                        x340Var2.r(false);
                    }
                    vu30Var.invoke(x340Var2, Integer.valueOf(iIntValue & 14));
                    x340Var2.r(true);
                    if (((CharSequence) ven0Var.getValue()).length() > 0) {
                        x340Var2.i0(1749631242);
                        qim0 qim0VarZ2 = uyn1.z(8.0f, 0.0f, 2, anm1.N("ClearButton", nim0Var));
                        gdx gdxVarS = yla.s(x340Var2);
                        String strO0 = cwl1.o0(x340Var2, 2131957654);
                        boolean zI = x340Var2.i(ven0Var) | x340Var2.g(function0);
                        Object objT = x340Var2.T();
                        if (zI || objT == fkj0.X) {
                            objT = new cb(ven0Var, function0, (byte) 23);
                            x340Var2.s0(objT);
                        }
                        Function0 function1 = (Function0) objT;
                        if (ihc1.y0(strO0)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        wro1.l(new gbx(new y50(strO0), function1), qim0VarZ2, (max) null, gdxVarS, (idn0) null, kxi.b, x340Var2, 196608, 20);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(1750157219);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                ((Number) obj3).intValue();
                x340 x340Var3 = (b0k) obj2;
                boolean zI2 = x340Var3.i(ven0Var) | x340Var3.g(function0);
                Object objT2 = x340Var3.T();
                if (zI2 || objT2 == fkj0.X) {
                    objT2 = new swi0(function0, ven0Var, (byte) 14);
                    x340Var3.s0(objT2);
                }
                z6p1.e(0, (Function0) objT2, x340Var3, (qim0) null);
                return rih1Var;
        }
    }
}
