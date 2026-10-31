package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class syq0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tyq0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ syq0(tyq0 tyq0Var, byte b) {
        super(0);
        this.a = b;
        this.b = tyq0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        tyq0 tyq0Var = this.b;
        switch (b) {
            case 0:
                return tyq0Var.b.n(13);
            default:
                return tyq0Var.b.n(5);
        }
    }
}
