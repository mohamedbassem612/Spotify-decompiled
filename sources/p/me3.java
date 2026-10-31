package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class me3 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 2;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me3(long j, boolean z) {
        super(2);
        this.c = j;
        this.b = z;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.c;
        boolean z = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                c680.p(czo1.p(1), j, (b0k) obj, z);
                break;
            case 1:
                ((Number) obj2).intValue();
                qqu.b(czo1.p(1), j, (b0k) obj, z);
                break;
            default:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    itx itxVar = itx.c;
                    uwr uwrVar = cbx.a;
                    w0h1.a(itxVar, new jsl(cwl1.o0(x340Var2, 2131958310)), u291.r(nim0.a, 16.0f), this.c, cbx.a(x340Var2).b.a, this.b, x340Var2, itx.d, 0);
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me3(long j, boolean z, int i) {
        super(2);
        this.c = j;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me3(boolean z, long j, int i) {
        super(2);
        this.b = z;
        this.c = j;
    }
}
