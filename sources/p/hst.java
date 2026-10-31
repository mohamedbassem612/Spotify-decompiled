package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hst extends hab0 implements vu30 {
    public final /* synthetic */ lqc a;
    public final /* synthetic */ tst b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public hst(lqc lqcVar, tst tstVar, iu30 iu30Var, boolean z, qim0 qim0Var, float f, int i, int i2) {
        super(2);
        this.a = lqcVar;
        this.b = tstVar;
        this.c = iu30Var;
        this.d = z;
        this.e = qim0Var;
        this.f = f;
        this.g = i;
        this.h = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        lqc.o(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
