package p;

import android.view.LayoutInflater;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bf50 extends r3g1 {
    public final fsp X;
    public final gsp Y;

    public bf50(fsp fspVar, gsp gspVar) {
        this.X = fspVar;
        this.Y = gspVar;
        x(true);
    }

    public final int g(int i) {
        return !nhc1.Y(D(i).uri(), "spotify:room:", false) ? 1 : 0;
    }

    public final void n(int i, w611 w611Var) {
        ((e711) w611Var).E(i, D(i));
    }

    public final w611 p(int i, ViewGroup viewGroup) {
        if (i != 0) {
            return this.X.a(viewGroup);
        }
        gsp gspVar = this.Y;
        gspVar.getClass();
        em0 em0Var = (em0) gspVar.a.c;
        LayoutInflater layoutInflater = (LayoutInflater) ((j3q) em0Var.b).c.g5.get();
        c8o.l(layoutInflater);
        gw70 gw70Var = (gw70) ((j3q) em0Var.b).b.d8.get();
        c8o.l(gw70Var);
        return new mq80(layoutInflater, viewGroup, gw70Var);
    }
}
