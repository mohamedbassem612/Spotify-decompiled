package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cfx extends hab0 implements vu30 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cfx(int i, j2i j2iVar, int i2) {
        super(2);
        this.a = i;
        this.b = j2iVar;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(this.c | 1);
        gfx.b(this.a, this.b, (b0k) obj, iP);
        return rih1.a;
    }
}
