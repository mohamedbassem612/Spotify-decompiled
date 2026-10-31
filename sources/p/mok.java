package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mok extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ fbh0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mok(iu30 iu30Var, fbh0 fbh0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = fbh0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fbh0 fbh0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new lnk(fbh0Var.a));
                break;
            case 1:
                iu30Var.invoke(new qnk(fbh0Var.d));
                break;
            case 2:
                iu30Var.invoke(new gnk(fbh0Var));
                break;
            default:
                iu30Var.invoke(new jnk(fbh0Var));
                break;
        }
        return rih1Var;
    }
}
