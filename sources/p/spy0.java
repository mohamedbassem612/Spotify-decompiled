package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class spy0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ upy0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ spy0(upy0 upy0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = upy0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        upy0 upy0Var = this.c;
        switch (b) {
            case 0:
                spy0 spy0Var = new spy0(upy0Var, lnmVar, (byte) 0);
                spy0Var.b = obj;
                return spy0Var;
            default:
                spy0 spy0Var2 = new spy0(upy0Var, lnmVar, (byte) 1);
                spy0Var2.b = obj;
                return spy0Var2;
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
        upy0 upy0Var = this.c;
        c9n c9nVar = (c9n) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                fn31.T(c9nVar, (o8n) null, 0, new kdt0(upy0Var, (lnm) null, (byte) 7), 3);
                fn31.T(c9nVar, (o8n) null, 0, new rpy0(upy0Var, null, (byte) 0), 3);
                fn31.T(c9nVar, (o8n) null, 0, new rpy0(upy0Var, null, (byte) 1), 3);
                fn31.T(c9nVar, (o8n) null, 0, new rpy0(upy0Var, null, (byte) 2), 3);
                fn31.T(c9nVar, (o8n) null, 0, new rpy0(upy0Var, null, (byte) 3), 3);
                fn31.T(c9nVar, (o8n) null, 0, new rpy0(upy0Var, null, (byte) 4), 3);
                return fn31.T(c9nVar, (o8n) null, 0, new rpy0(upy0Var, null, (byte) 5), 3);
            default:
                hm5.M(obj);
                return fn31.T(c9nVar, (o8n) null, 0, new rpy0(upy0Var, null, (byte) 6), 3);
        }
    }
}
