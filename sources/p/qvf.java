package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qvf extends hab0 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ qim0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ float d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ byte f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qvf(boolean z, qim0 qim0Var, float f, float f2, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = z;
        this.b = qim0Var;
        this.c = f;
        this.d = f2;
        this.e = j2iVar;
        this.f = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(24577);
        byte b = this.f;
        cyo1.a(this.a, this.b, this.c, this.d, this.e, (b0k) obj, iP, b);
        return rih1.a;
    }
}
