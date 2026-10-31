package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class y3h extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ l24 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y3h(l24 l24Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = l24Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        l24 l24Var = this.c;
        switch (b) {
            case 0:
                return new y3h(l24Var, lnmVar, (byte) 0);
            default:
                return new y3h(l24Var, lnmVar, (byte) 1);
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
        l24 l24Var = this.c;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    return l24Var.invoke(this) == d9nVar ? d9nVar : rih1Var;
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
                geo0 geo0Var = geo0.b;
                y3h y3hVar = new y3h(l24Var, lnmVar, (byte) 0);
                this.b = true;
                return fn31.Y(geo0Var, y3hVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
