package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class epr0 extends hab0 implements vu30 {
    public final /* synthetic */ byte X;
    public final /* synthetic */ i2c a;
    public final /* synthetic */ af5 b;
    public final /* synthetic */ vnr0 c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ phc1 e;
    public final /* synthetic */ a0e1 f;
    public final /* synthetic */ byte g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ int t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public epr0(i2c i2cVar, af5 af5Var, vnr0 vnr0Var, qim0 qim0Var, phc1 phc1Var, a0e1 a0e1Var, int i, boolean z, iu30 iu30Var, int i2, int i3) {
        super(2);
        this.a = i2cVar;
        this.b = af5Var;
        this.c = vnr0Var;
        this.d = qim0Var;
        this.e = phc1Var;
        this.f = a0e1Var;
        this.g = i;
        this.h = z;
        this.i = iu30Var;
        this.t = i2;
        this.X = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        wgo1.n(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, (b0k) obj, czo1.p(this.t | 1), this.X);
        return rih1.a;
    }
}
