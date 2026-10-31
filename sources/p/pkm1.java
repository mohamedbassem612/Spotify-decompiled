package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class pkm1 extends hab0 implements vu30 {
    public final /* synthetic */ b180 a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ short d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public pkm1(b180 b180Var, qim0 qim0Var, String str, int i, int i2) {
        super(2);
        this.a = b180Var;
        this.b = qim0Var;
        this.c = str;
        this.d = i;
        this.e = i2;
    }

    @Override // p.vu30
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        upn1.a(this.a, this.b, this.c, (b0k) obj, czo1.p(this.d | 1), this.e);
        return rih1.a;
    }
}
