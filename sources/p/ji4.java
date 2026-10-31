package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ji4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final luk i;
    public final idd1 j;

    public ji4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = lukVar;
        this.j = new idd1(new sh4(this, (byte) 8));
    }

    public final ji4 a() {
        return (ji4) this.j.getValue();
    }

    public final boolean b() {
        ji4 ji4VarA = a();
        return ji4VarA != null ? ji4VarA.b() : this.a;
    }

    public final boolean c() {
        ji4 ji4VarA = a();
        return ji4VarA != null ? ji4VarA.c() : this.b;
    }

    public final boolean d() {
        ji4 ji4VarA = a();
        return ji4VarA != null ? ji4VarA.d() : this.c;
    }

    public final boolean e() {
        ji4 ji4VarA = a();
        return ji4VarA != null ? ji4VarA.e() : this.d;
    }

    public final boolean f() {
        ji4 ji4VarA = a();
        return ji4VarA != null ? ji4VarA.f() : this.e;
    }

    public final boolean g() {
        ji4 ji4VarA = a();
        return ji4VarA != null ? ji4VarA.g() : this.f;
    }

    public final boolean h() {
        ji4 ji4VarA = a();
        return ji4VarA != null ? ji4VarA.h() : this.g;
    }

    public final boolean i() {
        ji4 ji4VarA = a();
        return ji4VarA != null ? ji4VarA.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_auto_create_playlist", "android-feature-song-dna", b()), new fpb("enable_contributor_sheet", "android-feature-song-dna", c()), new fpb("enable_go_to_blend_playlist", "android-feature-song-dna", d()), new fpb("enable_go_to_covers_playlist", "android-feature-song-dna", e()), new fpb("enable_sample_chain", "android-feature-song-dna", f()), new fpb("enable_search", "android-feature-song-dna", g()), new fpb("enable_song_dna", "android-feature-song-dna", h()), new fpb("enable_song_dna_share", "android-feature-song-dna", i()));
    }

    public ji4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, lukVar);
    }
}
