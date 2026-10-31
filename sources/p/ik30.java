package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class ik30 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ bbr0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ik30(bbr0 bbr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = bbr0Var;
    }

    public final Object invoke() {
        switch (this.a) {
            case 0:
                return this.b.b0(bn70.class);
            case 1:
                return this.b.b0(u17.class);
            case 2:
                return this.b.b0(bn70.class);
            case 3:
                return this.b.b0(bn70.class);
            default:
                return this.b.b0(vmc1.class);
        }
    }
}
