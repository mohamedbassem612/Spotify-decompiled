package p;

import android.app.Activity;
import android.os.Bundle;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class spn {
    public final Activity a;
    public final lzn0 b;
    public final a1r0 c;

    public spn(Activity activity, lzn0 lzn0Var, a1r0 a1r0Var, mhc mhcVar) {
        this.a = activity;
        this.b = lzn0Var;
        this.c = a1r0Var;
    }

    public final void a(boolean z, cqn cqnVar, tv80 tv80Var) {
        String str = cqnVar.a;
        zpn zpnVar = cqnVar.c;
        if (!(zpnVar instanceof vpn)) {
            if (!(zpnVar instanceof zpn)) {
                eg.o();
                return;
            }
            zpn zpnVar2 = zpnVar;
            ypn ypnVar = zpnVar2.i;
            if (!(ypnVar instanceof wpn)) {
                if (!(ypnVar instanceof xpn)) {
                    eg.o();
                    return;
                }
                mhc.g(zpnVar2.g, zpnVar2.e, zpnVar2.h);
            }
        }
        if (str != null && str.length() != 0) {
            Set set = s4b1.f;
            if (!uic.j(str, bzu0.f)) {
                hhg1.f("The folder uri must be a folder uri: ".concat(str));
                return;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("create_playlist_page_parameters", new dqn(false, cqnVar));
        Activity activity = this.a;
        lzn0 lzn0Var = this.b;
        if (lzn0Var.j(activity)) {
            lzn0Var.i(new dwn0("spotify:new:playlist", "", false, false, 0, 0, z, null, null, tv80Var != null ? new bwn0(tv80Var) : null), bundle);
        } else {
            a1r0.m(this.c, "spotify:new:playlist", tv80Var, bundle, 8);
        }
    }
}
