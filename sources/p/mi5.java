package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class mi5 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ b8f1 b;

    public /* synthetic */ mi5(b8f1 b8f1Var, byte b) {
        this.a = b;
        this.b = b8f1Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b8f1 b8f1Var = this.b;
        switch (b) {
            case 0:
                b8f1Var.a = -(((int) (((yr80) obj).a & 4294967295L)) - b8f1Var.c.s());
                break;
            default:
                b8f1Var.b(((Number) ((de5) obj).e.getValue()).floatValue());
                break;
        }
        return rih1Var;
    }
}
