package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class tpf extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ byte d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public tpf(float f, float f2, boolean z, int i) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.d | 1);
        ouo1.x(this.a, this.b, iP, (b0k) obj, this.c);
        return rih1.a;
    }
}
