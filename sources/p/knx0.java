package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class knx0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zkw0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ knx0(zkw0 zkw0Var, byte b) {
        super(0);
        this.a = b;
        this.b = zkw0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        zkw0 zkw0Var = this.b;
        switch (b) {
            case 0:
                return ycm.a((ycm) zkw0Var.e);
            default:
                return ((myq0) zkw0Var.f).e();
        }
    }
}
