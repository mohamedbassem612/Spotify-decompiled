package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o1n0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p1n0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o1n0(p1n0 p1n0Var, byte b) {
        super(0);
        this.a = b;
        this.b = p1n0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        p1n0 p1n0Var = this.b;
        switch (b) {
            case 0:
                return p1n0Var.t.a(p1n0Var.b, p1n0Var.a, p1n0Var.e);
            default:
                return p1n0Var.h.a(p1n0Var.d);
        }
    }
}
