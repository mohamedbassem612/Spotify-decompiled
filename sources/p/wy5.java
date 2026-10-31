package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wy5 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rz5 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wy5(rz5 rz5Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = rz5Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        cz5 cz5Var = cz5.a;
        iu30 iu30Var = this.c;
        rz5 rz5Var = this.b;
        switch (b) {
            case 0:
                if (rz5Var.b()) {
                    iu30Var.invoke(zy5.a);
                } else if (rz5Var.d()) {
                    iu30Var.invoke(bz5.a);
                } else if (rz5Var.e()) {
                    iu30Var.invoke(cz5Var);
                }
                break;
            default:
                if (rz5Var.e()) {
                    iu30Var.invoke(cz5Var);
                }
                break;
        }
        return rih1Var;
    }
}
