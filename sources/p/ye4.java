package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ye4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final luk i;
    public final idd1 j = new idd1(new pe4(this, (byte) 6));

    public ye4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
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

    public final boolean a() {
        ye4 ye4VarC = c();
        return ye4VarC != null ? ye4VarC.a() : this.a;
    }

    public final boolean b() {
        ye4 ye4VarC = c();
        return ye4VarC != null ? ye4VarC.b() : this.b;
    }

    public final ye4 c() {
        return (ye4) this.j.getValue();
    }

    public final boolean d() {
        ye4 ye4VarC = c();
        return ye4VarC != null ? ye4VarC.d() : this.c;
    }

    public final boolean e() {
        ye4 ye4VarC = c();
        return ye4VarC != null ? ye4VarC.e() : this.d;
    }

    public final boolean f() {
        ye4 ye4VarC = c();
        return ye4VarC != null ? ye4VarC.f() : this.e;
    }

    public final boolean g() {
        ye4 ye4VarC = c();
        return ye4VarC != null ? ye4VarC.g() : this.f;
    }

    public final boolean h() {
        ye4 ye4VarC = c();
        return ye4VarC != null ? ye4VarC.h() : this.g;
    }

    public final boolean i() {
        ye4 ye4VarC = c();
        return ye4VarC != null ? ye4VarC.i() : this.h;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("app_launch_dialog_enabled", "android-feature-age-verification", a()), new fpb("blocking_host_page_enabled", "android-feature-age-verification", b()), new fpb("episode_play_command_interceptor_enabled", "android-feature-age-verification", d()), new fpb("ignore_product_state_for_entry_points", "android-feature-age-verification", e()), new fpb("request_parental_consent_button_enabled", "android-feature-age-verification", f()), new fpb("settings_note_enabled", "android-feature-age-verification", g()), new fpb("side_drawer_entry_point_enabled", "android-feature-age-verification", h()), new fpb("unmapped_music_video_play_command_interceptor_enabled", "android-feature-age-verification", i())});
    }
}
