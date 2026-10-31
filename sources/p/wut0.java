package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class wut0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xut0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wut0(xut0 xut0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xut0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xut0 xut0Var = this.b;
        switch (b) {
            case 0:
                ((upp0) xut0Var.h.get()).getClass();
                return upp0.a();
            default:
                return tp91.b(xut0Var.f);
        }
    }
}
