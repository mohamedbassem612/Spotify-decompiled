package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cf6 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ xd6 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cf6(boolean z, xd6 xd6Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = z;
        this.c = xd6Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new cf6(this.b, this.c, lnmVar, (byte) 0);
            case 1:
                return new cf6(this.b, this.c, lnmVar, (byte) 1);
            default:
                return new cf6(this.b, this.c, lnmVar, (byte) 2);
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
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        xd6 xd6Var = this.c;
        boolean z = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                if (!z) {
                    xd6Var.e = false;
                } else {
                    xd6Var.e = true;
                }
                break;
            case 1:
                hm5.M(obj);
                if (!z) {
                    xd6Var.f = false;
                } else {
                    xd6Var.f = true;
                    xd6Var.a.t(0.0f);
                    xd6Var.b.t(0.0f);
                    xd6Var.c.t(0.0f);
                    xd6Var.d.t(0.0f);
                }
                break;
            default:
                hm5.M(obj);
                if (!z) {
                    xd6Var.f = false;
                } else {
                    xd6Var.f = true;
                    xd6Var.a.t(0.0f);
                    xd6Var.b.t(0.0f);
                    xd6Var.c.t(0.0f);
                    xd6Var.d.t(0.0f);
                }
                break;
        }
        return rih1Var;
    }
}
