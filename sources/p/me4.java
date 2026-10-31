package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class me4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final luk j;
    public final idd1 k = new idd1(new wb4(this, (byte) 28));

    public me4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = lukVar;
    }

    public final boolean a() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.a() : this.a;
    }

    public final boolean b() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.b() : this.b;
    }

    public final boolean c() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.c() : this.c;
    }

    public final boolean d() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.d() : this.d;
    }

    public final me4 e() {
        return (me4) this.k.getValue();
    }

    public final boolean f() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.f() : this.e;
    }

    public final boolean g() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.g() : this.f;
    }

    public final boolean h() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.h() : this.g;
    }

    public final boolean i() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.i() : this.i;
    }

    public final boolean j() {
        me4 me4VarE = e();
        return me4VarE != null ? me4VarE.j() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("audiobook_clips_enabled", "android-entity-segments", a()), new fpb("canonical_timeline_enabled", "android-entity-segments", b()), new fpb("clip_detail_sections_via_list_endpoint_enabled", "android-entity-segments", c()), new fpb("clip_notes_enabled", "android-entity-segments", d()), new fpb("enable_chapter_aware_episode_rows", "android-entity-segments", f()), new fpb("enable_content_experience_trait_on_entity_page", "android-entity-segments", g()), new fpb("enable_track_uris_for_episode_rows", "android-entity-segments", h()), new fpb("is_clip_editing_enabled", "android-entity-segments", j()), new fpb("music_clips_enabled", "android-entity-segments", i()));
    }
}
