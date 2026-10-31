package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ejh0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hjh0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ejh0(hjh0 hjh0Var, byte b) {
        super(0);
        this.a = b;
        this.b = hjh0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        hjh0 hjh0Var = this.b;
        switch (b) {
            case 0:
                return ((tau0) hjh0Var.f.a.b).a().a(new n9u0());
            case 1:
                return ((tau0) hjh0Var.f.a.b).a().a(new l9u0());
            default:
                return ((tau0) hjh0Var.f.a.b).a().a(new l9u0());
        }
    }
}
