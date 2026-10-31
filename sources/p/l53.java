package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class l53 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public Object d;
    public /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l53(fy71 fy71Var, mr20 mr20Var, sen0 sen0Var, Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 1;
        this.c = fy71Var;
        this.d = mr20Var;
        this.e = sen0Var;
        this.f = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return new l53((ip31) obj2, (String) this.e, lnmVar);
            case 1:
                return new l53((fy71) this.c, (mr20) this.d, (sen0) this.e, this.f, lnmVar);
            case 2:
                return new l53((rvo1) this.d, this.e, (rin1) obj2, lnmVar, (byte) 2);
            case 3:
                l53 l53Var = new l53(obj2, lnmVar, (byte) 3);
                l53Var.e = obj;
                return l53Var;
            case 4:
                return new l53((rvo1) this.d, this.e, (rin1) obj2, lnmVar, (byte) 4);
            default:
                l53 l53Var2 = new l53(obj2, lnmVar, (byte) 5);
                l53Var2.e = obj;
                return l53Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((zwo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((rvo1) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v45, types: [byte] */
    /* JADX WARN: Type inference failed for: r1v52, types: [p.vgn0] */
    /* JADX WARN: Type inference failed for: r1v57 */
    /* JADX WARN: Type inference failed for: r1v58 */
    public final Object invokeSuspend(Object obj) {
        Object objH;
        Object objC;
        t740 t740Var;
        String str;
        rvo1 rvo1Var;
        Object objA;
        xgn0 xgn0VarD;
        zwo1 zwo1Var;
        oao1 oao1Var;
        Object qwo1Var;
        zwo1 zwo1Var2;
        rvo1 rvo1Var2;
        Object objK;
        Object objA2;
        rvo1 rvo1Var3;
        f0p1 f0p1Var;
        xgn0 xgn0VarC;
        Object objH2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.f;
        nhn1 nhn1Var = d9n.a;
        switch (b) {
            case 0:
                String str2 = (String) this.e;
                ip31 ip31Var = (ip31) obj2;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    q8n q8nVarF = ip31.f(ip31Var);
                    hi2 hi2Var = new hi2(ip31Var, str2, (lnm) null, (byte) 8);
                    this.b = (byte) 1;
                    objH = c921.H(q8nVarF, hi2Var, this);
                    if (objH != nhn1Var) {
                    }
                    return nhn1Var;
                }
                if (b2 == 1) {
                    hm5.M(obj);
                    objH = obj;
                } else {
                    if (b2 != 2) {
                        if (b2 == 3) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) this.d;
                    t740 t740Var2 = (t740) this.c;
                    hm5.M(obj);
                    t740Var = t740Var2;
                    str = str3;
                    objC = obj;
                }
                t740.b(t740Var, str, (String) objC, (tv80) null, (String) null, 28);
                return rih1Var;
                if (((Boolean) objH).booleanValue()) {
                    t740 t740VarE = ip31.e(ip31Var);
                    String uri = ip31.h(ip31Var).getUri();
                    w6e0 w6e0VarG = ip31.g(ip31Var);
                    this.c = t740VarE;
                    this.d = uri;
                    this.b = (byte) 2;
                    objC = ip31.c(ip31Var, w6e0VarG, this);
                    if (objC != nhn1Var) {
                        t740Var = t740VarE;
                        str = uri;
                        t740.b(t740Var, str, (String) objC, (tv80) null, (String) null, 28);
                        return rih1Var;
                    }
                } else {
                    String uri2 = ip31.h(ip31Var).getUri();
                    this.b = (byte) 3;
                    if (ip31.j(ip31Var, uri2, str2, this) != nhn1Var) {
                        return rih1Var;
                    }
                }
                return nhn1Var;
            case 1:
                mr20 mr20Var = (mr20) this.d;
                ba baVar = (sen0) this.e;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 != 1) {
                        if (b3 == 2) {
                            hm5.M(obj);
                        } else if (b3 != 3 && b3 != 4) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                hm5.M(obj);
                xpv0 xpv0Var = (fy71) this.c;
                if (xpv0Var == ey71.a) {
                    this.b = (byte) 1;
                    if (mr20Var.collect(baVar, this) != nhn1Var) {
                        return rih1Var;
                    }
                } else if (xpv0Var == ey71.b) {
                    foc1 foc1VarJ = baVar.j();
                    ga5 ga5Var = new ga5();
                    this.b = (byte) 2;
                    if (b5p1.j(foc1VarJ, ga5Var, this) != nhn1Var) {
                    }
                } else {
                    mr20 mr20VarU = rqt0.u(xpv0Var.c(baVar.j()));
                    lqv lqvVar = new lqv(mr20Var, baVar, this.f, (lnm) null, (byte) 13);
                    this.b = (byte) 4;
                    if (l4p1.q(mr20VarU, lqvVar, this) != nhn1Var) {
                        return rih1Var;
                    }
                }
                return nhn1Var;
                this.b = (byte) 3;
                if (mr20Var.collect(baVar, this) != nhn1Var) {
                    return rih1Var;
                }
                return nhn1Var;
            case 2:
                byte b4 = this.b;
                if (b4 == 0) {
                    hm5.M(obj);
                    rvo1Var = (rvo1) this.d;
                    this.c = rvo1Var;
                    this.b = (byte) 1;
                    objA = ((cwn1) this.e).a((yln1) obj2);
                    if (objA != nhn1Var) {
                    }
                    return nhn1Var;
                }
                if (b4 != 1) {
                    hm5.M(obj);
                    return obj;
                }
                rvo1Var = (rvo1) this.c;
                hm5.M(obj);
                objA = obj;
                this.c = null;
                this.b = (byte) 2;
                Object objA3 = ((qwo1) objA).a(rvo1Var.a(), this);
                if (objA3 != nhn1Var) {
                    return objA3;
                }
                return nhn1Var;
            case 3:
                oao1 oao1Var2 = (oao1) obj2;
                byte b5 = this.b;
                try {
                    if (b5 == 0) {
                        hm5.M(obj);
                        zwo1 zwo1Var3 = (zwo1) this.e;
                        xgn0VarD = oao1.d(oao1Var2);
                        this.e = zwo1Var3;
                        this.c = xgn0VarD;
                        this.d = oao1Var2;
                        this.b = (byte) 1;
                        if (xgn0VarD.a(this) != nhn1Var) {
                            zwo1Var = zwo1Var3;
                            oao1Var = oao1Var2;
                        }
                        return nhn1Var;
                    }
                    if (b5 == 1) {
                        oao1Var = (oao1) this.d;
                        xgn0VarD = (xgn0) this.c;
                        zwo1Var = (zwo1) this.e;
                        hm5.M(obj);
                    } else {
                        if (b5 != 2) {
                            hm5.M(obj);
                            return rih1Var;
                        }
                        zwo1Var2 = (zwo1) this.e;
                        hm5.M(obj);
                        qwo1Var = obj;
                    }
                    this.e = null;
                    this.b = (byte) 3;
                    if (((qwo1) qwo1Var).a(zwo1Var2, this) != nhn1Var) {
                        return rih1Var;
                    }
                    return nhn1Var;
                    if (!(oao1.e(oao1Var) == e2x0.a1)) {
                        xgn0VarD.c((Object) null);
                        return rih1Var;
                    }
                    oao1.f(oao1Var, e2x0.b1);
                    oao1Var.f = sap1.a();
                    xgn0VarD.c((Object) null);
                    c921.y(oao1.i(oao1Var2).b(), (o8n) null, 0, new u9o1(zwo1Var, oao1Var2, (lnm) null), 3);
                    this.e = zwo1Var;
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    qwo1Var = new qwo1(new zdm1(oao1Var2, (lnm) null, (byte) 3));
                    if (qwo1Var != nhn1Var) {
                        zwo1Var2 = zwo1Var;
                        this.e = null;
                        this.b = (byte) 3;
                        if (((qwo1) qwo1Var).a(zwo1Var2, this) != nhn1Var) {
                            return rih1Var;
                        }
                    }
                    return nhn1Var;
                } catch (Throwable th) {
                    xgn0VarD.c((Object) null);
                    throw th;
                }
            case 4:
                byte b6 = this.b;
                if (b6 != 0) {
                    if (b6 != 1) {
                        hm5.M(obj);
                        objA2 = obj;
                    } else {
                        rvo1Var2 = (rvo1) this.c;
                        hm5.M(obj);
                        objK = obj;
                    }
                    return (yln1) objA2;
                }
                hm5.M(obj);
                rvo1Var2 = (rvo1) this.d;
                this.c = rvo1Var2;
                this.b = (byte) 1;
                objK = alg1.k((alg1) this.e, (xnn1) obj2, this);
                if (objK == nhn1Var) {
                    return nhn1Var;
                }
                this.c = null;
                this.b = (byte) 2;
                objA2 = ((qwo1) objK).a(rvo1Var2.a(), this);
                if (objA2 == nhn1Var) {
                    return nhn1Var;
                }
                return (yln1) objA2;
            default:
                vgn0 vgn0Var = this.b;
                try {
                    if (vgn0Var == 0) {
                        hm5.M(obj);
                        rvo1Var3 = (rvo1) this.e;
                        f0p1Var = (f0p1) obj2;
                        xgn0VarC = f0p1Var.c();
                        this.e = rvo1Var3;
                        this.c = xgn0VarC;
                        this.d = f0p1Var;
                        this.b = (byte) 1;
                        if (xgn0VarC.a(this) != nhn1Var) {
                        }
                        return nhn1Var;
                    }
                    if (vgn0Var != 1) {
                        vgn0 vgn0Var2 = (vgn0) this.e;
                        hm5.M(obj);
                        objH2 = obj;
                        vgn0Var = vgn0Var2;
                    } else {
                        f0p1Var = (f0p1) this.d;
                        xgn0VarC = (xgn0) this.c;
                        rvo1Var3 = (rvo1) this.e;
                        hm5.M(obj);
                    }
                    nhn1Var = (nhn1) objH2;
                    vgn0Var.c((Object) null);
                    return nhn1Var;
                    xgn0 xgn0Var = xgn0VarC;
                    f0p1 f0p1Var2 = f0p1Var;
                    xgn0 xgn0Var2 = xgn0Var;
                    String strA = rvo1Var3.a().a().a();
                    this.e = xgn0Var2;
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    objH2 = f0p1.h(f0p1Var2, strA, this);
                    vgn0Var = xgn0Var2;
                    if (objH2 != nhn1Var) {
                        nhn1Var = (nhn1) objH2;
                        vgn0Var.c((Object) null);
                    }
                    return nhn1Var;
                } catch (Throwable th2) {
                    vgn0Var.c((Object) null);
                    throw th2;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l53(ip31 ip31Var, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 0;
        this.f = ip31Var;
        this.e = str;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l53(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l53(rvo1 rvo1Var, Object obj, rin1 rin1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = rvo1Var;
        this.e = obj;
        this.f = rin1Var;
    }
}
