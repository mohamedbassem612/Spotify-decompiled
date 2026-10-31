package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class s08 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y08 b;
    public final /* synthetic */ q08 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s08(y08 y08Var, q08 q08Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = y08Var;
        this.c = q08Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        q08 q08Var = this.c;
        y08 y08Var = this.b;
        switch (b) {
            case 0:
                return new s08(y08Var, q08Var, lnmVar, (byte) 0);
            default:
                return new s08(y08Var, q08Var, lnmVar, (byte) 1);
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
        q08 q08Var = this.c;
        y08 y08Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((wr00) y08Var.i.getValue()).a(q08Var.a);
                break;
            default:
                hm5.M(obj);
                y08Var.c.b(q08Var.a, q08Var.b);
                break;
        }
        return rih1Var;
    }
}
