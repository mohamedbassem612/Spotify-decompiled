package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class noj0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ poj0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ noj0(poj0 poj0Var, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = poj0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        poj0 poj0Var = this.c;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                return new noj0(poj0Var, lnmVar, (byte) 0).invokeSuspend(rih1Var);
            default:
                return new noj0(poj0Var, lnmVar, (byte) 1).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        v6n v6nVar = v6n.a;
        poj0 poj0Var = this.c;
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
                b7n b7nVar = (b7n) poj0Var.b;
                Integer num = new Integer(5);
                this.b = true;
                return b7nVar.b(v6nVar, num, this) == d9nVar ? d9nVar : rih1Var;
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
                b7n b7nVar2 = (b7n) poj0Var.b;
                Integer num2 = new Integer(6);
                this.b = true;
                return b7nVar2.b(v6nVar, num2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
