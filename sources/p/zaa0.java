package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zaa0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ iba0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zaa0(iu30 iu30Var, iba0 iba0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = iba0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iba0 iba0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(iba0Var.c);
                break;
            case 1:
                iu30Var.invoke(iba0Var.c);
                break;
            default:
                iu30Var.invoke(iba0Var.d);
                break;
        }
        return rih1Var;
    }
}
