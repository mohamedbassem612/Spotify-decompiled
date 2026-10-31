package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class tg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final luk g;
    public final idd1 h = new idd1(new cg4(this, (byte) 10));

    public tg4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = lukVar;
    }

    public final boolean a() {
        tg4 tg4VarE = e();
        return tg4VarE != null ? tg4VarE.a() : this.a;
    }

    public final boolean b() {
        tg4 tg4VarE = e();
        return tg4VarE != null ? tg4VarE.b() : this.b;
    }

    public final boolean c() {
        tg4 tg4VarE = e();
        return tg4VarE != null ? tg4VarE.c() : this.c;
    }

    public final boolean d() {
        tg4 tg4VarE = e();
        return tg4VarE != null ? tg4VarE.d() : this.d;
    }

    public final tg4 e() {
        return (tg4) this.h.getValue();
    }

    public final boolean f() {
        tg4 tg4VarE = e();
        return tg4VarE != null ? tg4VarE.f() : this.e;
    }

    public final boolean g() {
        tg4 tg4VarE = e();
        return tg4VarE != null ? tg4VarE.g() : this.f;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("album_prerelease_full_width_limitation_enabled", "android-feature-main-layout", a()), new fpb("browse_full_width", "android-feature-main-layout", b()), new fpb("creator_full_width", "android-feature-main-layout", c()), new fpb("cwp_full_width", "android-feature-main-layout", d()), new fpb("home_full_width", "android-feature-main-layout", f()), new fpb("releases_page_full_width_limitation_enabled", "android-feature-main-layout", g())});
    }
}
