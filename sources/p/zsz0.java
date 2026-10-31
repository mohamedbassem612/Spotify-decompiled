package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zsz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ htz0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsz0(htz0 htz0Var, byte b) {
        super(1);
        this.a = b;
        this.b = htz0Var;
    }

    public final Object invoke(Object obj) {
        l0i hsz0Var;
        byte b = this.a;
        htz0 htz0Var = this.b;
        switch (b) {
            case 0:
                return htz0Var.a;
            case 1:
                ((qtr) obj).b(new xcc0(htz0Var, (lnm) null, (byte) 1));
                return rih1.a;
            default:
                ofx ofxVar = htz0Var.b;
                int iC = l1d.C(htz0Var.d);
                if (iC == 0) {
                    hsz0Var = gsz0.a;
                } else {
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                    hsz0Var = new hsz0(false);
                }
                return ofxVar.a(hsz0Var);
        }
    }
}
