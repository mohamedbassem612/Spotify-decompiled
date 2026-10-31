package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m7a1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a8a1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m7a1(a8a1 a8a1Var, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 1;
        this.b = a8a1Var;
        this.c = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:103:0x03d8  */
    /* JADX WARN: Code duplicated, block: B:79:0x02f7  */
    /* JADX WARN: Code duplicated, block: B:81:0x0319  */
    /* JADX WARN: Code duplicated, block: B:84:0x0346  */
    /* JADX WARN: Code duplicated, block: B:86:0x035d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0360  */
    /* JADX WARN: Code duplicated, block: B:90:0x0364  */
    /* JADX WARN: Code duplicated, block: B:91:0x0366  */
    /* JADX WARN: Code duplicated, block: B:93:0x0369  */
    /* JADX WARN: Code duplicated, block: B:95:0x0376  */
    /* JADX WARN: Code duplicated, block: B:97:0x0379  */
    /* JADX WARN: Code duplicated, block: B:98:0x0384  */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        String strF;
        String strU;
        String str;
        m4c m4cVar;
        Function0 function0;
        Object objT;
        boolean z2;
        boolean z3;
        String strK;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        a8a1 a8a1Var = this.b;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                x340 x340Var2 = x340Var;
                boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
                j06 j06Var = x340Var2.a;
                if (zY) {
                    nim0 nim0Var = nim0.a;
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    uwr uwrVar = cbx.a;
                    cvx cvxVar = cbx.b(x340Var2).b;
                    qim0 qim0VarN = anm1.N("SongDNAEntrypointElement", uyn1.x(qim0VarF, 16.0f));
                    era eraVar = een.P0;
                    f36 f36Var = h36.c;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var2, 0);
                    int iHashCode = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM = x340Var2.m();
                    qim0 qim0VarE = zr7.E(x340Var2, qim0VarN);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var2.m0();
                    boolean z4 = x340Var2.S;
                    n4k n4kVar = hmb0.t1;
                    if (z4) {
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
                    qim0 qim0VarN2 = anm1.N("SongDNAEntrypointElementTitle", nim0Var);
                    cvx cvxVar2 = cbx.b(x340Var2).b;
                    c680.q(qim0VarN2, uyn1.j(4.0f, 0.0f, 0.0f, 0.0f, 14), x340Var2, 0, 0);
                    c380 c380Var = a8a1Var.c;
                    int i2 = a8a1Var.f;
                    int i3 = a8a1Var.e;
                    if (c380Var.isEmpty()) {
                        i = 0;
                        x340Var2.i0(-1354052758);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1354274749);
                        cvx cvxVar3 = cbx.b(x340Var2).b;
                        op71.g(x340Var2, u291.h(nim0Var, 16.0f));
                        i = 0;
                        x760.e(mqo1.F(c380Var), u291.f(nim0Var, 1.0f), x340Var2, 0);
                        x340Var2.r(false);
                    }
                    cvx cvxVar4 = cbx.b(x340Var2).b;
                    qim0 qim0VarO = ab80.o(nim0Var, 16.0f, x340Var2, nim0Var, 1.0f);
                    jw31 jw31VarA = ew31.a(h36.g, een.N0, x340Var2, i);
                    int iHashCode2 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM2 = x340Var2.m();
                    qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarO);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(jw31VarA, x340Var2, lljVar);
                    nko1.H(xos0VarM2, x340Var2, lljVar2);
                    x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
                    wnb0 wnb0VarQ = kk0.q(x340Var2, qim0VarE2, lljVar4, 1.0f, true);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var2, 0);
                    int iHashCode3 = Long.hashCode(x340Var2.T);
                    xos0 xos0VarM3 = x340Var2.m();
                    qim0 qim0VarE3 = zr7.E(x340Var2, wnb0VarQ);
                    x340Var2.m0();
                    if (x340Var2.S) {
                        x340Var2.l(n4kVar);
                    } else {
                        x340Var2.v0();
                    }
                    nko1.H(mbhVarA2, x340Var2, lljVar);
                    nko1.H(xos0VarM3, x340Var2, lljVar2);
                    x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
                    nko1.H(qim0VarE3, x340Var2, lljVar4);
                    uwo1.e(a8a1Var.b, anm1.N("SongDNAEntrypointElementTrackName", u291.f(nim0Var, 1.0f)), cbx.d(x340Var2).e, cbx.a(x340Var2).b.a, new a0e1(5), (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var2, 0, 0, 1760);
                    if (i3 > 0 || i2 > 0) {
                        x340Var2.i0(-1200752409);
                        if (i3 > 0) {
                            x340Var2.i0(-2120105217);
                            strF = cwl1.U(2131820917, i3, new Object[]{Integer.valueOf(i3)}, x340Var2);
                            z = false;
                            x340Var2.r(false);
                        } else {
                            z = false;
                            x340Var2.i0(-2119954031);
                            x340Var2.r(false);
                            strF = null;
                        }
                        if (i2 > 0) {
                            x340Var2.i0(-2119901361);
                            strU = cwl1.U(2131820918, i2, new Object[]{Integer.valueOf(i2)}, x340Var2);
                            x340Var2.r(z);
                        } else {
                            x340Var2.i0(-2119796303);
                            x340Var2.r(z);
                            strU = null;
                        }
                        if (strF == null || strU == null) {
                            if (strF == null) {
                                if (strU == null) {
                                    strF = "";
                                } else {
                                    str = strU;
                                }
                            }
                            uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(5), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1760);
                            x340Var2.r(false);
                        } else {
                            strF = f4i1.f(strF, " • ", strU);
                        }
                        str = strF;
                        uwo1.e(str, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(5), (iu30) null, 0, false, new cjc0(1), 0, (qx8) null, x340Var2, 0, 0, 1760);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1200391600);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                    cvx cvxVar5 = cbx.b(x340Var2).b;
                    op71.g(x340Var2, u291.v(nim0Var, 12.0f));
                    String strO0 = cwl1.o0(x340Var2, 2131962705);
                    boolean zG = x340Var2.g(iu30Var);
                    Object objT2 = x340Var2.T();
                    if (zG) {
                        m4cVar = m4cVar2;
                    } else {
                        m4cVar = m4cVar2;
                        if (objT2 == m4cVar) {
                        }
                        function0 = (Function0) objT2;
                        if (!ihc1.y0(strO0)) {
                            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                            return null;
                        }
                        gbx gbxVar = new gbx(new y50(strO0), function0);
                        jdx jdxVar = jdx.c;
                        gdx gdxVarS = yla.s(x340Var2);
                        qim0 qim0VarN3 = anm1.N("SongDNAEntrypointElementExploreDNAButton", u291.B(nim0Var, (gra) null, 3));
                        objT = x340Var2.T();
                        if (objT == m4cVar) {
                            objT = y5a1.P0;
                            x340Var2.s0(objT);
                        }
                        foo1.c(gbxVar, jdxVar, s161.a(qim0VarN3, (iu30) objT), (max) null, gdxVarS, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, jjj.a, x340Var2, 0, 48, 2008);
                        x340Var2.r(true);
                        if (c380Var.isEmpty()) {
                            x340Var2.i0(-1351471574);
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(-1352000124);
                            cvx cvxVar6 = cbx.b(x340Var2).b;
                            op71.g(x340Var2, u291.h(nim0Var, 8.0f));
                            if (i2 > 0) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            if (i3 > 1) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2) {
                                strK = x0d.k(x340Var2, -223629168, 2131962706, x340Var2, false);
                            } else if (z3) {
                                strK = x0d.k(x340Var2, -223500580, 2131962707, x340Var2, false);
                            } else {
                                strK = x0d.k(x340Var2, -223414555, 2131962708, x340Var2, false);
                            }
                            uwo1.e(strK, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(5), (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var2, 0, 0, 1760);
                            x340Var2.r(false);
                        }
                        x340Var2.r(true);
                    }
                    objT2 = new pc81(iu30Var, (byte) 24);
                    x340Var2.s0(objT2);
                    function0 = (Function0) objT2;
                    if (!ihc1.y0(strO0)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    gbx gbxVar2 = new gbx(new y50(strO0), function0);
                    jdx jdxVar2 = jdx.c;
                    gdx gdxVarS2 = yla.s(x340Var2);
                    qim0 qim0VarN4 = anm1.N("SongDNAEntrypointElementExploreDNAButton", u291.B(nim0Var, (gra) null, 3));
                    objT = x340Var2.T();
                    if (objT == m4cVar) {
                        objT = y5a1.P0;
                        x340Var2.s0(objT);
                    }
                    foo1.c(gbxVar2, jdxVar2, s161.a(qim0VarN4, (iu30) objT), (max) null, gdxVarS2, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, jjj.a, x340Var2, 0, 48, 2008);
                    x340Var2.r(true);
                    if (c380Var.isEmpty()) {
                        x340Var2.i0(-1352000124);
                        cvx cvxVar7 = cbx.b(x340Var2).b;
                        op71.g(x340Var2, u291.h(nim0Var, 8.0f));
                        if (i2 > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (i3 > 1) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (z2) {
                            strK = x0d.k(x340Var2, -223629168, 2131962706, x340Var2, false);
                        } else if (z3) {
                            strK = x0d.k(x340Var2, -223500580, 2131962707, x340Var2, false);
                        } else {
                            strK = x0d.k(x340Var2, -223414555, 2131962708, x340Var2, false);
                        }
                        uwo1.e(strK, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).j, cbx.a(x340Var2).b.b, new a0e1(5), (iu30) null, 0, false, new cjc0(2), 0, (qx8) null, x340Var2, 0, 0, 1760);
                        x340Var2.r(false);
                    } else {
                        x340Var2.i0(-1351471574);
                        x340Var2.r(false);
                    }
                    x340Var2.r(true);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                x760.l(a8a1Var, iu30Var, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 2:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x760.l(a8a1Var, iu30Var, x340Var4, 0);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    x760.l(a8a1Var, iu30Var, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m7a1(a8a1 a8a1Var, iu30 iu30Var, byte b) {
        super(2);
        this.a = b;
        this.b = a8a1Var;
        this.c = iu30Var;
    }
}
