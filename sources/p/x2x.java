package p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.player.model.ContextTrack;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x2x extends e711 implements o5s {
    public final z1x U0;
    public final j44 V0;
    public final dtw W0;
    public final otu X0;
    public final x390 Y0;
    public final ViewGroup Z0;
    public final boolean a1;

    public x2x(z1x z1xVar, j44 j44Var, dtw dtwVar, otu otuVar, x390 x390Var, ViewGroup viewGroup, boolean z) {
        super(dtwVar.w);
        this.U0 = z1xVar;
        this.V0 = j44Var;
        this.W0 = dtwVar;
        this.X0 = otuVar;
        this.Y0 = x390Var;
        this.Z0 = viewGroup;
        this.a1 = z;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    public final void E(int i, Object obj) {
        boolean z;
        ContextTrack contextTrack = (ContextTrack) obj;
        q1x q1xVar = this.U0.f181p;
        if (q1xVar == null) {
            hhg1.n("Required value was null.");
            return;
        }
        anf1 anf1Var = q1xVar.a;
        ji0 ji0Var = anf1Var.a;
        if (ji0Var == null) {
            hhg1.n("Required value was null.");
            return;
        }
        ju0 ju0Var = q1xVar.c;
        uuw uuwVar = anf1Var.b;
        ruw ruwVar = uuwVar instanceof ruw ? (ruw) uuwVar : null;
        if (ruwVar != null) {
            z = ruwVar.b;
        }
        this.W0.f(new qey0(ji0Var, contextTrack, ju0Var, z, this.V0.b()));
    }

    public final void G() {
        x8c0 lifecycle;
        iac0 iac0VarH = x9p1.h(((w611) this).a);
        if (iac0VarH == null || (lifecycle = iac0VarH.getLifecycle()) == null) {
            n57.e("Couldn't find lifecycle owner from view");
            return;
        }
        ((dt71) this.X0.b).a(e7k1.a);
        lifecycle.a(this);
        eg7 eg7Var = new eg7(new v7v(this, (byte) 18), (byte) 16);
        x390 x390Var = this.Y0;
        x390Var.c = eg7Var;
        ((View) x390Var.b).addOnLayoutChangeListener(eg7Var);
    }

    public final void H() {
        x390 x390Var = this.Y0;
        eg7 eg7Var = (eg7) x390Var.c;
        if (eg7Var != null) {
            ((View) x390Var.b).removeOnLayoutChangeListener(eg7Var);
        }
        ((dt71) this.X0.b).a(i8k1.a);
    }

    public final void onDestroy(iac0 iac0Var) {
        iac0Var.getLifecycle().d(this);
    }
}
