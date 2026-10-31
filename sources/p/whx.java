package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class whx extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ short b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public whx(int i, ven0 ven0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = i;
        this.c = ven0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new whx(this.b, this.c, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.c;
        if (!z) {
            hm5.M(obj);
            if (((ll10) ven0Var.getValue()).a && !((ll10) ven0Var.getValue()).b) {
                long j = this.b;
                this.a = true;
                Object objI = hap1.i(j, this);
                d9n d9nVar = d9n.a;
                if (objI == d9nVar) {
                    return d9nVar;
                }
            }
            return rih1Var;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        hm5.M(obj);
        ven0Var.setValue(ll10.a((ll10) ven0Var.getValue(), false, false, 0.0f, 0.0f, 0, 0L, 62));
        return rih1Var;
    }
}
