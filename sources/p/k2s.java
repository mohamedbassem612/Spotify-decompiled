package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k2s extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ m2s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k2s(m2s m2sVar, byte b) {
        super(2);
        this.a = b;
        this.b = m2sVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        m2s m2sVar = this.b;
        byte b2 = 2;
        switch (b) {
            case 0:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (!x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x340Var2.b0();
                } else {
                    nyx.a(2, (wux) null, apo.r(-1368657297, new j2s(m2sVar, rwq.h((wen0) m2sVar.f.getValue(), x340Var2, 0), b2), x340Var2), x340Var2, 3078, 6);
                }
                break;
            default:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x340Var4.b0();
                } else {
                    ven0 ven0VarH = rwq.h((wen0) m2sVar.f.getValue(), x340Var4, 0);
                    maa maaVar = ((nt70) ven0VarH.getValue()).o;
                    if (maaVar != null) {
                        x340Var4.i0(1262301890);
                        nyx.a(2, (wux) null, apo.r(-738337649, new l2s(m2sVar, maaVar, ven0VarH, b2), x340Var4), x340Var4, 3078, 6);
                        x340Var4.r(false);
                    } else {
                        x340Var4.i0(1262301889);
                        x340Var4.r(false);
                    }
                }
                break;
        }
        return rih1Var;
    }
}
