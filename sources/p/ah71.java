package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ah71 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ol71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ah71(ol71 ol71Var, byte b) {
        super(1);
        this.a = b;
        this.b = ol71Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ol71 ol71Var = this.b;
        switch (b) {
            case 0:
                if (ol71Var.a) {
                    kj41 kj41Var = ol71Var.b;
                    if (kj41Var != null) {
                        kj41Var.stop();
                    }
                    ol71Var.b = null;
                }
                break;
            default:
                cas casVar = (a7m0) obj;
                casVar.d = da71.f;
                casVar.e = da71.g;
                casVar.a(new ldz0(1, (byte) 26), new ldz0(1, (byte) 27));
                casVar.a = ea71.d;
                casVar.h = new ah71(ol71Var, (byte) 0);
                break;
        }
        return rih1Var;
    }
}
