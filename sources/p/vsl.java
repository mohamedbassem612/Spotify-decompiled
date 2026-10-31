package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vsl extends hab0 implements vu30 {
    public final /* synthetic */ int X;
    public final /* synthetic */ short Y;
    public final /* synthetic */ dtl a;
    public final /* synthetic */ iuj b;
    public final /* synthetic */ maa c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ float g;
    public final /* synthetic */ p3v h;
    public final /* synthetic */ float i;
    public final /* synthetic */ float t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public vsl(dtl dtlVar, iuj iujVar, maa maaVar, boolean z, qim0 qim0Var, int i, float f, p3v p3vVar, float f2, float f3, int i2, int i3) {
        super(2);
        this.a = dtlVar;
        this.b = iujVar;
        this.c = maaVar;
        this.d = z;
        this.e = qim0Var;
        this.f = i;
        this.g = f;
        this.h = p3vVar;
        this.i = f2;
        this.t = f3;
        this.X = i2;
        this.Y = i3;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ctl.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj, czo1.p(this.X | 1), this.Y);
        return rih1.a;
    }
}
