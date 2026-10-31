package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class kf4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final luk g;
    public final idd1 h = new idd1(new pe4(this, (byte) 17));

    public kf4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = lukVar;
    }

    public final boolean a() {
        kf4 kf4VarC = c();
        return kf4VarC != null ? kf4VarC.a() : this.a;
    }

    public final boolean b() {
        kf4 kf4VarC = c();
        return kf4VarC != null ? kf4VarC.b() : this.b;
    }

    public final kf4 c() {
        return (kf4) this.h.getValue();
    }

    public final boolean d() {
        kf4 kf4VarC = c();
        return kf4VarC != null ? kf4VarC.d() : this.c;
    }

    public final boolean e() {
        kf4 kf4VarC = c();
        return kf4VarC != null ? kf4VarC.e() : this.d;
    }

    public final boolean f() {
        kf4 kf4VarC = c();
        return kf4VarC != null ? kf4VarC.f() : this.e;
    }

    public final boolean g() {
        kf4 kf4VarC = c();
        return kf4VarC != null ? kf4VarC.g() : this.f;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("ad_auto_dismiss", "android-feature-browse-clientnative", a()), new fpb("compose_browse_content_enabled", "android-feature-browse-clientnative", b()), new fpb("enable_e2e_test_feed", "android-feature-browse-clientnative", d()), new fpb("kodiak_play_link_card_enabled", "android-feature-browse-clientnative", e()), new fpb("send_is_tablet", "android-feature-browse-clientnative", f()), new fpb("show_audiobook_access_info_signifier", "android-feature-browse-clientnative", g())});
    }
}
