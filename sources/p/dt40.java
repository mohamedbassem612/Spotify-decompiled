package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dt40 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ vu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt40(vu30 vu30Var, Object obj, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 7;
        this.d = vu30Var;
        this.c = obj;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vu30 vu30Var = this.d;
        switch (b) {
            case 0:
                dt40 dt40Var = new dt40(vu30Var, lnmVar, (byte) 0);
                dt40Var.c = obj;
                return dt40Var;
            case 1:
                dt40 dt40Var2 = new dt40(vu30Var, lnmVar, (byte) 1);
                dt40Var2.c = obj;
                return dt40Var2;
            case 2:
                dt40 dt40Var3 = new dt40(vu30Var, lnmVar, (byte) 2);
                dt40Var3.c = obj;
                return dt40Var3;
            case 3:
                dt40 dt40Var4 = new dt40(vu30Var, lnmVar, (byte) 3);
                dt40Var4.c = obj;
                return dt40Var4;
            case 4:
                dt40 dt40Var5 = new dt40(vu30Var, lnmVar, (byte) 4);
                dt40Var5.c = obj;
                return dt40Var5;
            case 5:
                dt40 dt40Var6 = new dt40(vu30Var, lnmVar, (byte) 5);
                dt40Var6.c = obj;
                return dt40Var6;
            case 6:
                dt40 dt40Var7 = new dt40(vu30Var, lnmVar, (byte) 6);
                dt40Var7.c = obj;
                return dt40Var7;
            default:
                return new dt40(vu30Var, this.c, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 3:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 4:
                return create((cen0) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vu30 vu30Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    cen0 cen0VarB = ((cen0) this.c).b();
                    this.c = cen0VarB;
                    this.b = true;
                    return vu30Var.invoke(cen0VarB, this) == d9nVar ? d9nVar : cen0VarB;
                }
                if (!z) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cen0 cen0Var = (cen0) this.c;
                hm5.M(obj);
                return cen0Var;
            case 1:
                c9n c9nVar = (c9n) this.c;
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vu30Var.invoke(c9nVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                c9n c9nVar2 = (c9n) this.c;
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vu30Var.invoke(c9nVar2, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                c9n c9nVar3 = (c9n) this.c;
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vu30Var.invoke(c9nVar3, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 4:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    cen0 cen0VarB2 = ((cen0) this.c).b();
                    this.c = cen0VarB2;
                    this.b = true;
                    return vu30Var.invoke(cen0VarB2, this) == d9nVar ? d9nVar : cen0VarB2;
                }
                if (!z5) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                cen0 cen0Var2 = (cen0) this.c;
                hm5.M(obj);
                return cen0Var2;
            case 5:
                c9n c9nVar4 = (c9n) this.c;
                boolean z6 = this.b;
                if (!z6) {
                    hm5.M(obj);
                    this.c = null;
                    this.b = true;
                    return vu30Var.invoke(c9nVar4, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z6) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 6:
                boolean z7 = this.b;
                if (!z7) {
                    hm5.M(obj);
                    c9n c9nVar5 = (c9n) this.c;
                    this.b = true;
                    return vu30Var.invoke(c9nVar5, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z7) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z8 = this.b;
                if (z8) {
                    if (z8) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Object obj2 = this.c;
                this.b = true;
                Object objInvoke = vu30Var.invoke(obj2, this);
                return objInvoke == d9nVar ? d9nVar : objInvoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ dt40(vu30 vu30Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = vu30Var;
    }
}
