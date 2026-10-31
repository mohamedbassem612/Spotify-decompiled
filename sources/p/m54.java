package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m54 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final luk g;
    public final idd1 h;

    public m54(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = lukVar;
        this.h = new idd1(new m44(this, (byte) 18));
    }

    public final boolean a() {
        m54 m54VarB = b();
        return m54VarB != null ? m54VarB.a() : this.a;
    }

    public final m54 b() {
        return (m54) this.h.getValue();
    }

    public final boolean c() {
        m54 m54VarB = b();
        return m54VarB != null ? m54VarB.c() : this.b;
    }

    public final boolean d() {
        m54 m54VarB = b();
        return m54VarB != null ? m54VarB.d() : this.c;
    }

    public final boolean e() {
        m54 m54VarB = b();
        return m54VarB != null ? m54VarB.e() : this.d;
    }

    public final boolean f() {
        m54 m54VarB = b();
        return m54VarB != null ? m54VarB.f() : this.e;
    }

    public final boolean g() {
        m54 m54VarB = b();
        return m54VarB != null ? m54VarB.g() : this.f;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("always_request_focus_after_gaining_focus", "android-audio-focus-services-impl", a()), new fpb("focus_ducking_stop_guard_kill_switch", "android-audio-focus-services-impl", c()), new fpb("preserve_transient_focus_loss_on_speaker_disconnect", "android-audio-focus-services-impl", d()), new fpb("resume_playback_on_focus_gain_on_alarm_stream", "android-audio-focus-services-impl", e()), new fpb("use_list_player_audio_focus_esperanto", "android-audio-focus-services-impl", f()), new fpb("wait_for_player_command_completion", "android-audio-focus-services-impl", g()));
    }

    public m54(luk lukVar) {
        this(false, false, true, true, true, true, lukVar);
    }
}
