package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p73 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ x73 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ p73(x73 x73Var, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = x73Var;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        x73 x73Var = this.c;
        switch (b) {
            case 0:
                return new p73(x73Var, str, lnmVar, (byte) 0);
            default:
                return new p73(x73Var, str, lnmVar, (byte) 1);
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
        String str = this.d;
        x73 x73Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    Object objS = smo1.s(new vr1(x73Var, str, (lnm) null), this);
                    return objS == d9nVar ? d9nVar : objS;
                }
                if (z) {
                    hm5.M(obj);
                    return obj;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
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
                c221 c221Var = new c221(false, false);
                t73 t73Var = new t73(x73Var, str, null, (byte) 1);
                this.b = true;
                Object objC = x73Var.c(c221Var, t73Var, this);
                return objC == d9nVar ? d9nVar : objC;
        }
    }
}
