package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class f95 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final luk g;
    public final idd1 h = new idd1(new f85(this, (byte) 12));

    public f95(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = lukVar;
    }

    public final f95 a() {
        return (f95) this.h.getValue();
    }

    public final boolean b() {
        f95 f95VarA = a();
        return f95VarA != null ? f95VarA.b() : this.a;
    }

    public final boolean c() {
        f95 f95VarA = a();
        return f95VarA != null ? f95VarA.c() : this.b;
    }

    public final boolean d() {
        f95 f95VarA = a();
        return f95VarA != null ? f95VarA.d() : this.c;
    }

    public final boolean e() {
        f95 f95VarA = a();
        return f95VarA != null ? f95VarA.e() : this.d;
    }

    public final boolean f() {
        f95 f95VarA = a();
        return f95VarA != null ? f95VarA.f() : this.e;
    }

    public final boolean g() {
        f95 f95VarA = a();
        return f95VarA != null ? f95VarA.g() : this.f;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("glasses_detection_enabled", "android-xr-glasses", b()), new fpb("glasses_projected_experience_enabled", "android-xr-glasses", c()), new fpb("onboarding_account_linking_nudge_enabled", "android-xr-glasses", d()), new fpb("onboarding_education_enabled", "android-xr-glasses", e()), new fpb("onboarding_session_scoped_dismissals_enabled", "android-xr-glasses", f()), new fpb("onboarding_visual_music_enabled", "android-xr-glasses", g()));
    }
}
