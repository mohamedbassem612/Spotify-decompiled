package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class wqt0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xqt0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wqt0(xqt0 xqt0Var, byte b) {
        super(0);
        this.a = b;
        this.b = xqt0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xqt0 xqt0Var = this.b;
        switch (b) {
            case 0:
                return xqt0Var.d.a();
            default:
                return xqt0Var.a.a(xqt0Var.e, r6h1.c);
        }
    }
}
