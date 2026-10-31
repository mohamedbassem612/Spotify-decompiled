package p;

import android.app.Dialog;
import android.view.Window;
import com.spotify.login.loginflowimpl.LoginActivity;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zve0 extends uap1 {
    public final /* synthetic */ byte c;
    public final Object d;

    public /* synthetic */ zve0(Object obj, byte b) {
        this.c = b;
        this.d = obj;
    }

    public void j(zf30 zf30Var) {
        byte b = this.c;
    }

    public void k(zf30 zf30Var) {
        Dialog dialogA1;
        Window window;
        switch (this.c) {
            case 1:
                t2u t2uVar = zf30Var instanceof t2u ? (t2u) zf30Var : null;
                if (t2uVar != null && (dialogA1 = t2uVar.a1()) != null && (window = dialogA1.getWindow()) != null) {
                    window.setCallback(new ypn1(window.getCallback(), new a6n1(window, zf30Var.getClass().getSimpleName(), (utw0) this.d)));
                    break;
                }
                break;
        }
    }

    public void l(zf30 zf30Var) {
        switch (this.c) {
            case 0:
                if (u890.j(zf30Var.a1, "flow_fragment") || (zf30Var instanceof lir0)) {
                    bwe0 bwe0Var = ((LoginActivity) this.d).k1;
                    if (bwe0Var != null) {
                        bwe0Var.b(null, zf30Var);
                        return;
                    } else {
                        u890.C("loginActivityNavigationDelegate");
                        throw null;
                    }
                }
                return;
            default:
                return;
        }
    }

    public void m(zf30 zf30Var) {
        switch (this.c) {
            case 0:
                LoginActivity loginActivity = (LoginActivity) this.d;
                if (!(zf30Var instanceof lir0) || u890.j(zf30Var.a1, "flow_fragment")) {
                    return;
                }
                int i = LoginActivity.p1;
                zf30 zf30VarG = ((dg30) loginActivity).U0.t().G("flow_fragment");
                if (zf30VarG != null) {
                    bwe0 bwe0Var = loginActivity.k1;
                    if (bwe0Var != null) {
                        bwe0Var.b(null, zf30VarG);
                        return;
                    } else {
                        u890.C("loginActivityNavigationDelegate");
                        throw null;
                    }
                }
                return;
            default:
                return;
        }
    }

    private final void u(zf30 zf30Var) {
    }
}
