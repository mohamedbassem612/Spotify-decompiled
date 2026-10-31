package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class dg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new cg4(this, (byte) 0));

    public dg4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        dg4 dg4Var = (dg4) this.e.getValue();
        return dg4Var != null ? dg4Var.a() : this.a;
    }

    public final boolean b() {
        dg4 dg4Var = (dg4) this.e.getValue();
        return dg4Var != null ? dg4Var.b() : this.b;
    }

    public final boolean c() {
        dg4 dg4Var = (dg4) this.e.getValue();
        return dg4Var != null ? dg4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_artist_page_navigation", "android-feature-free-tier-track", a()), new fpb("enable_free_tier_track_page", "android-feature-free-tier-track", b()), new fpb("enable_play_track_as_a_list", "android-feature-free-tier-track", c()));
    }
}
