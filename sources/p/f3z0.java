package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f3z0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zja1 b;
    public final /* synthetic */ aka1 c;
    public final /* synthetic */ iu30 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f3z0(zja1 zja1Var, aka1 aka1Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = zja1Var;
        this.c = aka1Var;
        this.d = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.d;
        fw80 fw80Var = fw80.f;
        aka1 aka1Var = this.c;
        zja1 zja1Var = this.b;
        switch (b) {
            case 0:
                bka1.b(zja1Var, aka1Var, fw80Var);
                iu30Var.invoke(j3z0.a);
                break;
            default:
                bka1.b(zja1Var, aka1Var, fw80Var);
                iu30Var.invoke(i3z0.a);
                break;
        }
        return rih1Var;
    }
}
