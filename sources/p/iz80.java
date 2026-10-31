package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class iz80 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ long b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ qim0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz80(String str, long j, boolean z, qim0 qim0Var, int i) {
        super(2);
        this.f = str;
        this.b = j;
        this.c = z;
        this.d = qim0Var;
        this.e = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        Object obj3 = this.f;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                qim0 qim0Var = this.d;
                long j = this.b;
                boolean z = this.c;
                nz80.c(qim0Var, j, z, (j2i) obj3, (b0k) obj, iP);
                break;
            default:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                kbb.c((String) obj3, this.b, this.c, this.d, (b0k) obj, iP2);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iz80(qim0 qim0Var, long j, boolean z, j2i j2iVar, int i) {
        super(2);
        this.d = qim0Var;
        this.b = j;
        this.c = z;
        this.f = j2iVar;
        this.e = i;
    }
}
