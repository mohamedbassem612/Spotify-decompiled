package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w6i0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ u631 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w6i0(u631 u631Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = u631Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        u631 u631Var = this.c;
        switch (b) {
            case 0:
                return new w6i0(u631Var, lnmVar, (byte) 0);
            default:
                return new w6i0(u631Var, lnmVar, (byte) 1);
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
        u631 u631Var = this.c;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    if (u631Var.T(this) == d9nVar) {
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
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    gal galVar = u631Var.b;
                    this.b = true;
                    Object objJ = fc11.j(((ruz) galVar.c).a(new g9u0("share-mediatrimmer-contextplayermediaaction", false)), this);
                    if (objJ != d9nVar) {
                        objJ = rih1Var;
                    }
                    if (objJ == d9nVar) {
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
