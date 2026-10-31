package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uwj0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ exj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uwj0(exj0 exj0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = exj0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        exj0 exj0Var = this.c;
        switch (b) {
            case 0:
                return new uwj0(exj0Var, lnmVar, (byte) 0);
            default:
                return new uwj0(exj0Var, lnmVar, (byte) 1);
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
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        exj0 exj0Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    qjk0 qjk0Var = exj0Var.f;
                    String str = exj0Var.b;
                    this.b = true;
                    if (qjk0Var.e(str, this, false) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    Object obj2 = ((e331) obj).a;
                }
                return rih1.a;
            default:
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
                j5b0 j5b0Var = new j5b0(((roc0) exj0Var.c).d(), (byte) 5);
                hyg0 hyg0Var = new hyg0(exj0Var, (lnm) null, (byte) 9);
                this.b = true;
                Object objJ = b5p1.j(j5b0Var, hyg0Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
        }
    }
}
