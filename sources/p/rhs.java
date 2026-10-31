package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rhs extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ uhs c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhs(uhs uhsVar, iu30 iu30Var) {
        super(1);
        this.c = uhsVar;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        uhs uhsVar = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                j4w0 j4w0Var = uhsVar.X;
                if (j4w0Var == null) {
                    u890.C("headerModel");
                    throw null;
                }
                i4w0 i4w0Var = j4w0Var.a;
                h4w0 h4w0Var = i4w0Var instanceof h4w0 ? (h4w0) i4w0Var : null;
                if (h4w0Var != null) {
                    String str = ((k4w0) h4w0Var.a.get(0)).b;
                    j4w0 j4w0Var2 = uhsVar.X;
                    if (j4w0Var2 == null) {
                        u890.C("headerModel");
                        throw null;
                    }
                    iu30Var.invoke(new y3w0(str, j4w0Var2.h.a));
                }
                return rih1Var;
            default:
                j4w0 j4w0Var3 = uhsVar.X;
                if (j4w0Var3 != null) {
                    iu30Var.invoke(new b4w0(j4w0Var3.e));
                    return rih1Var;
                }
                u890.C("headerModel");
                throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rhs(iu30 iu30Var, uhs uhsVar) {
        super(1);
        this.b = iu30Var;
        this.c = uhsVar;
    }
}
