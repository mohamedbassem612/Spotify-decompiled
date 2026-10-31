package p;

import android.view.ViewGroup;
import app.p000rive.semantics.SemanticState;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class sj5 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ yj5 b;

    public /* synthetic */ sj5(yj5 yj5Var, byte b) {
        this.a = b;
        this.b = yj5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        byte b = this.a;
        yj5 yj5Var = this.b;
        switch (b) {
            case 0:
                if ((yj5Var.x1 & 1) != 0) {
                    yj5Var.u(0);
                }
                if ((yj5Var.x1 & SemanticState.Obscured) != 0) {
                    yj5Var.u(108);
                }
                yj5Var.w1 = false;
                yj5Var.x1 = 0;
                break;
            default:
                yj5Var.V0.showAtLocation(yj5Var.U0, 55, 0, 0);
                oek1 oek1Var = yj5Var.X0;
                if (oek1Var != null) {
                    oek1Var.c();
                }
                if (yj5Var.Y0 && (viewGroup = yj5Var.Z0) != null && viewGroup.isLaidOut()) {
                    yj5Var.U0.setAlpha(0.0f);
                    oek1 oek1VarC = b8k1.c(yj5Var.U0);
                    oek1VarC.a(1.0f);
                    yj5Var.X0 = oek1VarC;
                    oek1VarC.f(new tj5(this, (byte) 0));
                } else {
                    yj5Var.U0.setAlpha(1.0f);
                    yj5Var.U0.setVisibility(0);
                }
                break;
        }
    }
}
