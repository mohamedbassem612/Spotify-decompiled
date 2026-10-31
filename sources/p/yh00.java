package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class yh00 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i7d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yh00(i7d i7dVar, byte b) {
        super(1);
        this.a = b;
        this.b = i7dVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        i7d i7dVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return ((ksk0) i7dVar.c).b();
            default:
                g3h1 g3h1Var = new g3h1((ksk0) i7dVar.c);
                h3h1 h3h1Var = new h3h1(new yh00(i7dVar, (byte) 0));
                wch wchVar = q6x.b;
                if (!g3h1Var.equals(wchVar) || !h3h1Var.equals(wchVar)) {
                    if (g3h1Var.equals(wchVar)) {
                        return h3h1Var;
                    }
                    if (h3h1Var.equals(wchVar)) {
                        return g3h1Var;
                    }
                    wchVar = new wch(g3h1Var, h3h1Var);
                }
                return wchVar;
        }
    }
}
