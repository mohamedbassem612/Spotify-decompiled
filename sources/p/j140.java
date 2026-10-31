package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j140 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zja1 b;
    public final /* synthetic */ aka1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j140(zja1 zja1Var, aka1 aka1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = zja1Var;
        this.c = aka1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new j140(this.b, this.c, lnmVar, (byte) 0);
            default:
                return new j140(this.b, this.c, lnmVar, (byte) 1);
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
        aka1 aka1Var = this.c;
        zja1 zja1Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                bka1.b(zja1Var, aka1Var, fw80.g);
                break;
            default:
                hm5.M(obj);
                fn31.T(zja1Var.e, (o8n) null, 0, new sb91(zja1Var, aka1Var.a(), (lnm) null, (byte) 15), 3);
                break;
        }
        return rih1Var;
    }
}
