package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class pw51 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vw51 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pw51(vw51 vw51Var, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = vw51Var;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        vw51 vw51Var = this.c;
        switch (b) {
            case 0:
                return new pw51(vw51Var, lnmVar, (byte) 0);
            default:
                return new pw51(vw51Var, lnmVar, (byte) 1);
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
        vw51 vw51Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    mr20 mr20Var = vw51Var.e.a;
                    this.b = true;
                    obj = b5p1.i(mr20Var, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(((ibk0) obj).equals(ebk0.a));
            default:
                boolean z2 = this.b;
                if (!z2) {
                    hm5.M(obj);
                    mr20 mr20VarK = vw51Var.f.k();
                    this.b = true;
                    obj = b5p1.i(mr20VarK, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return Boolean.valueOf(u890.j(obj, zua1.a));
        }
    }
}
