package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ibe extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public ven0 b;
    public boolean c;
    public final /* synthetic */ qdm1 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ibe(qdm1 qdm1Var, ven0 ven0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = qdm1Var;
        this.e = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.e;
        qdm1 qdm1Var = this.d;
        switch (b) {
            case 0:
                return new ibe(qdm1Var, ven0Var, lnmVar, (byte) 0);
            default:
                return new ibe(qdm1Var, ven0Var, lnmVar, (byte) 1);
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
        qdm1 qdm1Var = this.d;
        ven0 ven0Var = this.e;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.c;
                if (!z) {
                    hm5.M(obj);
                    ndm1 ndm1Var = qdm1Var.d;
                    this.b = ven0Var;
                    this.c = true;
                    obj = ndm1Var.invoke(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var = this.b;
                    hm5.M(obj);
                }
                yj41 yj41Var = (yj41) obj;
                ven0Var.setValue(yj41Var != null ? new yj41(yj41Var.a, null, yj41Var.c) : null);
                return rih1Var;
            default:
                boolean z2 = this.c;
                if (!z2) {
                    hm5.M(obj);
                    ndm1 ndm1Var2 = qdm1Var.d;
                    this.b = ven0Var;
                    this.c = true;
                    obj = ndm1Var2.invoke(this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    ven0Var = this.b;
                    hm5.M(obj);
                }
                ven0Var.setValue((yj41) obj);
                return rih1Var;
        }
    }
}
