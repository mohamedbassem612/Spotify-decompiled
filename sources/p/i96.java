package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class i96 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l96 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i96(l96 l96Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = l96Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        l96 l96Var = this.b;
        switch (b) {
            case 0:
                l96Var.e.h();
                iu30Var.invoke(g86.a);
                break;
            default:
                l96Var.e.d();
                iu30Var.invoke(h86.a);
                break;
        }
        return rih1Var;
    }
}
