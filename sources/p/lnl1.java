package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lnl1 extends a8d1 implements vu30 {
    public boolean a;
    public final /* synthetic */ o95 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ tr80 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lnl1(o95 o95Var, int i, tr80 tr80Var, int i2, lnm lnmVar) {
        super(2, lnmVar);
        this.b = o95Var;
        this.c = i;
        this.d = tr80Var;
        this.e = i2;
    }

    @Override // p.faa
    public final lnm create(Object obj, lnm lnmVar) {
        return new lnl1(this.b, this.c, this.d, this.e, lnmVar);
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        return ((lnl1) create((c9n) obj, (lnm) obj2)).invokeSuspend(rih1.a);
    }

    @Override // p.faa
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            Float fO = yah0.o((this.c - this.d.a) / this.e);
            this.a = true;
            Object objG = this.b.g(fO, this);
            d9n d9nVar = d9n.a;
            if (objG == d9nVar) {
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
