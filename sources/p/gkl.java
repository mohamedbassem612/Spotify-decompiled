package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class gkl extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ b10 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gkl(iu30 iu30Var, int i, b10 b10Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = i;
        this.d = b10Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b10 b10Var = this.d;
        int i = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new mkl(i, b10Var.b));
                break;
            default:
                iu30Var.invoke(new nkl(i, b10Var.b));
                break;
        }
        return rih1Var;
    }
}
