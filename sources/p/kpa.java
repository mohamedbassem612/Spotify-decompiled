package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kpa extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ opa b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kpa(opa opaVar, long j, byte b) {
        super(2);
        this.a = b;
        this.b = opaVar;
        this.c = j;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        opa opaVar = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj).intValue();
                w7g1 w7g1Var = (w7g1) obj2;
                ppa ppaVar = (ppa) opaVar.h.get(Long.valueOf(j));
                if (ppaVar != null) {
                    ppaVar.h(iIntValue, w7g1Var);
                }
                break;
            default:
                int iIntValue2 = ((Number) obj).intValue();
                int iIntValue3 = ((Number) obj2).intValue();
                ppa ppaVar2 = (ppa) opaVar.h.get(Long.valueOf(j));
                if (ppaVar2 != null) {
                    ppaVar2.e(iIntValue2, iIntValue3);
                }
                break;
        }
        return rih1Var;
    }
}
