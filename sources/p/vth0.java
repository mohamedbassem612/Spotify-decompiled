package p;

import androidx.car.app.navigation.b;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vth0 implements o5s {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tac0 b;

    public vth0(b bVar, tac0 tac0Var) {
        this.a = (byte) 1;
        this.b = tac0Var;
    }

    public final void onDestroy(iac0 iac0Var) {
        byte b = this.a;
        tac0 tac0Var = this.b;
        switch (b) {
            case 0:
                tac0Var.d(this);
                break;
            case 1:
                sge1.a();
                tac0Var.d(this);
                break;
            default:
                tac0Var.d(this);
                break;
        }
    }

    public /* synthetic */ vth0(tac0 tac0Var, byte b) {
        this.a = b;
        this.b = tac0Var;
    }
}
