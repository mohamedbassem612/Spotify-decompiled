package p;

import com.spotify.mobius.Mobius;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class koc implements o5s {
    public final /* synthetic */ toc a;

    public koc(toc tocVar) {
        this.a = tocVar;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.a.e = true;
        MobiusLoop mobiusLoop = this.a.f;
        if (mobiusLoop != null) {
            mobiusLoop.dispose();
        }
        this.a.f = null;
        iac0Var.getLifecycle().d(this);
    }

    public final void onStart(iac0 iac0Var) {
        this.a.e = false;
        toc tocVar = this.a;
        tocVar.f = Mobius.d(n4.q, tocVar.c).h(this.a.d).g(new roc(0L, 0L));
    }
}
