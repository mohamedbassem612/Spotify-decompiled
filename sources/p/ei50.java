package p;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.spotify.mobius.MobiusLoop;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ei50 implements l5r0 {
    public final gw70 a;
    public final zfx b;
    public final t2b c;
    public final Resources d;
    public final MobiusLoop.Controller e;
    public gi50 f;

    public ei50(gw70 gw70Var, zfx zfxVar, t2b t2bVar, Resources resources, MobiusLoop.Controller controller) {
        this.a = gw70Var;
        this.b = zfxVar;
        this.c = t2bVar;
        this.d = resources;
        this.e = controller;
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0028  */
    public final void c(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        gi50 uh50Var;
        int iOrdinal = ((yh50) this.e.a()).a.ordinal();
        gw70 gw70Var = this.a;
        if (iOrdinal == 0) {
            uh50Var = new uh50(layoutInflater, viewGroup, gw70Var);
        } else if (iOrdinal == 1) {
            uh50Var = new ii50(layoutInflater, viewGroup, gw70Var);
        } else if (iOrdinal != 2) {
            if (iOrdinal != 3) {
                if (iOrdinal == 4) {
                    uh50Var = new ii50(layoutInflater, viewGroup, gw70Var);
                } else if (iOrdinal != 5) {
                    eg.o();
                    return;
                }
            }
            uh50Var = new uh50(layoutInflater, viewGroup, gw70Var);
        } else {
            uh50Var = new xh50(layoutInflater, viewGroup, this.b, this.c, this.d);
        }
        this.f = uh50Var;
    }

    public final View getView() {
        gi50 gi50Var = this.f;
        if (gi50Var != null) {
            return gi50Var.getRoot();
        }
        return null;
    }

    public final void start() {
        gi50 gi50Var = this.f;
        gi50Var.getClass();
        MobiusLoop.Controller controller = this.e;
        controller.c(gi50Var);
        controller.start();
    }

    public final void stop() {
        MobiusLoop.Controller controller = this.e;
        controller.stop();
        controller.disconnect();
    }
}
