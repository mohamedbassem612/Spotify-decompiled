package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bu40 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ du40 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bu40(du40 du40Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = du40Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        du40 du40Var = this.c;
        switch (b) {
            case 0:
                return new bu40(du40Var, lnmVar, (byte) 0);
            case 1:
                return new bu40(du40Var, lnmVar, (byte) 1);
            default:
                return new bu40(du40Var, lnmVar, (byte) 2);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        du40 du40Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    uu40 uu40Var = (uu40) du40Var.e;
                    this.b = true;
                    if (uu40Var.b(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    uu40 uu40Var2 = (uu40) du40Var.e;
                    this.b = true;
                    if (uu40Var2.a(this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    sp00 sp00Var = (sp00) du40Var.d;
                    bge bgeVar = ((ut40) sp00Var.b).a;
                    xp10 xp10Var = new xp10(du40Var, (byte) 9);
                    this.b = true;
                    Object objCollect = bgeVar.collect(new cy20(new u5z(xp10Var, sp00Var, (byte) 22), (byte) 25), this);
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect != d9nVar) {
                        objCollect = rih1Var;
                    }
                    if (objCollect == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1Var;
        }
    }
}
