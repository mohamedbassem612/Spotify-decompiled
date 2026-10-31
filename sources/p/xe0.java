package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class xe0 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ float b;
    public final /* synthetic */ float c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xe0(String str, float f, float f2, boolean z, float f3, int i) {
        super(2);
        this.a = str;
        this.b = f;
        this.c = f2;
        this.d = z;
        this.e = f3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        ye0.f(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP);
        return rih1.a;
    }
}
