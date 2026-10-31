package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j8i0 extends a8d1 implements vu30 {
    public long a;
    public float b;
    public boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ long e;
    public final /* synthetic */ ven0 f;
    public final /* synthetic */ drr0 g;
    public final /* synthetic */ float h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8i0(boolean z, long j, ven0 ven0Var, drr0 drr0Var, float f, lnm lnmVar) {
        super(2, lnmVar);
        this.d = z;
        this.e = j;
        this.f = ven0Var;
        this.g = drr0Var;
        this.h = f;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new j8i0(this.d, this.e, this.f, this.g, this.h, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        long jNanoTime;
        float fFloatValue;
        boolean z = this.c;
        drr0 drr0Var = this.g;
        if (!z) {
            hm5.M(obj);
            boolean z2 = this.d;
            ven0 ven0Var = this.f;
            if (!z2 || this.e <= 0) {
                drr0Var.t(((Number) ven0Var.getValue()).floatValue());
            } else {
                drr0Var.t(((Number) ven0Var.getValue()).floatValue());
                jNanoTime = System.nanoTime();
                fFloatValue = ((Number) ven0Var.getValue()).floatValue();
            }
            return rih1.a;
        }
        if (!z) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        float f = this.b;
        jNanoTime = this.a;
        hm5.M(obj);
        fFloatValue = f;
        long j = jNanoTime;
        while (drr0Var.s() < 1.0f) {
            i8i0 i8i0Var = new i8i0(j, this.h, this.e, fFloatValue, this.g);
            this.a = j;
            this.b = fFloatValue;
            this.c = true;
            Object objD = s110.h(getContext()).D(i8i0Var, this);
            d9n d9nVar = d9n.a;
            if (objD == d9nVar) {
                return d9nVar;
            }
        }
        return rih1.a;
    }
}
