package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jy4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public jy4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new sx4(this, (byte) 14));
    }

    public final boolean a() {
        jy4 jy4Var = (jy4) this.f.getValue();
        return jy4Var != null ? jy4Var.a() : this.a;
    }

    public final boolean b() {
        jy4 jy4Var = (jy4) this.f.getValue();
        return jy4Var != null ? jy4Var.b() : this.b;
    }

    public final boolean c() {
        jy4 jy4Var = (jy4) this.f.getValue();
        return jy4Var != null ? jy4Var.c() : this.c;
    }

    public final boolean d() {
        jy4 jy4Var = (jy4) this.f.getValue();
        return jy4Var != null ? jy4Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("delete_show_enabled", "android-podcastsettings-page", a()), new fpb("enable_podcast_settings_page", "android-podcastsettings-page", b()), new fpb("set_schedule_enabled", "android-podcastsettings-page", c()), new fpb("skip_finished_episodes_enabled", "android-podcastsettings-page", d()));
    }

    public jy4(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
