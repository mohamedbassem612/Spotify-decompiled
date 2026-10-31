package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class uka extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rk41 b;
    public final /* synthetic */ lz20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uka(rk41 rk41Var, lz20 lz20Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = rk41Var;
        this.c = lz20Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        lz20 lz20Var = this.c;
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                return new uka(rk41Var, lz20Var, lnmVar, (byte) 0);
            case 1:
                return new uka(rk41Var, lz20Var, lnmVar, (byte) 1);
            case 2:
                return new uka(rk41Var, lz20Var, lnmVar, (byte) 2);
            case 3:
                return new uka(rk41Var, lz20Var, lnmVar, (byte) 3);
            case 4:
                return new uka(rk41Var, lz20Var, lnmVar, (byte) 4);
            case 5:
                return new uka(rk41Var, lz20Var, lnmVar, (byte) 5);
            default:
                return new uka(rk41Var, lz20Var, lnmVar, (byte) 6);
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
            case 1:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 2:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 3:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 4:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            case 5:
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
        lz20 lz20Var = this.c;
        rk41 rk41Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (!rk41Var.a) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused) {
                    }
                }
                break;
            case 1:
                hm5.M(obj);
                if (!rk41Var.a) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused2) {
                    }
                }
                break;
            case 2:
                hm5.M(obj);
                if (!rk41Var.a) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused3) {
                    }
                }
                break;
            case 3:
                hm5.M(obj);
                if (!rk41Var.a) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused4) {
                    }
                }
                break;
            case 4:
                hm5.M(obj);
                if (!rk41Var.a) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused5) {
                    }
                }
                break;
            case 5:
                hm5.M(obj);
                if (!rk41Var.a) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused6) {
                    }
                }
                break;
            default:
                hm5.M(obj);
                if (!rk41Var.a) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused7) {
                    }
                }
                break;
        }
        return rih1Var;
        return rih1Var;
        return rih1Var;
        return rih1Var;
        return rih1Var;
        return rih1Var;
        return rih1Var;
    }
}
