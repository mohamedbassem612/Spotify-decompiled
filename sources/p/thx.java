package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class thx extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ gbx c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ thx(String str, gbx gbxVar, byte b) {
        super(1);
        this.a = b;
        this.b = str;
        this.c = gbxVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gbx gbxVar = this.c;
        String str = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                if ((str == null || str.length() == 0) && gbxVar == null) {
                    b261.f(e261Var);
                } else {
                    b261.n(e261Var, str != null ? str : "");
                    if (gbxVar != null) {
                        b261.x(e261Var, 0);
                    }
                }
                break;
            case 1:
                e261 e261Var2 = (e261) obj;
                if ((str == null || str.length() == 0) && gbxVar == null) {
                    b261.f(e261Var2);
                } else {
                    b261.n(e261Var2, str != null ? str : "");
                    if (gbxVar != null) {
                        b261.x(e261Var2, 0);
                    }
                }
                break;
            default:
                e261 e261Var3 = (e261) obj;
                b261.n(e261Var3, str);
                b261.x(e261Var3, 0);
                b261.g(e261Var3, gbxVar.c, new n70(gbxVar, (byte) 3));
                break;
        }
        return rih1Var;
    }
}
