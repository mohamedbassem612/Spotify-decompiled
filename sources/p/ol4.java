package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ol4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new gk4(this, (byte) 10));

    public ol4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
    }

    public final boolean a() {
        ol4 ol4Var = (ol4) this.g.getValue();
        return ol4Var != null ? ol4Var.a() : this.a;
    }

    public final boolean b() {
        ol4 ol4Var = (ol4) this.g.getValue();
        return ol4Var != null ? ol4Var.b() : this.b;
    }

    public final boolean c() {
        ol4 ol4Var = (ol4) this.g.getValue();
        return ol4Var != null ? ol4Var.c() : this.c;
    }

    public final boolean d() {
        ol4 ol4Var = (ol4) this.g.getValue();
        return ol4Var != null ? ol4Var.d() : this.d;
    }

    public final boolean e() {
        ol4 ol4Var = (ol4) this.g.getValue();
        return ol4Var != null ? ol4Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("curate_transitions_in_ac", "android-lib-aligned-curation-flags", a()), new fpb("curation_platform_enabled", "android-lib-aligned-curation-flags", b()), new fpb("default_save_location_curation_enabled", "android-lib-aligned-curation-flags", c()), new fpb("episode_curation_trait_enabled", "android-lib-aligned-curation-flags", d()), new fpb("track_curation_trait_enabled", "android-lib-aligned-curation-flags", e()));
    }
}
