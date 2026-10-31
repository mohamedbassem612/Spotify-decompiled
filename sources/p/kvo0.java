package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class kvo0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ kqi0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kvo0(kqi0 kqi0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = kqi0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        kqi0 kqi0Var = this.c;
        switch (b) {
            case 0:
                return new kvo0(kqi0Var, lnmVar, (byte) 0);
            default:
                return new kvo0(kqi0Var, lnmVar, (byte) 1);
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
        rih1 rih1Var = rih1.a;
        kqi0 kqi0Var = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    fpo fpoVar = (fpo) kqi0Var.c;
                    this.b = true;
                    return fpoVar.invoke(this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                q8n q8nVar = (q8n) kqi0Var.d;
                kvo0 kvo0Var = new kvo0(kqi0Var, lnmVar, (byte) 0);
                this.b = true;
                return fn31.Y(q8nVar, kvo0Var, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
