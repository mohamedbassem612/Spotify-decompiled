package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ssh extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j2i b;
    public final /* synthetic */ j2i c;
    public final /* synthetic */ j2i d;
    public final /* synthetic */ qim0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ssh(j2i j2iVar, j2i j2iVar2, j2i j2iVar3, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j2iVar;
        this.c = j2iVar2;
        this.d = j2iVar3;
        this.e = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                bth.b(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(3073));
                break;
            default:
                ((Number) obj2).intValue();
                j0o1.f(this.b, this.c, this.d, this.e, (b0k) obj, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
