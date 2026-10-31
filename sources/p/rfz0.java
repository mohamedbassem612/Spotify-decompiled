package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rfz0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rfz0(int i, String str, byte b) {
        super(1);
        this.a = b;
        this.b = i;
        this.c = str;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        int i = 2;
        int i2 = this.b;
        switch (b) {
            case 0:
                agz0 agz0Var = (agz0) obj;
                int iC = l1d.C(i2);
                if (iC != 0) {
                    i = 1;
                    if (iC != 1) {
                        eg.o();
                        return null;
                    }
                }
                agz0Var.y(new vfz0(i, str));
                return rih1Var;
            default:
                e261 e261Var = (e261) obj;
                if (i2 != 2) {
                    return rih1Var;
                }
                b261.a(e261Var);
                if (str != null) {
                    b261.A(e261Var, str);
                    return rih1Var;
                }
                eg.m("Required value was null.");
                return null;
        }
    }
}
