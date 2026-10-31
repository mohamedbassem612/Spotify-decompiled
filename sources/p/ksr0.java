package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ksr0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ poj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ksr0(poj0 poj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = poj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        poj0 poj0Var = this.b;
        switch (b) {
            case 0:
                return new b8l0(((h7l0) poj0Var.c).b());
            default:
                return (i8h1) ((kly0) poj0Var.b).get();
        }
    }
}
