package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ld6 extends hab0 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ short d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ld6(int i, int i2, j2i j2iVar, qim0 qim0Var, boolean z) {
        super(2);
        this.a = qim0Var;
        this.b = z;
        this.c = j2iVar;
        this.d = i;
        this.e = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        dgo1.a(czo1.p(this.d | 1), this.e, this.c, (b0k) obj, this.a, this.b);
        return rih1.a;
    }
}
