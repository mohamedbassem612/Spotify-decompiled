package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class np50 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ zv31 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ np50(iu30 iu30Var, zv31 zv31Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = zv31Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zv31 zv31Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new jm50(zv31Var));
                break;
            case 1:
                iu30Var.invoke(new hm50(zv31Var));
                break;
            default:
                iu30Var.invoke(new im50(zv31Var));
                break;
        }
        return rih1Var;
    }
}
