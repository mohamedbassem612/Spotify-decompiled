package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rec0 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ et90 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rec0(et90 et90Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = et90Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        et90 et90Var = this.c;
        switch (b) {
            case 0:
                return new rec0(et90Var, lnmVar, (byte) 0);
            default:
                return new rec0(et90Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        et90 et90Var = this.c;
        d9n d9nVar = d9n.a;
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
                xec0 xec0Var = (xec0) et90Var.d;
                String str = (String) et90Var.e;
                this.b = true;
                return xec0Var.c(str, this) == d9nVar ? d9nVar : rih1Var;
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
                xec0 xec0Var2 = (xec0) et90Var.d;
                String str2 = (String) et90Var.e;
                this.b = true;
                return xec0Var2.a(str2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
