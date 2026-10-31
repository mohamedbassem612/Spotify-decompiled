package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class p74 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new m44(this, (byte) 27));

    public p74(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
    }

    public final boolean a() {
        p74 p74Var = (p74) this.g.getValue();
        return p74Var != null ? p74Var.a() : this.a;
    }

    public final boolean b() {
        p74 p74Var = (p74) this.g.getValue();
        return p74Var != null ? p74Var.b() : this.b;
    }

    public final boolean c() {
        p74 p74Var = (p74) this.g.getValue();
        return p74Var != null ? p74Var.c() : this.c;
    }

    public final boolean d() {
        p74 p74Var = (p74) this.g.getValue();
        return p74Var != null ? p74Var.d() : this.d;
    }

    public final boolean e() {
        p74 p74Var = (p74) this.g.getValue();
        return p74Var != null ? p74Var.e() : this.e;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("absolute_clip_position_enabled", "android-betamax-context-player", a()), new fpb("defer_app_start_prepare_enabled", "android-betamax-context-player", b()), new fpb("resume_anchored_pttff_enabled", "android-betamax-context-player", c()), new fpb("stop_ad_player_on_transition_enabled", "android-betamax-context-player", d()), new fpb("video_ads_caching_enabled", "android-betamax-context-player", e())});
    }
}
