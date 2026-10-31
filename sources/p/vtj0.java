package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vtj0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q811 b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vtj0(q811 q811Var, boolean z, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = q811Var;
        this.c = z;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new vtj0(this.b, this.c, lnmVar, (byte) 0);
            default:
                return new vtj0(this.b, this.c, lnmVar, (byte) 1);
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
        boolean z = this.c;
        q811 q811Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                q811Var.a = Boolean.valueOf(z);
                break;
            default:
                hm5.M(obj);
                q811Var.a = Boolean.valueOf(z);
                break;
        }
        return rih1Var;
    }
}
