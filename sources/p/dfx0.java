package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class dfx0 extends hab0 implements iu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ drr0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dfx0(long j, float f, float f2, float f3, drr0 drr0Var) {
        super(1);
        this.a = j;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = drr0Var;
    }

    public final Object invoke(Object obj) {
        float fLongValue = (((((Number) obj).longValue() - this.a) / 1000000.0f) * this.b) + this.c;
        float f = this.d;
        if (fLongValue > f) {
            fLongValue = f;
        }
        this.e.t(fLongValue);
        return rih1.a;
    }
}
