package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class f871 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ g871 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f871(g871 g871Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g871Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        g871 g871Var = this.c;
        switch (b) {
            case 0:
                return new f871(g871Var, lnmVar, (byte) 0);
            case 1:
                return new f871(g871Var, lnmVar, (byte) 1);
            default:
                return new f871(g871Var, lnmVar, (byte) 2);
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
        g871 g871Var = this.c;
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
                zwz0 zwz0Var = g871Var.c;
                this.b = true;
                Object objI = b5p1.i(zwz0Var.b(), this);
                return objI == d9nVar ? d9nVar : objI;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                zwz0 zwz0Var2 = g871Var.c;
                this.b = true;
                Object objI2 = b5p1.i(zwz0Var2.b(), this);
                return objI2 == d9nVar ? d9nVar : objI2;
            default:
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
                zwz0 zwz0Var3 = g871Var.c;
                this.b = true;
                Object objI3 = b5p1.i(zwz0Var3.b(), this);
                return objI3 == d9nVar ? d9nVar : objI3;
        }
    }
}
