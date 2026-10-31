package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    public final boolean g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final boolean l;
    public final luk m;
    public final idd1 n = new idd1(new cg4(this, (byte) 15));

    public zg4(boolean z, boolean z2, boolean z3, boolean z4, int i, int i2, boolean z5, int i3, int i4, int i5, int i6, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = i;
        this.f = i2;
        this.g = z5;
        this.h = i3;
        this.i = i4;
        this.j = i5;
        this.k = i6;
        this.l = z6;
        this.m = lukVar;
    }

    public final zg4 a() {
        return (zg4) this.n.getValue();
    }

    public final boolean b() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.b() : this.a;
    }

    public final boolean c() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.c() : this.b;
    }

    public final boolean d() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.d() : this.c;
    }

    public final int e() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.e() : this.e;
    }

    public final int f() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.f() : this.f;
    }

    public final boolean g() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.g() : this.g;
    }

    public final int h() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.h() : this.h;
    }

    public final int i() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.i() : this.i;
    }

    public final int j() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.j() : this.j;
    }

    public final int k() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.k() : this.k;
    }

    public final boolean l() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.l() : this.l;
    }

    public final boolean m() {
        zg4 zg4VarA = a();
        return zg4VarA != null ? zg4VarA.m() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_device_state_sync", "android-feature-notificationssdk", b()), new fpb("enable_per_message_worker_name", "android-feature-notificationssdk", c()), new fpb("enable_push_token_sync_worker", "android-feature-notificationssdk", d()), new fpb("is_messages_channel_enabled", "android-feature-notificationssdk", m()), new fpb("log_device_settings_flex_interval", "android-feature-notificationssdk", e(), 0, 6), new fpb("log_device_settings_timer", "android-feature-notificationssdk", f(), 1, 72), new fpb("push_handler_sync", "android-feature-notificationssdk", g()), new fpb("push_handler_timekeeper_sample_rate", "android-feature-notificationssdk", h(), 0, 100), new fpb("push_image_load_timeout_ms", "android-feature-notificationssdk", i(), 1000, 30000), new fpb("robin_log_initial_delay_ms", "android-feature-notificationssdk", j(), 1000, 60000), new fpb("robin_log_max_retries", "android-feature-notificationssdk", k(), 0, 3), new fpb("validate_jam_notifications", "android-feature-notificationssdk", l()));
    }
}
