package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class hn01 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nhe0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hn01(nhe0 nhe0Var, byte b) {
        super(1);
        this.a = b;
        this.b = nhe0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        boolean z = false;
        nhe0 nhe0Var = this.b;
        switch (b) {
            case 0:
                nhe0 nhe0Var2 = (nhe0) obj;
                bma1 bma1Var = jn01.a;
                if (u890.j(nhe0Var2.a, nhe0Var.a) && u890.j(nhe0Var2.c, nhe0Var.c)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                nhe0 nhe0Var3 = (nhe0) obj;
                bma1 bma1Var2 = jn01.a;
                if (u890.j(nhe0Var3.a, nhe0Var.a) && u890.j(nhe0Var3.c, nhe0Var.c)) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
