package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s4t extends hab0 implements vu30 {
    public final /* synthetic */ qim0 a;
    public final /* synthetic */ short b;
    public final /* synthetic */ short c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ short e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [int, short] */
    public s4t(qim0 qim0Var, int i, long j, j2i j2iVar, int i2, int i3) {
        super(2);
        this.a = qim0Var;
        this.b = i;
        this.c = (int) j;
        this.d = j2iVar;
        this.e = i2;
        this.f = i3;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        lap1.b(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1), this.f);
        return rih1.a;
    }
}
