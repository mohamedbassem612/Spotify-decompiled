package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class n1d0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ znb0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n1d0(znb0 znb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = znb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        znb0 znb0Var = this.b;
        switch (b) {
            case 0:
                return (laa) znb0Var.getValue();
            default:
                return Integer.valueOf(((Number) znb0Var.getValue()).intValue());
        }
    }
}
