package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class zay extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ aby b;
    public final /* synthetic */ long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zay(aby abyVar, long j, byte b) {
        super(1);
        this.a = b;
        this.b = abyVar;
        this.c = j;
    }

    public final Object invoke(Object obj) {
        iu30 iu30Var;
        iu30 iu30Var2;
        iu30 iu30Var3;
        iu30 iu30Var4;
        int iOrdinal;
        byte b = this.a;
        long j = this.c;
        long jC = 0;
        aby abyVar = this.b;
        switch (b) {
            case 0:
                int iOrdinal2 = ((pay) obj).ordinal();
                if (iOrdinal2 == 0) {
                    cfe cfeVar = abyVar.S0.a.c;
                    if (cfeVar != null && (iu30Var = cfeVar.b) != null) {
                        j = ((yr80) iu30Var.invoke(new yr80(j))).a;
                    }
                } else if (iOrdinal2 != 1) {
                    if (iOrdinal2 != 2) {
                        eg.o();
                        return null;
                    }
                    cfe cfeVar2 = abyVar.T0.a.c;
                    if (cfeVar2 != null && (iu30Var2 = cfeVar2.b) != null) {
                        j = ((yr80) iu30Var2.invoke(new yr80(j))).a;
                    }
                }
                return new yr80(j);
            case 1:
                pay payVar = (pay) obj;
                if (payVar == pay.c && abyVar.T0.a.b == null) {
                    jC = abyVar.U0.j;
                } else {
                    eb91 eb91Var = abyVar.S0.a.b;
                    long j2 = (eb91Var == null || (iu30Var4 = eb91Var.a) == null) ? 0L : ((qr80) iu30Var4.invoke(new yr80(j))).a;
                    eb91 eb91Var2 = abyVar.T0.a.b;
                    long j3 = (eb91Var2 == null || (iu30Var3 = eb91Var2.a) == null) ? 0L : ((qr80) iu30Var3.invoke(new yr80(j))).a;
                    int iOrdinal3 = payVar.ordinal();
                    if (iOrdinal3 == 0) {
                        jC = j2;
                    } else if (iOrdinal3 != 1) {
                        if (iOrdinal3 != 2) {
                            eg.o();
                            return null;
                        }
                        jC = j3;
                    }
                }
                return new qr80(jC);
            default:
                pay payVar2 = (pay) obj;
                if (abyVar.Y0 != null && abyVar.H1() != null && !u890.j(abyVar.Y0, abyVar.H1()) && (iOrdinal = payVar2.ordinal()) != 0 && iOrdinal != 1) {
                    if (iOrdinal != 2) {
                        eg.o();
                        return null;
                    }
                    cfe cfeVar3 = abyVar.T0.a.c;
                    if (cfeVar3 != null) {
                        iu30 iu30Var5 = cfeVar3.b;
                        long j4 = this.c;
                        long j5 = ((yr80) iu30Var5.invoke(new yr80(j4))).a;
                        tl3 tl3VarH1 = abyVar.H1();
                        tl3VarH1.getClass();
                        flb0 flb0Var = flb0.a;
                        long jA = tl3VarH1.a(j4, j5, flb0Var);
                        tl3 tl3Var = abyVar.Y0;
                        tl3Var.getClass();
                        jC = qr80.c(jA, tl3Var.a(j4, j5, flb0Var));
                    }
                }
                return new qr80(jC);
        }
    }
}
