package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e2c1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ g2c1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e2c1(g2c1 g2c1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = g2c1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        g2c1 g2c1Var = this.c;
        switch (b) {
            case 0:
                return new e2c1(g2c1Var, lnmVar, (byte) 0);
            default:
                return new e2c1(g2c1Var, lnmVar, (byte) 1);
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
        g2c1 g2c1Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var = g2c1Var.b;
                q1c1 q1c1Var = new q1c1(2, (lnm) null, (byte) 1);
                this.b = true;
                Object objJ = b5p1.j(mr20Var, q1c1Var, this);
                return objJ == d9nVar ? d9nVar : objJ;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mr20 mr20Var2 = g2c1Var.b;
                q1c1 q1c1Var2 = new q1c1(2, (lnm) null, (byte) 2);
                this.b = true;
                Object objJ2 = b5p1.j(mr20Var2, q1c1Var2, this);
                return objJ2 == d9nVar ? d9nVar : objJ2;
        }
    }
}
