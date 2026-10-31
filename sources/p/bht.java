package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class bht implements iu30 {
    public final /* synthetic */ byte a;
    public final cht b;

    public /* synthetic */ bht(cht chtVar, byte b) {
        this.a = b;
        this.b = chtVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        cht chtVar = this.b;
        switch (b) {
            case 0:
                e1h1 e1h1Var = (e1h1) obj;
                if (e1h1Var.c()) {
                    return "*";
                }
                String strU = chtVar.U(e1h1Var.b());
                if (e1h1Var.a() == 1) {
                    return strU;
                }
                return xcg1.q(e1h1Var.a()) + ' ' + strU;
            default:
                a8b0 a8b0Var = (a8b0) obj;
                a8b0Var.getClass();
                return chtVar.U(a8b0Var);
        }
    }
}
