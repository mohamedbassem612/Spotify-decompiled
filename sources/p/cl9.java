package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cl9 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ lp9 b;
    public /* synthetic */ xq9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cl9(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 3;
        lp9 lp9Var = (lp9) obj;
        xq9 xq9Var = (xq9) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                cl9 cl9Var = new cl9(i, lnmVar, (byte) 0);
                cl9Var.b = lp9Var;
                cl9Var.c = xq9Var;
                return cl9Var.invokeSuspend(rih1Var);
            default:
                cl9 cl9Var2 = new cl9(i, lnmVar, (byte) 1);
                cl9Var2.b = lp9Var;
                cl9Var2.c = xq9Var;
                return cl9Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                lp9 lp9Var = this.b;
                xq9 xq9Var = this.c;
                hm5.M(obj);
                return new jl9(xq9Var.a, lp9Var instanceof jp9 ? (jp9) lp9Var : null, xq9Var.b, xq9Var.c);
            default:
                lp9 lp9Var2 = this.b;
                xq9 xq9Var2 = this.c;
                hm5.M(obj);
                return new jl9(xq9Var2.a, lp9Var2 instanceof jp9 ? (jp9) lp9Var2 : null, xq9Var2.b, xq9Var2.c);
        }
    }
}
