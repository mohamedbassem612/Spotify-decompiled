package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zap0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ l3n1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zap0(l3n1 l3n1Var, byte b) {
        super(0);
        this.a = b;
        this.b = l3n1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        l3n1 l3n1Var = this.b;
        switch (b) {
            case 0:
                return l3n1Var.c();
            case 1:
                return new wcp0(l3n1Var, (byte) 0);
            case 2:
                return new wcp0(l3n1Var, (byte) 1);
            case 3:
                return l3n1Var.c();
            default:
                return l3n1Var.b();
        }
    }
}
