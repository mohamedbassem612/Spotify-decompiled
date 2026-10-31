package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rya0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ shg1 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rya0(shg1 shg1Var, iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = shg1Var;
        this.c = iu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        shg1 shg1Var = this.b;
        switch (b) {
            case 0:
                x1c0 x1c0Var = (x1c0) obj;
                String str = x1c0Var.a;
                if (x1c0Var instanceof u1c0) {
                    shg1Var.c(str);
                } else if (x1c0Var instanceof v1c0) {
                    shg1Var.b(str);
                }
                iu30Var.invoke(new gya0(x1c0Var));
                break;
            case 1:
                shg1Var.c("https://support.spotify.com/article/managed-accounts-for-premium-family/plain/");
                iu30Var.invoke(new gya0(u1c0.b));
                break;
            default:
                shg1Var.b("https://www.spotify.com/legal/managed-account-parent-guardian-privacy-policy/plain/");
                iu30Var.invoke(new gya0(w1c0.b));
                break;
        }
        return rih1Var;
    }
}
