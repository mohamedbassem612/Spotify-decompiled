package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class f02 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ p60 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f02(iu30 iu30Var, p60 p60Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = p60Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        p60 p60Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(p60Var);
                break;
            case 1:
                iu30Var.invoke(new sym1(p60Var.e));
                break;
            case 2:
                iu30Var.invoke(p60Var);
                break;
            case 3:
                iu30Var.invoke(p60Var);
                break;
            case 4:
                iu30Var.invoke(p60Var);
                break;
            default:
                iu30Var.invoke(p60Var);
                break;
        }
        return rih1Var;
    }
}
