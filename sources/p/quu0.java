package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class quu0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ uuu0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ quu0(uuu0 uuu0Var, byte b) {
        super(0);
        this.a = b;
        this.b = uuu0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        uuu0 uuu0Var = this.b;
        switch (b) {
            case 0:
                return uuu0Var.e.a(uuu0Var.g, uuu0Var.h);
            default:
                return uuu0Var.c.a(uuu0Var.h, uuu0Var.g);
        }
    }
}
