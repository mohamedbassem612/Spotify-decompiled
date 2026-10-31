package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class t7e1 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ r7e1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t7e1(r7e1 r7e1Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = r7e1Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        r7e1 r7e1Var = this.c;
        switch (b) {
            case 0:
                return new t7e1(r7e1Var, lnmVar, (byte) 0);
            case 1:
                return new t7e1(r7e1Var, lnmVar, (byte) 1);
            default:
                return new t7e1(r7e1Var, lnmVar, (byte) 2);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
            case 1:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = rih1.a;
        r7e1 r7e1Var = this.c;
        d9n d9nVar2 = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    this.b = true;
                    r7e1Var.d(this);
                    return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            case 1:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return d9nVar;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                boolean zBooleanValue = ((Boolean) r7e1Var.u.getValue()).booleanValue();
                this.b = true;
                r7e1Var.c(zBooleanValue, this);
                return d9nVar == d9nVar2 ? d9nVar2 : d9nVar;
            default:
                boolean z3 = this.b;
                if (!z3) {
                    hm5.M(obj);
                    this.b = true;
                    return r7e1Var.s(false, this) == d9nVar2 ? d9nVar2 : d9nVar;
                }
                if (z3) {
                    hm5.M(obj);
                    return d9nVar;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
