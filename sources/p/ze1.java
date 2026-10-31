package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ze1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ yg1 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ze1(byte b, yg1 yg1Var, iu30 iu30Var) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = yg1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yg1 yg1Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(yg1Var.e.c.e);
                break;
            case 1:
                iu30Var.invoke(yg1Var.e.c.e);
                break;
            case 2:
                iu30Var.invoke(new mg1(yg1Var.j.e));
                break;
            default:
                iu30Var.invoke(new ng1(yg1Var.g.e));
                break;
        }
        return rih1Var;
    }
}
