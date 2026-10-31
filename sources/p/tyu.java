package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class tyu extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vyu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tyu(vyu vyuVar, lnm lnmVar, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.c = vyuVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vyu vyuVar = this.c;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                return new tyu(vyuVar, lnmVar, (byte) 0).invokeSuspend(rih1Var);
            default:
                return new tyu(vyuVar, lnmVar, (byte) 1).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i6n i6nVar = i6n.a;
        vyu vyuVar = this.c;
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
                b7n b7nVar = vyuVar.c;
                Boolean bool = Boolean.TRUE;
                this.b = true;
                return b7nVar.b(i6nVar, bool, this) == d9nVar ? d9nVar : rih1Var;
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
                b7n b7nVar2 = vyuVar.c;
                Boolean bool2 = Boolean.TRUE;
                this.b = true;
                return b7nVar2.b(i6nVar, bool2, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
