package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class p270 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kly0 b;

    public /* synthetic */ p270(kly0 kly0Var, byte b) {
        this.a = b;
        this.b = kly0Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        Object objB;
        byte b = this.a;
        kly0 kly0Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                ((Boolean) obj).booleanValue();
                ((w5b1) kly0Var.get()).g.a();
                return rih1Var;
            default:
                ml8 ml8Var = (nl8) obj;
                if (ml8Var.a()) {
                    return ((ml8Var instanceof ml8 ? ml8Var.a.a() : false) && (objB = ((b7n) kly0Var.get()).b(o6n.a, Boolean.FALSE, lnmVar)) == d9n.a) ? objB : rih1Var;
                }
                return rih1Var;
        }
    }
}
