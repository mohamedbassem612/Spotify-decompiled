package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kq2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ j2i e;
    public final /* synthetic */ int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kq2(qim0 qim0Var, boolean z, boolean z2, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 0;
        this.d = qim0Var;
        this.b = z;
        this.c = z2;
        this.e = j2iVar;
        this.f = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                oq2.a(czo1.p(i | 1), this.e, (b0k) obj, this.d, this.b, this.c);
                break;
            case 1:
                ((Number) obj2).intValue();
                lc60.c(czo1.p(i | 1), this.e, (b0k) obj, this.d, this.b, this.c);
                break;
            default:
                ((Number) obj2).intValue();
                eqr0.j(czo1.p(i | 1), this.e, (b0k) obj, this.d, this.b, this.c);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kq2(boolean z, boolean z2, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = z;
        this.c = z2;
        this.d = qim0Var;
        this.e = j2iVar;
        this.f = i;
    }
}
