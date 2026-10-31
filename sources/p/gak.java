package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gak extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ lak c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gak(lak lakVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = lakVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        lak lakVar = this.c;
        switch (b) {
            case 0:
                return new gak(lakVar, lnmVar, (byte) 0);
            default:
                return new gak(lakVar, lnmVar, (byte) 1);
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
        lak lakVar = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    k9k k9kVar = lakVar.f;
                    nak nakVar = lakVar.b;
                    this.b = true;
                    if (k9kVar.c(nakVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
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
                rm5 rm5Var = lakVar.e;
                String str = lakVar.b.b;
                this.b = true;
                Object objS = rm5Var.s(str, this);
                return objS == d9nVar ? d9nVar : objS;
        }
    }
}
