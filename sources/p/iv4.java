package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iv4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final luk f;
    public final idd1 g;

    public iv4(int i, luk lukVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = lukVar;
        this.g = new idd1(new fv4(this, (byte) 2));
    }

    public final boolean a() {
        iv4 iv4Var = (iv4) this.g.getValue();
        return iv4Var != null ? iv4Var.a() : this.a;
    }

    public final boolean b() {
        iv4 iv4Var = (iv4) this.g.getValue();
        return iv4Var != null ? iv4Var.b() : this.b;
    }

    public final boolean c() {
        iv4 iv4Var = (iv4) this.g.getValue();
        return iv4Var != null ? iv4Var.c() : this.c;
    }

    public final boolean d() {
        iv4 iv4Var = (iv4) this.g.getValue();
        return iv4Var != null ? iv4Var.d() : this.d;
    }

    public final int e() {
        iv4 iv4Var = (iv4) this.g.getValue();
        return iv4Var != null ? iv4Var.e() : this.e;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("defer_scroll_setup_until_playback_duration_available_enabled", "android-nowplaying-pagetemplate", a()), new fpb("floating_skip_ahead_button", "android-nowplaying-pagetemplate", b()), new fpb("mixing_transition_enabled", "android-nowplaying-pagetemplate", c()), new fpb("podcast_video_captions_button_enabled", "android-nowplaying-pagetemplate", d()), new fpb("scroll_setup_readiness_timeout_ms", "android-nowplaying-pagetemplate", e(), 0, 30000)});
    }

    public iv4(luk lukVar) {
        this(5000, lukVar, false, false, false, false);
    }
}
