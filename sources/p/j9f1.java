package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class j9f1 extends hab0 implements vu30 {
    public final /* synthetic */ yj41 a;
    public final /* synthetic */ vnr0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ float d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ qim0 g;
    public final /* synthetic */ byte h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j9f1(yj41 yj41Var, vnr0 vnr0Var, int i, float f, boolean z, boolean z2, qim0 qim0Var, int i2, int i3) {
        super(2);
        this.a = yj41Var;
        this.b = vnr0Var;
        this.c = i;
        this.d = f;
        this.e = z;
        this.f = z2;
        this.g = qim0Var;
        this.h = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(65);
        byte b = this.h;
        yto.e(this.a, this.b, this.c, this.d, this.e, this.f, this.g, (b0k) obj, iP, b);
        return rih1.a;
    }
}
