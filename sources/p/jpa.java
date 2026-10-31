package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class jpa extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ opa b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jpa(opa opaVar, long j, byte b) {
        super(1);
        this.a = b;
        this.b = opaVar;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        long j = this.c;
        opa opaVar = this.b;
        switch (b) {
            case 0:
                ppa ppaVar = (ppa) opaVar.h.get(Long.valueOf(j));
                if (ppaVar != null) {
                    ppaVar.b((long) (0.0f * 100.0f), j);
                }
                break;
            case 1:
                cga cgaVar = (cga) obj;
                ppa ppaVar2 = (ppa) opaVar.h.get(Long.valueOf(j));
                if (ppaVar2 != null) {
                    ppaVar2.i(cgaVar);
                }
                break;
            case 2:
                float fFloatValue = ((Number) obj).floatValue();
                ppa ppaVar3 = (ppa) opaVar.h.get(Long.valueOf(j));
                if (ppaVar3 != null) {
                    ppaVar3.b((long) (fFloatValue * 100.0f), j);
                }
                break;
            default:
                kgg1 kgg1Var = (kgg1) obj;
                c8g1 c8g1Var = (c8g1) opaVar.i.get(Long.valueOf(j));
                if (c8g1Var != null) {
                    c8g1Var.a.set(kgg1Var);
                }
                break;
        }
        return rih1Var;
    }
}
