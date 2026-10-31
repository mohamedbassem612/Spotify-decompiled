package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t75 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final luk h;
    public final idd1 i;

    public t75(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = lukVar;
        this.i = new idd1(new f55(this, (byte) 22));
    }

    public final boolean a() {
        t75 t75VarB = b();
        return t75VarB != null ? t75VarB.a() : this.a;
    }

    public final t75 b() {
        return (t75) this.i.getValue();
    }

    public final boolean c() {
        t75 t75VarB = b();
        return t75VarB != null ? t75VarB.c() : this.b;
    }

    public final boolean d() {
        t75 t75VarB = b();
        return t75VarB != null ? t75VarB.d() : this.c;
    }

    public final boolean e() {
        t75 t75VarB = b();
        return t75VarB != null ? t75VarB.e() : this.d;
    }

    public final boolean f() {
        t75 t75VarB = b();
        return t75VarB != null ? t75VarB.f() : this.e;
    }

    public final boolean g() {
        t75 t75VarB = b();
        return t75VarB != null ? t75VarB.g() : this.f;
    }

    public final boolean h() {
        t75 t75VarB = b();
        return t75VarB != null ? t75VarB.h() : this.g;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("boxed_entity_row_playlist_cache_sync_enabled", "android-watch-feed-components", a()), new fpb("disable_adaptive_content_prewarming", "android-watch-feed-components", c()), new fpb("disable_progressive_content_prewarming", "android-watch-feed-components", d()), new fpb("enable_surface_view", "android-watch-feed-components", e()), new fpb("replace_explore_button_with_search_bar", "android-watch-feed-components", f()), new fpb("skip_aligned_curation_dialog_on_remove", "android-watch-feed-components", g()), new fpb("tap_to_mute_gesture_enabled", "android-watch-feed-components", h()));
    }

    public t75(luk lukVar) {
        this(true, false, false, false, false, false, false, lukVar);
    }
}
