package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a4z0 extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ e6d1 c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ qim0 e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a4z0(boolean z, boolean z2, e6d1 e6d1Var, iu30 iu30Var, qim0 qim0Var, int i, int i2) {
        super(2);
        this.a = z;
        this.b = z2;
        this.c = e6d1Var;
        this.d = iu30Var;
        this.e = qim0Var;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        byte b = this.f;
        zho1.x(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP, b);
        return rih1.a;
    }
}
