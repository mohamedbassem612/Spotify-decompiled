package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m7e1 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r7e1 b;

    public /* synthetic */ m7e1(r7e1 r7e1Var, byte b) {
        this.a = b;
        this.b = r7e1Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        r7e1 r7e1Var = this.b;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                r7e1Var.w(false);
                r7e1Var.x(ree1.a);
                break;
            default:
                if (((n511) obj) == null) {
                    r7e1Var.d.a();
                } else {
                    r7e1Var.d.b();
                }
                break;
        }
        return rih1Var;
    }
}
