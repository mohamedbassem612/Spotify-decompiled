package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class dq00 extends hab0 implements vu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ int b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq00(float f, int i, j2i j2iVar, int i2) {
        super(2);
        this.a = f;
        this.b = i;
        this.c = j2iVar;
        this.d = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.d | 1);
        gho1.b(this.a, this.b, this.c, (b0k) obj, iP);
        return rih1.a;
    }
}
