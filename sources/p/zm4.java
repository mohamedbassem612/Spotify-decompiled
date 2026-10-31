package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final luk g;
    public final idd1 h = new idd1(new om4(this, (byte) 9));

    public zm4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = lukVar;
    }

    public final boolean a() {
        zm4 zm4VarB = b();
        return zm4VarB != null ? zm4VarB.a() : this.a;
    }

    public final zm4 b() {
        return (zm4) this.h.getValue();
    }

    public final boolean c() {
        zm4 zm4VarB = b();
        return zm4VarB != null ? zm4VarB.c() : this.b;
    }

    public final boolean d() {
        zm4 zm4VarB = b();
        return zm4VarB != null ? zm4VarB.d() : this.c;
    }

    public final boolean e() {
        zm4 zm4VarB = b();
        return zm4VarB != null ? zm4VarB.e() : this.d;
    }

    public final boolean f() {
        zm4 zm4VarB = b();
        return zm4VarB != null ? zm4VarB.f() : this.e;
    }

    public final boolean g() {
        zm4 zm4VarB = b();
        return zm4VarB != null ? zm4VarB.g() : this.f;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("compose_elements_enabled", "android-libs-nowplaying-ads-mode", a()), new fpb("in_stream_overflow_enabled", "android-libs-nowplaying-ads-mode", c()), new fpb("instream_feedback_v2_enabled", "android-libs-nowplaying-ads-mode", d()), new fpb("landscape_mode_npv_enabled", "android-libs-nowplaying-ads-mode", e()), new fpb("scope_carousel_holders_to_mode_page", "android-libs-nowplaying-ads-mode", f()), new fpb("screenshot_detection_enabled", "android-libs-nowplaying-ads-mode", g())});
    }
}
