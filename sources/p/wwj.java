package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwj extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ txj c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwj(txj txjVar, boolean z, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.c = txjVar;
        this.b = z;
        this.d = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ven0 ven0Var = this.d;
        txj txjVar = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                return new wwj(txjVar, z, ven0Var, lnmVar);
            default:
                return new wwj(z, txjVar, ven0Var, lnmVar);
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
        txj txjVar = this.c;
        boolean z = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (!((Boolean) ven0Var.getValue()).booleanValue()) {
                    int i = txjVar.a ? z ? 3 : 0 : 2;
                    if (i != 0) {
                        ven0Var.setValue(Boolean.TRUE);
                        txjVar.b.b(i);
                    }
                }
                break;
            default:
                hm5.M(obj);
                if (z && !((Boolean) ven0Var.getValue()).booleanValue()) {
                    ven0Var.setValue(Boolean.TRUE);
                    txjVar.b.b(1);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wwj(boolean z, txj txjVar, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = z;
        this.c = txjVar;
        this.d = ven0Var;
    }
}
