package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class qq4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final int c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final luk j;
    public final idd1 k;

    public qq4(boolean z, int i, int i2, boolean z2, boolean z3, int i3, boolean z4, int i4, int i5, luk lukVar) {
        this.a = z;
        this.b = i;
        this.c = i2;
        this.d = z2;
        this.e = z3;
        this.f = i3;
        this.g = z4;
        this.h = i4;
        this.i = i5;
        this.j = lukVar;
        this.k = new idd1(new lp4(this, (byte) 29));
    }

    public final boolean a() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.a() : this.a;
    }

    public final int b() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.b() : this.b;
    }

    public final qq4 c() {
        return (qq4) this.k.getValue();
    }

    public final int d() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.d() : this.c;
    }

    public final int e() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.e() : this.f;
    }

    public final boolean f() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.f() : this.g;
    }

    public final int g() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.g() : this.h;
    }

    public final int h() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.h() : this.i;
    }

    public final boolean i() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.i() : this.d;
    }

    public final boolean j() {
        qq4 qq4VarC = c();
        return qq4VarC != null ? qq4VarC.j() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("chat_enabled", "android-liveroom-listening-party", a()), new fpb("chat_max_messages", "android-liveroom-listening-party", b(), 1, 500), new fpb("initial_message_buffer_millis", "android-liveroom-listening-party", d(), 0, 10000), new fpb("is_chat_expand_button_enabled", "android-liveroom-listening-party", i()), new fpb("is_fullscreen_chat_controls_enabled", "android-liveroom-listening-party", j()), new fpb("max_live_message_delay_millis", "android-liveroom-listening-party", e(), 0, 60000), new fpb("music_playback_coordination_enabled", "android-liveroom-listening-party", f()), new fpb("periodic_message_buffer_millis", "android-liveroom-listening-party", g(), 0, 10000), new fpb("seconds_to_rewind_live_messages", "android-liveroom-listening-party", h(), 0, 300));
    }

    public qq4(luk lukVar) {
        this(false, 250, 100, true, false, 20000, true, 100, 120, lukVar);
    }
}
