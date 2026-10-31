package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class efx0 extends a8d1 implements vu30 {
    public long a;
    public float b;
    public float c;
    public boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ drr0 h;
    public final /* synthetic */ float i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public efx0(boolean z, long j, long j2, drr0 drr0Var, float f, lnm lnmVar) {
        super(2, lnmVar);
        this.e = z;
        this.f = j;
        this.g = j2;
        this.h = drr0Var;
        this.i = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new efx0(this.e, this.f, this.g, this.h, this.i, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        float f;
        float f2;
        long jNanoTime;
        boolean z = this.d;
        drr0 drr0Var = this.h;
        if (!z) {
            hm5.M(obj);
            boolean z2 = this.e;
            long j = this.g;
            if (z2) {
                long j2 = this.f;
                if (j2 > 0) {
                    float f3 = j;
                    drr0Var.t(f3);
                    float f4 = j2;
                    f = f3;
                    f2 = f4;
                    jNanoTime = System.nanoTime();
                }
                return rih1.a;
            }
            drr0Var.t(j);
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f5 = this.c;
        float f6 = this.b;
        jNanoTime = this.a;
        hm5.M(obj);
        f2 = f5;
        f = f6;
        while (drr0Var.s() < f2) {
            dfx0 dfx0Var = new dfx0(jNanoTime, this.i, f, f2, drr0Var);
            this.a = jNanoTime;
            this.b = f;
            this.c = f2;
            this.d = true;
            Object objD = s110.h(getContext()).D(dfx0Var, this);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
