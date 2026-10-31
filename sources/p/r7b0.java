package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class r7b0 implements Function0 {
    public final /* synthetic */ byte a;
    public final t7b0 b;

    public /* synthetic */ r7b0(t7b0 t7b0Var, byte b) {
        this.a = b;
        this.b = t7b0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        t7b0 t7b0Var = this.b;
        switch (b) {
            case 0:
                return new s7b0(t7b0Var);
            default:
                return t7b0Var.s();
        }
    }
}
