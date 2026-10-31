package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kz0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz0(byte b, long j, long j2) {
        super(2);
        this.a = b;
        this.b = j;
        this.c = j2;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        long j = this.c;
        long j2 = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                long j3 = this.c;
                int iP = czo1.p(7);
                q3p1.e(this.b, j3, (b0k) obj, iP);
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                long j4 = this.c;
                int iP2 = czo1.p(7);
                qhf.b(this.b, j4, (b0k) obj, iP2);
                return rih1Var;
            case 2:
                int iOrdinal = ((vux) obj2).ordinal();
                if (iOrdinal == 0) {
                    j = j2;
                } else if (iOrdinal != 1 && iOrdinal != 2) {
                    eg.o();
                    return null;
                }
                return new u7h(j);
            case 3:
                int iOrdinal2 = ((vux) obj2).ordinal();
                if (iOrdinal2 == 0) {
                    j = j2;
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    j = j2;
                }
                return new u7h(j);
            case 4:
                ((Number) obj2).intValue();
                long j5 = this.c;
                int iP3 = czo1.p(1);
                zr7.b(this.b, j5, (b0k) obj, iP3);
                return rih1Var;
            default:
                ((Number) obj2).intValue();
                long j6 = this.c;
                int iP4 = czo1.p(1);
                zr7.f(this.b, j6, (b0k) obj, iP4);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kz0(long j, long j2, int i, byte b) {
        super(2);
        this.a = b;
        this.b = j;
        this.c = j2;
    }
}
