package p;

import android.os.Bundle;
import com.spotify.mainlayout.ui.view.MainLayout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class aks implements ne41, iv30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ aks(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Bundle a() {
        c7p0 nowPlayingViewMode;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                cks cksVar = (cks) obj;
                Bundle bundle = new Bundle();
                ip31 ip31Var = cksVar.T0;
                if (ip31Var != null) {
                    th61 th61Var = (th61) ip31Var.i;
                    kp5 kp5Var = (kp5) ip31Var.h;
                    if (kp5Var == null) {
                        u890.C("appLoggedInStateContraption");
                        throw null;
                    }
                    p1f0 p1f0Var = (p1f0) kp5Var.e;
                    if (p1f0Var == null) {
                        u890.C("loggedInContraption");
                        throw null;
                    }
                    ywv0 ywv0Var = (ywv0) p1f0Var.f;
                    if (ywv0Var == null) {
                        u890.C("sessionContraption");
                        throw null;
                    }
                    Object objE = ((kdn0) ywv0Var.f).e();
                    objE.getClass();
                    bundle.putParcelable("root-contraption-saved-state-key", new dp31(th61Var, new gp5(new n1f0(new lb61((jl8) objE)))));
                }
                v6s v6sVar = cksVar.O0;
                bundle.putParcelable("logged-in-ui-saved-state", v6sVar != null ? new u6s(v6sVar.f) : null);
                return bundle;
            default:
                l1g0 l1g0Var = (l1g0) obj;
                l1g0Var.getClass();
                Bundle bundle2 = new Bundle();
                MainLayout mainLayout = l1g0Var.w;
                if (mainLayout != null && (nowPlayingViewMode = mainLayout.getNowPlayingViewMode()) != null) {
                    bundle2.putInt("npv_mode", nowPlayingViewMode.ordinal());
                }
                return bundle2;
        }
    }

    public final boolean equals(Object obj) {
        switch (this.a) {
            case 0:
                if ((obj instanceof ne41) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
            default:
                if ((obj instanceof ne41) && (obj instanceof iv30)) {
                    return u890.j(getFunctionDelegate(), ((iv30) obj).getFunctionDelegate());
                }
                return false;
        }
    }

    public final cv30 getFunctionDelegate() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new tv30(0, (cks) obj, cks.class, "saveState", "saveState()Landroid/os/Bundle;", 0);
            default:
                return new tv30(0, (l1g0) obj, l1g0.class, "onSaveInstanceState", "onSaveInstanceState()Landroid/os/Bundle;", 0);
        }
    }

    public final int hashCode() {
        switch (this.a) {
            case 0:
                break;
        }
        return getFunctionDelegate().hashCode();
    }
}
