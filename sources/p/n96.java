package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class n96 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ ven0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n96(String str, ven0 ven0Var, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = ven0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        ven0 ven0Var = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                ((iu30) ven0Var.getValue()).invoke(str + ((af5) obj).b);
                return Boolean.TRUE;
            default:
                e261 e261Var = (e261) obj;
                if (str != null && ((c8e1) ven0Var.getValue()).a.b.length() == 0) {
                    b261.n(e261Var, str);
                }
                return rih1.a;
        }
    }
}
