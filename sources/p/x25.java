package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class x25 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new k25(this, (byte) 5));

    public x25(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
    }

    public final boolean a() {
        x25 x25Var = (x25) this.g.getValue();
        return x25Var != null ? x25Var.a() : this.a;
    }

    public final boolean b() {
        x25 x25Var = (x25) this.g.getValue();
        return x25Var != null ? x25Var.b() : this.b;
    }

    public final boolean c() {
        x25 x25Var = (x25) this.g.getValue();
        return x25Var != null ? x25Var.c() : this.c;
    }

    public final boolean d() {
        x25 x25Var = (x25) this.g.getValue();
        return x25Var != null ? x25Var.d() : this.d;
    }

    public final boolean e() {
        x25 x25Var = (x25) this.g.getValue();
        return x25Var != null ? x25Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_animation", "android-system-home-followfeed", a()), new fpb("enable_compose_release_row_element", "android-system-home-followfeed", b()), new fpb("enable_episode_imagery", "android-system-home-followfeed", c()), new fpb("enable_prompted_playlists", "android-system-home-followfeed", d()), new fpb("enable_video_thumbnail", "android-system-home-followfeed", e()));
    }
}
