package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nv01 extends hab0 implements vu30 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nv01(int i, String str, boolean z, boolean z2, boolean z3) {
        super(2);
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        kyo1.g(this.a, this.b, this.c, this.d, (b0k) obj, czo1.p(this.e | 1));
        return rih1.a;
    }
}
