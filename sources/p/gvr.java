package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gvr extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ hvr c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gvr(hvr hvrVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = hvrVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        hvr hvrVar = this.c;
        switch (b) {
            case 0:
                return new gvr(hvrVar, lnmVar, (byte) 0);
            case 1:
                return new gvr(hvrVar, lnmVar, (byte) 1);
            default:
                return new gvr(hvrVar, lnmVar, (byte) 2);
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
        rih1 rih1Var = rih1.a;
        hvr hvrVar = this.c;
        d9n d9nVar = d9n.a;
        byte b2 = 1;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                xyc0 xyc0Var = hvrVar.d;
                this.b = true;
                xyc0 xyc0Var2 = xyc0Var;
                return fn31.Y(xyc0Var2.c, new no70(xyc0Var2, (lnm) null, (byte) 26), this) == d9nVar ? d9nVar : rih1Var;
            case 1:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    gvr gvrVar = new gvr(hvrVar, lnmVar, (byte) 0);
                    this.b = true;
                    return rc2.M(1000L, gvrVar, this) == d9nVar ? d9nVar : rih1Var;
                }
                if (z2) {
                    hm5.M(obj);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                geo0 geo0Var = geo0.b;
                gvr gvrVar2 = new gvr(hvrVar, lnmVar, b2);
                this.b = true;
                return fn31.Y(geo0Var, gvrVar2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
