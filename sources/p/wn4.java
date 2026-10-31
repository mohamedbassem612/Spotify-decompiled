package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wn4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final int g;
    public final int h;
    public final luk i;
    public final idd1 j;

    public wn4(int i, int i2, luk lukVar, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = i;
        this.h = i2;
        this.i = lukVar;
        this.j = new idd1(new om4(this, (byte) 27));
    }

    public final boolean a() {
        wn4 wn4VarB = b();
        return wn4VarB != null ? wn4VarB.a() : this.a;
    }

    public final wn4 b() {
        return (wn4) this.j.getValue();
    }

    public final boolean c() {
        wn4 wn4VarB = b();
        return wn4VarB != null ? wn4VarB.c() : this.b;
    }

    public final boolean d() {
        wn4 wn4VarB = b();
        return wn4VarB != null ? wn4VarB.d() : this.c;
    }

    public final boolean e() {
        wn4 wn4VarB = b();
        return wn4VarB != null ? wn4VarB.e() : this.d;
    }

    public final boolean f() {
        wn4 wn4VarB = b();
        return wn4VarB != null ? wn4VarB.f() : this.e;
    }

    public final boolean g() {
        wn4 wn4VarB = b();
        return wn4VarB != null ? wn4VarB.g() : this.f;
    }

    public final int h() {
        wn4 wn4VarB = b();
        return wn4VarB != null ? wn4VarB.h() : this.g;
    }

    public final int i() {
        wn4 wn4VarB = b();
        return wn4VarB != null ? wn4VarB.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("automatically_opt_in_after_message_period", "android-libs-on-demand-trials", a()), new fpb("enable_mini_trial", "android-libs-on-demand-trials", c()), new fpb("enable_one_day_trial_end_message", "android-libs-on-demand-trials", d()), new fpb("enable_opt_in_trials", "android-libs-on-demand-trials", e()), new fpb("enable_trial_signifier_for_audio_quality", "android-libs-on-demand-trials", f()), new fpb("enable_trial_signifiers", "android-libs-on-demand-trials", g()), new fpb("trial_message_period_active_days", "android-libs-on-demand-trials", h(), 0, 100), new fpb("trial_message_period_total_days", "android-libs-on-demand-trials", i(), 0, 100));
    }

    public wn4(luk lukVar) {
        this(3, 14, lukVar, false, false, false, false, false, false);
    }
}
