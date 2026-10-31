package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class hl90 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ j0v0 b;
    public final /* synthetic */ bct c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hl90(j0v0 j0v0Var, bct bctVar, byte b) {
        super(0);
        this.a = b;
        this.b = j0v0Var;
        this.c = bctVar;
    }

    public final Object invoke() {
        byte b = this.a;
        bct bctVar = this.c;
        j0v0 j0v0Var = this.b;
        switch (b) {
            case 0:
                return new bl90(j0v0Var.a, new y1i((tf51) j0v0Var.c.g(bctVar), j0v0Var.b));
            default:
                return new bl90(j0v0Var.a, new y1i((tf51) j0v0Var.c.g(bctVar), j0v0Var.b));
        }
    }
}
