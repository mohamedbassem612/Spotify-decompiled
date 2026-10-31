package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class e9m1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g9l1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e9m1(g9l1 g9l1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = g9l1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new e9m1(this.b, lnmVar, (byte) 0);
            default:
                return new e9m1(this.b, lnmVar, (byte) 1);
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
        switch (this.a) {
            case 0:
                hm5.M(obj);
                g9l1 g9l1Var = this.b;
                g9l1Var.n = 2;
                r091 r091Var = g9l1Var.h;
                if (r091Var != null) {
                    r091Var.d();
                }
                vq71 vq71Var = g9l1Var.j;
                g9l1Var.e(new jt71(vq71Var != null ? vq71Var.g : null));
                break;
            default:
                hm5.M(obj);
                this.b.d();
                break;
        }
        return rih1.a;
    }
}
