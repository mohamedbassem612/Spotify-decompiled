package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class h6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i6 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h6(i6 i6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = i6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        i6 i6Var = this.b;
        switch (b) {
            case 0:
                return new h6(i6Var, lnmVar, (byte) 0);
            default:
                return new h6(i6Var, lnmVar, (byte) 1);
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
        i6 i6Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (i6Var.d1 == null) {
                    dy60 dy60Var = new dy60();
                    idn0 idn0Var = i6Var.Q0;
                    if (idn0Var != null) {
                        fn31.T(i6Var.v1(), null, 0, new q4(idn0Var, dy60Var, (lnm) null, (byte) 1), 3);
                    }
                    i6Var.d1 = dy60Var;
                }
                break;
            default:
                hm5.M(obj);
                dy60 dy60Var2 = i6Var.d1;
                if (dy60Var2 != null) {
                    ey60 ey60Var = new ey60(dy60Var2);
                    idn0 idn0Var2 = i6Var.Q0;
                    if (idn0Var2 != null) {
                        fn31.T(i6Var.v1(), null, 0, new q4(idn0Var2, ey60Var, (lnm) null, (byte) 2), 3);
                    }
                    i6Var.d1 = null;
                }
                break;
        }
        return rih1Var;
    }
}
