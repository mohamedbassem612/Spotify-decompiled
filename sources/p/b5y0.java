package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class b5y0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i5y0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b5y0(i5y0 i5y0Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = i5y0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        i5y0 i5y0Var = this.b;
        switch (b) {
            case 0:
                return new b5y0(i5y0Var, lnmVar, (byte) 0);
            default:
                return new b5y0(i5y0Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(vr20Var, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(vr20Var, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        i5y0 i5y0Var = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                i5y0Var.i();
                break;
            default:
                hm5.M(obj);
                i5y0Var.i();
                break;
        }
        return rih1Var;
    }
}
