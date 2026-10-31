package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zf6 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf6(float f, float f2, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.a = f;
        this.b = f2;
        this.c = z;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(1);
        zgo1.a(this.a, this.b, this.c, this.d, (b0k) obj, iP);
        return rih1.a;
    }
}
