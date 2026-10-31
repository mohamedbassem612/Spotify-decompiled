package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bc40 extends hab0 implements iu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc40(int i, String str, iu30 iu30Var) {
        super(1);
        this.c = i;
        this.b = str;
        this.d = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        iu30 iu30Var = this.d;
        String str = this.b;
        switch (b) {
            case 0:
                if (!((Boolean) obj).booleanValue()) {
                    iu30Var.invoke(new lb40(i, str));
                } else {
                    iu30Var.invoke(new qb40(i, str));
                }
                break;
            case 1:
                e261 e261Var = (e261) obj;
                b261.n(e261Var, str);
                b261.A(e261Var, str);
                b261.w(e261Var, new vfx0(i, new jsg(0.0f, 5.0f), 4));
                b261.v(e261Var, new ppv0(iu30Var, (byte) 26));
                break;
            default:
                e261 e261Var2 = (e261) obj;
                b261.x(e261Var2, 0);
                b261.g(e261Var2, str, new ck0(iu30Var, i, (byte) 22));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc40(String str, int i, iu30 iu30Var) {
        super(1);
        this.b = str;
        this.c = i;
        this.d = iu30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bc40(String str, iu30 iu30Var, int i) {
        super(1);
        this.b = str;
        this.d = iu30Var;
        this.c = i;
    }
}
