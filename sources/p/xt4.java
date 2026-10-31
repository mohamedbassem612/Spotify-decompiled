package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xt4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new st4(this, (byte) 4));

    public xt4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        xt4 xt4Var = (xt4) this.c.getValue();
        return xt4Var != null ? xt4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("track_player_state_subscriptions", "android-music-libs-player", a()));
    }
}
