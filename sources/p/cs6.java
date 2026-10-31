package p;

import io.reactivex.rxjava3.core.Observable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cs6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ js6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cs6(js6 js6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = js6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        js6 js6Var = this.c;
        switch (b) {
            case 0:
                return new cs6(js6Var, lnmVar, (byte) 0);
            case 1:
                return new cs6(js6Var, lnmVar, (byte) 1);
            case 2:
                return new cs6(js6Var, lnmVar, (byte) 2);
            case 3:
                return new cs6(js6Var, lnmVar, (byte) 3);
            case 4:
                return new cs6(js6Var, lnmVar, (byte) 4);
            case 5:
                return new cs6(js6Var, lnmVar, (byte) 5);
            default:
                return new cs6(js6Var, lnmVar, (byte) 6);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        js6 js6Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                sb40 sb40Var = js6Var.f;
                ezc ezcVarG = yoi1.g(sb40Var.b.e() ? sb40Var.c().map(zz10.d) : Observable.just(Boolean.FALSE));
                this.b = true;
                Object objI = b5p1.i(ezcVarG, this);
                return objI == d9nVar ? d9nVar : objI;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    Object objI2 = b5p1.i(new u70(js6Var.b.c("disable-blocked-content", "0"), (byte) 29), this);
                    return objI2 == d9nVar ? d9nVar : objI2;
                }
                if (z2) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarG2 = yoi1.g(js6Var.f.c().map(a020.d));
                this.b = true;
                Object objI3 = b5p1.i(ezcVarG2, this);
                return objI3 == d9nVar ? d9nVar : objI3;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.b = true;
                    Object objI4 = b5p1.i(new nf(yoi1.g(js6Var.c.a(true)), (byte) 12), this);
                    return objI4 == d9nVar ? d9nVar : objI4;
                }
                if (z4) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (z5) {
                    if (z5) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                ezc ezcVarB = js6Var.e.b();
                this.b = true;
                Object objI5 = b5p1.i(ezcVarB, this);
                return objI5 == d9nVar ? d9nVar : objI5;
            case 5:
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.b = true;
                    Object objI6 = b5p1.i(new hs6(rqt0.u(new p3t(js6Var.b.a, (byte) 23)), (byte) 0), this);
                    return objI6 == d9nVar ? d9nVar : objI6;
                }
                if (z6) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z7 = this.b;
                if (z7) {
                    if (z7) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20VarB = js6Var.j.b();
                this.b = true;
                Object objI7 = b5p1.i(mr20VarB, this);
                return objI7 == d9nVar ? d9nVar : objI7;
        }
    }
}
