package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class new0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public final /* synthetic */ sbw0 c;
    public final /* synthetic */ gfw0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public new0(sbw0 sbw0Var, gfw0 gfw0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = sbw0Var;
        this.d = gfw0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        gfw0 gfw0Var = this.d;
        sbw0 sbw0Var = this.c;
        switch (b) {
            case 0:
                return new new0(gfw0Var, sbw0Var, lnmVar);
            default:
                return new new0(sbw0Var, gfw0Var, lnmVar);
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
        d9n d9nVar = d9n.a;
        sbw0 sbw0Var = this.c;
        gfw0 gfw0Var = this.d;
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
                ggl gglVar = gfw0Var.j;
                if (gglVar == null) {
                    return rih1Var;
                }
                dt71 dt71Var = gglVar.g;
                mew0 mew0Var = new mew0(gfw0Var, sbw0Var, (byte) 0);
                this.b = true;
                dt71Var.collect(mew0Var, this);
                return d9nVar;
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
                if (!sbw0Var.g) {
                    return rih1Var;
                }
                k9k k9kVar = gfw0Var.l;
                mr20 mr20VarR = o4p1.r(rqt0.u(new x010(((clm) k9kVar.d).a, gfw0Var.f4p, new b7c(new z6v0(sbw0Var, (byte) 16), k9kVar, (lnm) null, (byte) 16), (byte) 1)), (q8n) k9kVar.c);
                mew0 mew0Var2 = new mew0(sbw0Var, gfw0Var);
                this.b = true;
                return mr20VarR.collect(mew0Var2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public new0(gfw0 gfw0Var, sbw0 sbw0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.d = gfw0Var;
        this.c = sbw0Var;
    }
}
