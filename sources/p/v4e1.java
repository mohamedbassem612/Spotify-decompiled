package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class v4e1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ z4e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4e1(z4e1 z4e1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z4e1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        z4e1 z4e1Var = this.c;
        switch (b) {
            case 0:
                return new v4e1(z4e1Var, lnmVar, (byte) 0);
            case 1:
                return new v4e1(z4e1Var, lnmVar, (byte) 1);
            case 2:
                return new v4e1(z4e1Var, lnmVar, (byte) 2);
            case 3:
                return new v4e1(z4e1Var, lnmVar, (byte) 3);
            case 4:
                return new v4e1(z4e1Var, lnmVar, (byte) 4);
            default:
                return new v4e1(z4e1Var, lnmVar, (byte) 5);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 1:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 2:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 3:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            case 4:
                return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                return d9n.a;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = rih1.a;
        z4e1 z4e1Var = this.c;
        d9n d9nVar2 = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r7e1 r7e1Var = z4e1Var.S0;
                this.b = true;
                r7e1Var.c(true, this);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                r7e1 r7e1Var2 = z4e1Var.S0;
                this.b = true;
                r7e1Var2.d(this);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    r7e1 r7e1Var3 = z4e1Var.S0;
                    this.b = true;
                    return r7e1Var3.s(false, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z3) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (z4) {
                    if (z4) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this.b = true;
                Object objCollect = z4p1.F(z4p1.v(rwq.q(new s4e1(z4e1Var, (byte) 7)), 1), 1).collect(new bda1(z4e1Var, (byte) 7), this);
                if (objCollect != d9nVar2) {
                    objCollect = d9nVar;
                }
                return objCollect == d9nVar2 ? d9nVar2 : d9nVar;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    r7e1 r7e1Var4 = z4e1Var.S0;
                    this.b = true;
                    return r7e1Var4.y(this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z5) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z6 = this.b;
                if (z6) {
                    if (z6) {
                        throw l1d.v(obj);
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                pec1 pec1Var = new pec1(z4e1Var, (lnm) null, (byte) 13);
                this.b = true;
                udt0.a(z4e1Var, pec1Var, this);
                return d9nVar2;
        }
    }
}
