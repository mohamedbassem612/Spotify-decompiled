package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yda0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dea0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yda0(dea0 dea0Var, byte b) {
        super(0);
        this.a = b;
        this.b = dea0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        dea0 dea0Var = this.b;
        switch (b) {
            case 0:
                return n3o1.q(dea0Var).a(new xda0(dea0Var, (byte) 0), mx90.X0);
            default:
                return n3o1.q(dea0Var).a(new xda0(dea0Var, (byte) 1), mx90.Y0);
        }
    }
}
