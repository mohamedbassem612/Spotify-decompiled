package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class mr4 implements pdy0 {
    public final idd1 A;
    public final boolean a;
    public final lr4 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f56p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final boolean v;
    public final boolean w;
    public final boolean x;
    public final boolean y;
    public final luk z;

    public mr4(boolean z, lr4 lr4Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, luk lukVar) {
        this.a = z;
        this.b = lr4Var;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = z9;
        this.k = z10;
        this.l = z11;
        this.m = z12;
        this.n = z13;
        this.o = z14;
        this.f56p = z15;
        this.q = z16;
        this.r = z17;
        this.s = z18;
        this.t = z19;
        this.u = z20;
        this.v = z21;
        this.w = z22;
        this.x = z23;
        this.y = z24;
        this.z = lukVar;
        this.A = new idd1(new rq4(this, (byte) 13));
    }

    public final boolean a() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.a() : this.a;
    }

    public final lr4 b() {
        lr4 lr4VarB;
        mr4 mr4VarF = f();
        return (mr4VarF == null || (lr4VarB = mr4VarF.b()) == null) ? this.b : lr4VarB;
    }

    public final boolean c() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.c() : this.c;
    }

    public final boolean d() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.d() : this.d;
    }

    public final boolean e() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.e() : this.e;
    }

    public final mr4 f() {
        return (mr4) this.A.getValue();
    }

    public final boolean g() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.g() : this.f;
    }

    public final boolean h() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.h() : this.g;
    }

    public final boolean i() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.i() : this.h;
    }

    public final boolean j() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.j() : this.i;
    }

    public final boolean k() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.k() : this.j;
    }

    public final boolean l() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.l() : this.k;
    }

    public final boolean m() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("audio_recognition_enabled", "android-martini-flags", a());
        String str = b().a;
        lr4[] lr4VarArrValues = lr4.values();
        ArrayList arrayList = new ArrayList(lr4VarArrValues.length);
        for (lr4 lr4Var : lr4VarArrValues) {
            arrayList.add(lr4Var.a);
        }
        return p7h.M(fpbVar, new fpb("card_peek_redesign_enabled", "android-martini-flags", str, arrayList), new fpb("card_streaming_text_animation_enabled", "android-martini-flags", c()), new fpb("chat_entry_beta_tag_hidden", "android-martini-flags", d()), new fpb("chat_playlist_header_enabled", "android-martini-flags", e()), new fpb("direct_prompt_tap_enabled", "android-martini-flags", g()), new fpb("full_markdown_rendering_enabled", "android-martini-flags", h()), new fpb("home_pill_glow_animation_enabled", "android-martini-flags", i()), new fpb("idj_npv_martini_entry_point_enabled", "android-martini-flags", j()), new fpb("image_search_enabled", "android-martini-flags", k()), new fpb("minichat_agent_icon_animation_enabled", "android-martini-flags", l()), new fpb("minichat_bottom_placement_enabled", "android-martini-flags", m()), new fpb("minichat_enabled", "android-martini-flags", n()), new fpb("minichat_thinking_glow_enabled", "android-martini-flags", o()), new fpb("next_previous_buttons_enabled", "android-martini-flags", p()), new fpb("no_prompt_suggestions_enabled", "android-martini-flags", q()), new fpb("npv_agent_button_enabled", "android-martini-flags", r()), new fpb("npv_floating_chat_enabled", "android-martini-flags", s()), new fpb("prompt_cta_enabled", "android-martini-flags", t()), new fpb("realtime_voice_enabled", "android-martini-flags", u()), new fpb("stop_generation_enabled", "android-martini-flags", v()), new fpb("story_share_enabled", "android-martini-flags", w()), new fpb("tts_enabled", "android-martini-flags", x()), new fpb("vertical_prompt_suggestions_enabled", "android-martini-flags", y()), new fpb("voice_chat_character_settings_enabled", "android-martini-flags", z()));
    }

    public final boolean n() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.n() : this.m;
    }

    public final boolean o() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.o() : this.n;
    }

    public final boolean p() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.p() : this.o;
    }

    public final boolean q() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.q() : this.f56p;
    }

    public final boolean r() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.r() : this.q;
    }

    public final boolean s() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.s() : this.r;
    }

    public final boolean t() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.t() : this.s;
    }

    public final boolean u() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.u() : this.t;
    }

    public final boolean v() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.v() : this.u;
    }

    public final boolean w() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.w() : this.v;
    }

    public final boolean x() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.x() : this.w;
    }

    public final boolean y() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.y() : this.x;
    }

    public final boolean z() {
        mr4 mr4VarF = f();
        return mr4VarF != null ? mr4VarF.z() : this.y;
    }

    public mr4(luk lukVar) {
        this(false, lr4.CONTROL, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, lukVar);
    }
}
