package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class axx extends hab0 implements vu30 {
    public final /* synthetic */ b6j0 a;
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ long d;
    public final /* synthetic */ byte e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public axx(b6j0 b6j0Var, float f, long j, long j2, int i) {
        super(2);
        this.a = b6j0Var;
        this.b = f;
        this.c = j;
        this.d = j2;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.a.c(this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1));
        return rih1.a;
    }
}
