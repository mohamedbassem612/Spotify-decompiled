package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class xhi0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zhi0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xhi0(zhi0 zhi0Var, byte b) {
        super(0);
        this.a = b;
        this.b = zhi0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        zhi0 zhi0Var = this.b;
        switch (b) {
            case 0:
                return d5p1.t(zhi0Var.l.a(), cto1.q(zhi0Var.m), ey71.a, (Object) null);
            default:
                return (hwt) ((zob1) zhi0Var.n.getValue()).getValue();
        }
    }
}
