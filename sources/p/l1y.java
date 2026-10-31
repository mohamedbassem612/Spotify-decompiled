package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class l1y extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rpu b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1y(rpu rpuVar, byte b) {
        super(3);
        this.a = b;
        this.b = rpuVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i;
        int i2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        rpu rpuVar = this.b;
        switch (b) {
            case 0:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                int iOrdinal = rpuVar.ordinal();
                if (iOrdinal == 0) {
                    i = 2131954117;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    i = 2131954115;
                }
                uwo1.e(cwl1.o0(b0kVar, i), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar, 0, 0, 2046);
                return rih1Var;
            default:
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                int iOrdinal2 = rpuVar.ordinal();
                if (iOrdinal2 == 0) {
                    i2 = 2131954118;
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    i2 = 2131954116;
                }
                uwo1.e(cwl1.o0(b0kVar2, i2), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2046);
                return rih1Var;
        }
    }
}
