package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pf8 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k1i b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pf8(k1i k1iVar, byte b) {
        super(1);
        this.a = b;
        this.b = k1iVar;
    }

    public final Object invoke(Object obj) {
        njt njtVar;
        pjt pjtVar;
        byte b = this.a;
        k1i k1iVar = this.b;
        switch (b) {
            case 0:
                tv80 tv80Var = (tv80) obj;
                int iOrdinal = ((gp41) k1iVar.e).ordinal();
                if (iOrdinal == 21) {
                    njtVar = njt.a;
                } else {
                    if (iOrdinal != 22) {
                        eg.m("Facebook flow started from unexpected screen");
                        return null;
                    }
                    njtVar = njt.b;
                }
                return new ojt(njtVar, tv80Var);
            default:
                tv80 tv80Var2 = (tv80) obj;
                int iOrdinal2 = ((gp41) k1iVar.e).ordinal();
                if (iOrdinal2 == 21) {
                    pjtVar = pjt.a;
                } else {
                    if (iOrdinal2 != 22) {
                        eg.m("Google flow started from unexpected screen");
                        return null;
                    }
                    pjtVar = pjt.b;
                }
                return new qjt(pjtVar, tv80Var2);
        }
    }
}
