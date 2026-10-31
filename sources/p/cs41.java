package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class cs41 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ es41 b;

    public /* synthetic */ cs41(es41 es41Var, byte b) {
        this.a = b;
        this.b = es41Var;
    }

    public final Object invoke() {
        byte b = this.a;
        es41 es41Var = this.b;
        switch (b) {
            case 0:
                return Boolean.valueOf(es41Var.a.s() < es41Var.f.s());
            default:
                return Boolean.valueOf(es41Var.a.s() > 0);
        }
    }
}
