package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class skj1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rk41 b;
    public final /* synthetic */ vkj1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ skj1(rk41 rk41Var, vkj1 vkj1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = rk41Var;
        this.c = vkj1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vkj1 vkj1Var = this.c;
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                return new skj1(rk41Var, vkj1Var, lnmVar, (byte) 0);
            default:
                return new skj1(rk41Var, vkj1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vkj1 vkj1Var = this.c;
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                boolean z = rk41Var.b;
                ejj1 ejj1Var = vkj1Var.h;
                if (!z) {
                    ejj1Var.d().o(false);
                } else {
                    ejj1Var.d().p(2);
                }
                break;
            default:
                hm5.M(obj);
                boolean z2 = rk41Var.a;
                ejj1 ejj1Var2 = vkj1Var.h;
                if (!z2) {
                    ejj1Var2.f();
                } else {
                    ejj1Var2.d().f();
                }
                break;
        }
        return rih1Var;
    }
}
