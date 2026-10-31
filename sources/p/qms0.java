package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class qms0 extends hab0 implements vu30 {
    public final /* synthetic */ long a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ boolean c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public qms0(long j, j2i j2iVar, int i, int i2) {
        super(2);
        this.a = j;
        this.b = j2iVar;
        this.c = i2;
    }

    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int iP = czo1.p(49);
        boolean z = this.c;
        tro1.e(this.a, this.b, (b0k) obj, iP, z ? 1 : 0);
        return rih1.a;
    }
}
