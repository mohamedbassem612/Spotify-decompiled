package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gsm0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hsm0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gsm0(hsm0 hsm0Var, byte b) {
        super(0);
        this.a = b;
        this.b = hsm0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        hsm0 hsm0Var = this.b;
        switch (b) {
            case 0:
                return hsm0Var.b.a(hsm0Var.f);
            default:
                ((osm0) hsm0Var.g.getValue()).getClass();
                return new zau0(false);
        }
    }
}
