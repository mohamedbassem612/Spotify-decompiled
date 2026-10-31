package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class axc extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ String b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ short f;
    public final /* synthetic */ byte g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public axc(int i, int i2, int i3, int i4, String str, String str2, qim0 qim0Var) {
        super(2);
        this.a = str;
        this.b = str2;
        this.c = qim0Var;
        this.d = i;
        this.e = i2;
        this.f = i3;
        this.g = i4;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.f | 1);
        byte b = this.g;
        ton1.f(this.d, this.e, iP, b, this.a, this.b, (b0k) obj, this.c);
        return rih1.a;
    }
}
