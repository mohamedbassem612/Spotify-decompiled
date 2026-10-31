package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dm11 extends a8d1 implements vu30 {
    public long a;
    public float b;
    public float c;
    public boolean d;
    public final /* synthetic */ u4p1 e;
    public final /* synthetic */ drr0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dm11(u4p1 u4p1Var, drr0 drr0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = u4p1Var;
        this.f = drr0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new dm11(this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        long j;
        Object objD;
        d9n d9nVar;
        boolean z = this.d;
        if (!z) {
            hm5.M(obj);
            u4p1 u4p1Var = this.e;
            boolean z2 = u4p1Var instanceof pfu0;
            drr0 drr0Var = this.f;
            if (z2) {
                pfu0 pfu0Var = (pfu0) u4p1Var;
                long j2 = pfu0Var.d;
                if (j2 > 0) {
                    long jNanoTime = System.nanoTime();
                    f = pfu0Var.c;
                    f2 = j2;
                    j = jNanoTime;
                } else {
                    drr0Var.t(0.0f);
                }
            } else {
                drr0Var.t(0.0f);
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f3 = this.c;
        float f4 = this.b;
        long j3 = this.a;
        hm5.M(obj);
        f2 = f3;
        f = f4;
        j = j3;
        do {
            bxj bxjVar = new bxj(j, f, f2, this.f);
            this.a = j;
            this.b = f;
            this.c = f2;
            this.d = true;
            objD = s110.h(getContext()).D(bxjVar, this);
            d9nVar = d9n.a;
        } while (objD != d9nVar);
        return d9nVar;
    }
}
