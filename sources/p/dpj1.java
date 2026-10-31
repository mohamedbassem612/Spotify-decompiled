package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class dpj1 extends a8d1 implements vu30 {
    public xgn0 a;
    public gpj1 b;
    public int c;
    public long d;
    public long e;
    public boolean f;
    public final /* synthetic */ gpj1 g;
    public final /* synthetic */ int h;
    public final /* synthetic */ long i;
    public final /* synthetic */ long t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dpj1(gpj1 gpj1Var, int i, long j, long j2, lnm lnmVar) {
        super(2, lnmVar);
        this.g = gpj1Var;
        this.h = i;
        this.i = j;
        this.t = j2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new dpj1(this.g, this.h, this.i, this.t, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        gpj1 gpj1Var;
        int i;
        long j;
        long j2;
        xgn0 xgn0Var;
        boolean z = this.f;
        if (!z) {
            hm5.M(obj);
            gpj1Var = this.g;
            xgn0 xgn0Var2 = gpj1Var.c;
            this.a = xgn0Var2;
            this.b = gpj1Var;
            i = this.h;
            this.c = i;
            j = this.i;
            this.d = j;
            j2 = this.t;
            this.e = j2;
            this.f = true;
            Object objA = xgn0Var2.a(this);
            d9n d9nVar = d9n.a;
            if (objA == d9nVar) {
                return d9nVar;
            }
            xgn0Var = xgn0Var2;
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            long j3 = this.e;
            j = this.d;
            i = this.c;
            gpj1Var = this.b;
            xgn0Var = this.a;
            hm5.M(obj);
            j2 = j3;
        }
        gpj1 gpj1Var2 = gpj1Var;
        long j4 = j;
        int i2 = i;
        try {
            if (!gpj1Var2.f) {
                gpj1Var2.d.add(new apj1(i2, j4, j2));
            }
            return rih1.a;
        } finally {
            xgn0Var.c((Object) null);
        }
    }
}
