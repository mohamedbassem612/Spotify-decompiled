package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jj21 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ yw10 d;
    public final /* synthetic */ ven0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jj21(int i, iu30 iu30Var, yw10 yw10Var, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = i;
        this.c = iu30Var;
        this.d = yw10Var;
        this.e = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        yw10 yw10Var = this.d;
        iu30 iu30Var = this.c;
        int i = this.b;
        ven0 ven0Var = this.e;
        switch (b) {
            case 0:
                ven0Var.setValue(Integer.valueOf(i));
                iu30Var.invoke(yw10Var.a);
                break;
            default:
                ven0Var.setValue(Integer.valueOf(i));
                iu30Var.invoke(yw10Var.a);
                break;
        }
        return rih1Var;
    }
}
