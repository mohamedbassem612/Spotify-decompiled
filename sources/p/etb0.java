package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class etb0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ftb0 b;

    public /* synthetic */ etb0(ftb0 ftb0Var, byte b) {
        this.a = b;
        this.b = ftb0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        ftb0 ftb0Var = this.b;
        switch (b) {
            case 0:
                return Float.valueOf(ftb0Var.P0.a());
            case 1:
                return Float.valueOf(ftb0Var.P0.c());
            default:
                return Float.valueOf(ftb0Var.P0.e() - ftb0Var.P0.b());
        }
    }
}
