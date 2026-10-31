package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class k690 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i5w0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k690(i5w0 i5w0Var, byte b) {
        super(0);
        this.a = b;
        this.b = i5w0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        i5w0 i5w0Var = this.b;
        switch (b) {
            case 0:
                return (Boolean) ((kly0) i5w0Var.e(j690.b)).get();
            default:
                return (Boolean) ((kly0) i5w0Var.e(j690.h)).get();
        }
    }
}
