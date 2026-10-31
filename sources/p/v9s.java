package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v9s implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ y9s c;

    public /* synthetic */ v9s(vr20 vr20Var, y9s y9sVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = y9sVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0065  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        u9s u9sVar;
        x9s x9sVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        y9s y9sVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof u9s) {
                    u9sVar = (u9s) lnmVar;
                    int i = u9sVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u9sVar.b = i - Integer.MIN_VALUE;
                    } else {
                        u9sVar = new u9s(this, lnmVar);
                    }
                } else {
                    u9sVar = new u9s(this, lnmVar);
                }
                Object obj2 = u9sVar.a;
                int i2 = u9sVar.b;
                if (i2 == 0) {
                    hm5.M(obj2);
                    pok0 pok0Var = new pok0(y9sVar.f((m250) obj), iwc1.b);
                    u9sVar.b = 1;
                    return vr20Var.emit(pok0Var, u9sVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i2 == 1) {
                    hm5.M(obj2);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            default:
                if (lnmVar instanceof x9s) {
                    x9sVar = (x9s) lnmVar;
                    int i3 = x9sVar.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        x9sVar.b = i3 - Integer.MIN_VALUE;
                    } else {
                        x9sVar = new x9s(this, lnmVar);
                    }
                } else {
                    x9sVar = new x9s(this, lnmVar);
                }
                Object obj3 = x9sVar.a;
                int i4 = x9sVar.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    pok0 pok0Var2 = new pok0(y9sVar.g((xnl1) obj), iwc1.a);
                    x9sVar.b = 1;
                    return vr20Var.emit(pok0Var2, x9sVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
