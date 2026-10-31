package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n421 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i521 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n421(i521 i521Var, byte b) {
        super(0);
        this.a = b;
        this.b = i521Var;
    }

    public final Object invoke() {
        byte b = this.a;
        p521 p521Var = p521.b;
        rih1 rih1Var = rih1.a;
        i521 i521Var = this.b;
        switch (b) {
            case 0:
                i521Var.invoke(p521.a);
                break;
            case 1:
                i521Var.invoke(p521Var);
                break;
            default:
                i521Var.invoke(p521Var);
                break;
        }
        return rih1Var;
    }
}
