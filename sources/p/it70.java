package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class it70 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iie1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ it70(iie1 iie1Var, byte b) {
        super(0);
        this.a = b;
        this.b = iie1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        iie1 iie1Var = this.b;
        switch (b) {
            case 0:
                return Integer.valueOf(iie1Var.f.s());
            default:
                return new p3v(iie1Var.b.N0(iie1Var.c));
        }
    }
}
