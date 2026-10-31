package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class h75 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ k75 b;

    public /* synthetic */ h75(k75 k75Var, byte b) {
        this.a = b;
        this.b = k75Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        k75 k75Var = this.b;
        switch (b) {
            case 0:
                k75.m(k75Var);
                break;
            default:
                k75Var.c1.D();
                break;
        }
        return rih1Var;
    }
}
