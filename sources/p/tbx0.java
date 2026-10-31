package p;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class tbx0 implements f4h1 {
    public final g1b a;
    public final MobiusLoop.Controller b;
    public final LinearLayout c;

    public tbx0(g1b g1bVar, MobiusLoop.Controller controller) {
        this.a = g1bVar;
        this.b = controller;
        int i = kgr0.T0;
        this.c = xyn1.z((ViewGroup) g1bVar.d);
    }

    public final Object getView() {
        return this.c;
    }

    public final Bundle serialize() {
        String str;
        Bundle bundle;
        qbx0 qbx0Var = (qbx0) this.b.a();
        int iC = l1d.C(qbx0Var.b);
        if (iC != 4) {
            str = iC != 5 ? null : "friendsProfileListData";
        } else {
            str = "blockedUsersProfileListData";
        }
        if (str == null || qbx0Var.e.a != 3) {
            bundle = null;
        } else {
            bundle = new Bundle();
            bundle.putParcelable(str, j8x0.a(qbx0Var.e, 0, null, null, false, false, 0, 0, 119));
        }
        if (bundle == null) {
            return null;
        }
        return bundle;
    }

    public final void start() {
        g1b g1bVar = this.a;
        MobiusLoop.Controller controller = this.b;
        controller.c(g1bVar);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.b;
        controller.stop();
        controller.disconnect();
    }
}
