package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class g84 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final tgp0 c;
    public final luk d;
    public final idd1 e;
    public final idd1 f;

    public g84(boolean z, boolean z2, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = tgp0Var;
        this.d = lukVar;
        this.e = new idd1(new f84(this, (byte) 1));
        this.f = new idd1(new f84(this, (byte) 0));
    }

    public final boolean a() {
        g84 g84Var = (g84) this.f.getValue();
        return g84Var != null ? g84Var.a() : this.a;
    }

    public final boolean b() {
        g84 g84Var = (g84) this.f.getValue();
        return g84Var != null ? g84Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("crossfade_enabled", "android-boombox-settings", a()), new fpb("use_playback_settings_crossfade", "android-boombox-settings", b())});
    }

    public g84(tgp0 tgp0Var, luk lukVar) {
        this(true, true, tgp0Var, lukVar);
    }
}
