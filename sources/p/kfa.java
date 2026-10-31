package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kfa extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ w5f1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kfa(w5f1 w5f1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = w5f1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new kfa(this.c, lnmVar, (byte) 0);
            case 1:
                kfa kfaVar = new kfa(this.c, lnmVar, (byte) 1);
                kfaVar.b = ((Boolean) obj).booleanValue();
                return kfaVar;
            default:
                return new kfa(this.c, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return ((kfa) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
            case 1:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((kfa) create(bool, (lnm) obj2)).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                return ((kfa) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        w5f1 w5f1Var = this.c;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (w5f1Var.c(hfn0.a, this) == d9nVar) {
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
                hm5.M(obj);
                if (!this.b) {
                    w5f1Var.dismiss();
                }
                return rih1Var;
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    this.b = true;
                    if (w5f1Var.c(hfn0.b, this) == d9nVar) {
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
        }
    }
}
