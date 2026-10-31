package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class y54 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uw0 b;
    public final /* synthetic */ ynb0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y54(uw0 uw0Var, ynb0 ynb0Var, byte b) {
        super(0);
        this.a = b;
        this.b = uw0Var;
        this.c = ynb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ynb0 ynb0Var = this.c;
        uw0 uw0Var = this.b;
        switch (b) {
            case 0:
                return new w6o0(uw0Var.n(12), (w310) ynb0Var.get(), 8);
            case 1:
                return new w6o0(uw0Var.n(11), (w310) ynb0Var.get(), 12);
            default:
                return new w6o0(uw0Var.n(10), (w310) ynb0Var.get(), 12);
        }
    }
}
