package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zsl extends hab0 implements vu30 {
    public final /* synthetic */ dtl a;
    public final /* synthetic */ maa b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ byte e;
    public final /* synthetic */ float f;
    public final /* synthetic */ p3v g;
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public zsl(dtl dtlVar, maa maaVar, float f, float f2, int i, float f3, p3v p3vVar, int i2) {
        super(2);
        this.a = dtlVar;
        this.b = maaVar;
        this.c = f;
        this.d = f2;
        this.e = i;
        this.f = f3;
        this.g = p3vVar;
        this.h = i2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ctl.b(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, czo1.p(this.h | 1));
        return rih1.a;
    }
}
