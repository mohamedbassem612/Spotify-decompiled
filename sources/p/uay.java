package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uay extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bby b;
    public final /* synthetic */ ln00 c;
    public final /* synthetic */ ft71 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uay(bby bbyVar, ln00 ln00Var, ft71 ft71Var, byte b) {
        super(1);
        this.a = b;
        this.b = bbyVar;
        this.c = ln00Var;
        this.d = ft71Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        bby bbyVar = this.b;
        ft71 ft71Var = this.d;
        ln00 ln00Var = this.c;
        float f = 1.0f;
        switch (b) {
            case 0:
                int iOrdinal = ((pay) obj).ordinal();
                if (iOrdinal == 0) {
                    qg10 qg10Var = bbyVar.a.a;
                    if (qg10Var != null) {
                        f = qg10Var.a;
                    }
                } else if (iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    qg10 qg10Var2 = ln00Var.a.a;
                    f = qg10Var2 != null ? qg10Var2.a : ft71Var.g;
                }
                return Float.valueOf(f);
            default:
                int iOrdinal2 = ((pay) obj).ordinal();
                if (iOrdinal2 == 0) {
                    eg41 eg41Var = bbyVar.a.d;
                    if (eg41Var != null) {
                        f = eg41Var.a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    eg41 eg41Var2 = ln00Var.a.d;
                    f = eg41Var2 != null ? eg41Var2.a : ft71Var.h;
                }
                return Float.valueOf(f);
        }
    }
}
