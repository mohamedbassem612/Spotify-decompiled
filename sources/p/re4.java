package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class re4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new pe4(this, (byte) 1));

    public re4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        re4 re4Var = (re4) this.d.getValue();
        return re4Var != null ? re4Var.a() : this.a;
    }

    public final boolean b() {
        re4 re4Var = (re4) this.d.getValue();
        return re4Var != null ? re4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_autoplay_restriction_from_show", "android-episode-player", a()), new fpb("use_show_esperanto_endpoint", "android-episode-player", b())});
    }
}
