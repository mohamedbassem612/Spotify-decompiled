package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ts51 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ qim0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ts51(long j, long j2, qim0 qim0Var, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.c = j2;
        this.d = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                qim0 qim0Var = this.d;
                int iP = czo1.p(1);
                ft51.a(this.b, this.c, qim0Var, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                qim0 qim0Var2 = this.d;
                int iP2 = czo1.p(1);
                upo1.a(this.b, this.c, qim0Var2, (b0k) obj, iP2);
                break;
            default:
                ((Number) obj2).intValue();
                qim0 qim0Var3 = this.d;
                int iP3 = czo1.p(1);
                i3p1.j(this.b, this.c, qim0Var3, (b0k) obj, iP3);
                break;
        }
        return rih1Var;
    }
}
