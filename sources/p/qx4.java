package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qx4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final luk o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f64p;

    public qx4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = z14;
        this.o = lukVar;
        this.f64p = new idd1(new fv4(this, (byte) 28));
    }

    public final boolean a() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.a() : this.a;
    }

    public final qx4 b() {
        return (qx4) this.f64p.getValue();
    }

    public final boolean c() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.c() : this.b;
    }

    public final boolean d() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.d() : this.c;
    }

    public final boolean e() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.e() : this.d;
    }

    public final boolean f() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.f() : this.e;
    }

    public final boolean g() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.g() : this.f;
    }

    public final boolean h() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.h() : this.g;
    }

    public final boolean i() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.i() : this.h;
    }

    public final boolean j() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.j() : this.i;
    }

    public final boolean k() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.k() : this.j;
    }

    public final boolean l() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.l() : this.k;
    }

    public final boolean m() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.m() : this.l;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("creator_element_group_chat", "android-playlist-collaboration-availability", a()), new fpb("on_platform_invite_enabled", "android-playlist-collaboration-availability", c()), new fpb("on_platform_invite_join_button_enabled", "android-playlist-collaboration-availability", d()), new fpb("on_platform_invite_owner_card_enabled", "android-playlist-collaboration-availability", e()), new fpb("reaction_selection_in_reaction_bottomsheet", "android-playlist-collaboration-availability", f()), new fpb("reactions_audiobook_release_row", "android-playlist-collaboration-availability", g()), new fpb("reactions_episode_release_row", "android-playlist-collaboration-availability", h()), new fpb("reactions_secondary_action_in_item_list_row", "android-playlist-collaboration-availability", i()), new fpb("reply_from_reaction_bottomsheet_enabled", "android-playlist-collaboration-availability", j()), new fpb("show_added_by_badge_on_audiobook_row_artwork", "android-playlist-collaboration-availability", k()), new fpb("show_added_by_badge_on_episode_row_artwork", "android-playlist-collaboration-availability", l()), new fpb("show_added_by_badge_on_row_artwork", "android-playlist-collaboration-availability", m()), new fpb("show_collaborative_artwork_in_context_menu", "android-playlist-collaboration-availability", n()), new fpb("social_context_menu_enabled", "android-playlist-collaboration-availability", o())});
    }

    public final boolean n() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.n() : this.m;
    }

    public final boolean o() {
        qx4 qx4VarB = b();
        return qx4VarB != null ? qx4VarB.o() : this.n;
    }

    public qx4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, false, false, false, false, false, lukVar);
    }
}
