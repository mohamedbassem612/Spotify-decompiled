package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class d660 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ e660 b;

    public /* synthetic */ d660(e660 e660Var, byte b) {
        this.a = b;
        this.b = e660Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        e660 e660Var = this.b;
        switch (b) {
            case 0:
                f2h1 f2h1Var = e660Var.V0;
                if (f2h1Var == null) {
                    throw kaa0.g("Font resolution state is not set.");
                }
                f2h1Var.getValue();
                return rih1Var;
            default:
                f2h1 f2h1Var2 = e660Var.V0;
                if (f2h1Var2 == null) {
                    throw kaa0.g("Font resolution state is not set.");
                }
                f2h1Var2.getValue();
                return rih1Var;
        }
    }
}
