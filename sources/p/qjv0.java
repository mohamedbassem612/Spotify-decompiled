package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qjv0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ziv0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qjv0(ziv0 ziv0Var, byte b) {
        super(1);
        this.a = b;
        this.b = ziv0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ziv0 ziv0Var = this.b;
        switch (b) {
            case 0:
                e261 e261Var = (e261) obj;
                String str = ziv0Var.c;
                if (str != null) {
                    b261.A(e261Var, str);
                }
                break;
            default:
                e261 e261Var2 = (e261) obj;
                String str2 = ziv0Var.c;
                if (str2 != null) {
                    b261.A(e261Var2, str2);
                }
                break;
        }
        return rih1Var;
    }
}
