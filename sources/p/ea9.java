package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ea9 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ hdn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea9(boolean z, iu30 iu30Var, hdn0 hdn0Var) {
        super(0);
        this.a = (byte) 2;
        this.c = z;
        this.b = iu30Var;
        this.d = hdn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        err0 err0Var = this.d;
        iu30 iu30Var = this.b;
        boolean z = this.c;
        switch (b) {
            case 0:
                err0Var.t(0);
                iu30Var.invoke(new q99(0, z));
                break;
            case 1:
                err0Var.t(1);
                iu30Var.invoke(new q99(1, z));
                break;
            default:
                if (z) {
                    iu30Var.invoke(Integer.valueOf(err0Var.s()));
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ea9(iu30 iu30Var, boolean z, hdn0 hdn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = z;
        this.d = hdn0Var;
    }
}
