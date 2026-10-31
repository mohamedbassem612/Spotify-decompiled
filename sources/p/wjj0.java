package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wjj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xjj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wjj0(xjj0 xjj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xjj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xjj0 xjj0Var = this.b;
        switch (b) {
            case 0:
                return xjj0Var.e.a(xjj0Var.a);
            default:
                return xjj0Var.f.a();
        }
    }
}
