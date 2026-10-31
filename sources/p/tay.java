package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tay extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bby b;
    public final /* synthetic */ ln00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tay(bby bbyVar, ln00 ln00Var, byte b) {
        super(1);
        this.a = b;
        this.b = bbyVar;
        this.c = ln00Var;
    }

    public final Object invoke(Object obj) {
        ni20 ni20Var;
        ni20 ni20Var2;
        ni20 ni20Var3;
        ni20 ni20Var4;
        byte b = this.a;
        ln00 ln00Var = this.c;
        pay payVar = pay.c;
        bby bbyVar = this.b;
        pay payVar2 = pay.b;
        pay payVar3 = pay.a;
        switch (b) {
            case 0:
                dhg1 dhg1Var = (dhg1) obj;
                if (dhg1Var.f(payVar3, payVar2)) {
                    qg10 qg10Var = bbyVar.a.a;
                    return (qg10Var == null || (ni20Var2 = qg10Var.b) == null) ? xay.b : ni20Var2;
                }
                if (!dhg1Var.f(payVar2, payVar)) {
                    return xay.b;
                }
                qg10 qg10Var2 = ln00Var.a.a;
                return (qg10Var2 == null || (ni20Var = qg10Var2.b) == null) ? xay.b : ni20Var;
            default:
                dhg1 dhg1Var2 = (dhg1) obj;
                if (dhg1Var2.f(payVar3, payVar2)) {
                    eg41 eg41Var = bbyVar.a.d;
                    return (eg41Var == null || (ni20Var4 = eg41Var.c) == null) ? xay.b : ni20Var4;
                }
                if (!dhg1Var2.f(payVar2, payVar)) {
                    return xay.b;
                }
                eg41 eg41Var2 = ln00Var.a.d;
                return (eg41Var2 == null || (ni20Var3 = eg41Var2.c) == null) ? xay.b : ni20Var3;
        }
    }
}
