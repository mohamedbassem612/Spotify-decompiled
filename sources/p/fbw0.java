package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class fbw0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kbw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fbw0(kbw0 kbw0Var, byte b) {
        super(0);
        this.a = b;
        this.b = kbw0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        kbw0 kbw0Var = this.b;
        switch (b) {
            case 0:
                return d5p1.t(kbw0Var.k.a(), cto1.q(kbw0Var.l), ey71.a, (Object) null);
            default:
                return (hwt) ((zob1) kbw0Var.f8p.getValue()).getValue();
        }
    }
}
