package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ch81 extends a8d1 implements vu30 {
    public static final /* synthetic */ mma0[] c = {new den0(lyc.NO_RECEIVER, fh81.class, "isFocused", "<v#0>", 0)};
    public boolean a;
    public final /* synthetic */ fh81 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ch81(fh81 fh81Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = fh81Var;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new ch81(this.b, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((ch81) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Boolean boolM = yah0.m(false);
            fh81 fh81Var = this.b;
            bh81 bh81Var = new bh81(boolM, fh81Var);
            mr20 mr20Var = fh81Var.t1;
            cff cffVar = new cff(bh81Var, (byte) 21);
            this.a = true;
            Object objCollect = mr20Var.collect(cffVar, this);
            d9n d9nVar = d9n.a;
            if (objCollect == d9nVar) {
                return d9nVar;
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
