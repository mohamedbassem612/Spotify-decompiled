package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lx4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 26));

    public lx4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        lx4 lx4Var = (lx4) this.c.getValue();
        return lx4Var != null ? lx4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("observe_player_state_on_computation", "android-player-esperanto", a()));
    }
}
