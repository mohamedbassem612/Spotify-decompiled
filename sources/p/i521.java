package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i521 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ r6h1 c;
    public final /* synthetic */ ohd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i521(m021 m021Var, String str, r6h1 r6h1Var, ohd ohdVar, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = r6h1Var;
        this.d = ohdVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ohd ohdVar = this.d;
        String str = this.b;
        boolean z = false;
        r6h1 r6h1Var = this.c;
        switch (b) {
            case 0:
                int iOrdinal = ((p521) obj).ordinal();
                if (iOrdinal == 0) {
                    pvc.m(str, r6h1Var);
                    z = true;
                } else {
                    if (iOrdinal != 1) {
                        eg.o();
                        return null;
                    }
                    pvc.k(r6h1Var);
                }
                ohdVar.resumeWith(Boolean.valueOf(z));
                return rih1Var;
            default:
                int iOrdinal2 = ((p521) obj).ordinal();
                if (iOrdinal2 == 0) {
                    pvc.m(str, r6h1Var);
                    z = true;
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    pvc.k(r6h1Var);
                }
                ohdVar.resumeWith(Boolean.valueOf(z));
                return rih1Var;
        }
    }
}
