package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class c9o extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9o(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        super(2);
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public final Object invoke(Object obj, Object obj2) {
        Object objP0;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        Object obj6 = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                m4c m4cVar = fkj0.X;
                x340 x340Var = (x340) b0kVar;
                if (x340Var.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    bjg1 bjg1Var = (bjg1) obj6;
                    ec3 ec3Var = new ec3((ni20) obj5, b2);
                    boolean zG = bjg1Var.g();
                    k9 k9Var = bjg1Var.a;
                    if (zG) {
                        x340Var.i0(1666827533);
                        x340Var.r(false);
                        objP0 = k9Var.P0();
                    } else {
                        x340Var.i0(1666573488);
                        boolean zG2 = x340Var.g(bjg1Var);
                        objP0 = x340Var.T();
                        if (zG2 || objP0 == m4cVar) {
                            jv91 jv91VarO = ekb.o();
                            iu30 iu30VarE = jv91VarO != null ? jv91VarO.e() : null;
                            jv91 jv91VarU = ekb.u(jv91VarO);
                            try {
                                Object objP1 = k9Var.P0();
                                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                                x340Var.s0(objP1);
                                objP0 = objP1;
                            } catch (Throwable th) {
                                ekb.C(jv91VarO, jv91VarU, iu30VarE);
                                throw th;
                            }
                        }
                        x340Var.r(false);
                    }
                    x340Var.i0(1378811975);
                    float f = u890.j(objP0, obj4) ? 1.0f : 0.0f;
                    x340Var.r(false);
                    Float fValueOf = Float.valueOf(f);
                    boolean zG3 = x340Var.g(bjg1Var);
                    Object objT = x340Var.T();
                    if (zG3 || objT == m4cVar) {
                        objT = xto.l(new b9o(bjg1Var, (byte) 0));
                        x340Var.s0(objT);
                    }
                    Object value = ((tob1) objT).getValue();
                    x340Var.i0(1378811975);
                    float f2 = u890.j(value, obj4) ? 1.0f : 0.0f;
                    x340Var.r(false);
                    Float fValueOf2 = Float.valueOf(f2);
                    boolean zG4 = x340Var.g(bjg1Var);
                    Object objT2 = x340Var.T();
                    if (zG4 || objT2 == m4cVar) {
                        objT2 = xto.l(new dck(bjg1Var, (byte) 18));
                        x340Var.s0(objT2);
                    }
                    fhg1 fhg1VarO = bno1.o(bjg1Var, fValueOf, fValueOf2, (ni20) ec3Var.invoke(((tob1) objT2).getValue(), x340Var, 0), rno1.a, x340Var, 0);
                    boolean zG5 = x340Var.g(fhg1VarO);
                    Object objT3 = x340Var.T();
                    if (zG5 || objT3 == m4cVar) {
                        objT3 = new pak(fhg1VarO, (byte) 2);
                        x340Var.s0(objT3);
                    }
                    qim0 qim0VarC = i541.C(nim0.a, (iu30) objT3);
                    j2i j2iVar = (j2i) obj3;
                    gfh0 gfh0VarC = t1c.c(een.d, false);
                    int iHashCode = Long.hashCode(tgp1.l(x340Var));
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
                    nko1.H(gfh0VarC, x340Var, y580.O0);
                    nko1.H(xos0VarM, x340Var, y580.N0);
                    nko1.B(x340Var, Integer.valueOf(iHashCode));
                    nko1.F(x340Var);
                    nko1.H(qim0VarE, x340Var, y580.Y);
                    j2iVar.invoke(obj4, x340Var, 0);
                    x340Var.r(true);
                } else {
                    x340Var.b0();
                }
                return rih1Var;
            case 1:
                b0k b0kVar2 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var2 = (x340) b0kVar2;
                if (x340Var2.Y(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    foo1.o((gdx) obj6, (vu30) obj5, (vu30) obj4, (vu30) obj3, x340Var2);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 2:
                b0k b0kVar3 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var3 = (x340) b0kVar3;
                if (x340Var3.Y(1 & iIntValue3, (iIntValue3 & 3) != 2)) {
                    kqn1.h((tna0) obj6, (iu30) obj5, (yqg) obj4, (xho) obj3, (qim0) null, x340Var3, 4096);
                } else {
                    x340Var3.b0();
                }
                return rih1Var;
            default:
                b0k b0kVar4 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                knn0 knn0Var = (knn0) obj6;
                x340 x340Var4 = (x340) b0kVar4;
                if (x340Var4.Y(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    boolean zI = x340Var4.i(knn0Var);
                    Object objT4 = x340Var4.T();
                    if (zI || objT4 == fkj0.X) {
                        objT4 = new y3o0(knn0Var, (byte) 24);
                        x340Var4.s0(objT4);
                    }
                    aon0.a((iu30) objT4, apo.r(-1463233507, new vbn0((w6p0) obj5, (Boolean) obj4, (b7p0) obj3, (byte) 10), x340Var4), x340Var4, 48);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
        }
    }
}
