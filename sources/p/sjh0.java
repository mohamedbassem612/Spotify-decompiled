package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class sjh0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ pjh0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sjh0(iu30 iu30Var, pjh0 pjh0Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = pjh0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        pjh0 pjh0Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new ljh0(pjh0Var.a));
                break;
            default:
                iu30Var.invoke(new mjh0(pjh0Var.a));
                break;
        }
        return rih1Var;
    }
}
