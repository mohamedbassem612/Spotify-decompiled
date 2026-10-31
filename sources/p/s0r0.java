package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class s0r0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w0r0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0r0(w0r0 w0r0Var, byte b) {
        super(0);
        this.a = b;
        this.b = w0r0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        w0r0 w0r0Var = this.b;
        switch (b) {
            case 0:
                w0r0Var.a.finish();
                break;
            default:
                w0r0Var.f();
                break;
        }
        return rih1Var;
    }
}
