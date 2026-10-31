package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ow11 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ a8f1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow11(a8f1 a8f1Var, byte b) {
        super(0);
        this.a = b;
        this.b = a8f1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        a8f1 a8f1Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(a8f1Var.getState().a() > 0.3f);
            default:
                return a8f1Var.a();
        }
    }
}
