package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mv4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final luk f;
    public final idd1 g;

    public mv4(int i, luk lukVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = lukVar;
        this.g = new idd1(new fv4(this, (byte) 5));
    }

    public final boolean a() {
        mv4 mv4Var = (mv4) this.g.getValue();
        return mv4Var != null ? mv4Var.a() : this.a;
    }

    public final int b() {
        mv4 mv4Var = (mv4) this.g.getValue();
        return mv4Var != null ? mv4Var.b() : this.e;
    }

    public final boolean c() {
        mv4 mv4Var = (mv4) this.g.getValue();
        return mv4Var != null ? mv4Var.c() : this.b;
    }

    public final boolean d() {
        mv4 mv4Var = (mv4) this.g.getValue();
        return mv4Var != null ? mv4Var.d() : this.c;
    }

    public final boolean e() {
        mv4 mv4Var = (mv4) this.g.getValue();
        return mv4Var != null ? mv4Var.e() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_video_layer_refetch", "android-nowplaying-scrollsection", a()), new fpb("is_new_artist_verified_badge_enabled", "android-nowplaying-scrollsection", c()), new fpb("is_reorder_engagement_gating_enabled", "android-nowplaying-scrollsection", d()), new fpb("is_time_based_reorder_enabled", "android-nowplaying-scrollsection", e()), new fpb("reorder_engagement_threshold_dp", "android-nowplaying-scrollsection", b(), 0, 500)});
    }

    public mv4(luk lukVar) {
        this(40, lukVar, false, false, false, false);
    }
}
