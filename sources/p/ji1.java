package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ji1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ w4i1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji1(iu30 iu30Var, int i, w4i1 w4i1Var) {
        super(0);
        this.b = iu30Var;
        this.c = i;
        this.d = w4i1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w4i1 w4i1Var = this.d;
        int i = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new cj1(i, w4i1Var));
                break;
            default:
                iu30Var.invoke(new ukn(i, w4i1Var));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji1(iu30 iu30Var, w4i1 w4i1Var, int i) {
        super(0);
        this.b = iu30Var;
        this.d = w4i1Var;
        this.c = i;
    }
}
