package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q4k0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ fy00 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4k0(iu30 iu30Var, fy00 fy00Var, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = fy00Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        fy00 fy00Var = this.c;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                iu30Var.invoke(new l5k0(fy00Var.a));
                break;
            default:
                iu30Var.invoke(new i5k0(fy00Var.a));
                break;
        }
        return rih1Var;
    }
}
