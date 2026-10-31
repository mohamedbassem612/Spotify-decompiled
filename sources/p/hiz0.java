package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hiz0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ iiz0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hiz0(iiz0 iiz0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = iiz0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iiz0 iiz0Var = this.c;
        switch (b) {
            case 0:
                return new hiz0(iiz0Var, lnmVar, (byte) 0);
            case 1:
                return new hiz0(iiz0Var, lnmVar, (byte) 1);
            default:
                return new hiz0(iiz0Var, lnmVar, (byte) 2);
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
        Object objF;
        Object objB;
        Object objD;
        byte b = this.a;
        iiz0 iiz0Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    e5l0 e5l0Var = iiz0Var.f;
                    String str = iiz0Var.d.a;
                    this.b = true;
                    objF = e5l0Var.f(str, this);
                    if (objF == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objF = ((e331) obj).a;
                }
                return new e331(objF);
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    tym0 tym0Var = iiz0Var.e;
                    niz0 niz0Var = iiz0Var.d;
                    String str2 = niz0Var.a;
                    String str3 = niz0Var.b;
                    this.b = true;
                    objB = tym0Var.b(str2, str3, this);
                    if (objB == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objB = ((e331) obj).a;
                }
                Object obj2 = objB;
                hm5.M(obj2);
                return obj2;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    e5l0 e5l0Var2 = iiz0Var.f;
                    String str4 = iiz0Var.d.a;
                    this.b = true;
                    objD = e5l0Var2.d(str4, this);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objD = ((e331) obj).a;
                }
                return new e331(objD);
        }
    }
}
