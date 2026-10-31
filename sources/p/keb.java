package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class keb extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ at80 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ keb(iu30 iu30Var, at80 at80Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = at80Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        at80 at80Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new ig80(at80Var));
                break;
            case 1:
                iu30Var.invoke(new jg80(at80Var));
                break;
            default:
                iu30Var.invoke(new gg80(at80Var, md80.c, cg80.b));
                break;
        }
        return rih1Var;
    }
}
