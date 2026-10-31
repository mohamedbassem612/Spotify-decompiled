package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i9l1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ven0 b;

    public /* synthetic */ i9l1(ven0 ven0Var, byte b) {
        this.a = b;
        this.b = ven0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ven0 ven0Var = this.b;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.TRUE);
                break;
            case 1:
                Boolean bool = (Boolean) obj;
                bool.getClass();
                ven0Var.setValue(bool);
                break;
            default:
                ((iu30) ven0Var.getValue()).invoke(new Integer(((Number) obj).intValue()));
                break;
        }
        return rih1Var;
    }
}
