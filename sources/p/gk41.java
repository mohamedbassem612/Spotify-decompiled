package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class gk41 extends hab0 implements vu30 {
    public final /* synthetic */ iec a;
    public final /* synthetic */ short b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ djc0 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public gk41(iec iecVar, int i, boolean z, boolean z2, qim0 qim0Var, djc0 djc0Var, int i2, int i3) {
        super(2);
        this.a = iecVar;
        this.b = i;
        this.c = z;
        this.d = z2;
        this.e = qim0Var;
        this.f = djc0Var;
        this.g = i2;
        this.h = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        don1.i(this.a, this.b, this.c, this.d, this.e, this.f, (b0k) obj, czo1.p(this.g | 1), this.h);
        return rih1.a;
    }
}
