package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qpw0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yeu0 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qpw0(yeu0 yeu0Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = yeu0Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        yeu0 yeu0Var = this.b;
        switch (b) {
            case 0:
                yeu0Var.i(2);
                iu30Var.invoke(Boolean.TRUE);
                break;
            default:
                yeu0Var.i(1);
                iu30Var.invoke(Boolean.FALSE);
                break;
        }
        return rih1Var;
    }
}
