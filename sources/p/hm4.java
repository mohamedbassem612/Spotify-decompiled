package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final luk i;
    public final idd1 j = new idd1(new gk4(this, (byte) 25));

    public hm4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
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

    public final hm4 a() {
        return (hm4) this.j.getValue();
    }

    public final boolean b() {
        hm4 hm4VarA = a();
        return hm4VarA != null ? hm4VarA.b() : this.a;
    }

    public final boolean c() {
        hm4 hm4VarA = a();
        return hm4VarA != null ? hm4VarA.c() : this.b;
    }

    public final boolean d() {
        hm4 hm4VarA = a();
        return hm4VarA != null ? hm4VarA.d() : this.c;
    }

    public final boolean e() {
        hm4 hm4VarA = a();
        return hm4VarA != null ? hm4VarA.e() : this.d;
    }

    public final boolean f() {
        hm4 hm4VarA = a();
        return hm4VarA != null ? hm4VarA.f() : this.e;
    }

    public final boolean g() {
        hm4 hm4VarA = a();
        return hm4VarA != null ? hm4VarA.g() : this.f;
    }

    public final boolean h() {
        hm4 hm4VarA = a();
        return hm4VarA != null ? hm4VarA.h() : this.g;
    }

    public final boolean i() {
        hm4 hm4VarA = a();
        return hm4VarA != null ? hm4VarA.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("editor_notes_npv_card_experiment_exposure", "android-libs-contribution-properties", b()), new fpb("enable_contribution_notes_management", "android-libs-contribution-properties", c()), new fpb("enable_notes_confirmation_snackbars", "android-libs-contribution-properties", d()), new fpb("enable_release_row_notes", "android-libs-contribution-properties", e()), new fpb("enable_track_notes", "android-libs-contribution-properties", f()), new fpb("restrict_user_notes_to_music", "android-libs-contribution-properties", g()), new fpb("show_editorial_notes", "android-libs-contribution-properties", h()), new fpb("show_user_notes", "android-libs-contribution-properties", i()));
    }
}
