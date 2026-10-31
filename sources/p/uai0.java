package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class uai0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ xk00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uai0(xk00 xk00Var, byte b) {
        super(0);
        this.a = b;
        this.b = xk00Var;
    }

    public final Object invoke() {
        byte b = this.a;
        xk00 xk00Var = this.b;
        switch (b) {
            case 0:
                return xk00Var.h.a();
            case 1:
                return xk00Var.h.a();
            case 2:
                return xk00Var.h.a();
            default:
                return new xho(xk00Var.a);
        }
    }
}
