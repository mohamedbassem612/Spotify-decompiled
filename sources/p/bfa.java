package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class bfa implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ oae1 b;

    public /* synthetic */ bfa(oae1 oae1Var, byte b) {
        this.a = b;
        this.b = oae1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        boolean zJ = false;
        oae1 oae1Var = this.b;
        switch (b) {
            case 0:
                if (oae1Var != null) {
                    af5 af5Var = oae1Var.b;
                    y9e1 y9e1Var = (y9e1) oae1Var.a.getValue();
                    zJ = u890.j(af5Var, y9e1Var != null ? y9e1Var.a.a : null);
                }
                return Boolean.valueOf(zJ);
            default:
                if (oae1Var != null) {
                    af5 af5Var2 = oae1Var.b;
                    y9e1 y9e1Var2 = (y9e1) oae1Var.a.getValue();
                    zJ = u890.j(af5Var2, y9e1Var2 != null ? y9e1Var2.a.a : null);
                }
                return Boolean.valueOf(zJ);
        }
    }
}
