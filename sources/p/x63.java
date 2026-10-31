package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class x63 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g23 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x63(g23 g23Var, byte b) {
        super(1);
        this.a = b;
        this.b = g23Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        g23 g23Var = this.b;
        switch (b) {
            case 0:
                int iOrdinal = ((b73) obj).ordinal();
                if (iOrdinal == 0) {
                    return new q63(((yqg) g23Var.c).b());
                }
                if (iOrdinal == 1) {
                    return o63.a;
                }
                if (iOrdinal == 2) {
                    return p63.a;
                }
                eg.o();
                return null;
            default:
                pp ppVar = (pp) g23Var.b;
                di4 di4Var = (di4) g23Var.d;
                boolean zC = di4Var.c();
                boolean zT = di4Var.t();
                wfx wfxVar = ppVar.b;
                return new xer(wfxVar.b, wfxVar.a, zC, zT);
        }
    }
}
