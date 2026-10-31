package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nfi0 extends hab0 implements vu30 {
    public final /* synthetic */ lfi0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ short d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public nfi0(lfi0 lfi0Var, boolean z, boolean z2, int i, int i2) {
        super(2);
        this.a = lfi0Var;
        this.b = z;
        this.c = z2;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        fqo1.q(this.a, this.b, this.c, (b0k) obj, czo1.p(this.d | 1), this.e);
        return rih1.a;
    }
}
