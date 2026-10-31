package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gdo0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hdo0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gdo0(hdo0 hdo0Var, byte b) {
        super(0);
        this.a = b;
        this.b = hdo0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        hdo0 hdo0Var = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) hdo0Var.T0.getValue();
                bool.getClass();
                return bool;
            case 1:
                tif1.d(hdo0Var.X, "LoggedInUi");
                return rih1Var;
            case 2:
                hdo0Var.S0 = false;
                return rih1Var;
            default:
                return hdo0Var.b.p0().b.e;
        }
    }
}
