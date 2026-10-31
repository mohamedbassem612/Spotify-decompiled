package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class e3e implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ s24 b;

    public /* synthetic */ e3e(s24 s24Var, byte b) {
        this.a = b;
        this.b = s24Var;
    }

    public final Object emit(Object obj, lnm lnmVar) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        s24 s24Var = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                s24Var.l0();
                break;
            default:
                pr31 pr31Var = (pr31) obj;
                String str = pr31Var.a;
                if (((pr31) s24Var.Y) == null) {
                    s24Var.Y = pr31Var;
                }
                s24Var.l0();
                break;
        }
        return rih1Var;
    }
}
