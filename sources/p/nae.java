package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class nae extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ cfd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nae(cfd cfdVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = cfdVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        cfd cfdVar = this.d;
        switch (b) {
            case 0:
                nae naeVar = new nae(cfdVar, lnmVar, (byte) 0);
                naeVar.c = obj;
                return naeVar;
            default:
                nae naeVar2 = new nae(cfdVar, lnmVar, (byte) 1);
                naeVar2.c = obj;
                return naeVar2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(vr20Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cfd cfdVar = this.d;
        d9n d9nVar = d9n.a;
        lnm lnmVar = null;
        byte b2 = 1;
        switch (b) {
            case 0:
                vr20 vr20Var = (vr20) this.c;
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
                dxz0 dxz0Var = (dxz0) cfdVar.b;
                mr20 mr20VarU = rqt0.u(new x010(yoi1.g(dxz0Var.c().startWithItem(dxz0Var.b()).distinctUntilChanged().map(mm10.U0)), new lt20(new m441(new nae(cfdVar, lnmVar, b2)), new rf2(3, (lnm) null, (byte) 10), (byte) 0), new a82(3, (lnm) null, (byte) 1), (byte) 1));
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var, mr20VarU, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = (vr20) this.c;
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
                mr20 mr20VarA = ((b7n) cfdVar.c).a(i6n.a);
                this.c = null;
                this.b = true;
                return l4p1.s(vr20Var2, mr20VarA, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
