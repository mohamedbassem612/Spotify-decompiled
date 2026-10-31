package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sbk0 extends a8d1 implements bv30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ byte a = 0;
    public tv80 b;
    public tv80 c;
    public int d;
    public byte e;
    public /* synthetic */ tqw f;
    public xu30 g;
    public /* synthetic */ Object h;
    public /* synthetic */ Object i;
    public /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbk0(p9n0 p9n0Var, u9a1 u9a1Var, lnm lnmVar) {
        super(5, lnmVar);
        this.X = p9n0Var;
        this.h = u9a1Var;
    }

    public final Object c1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj6 = this.X;
        switch (b) {
            case 0:
                sbk0 sbk0Var = new sbk0((p9n0) obj6, (u9a1) this.h, (lnm) obj5);
                sbk0Var.i = (nbk0) obj;
                sbk0Var.t = (kbk0) obj3;
                sbk0Var.f = (tqw) obj4;
                return sbk0Var.invokeSuspend(rih1Var);
            default:
                sbk0 sbk0Var2 = new sbk0((q8u0) this.t, (xu30) obj6, (lnm) obj5);
                sbk0Var2.h = (qet0) obj;
                sbk0Var2.i = (met0) obj3;
                sbk0Var2.f = (tqw) obj4;
                return sbk0Var2.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:45:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        tv80 tv80Var;
        u9a1 u9a1Var;
        tv80 tv80Var2;
        tv80 tv80VarY;
        xu30 xu30Var;
        tv80 tv80Var3;
        tv80 tv80Var4;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 0;
        Object obj2 = this.X;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                nbk0 nbk0Var = (nbk0) this.i;
                kbk0 kbk0Var = (kbk0) this.t;
                tqw tqwVar = this.f;
                byte b2 = this.e;
                if (b2 == 0) {
                    hm5.M(obj);
                    if (tqwVar == null) {
                        return rih1Var;
                    }
                    tv80 tv80VarY2 = n3o1.y(tqwVar);
                    u9a1 u9a1Var2 = (u9a1) this.h;
                    nbk0Var.getClass();
                    this.i = null;
                    this.t = kbk0Var;
                    this.f = null;
                    this.b = tv80VarY2;
                    this.g = u9a1Var2;
                    this.c = tv80VarY2;
                    this.d = 0;
                    this.e = (byte) 1;
                    if (((p9n0) obj2).b(tv80VarY2, this) != d9nVar) {
                        tv80Var = tv80VarY2;
                        u9a1Var = u9a1Var2;
                        tv80Var2 = tv80Var;
                    }
                    return d9nVar;
                }
                if (b2 != 1) {
                    if (b2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    return rih1Var;
                }
                i = this.d;
                tv80Var = this.c;
                u9a1Var = this.g;
                tv80Var2 = this.b;
                hm5.M(obj);
                this.i = null;
                this.t = null;
                this.f = null;
                this.b = tv80Var2;
                this.g = null;
                this.c = null;
                this.d = i;
                this.e = (byte) 2;
                if (u9a1Var.invoke(kbk0Var, tv80Var, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
            default:
                qet0 qet0Var = (qet0) this.h;
                met0 met0Var = (met0) this.i;
                tqw tqwVar2 = this.f;
                byte b3 = this.e;
                if (b3 == 0) {
                    hm5.M(obj);
                    if (tqwVar2 == null) {
                        return rih1Var;
                    }
                    tv80VarY = n3o1.y(tqwVar2);
                    q8u0 q8u0Var = (q8u0) this.t;
                    xu30Var = (xu30) obj2;
                    if (qet0Var.c) {
                        tv80Var3 = tv80VarY;
                        this.h = null;
                        this.i = null;
                        this.f = null;
                        this.b = tv80Var3;
                        this.g = null;
                        this.c = null;
                        this.d = i;
                        this.e = (byte) 2;
                        if (xu30Var.invoke(met0Var, tv80VarY, this) != d9nVar) {
                            return rih1Var;
                        }
                    } else {
                        this.h = null;
                        this.i = met0Var;
                        this.f = null;
                        this.b = tv80VarY;
                        this.g = xu30Var;
                        this.c = tv80VarY;
                        this.d = 0;
                        this.e = (byte) 1;
                        if (q8u0Var.b(tv80VarY, this) != d9nVar) {
                            tv80Var4 = tv80VarY;
                            tv80Var3 = tv80Var4;
                        }
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    tv80 tv80Var5 = this.g;
                    hm5.M(obj);
                    return rih1Var;
                }
                i = this.d;
                tv80Var4 = this.c;
                xu30Var = this.g;
                tv80Var3 = this.b;
                hm5.M(obj);
                tv80VarY = tv80Var4;
                this.h = null;
                this.i = null;
                this.f = null;
                this.b = tv80Var3;
                this.g = null;
                this.c = null;
                this.d = i;
                this.e = (byte) 2;
                if (xu30Var.invoke(met0Var, tv80VarY, this) != d9nVar) {
                    return rih1Var;
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sbk0(q8u0 q8u0Var, xu30 xu30Var, lnm lnmVar) {
        super(5, lnmVar);
        this.t = q8u0Var;
        this.X = xu30Var;
    }
}
