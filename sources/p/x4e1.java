package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class x4e1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ r7e1 c;
    public final /* synthetic */ nav0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x4e1(nav0 nav0Var, r7e1 r7e1Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.d = nav0Var;
        this.c = r7e1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        nav0 nav0Var = this.d;
        r7e1 r7e1Var = this.c;
        switch (b) {
            case 0:
                return new x4e1(r7e1Var, nav0Var, lnmVar, (byte) 0);
            case 1:
                return new x4e1(r7e1Var, nav0Var, lnmVar, (byte) 1);
            case 2:
                return new x4e1(r7e1Var, nav0Var, lnmVar, (byte) 2);
            case 3:
                return new x4e1(nav0Var, r7e1Var, lnmVar);
            default:
                return new x4e1(r7e1Var, nav0Var, lnmVar, (byte) 4);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        nav0 nav0Var = this.d;
        rih1 rih1Var = rih1.a;
        r7e1 r7e1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return r7e1Var.i(nav0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    return r7e1Var.i(nav0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 2:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    return r7e1Var.e(nav0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z3) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 3:
                boolean z4 = this.b;
                if (!z4) {
                    hm5.M(obj);
                    tea teaVar = new tea(r7e1Var, (byte) 1);
                    this.b = true;
                    return rqd1.d(this.d, (iu30) null, (iu30) null, (xu30) null, teaVar, this, 7) == d9nVar ? d9nVar : rih1Var;
                }
                if (z4) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z5 = this.b;
                if (!z5) {
                    hm5.M(obj);
                    this.b = true;
                    return r7e1Var.i(nav0Var, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z5) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x4e1(r7e1 r7e1Var, nav0 nav0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = r7e1Var;
        this.d = nav0Var;
    }
}
