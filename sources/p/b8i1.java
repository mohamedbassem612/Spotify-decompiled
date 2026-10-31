package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class b8i1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ e8i1 c;
    public final /* synthetic */ z7i1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b8i1(e8i1 e8i1Var, z7i1 z7i1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = e8i1Var;
        this.d = z7i1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        z7i1 z7i1Var = this.d;
        e8i1 e8i1Var = this.c;
        switch (b) {
            case 0:
                return new b8i1(e8i1Var, z7i1Var, lnmVar, (byte) 0);
            case 1:
                return new b8i1(e8i1Var, z7i1Var, lnmVar, (byte) 1);
            default:
                return new b8i1(e8i1Var, z7i1Var, lnmVar, (byte) 2);
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
        z7i1 z7i1Var = this.d;
        e8i1 e8i1Var = this.c;
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
                this.b = true;
                int i = e8i1.m;
                Object objS = smo1.s(new ae1(e8i1Var, z7i1Var, (lnm) null, (byte) 24), this);
                return objS == d9nVar ? d9nVar : objS;
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
                this.b = true;
                int i2 = e8i1.m;
                Object objB = e8i1Var.b(z7i1Var, this);
                return objB == d9nVar ? d9nVar : objB;
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
                this.b = true;
                int i3 = e8i1.m;
                Object objC = e8i1Var.c(z7i1Var, this);
                return objC == d9nVar ? d9nVar : objC;
        }
    }
}
