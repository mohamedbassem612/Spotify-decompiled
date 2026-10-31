package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class akw0 extends a8d1 implements vu30 {
    public long a;
    public boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ fc5 d;
    public final /* synthetic */ long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akw0(boolean z, fc5 fc5Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.c = z;
        this.d = fc5Var;
        this.e = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new akw0(this.c, this.d, this.e, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long jNanoTime;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        fc5 fc5Var = this.d;
        if (!z) {
            hm5.M(obj);
            if (!this.c) {
                fc5Var.a.t(0.0f);
                return rih1Var;
            }
            if (this.e <= 0) {
                fc5Var.a.t(0.0f);
                return rih1Var;
            }
            jNanoTime = System.nanoTime();
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jNanoTime = this.a;
            hm5.M(obj);
        }
        long j = jNanoTime;
        while (fc5Var.a.s() < 1.0f) {
            da5 da5Var = new da5(j, this.d, this.e);
            this.a = j;
            this.b = true;
            Object objD = s110.h(getContext()).D(da5Var, this);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
