package p;

import com.spotify.home.evopage.mobius.Event;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rj00 implements o5s {
    public final /* synthetic */ tj00 a;

    public rj00(tj00 tj00Var) {
        this.a = tj00Var;
    }

    public final void onResume(iac0 iac0Var) {
        tj00 tj00Var = this.a;
        if (!tj00Var.U0) {
            tj00Var.l(Event.Foregrounded.INSTANCE);
        }
        tj00Var.U0 = false;
    }
}
