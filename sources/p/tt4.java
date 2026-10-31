package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tt4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final luk i;
    public final idd1 j = new idd1(new st4(this, (byte) 0));

    public tt4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = lukVar;
    }

    public final tt4 a() {
        return (tt4) this.j.getValue();
    }

    public final boolean b() {
        tt4 tt4VarA = a();
        return tt4VarA != null ? tt4VarA.b() : this.h;
    }

    public final boolean c() {
        tt4 tt4VarA = a();
        return tt4VarA != null ? tt4VarA.c() : this.a;
    }

    public final boolean d() {
        tt4 tt4VarA = a();
        return tt4VarA != null ? tt4VarA.d() : this.b;
    }

    public final boolean e() {
        tt4 tt4VarA = a();
        return tt4VarA != null ? tt4VarA.e() : this.c;
    }

    public final boolean f() {
        tt4 tt4VarA = a();
        return tt4VarA != null ? tt4VarA.f() : this.d;
    }

    public final boolean g() {
        tt4 tt4VarA = a();
        return tt4VarA != null ? tt4VarA.g() : this.e;
    }

    public final boolean h() {
        tt4 tt4VarA = a();
        return tt4VarA != null ? tt4VarA.h() : this.f;
    }

    public final boolean i() {
        tt4 tt4VarA = a();
        return tt4VarA != null ? tt4VarA.i() : this.g;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("is_chaptered_content_fetch_enabled", "android-multitrackmusicvideo-configurationimpl", c()), new fpb("is_chaptered_content_render_enabled", "android-multitrackmusicvideo-configurationimpl", d()), new fpb("is_go_to_album_hidden_for_multi_song_tracks", "android-multitrackmusicvideo-configurationimpl", e()), new fpb("is_mft_plus_entity_segments_disable_enabled", "android-multitrackmusicvideo-configurationimpl", f()), new fpb("is_mft_rules_preserved_for_multi_song_content", "android-multitrackmusicvideo-configurationimpl", g()), new fpb("is_multi_song_row_enabled", "android-multitrackmusicvideo-configurationimpl", h()), new fpb("is_multi_song_track_reroute_enabled", "android-multitrackmusicvideo-configurationimpl", i()), new fpb("override_chaptered_content_type_as_talk", "android-multitrackmusicvideo-configurationimpl", b()));
    }
}
