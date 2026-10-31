package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lh4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g;

    public lh4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
        this.g = new idd1(new cg4(this, (byte) 24));
    }

    public final boolean a() {
        lh4 lh4Var = (lh4) this.g.getValue();
        return lh4Var != null ? lh4Var.a() : this.a;
    }

    public final boolean b() {
        lh4 lh4Var = (lh4) this.g.getValue();
        return lh4Var != null ? lh4Var.b() : this.b;
    }

    public final boolean c() {
        lh4 lh4Var = (lh4) this.g.getValue();
        return lh4Var != null ? lh4Var.c() : this.c;
    }

    public final boolean d() {
        lh4 lh4Var = (lh4) this.g.getValue();
        return lh4Var != null ? lh4Var.d() : this.d;
    }

    public final boolean e() {
        lh4 lh4Var = (lh4) this.g.getValue();
        return lh4Var != null ? lh4Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("context_menu_in_toolbar_trailing_action_episode", "android-feature-podcast-episode-cwp", a()), new fpb("enable_creative_work_full_slice_plugins_on_episode", "android-feature-podcast-episode-cwp", b()), new fpb("media_prefetch_enabled", "android-feature-podcast-episode-cwp", c()), new fpb("media_prefetch_resume_position_enabled", "android-feature-podcast-episode-cwp", d()), new fpb("music_contributor_attribution_enabled", "android-feature-podcast-episode-cwp", e()));
    }

    public lh4(luk lukVar) {
        this(false, true, false, false, false, lukVar);
    }
}
