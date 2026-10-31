package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class iwd extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ lz20 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iwd(boolean z, lz20 lz20Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = lz20Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new iwd(this.b, this.c, lnmVar, (byte) 0);
            case 1:
                return new iwd(this.b, this.c, lnmVar, (byte) 1);
            case 2:
                return new iwd(this.b, this.c, lnmVar, (byte) 2);
            case 3:
                return new iwd(this.b, this.c, lnmVar, (byte) 3);
            default:
                return new iwd(this.b, this.c, lnmVar, (byte) 4);
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
        boolean z = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (z) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused) {
                    }
                }
                break;
            case 1:
                hm5.M(obj);
                if (z) {
                    lz20.b(lz20Var);
                }
                break;
            case 2:
                hm5.M(obj);
                if (!z) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused2) {
                    }
                }
                break;
            case 3:
                hm5.M(obj);
                if (z) {
                    lz20.b(lz20Var);
                }
                break;
            default:
                hm5.M(obj);
                if (z) {
                    try {
                        lz20.b(lz20Var);
                    } catch (IllegalStateException unused3) {
                    }
                }
                break;
        }
        return rih1Var;
        return rih1Var;
        return rih1Var;
    }
}
