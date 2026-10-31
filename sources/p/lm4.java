package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class lm4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final jm4 j;
    public final int k;
    public final km4 l;
    public final boolean m;
    public final luk n;
    public final idd1 o;

    public lm4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, jm4 jm4Var, int i, km4 km4Var, boolean z10, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = jm4Var;
        this.k = i;
        this.l = km4Var;
        this.m = z10;
        this.n = lukVar;
        this.o = new idd1(new gk4(this, (byte) 27));
    }

    public final lm4 a() {
        return (lm4) this.o.getValue();
    }

    public final boolean b() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.b() : this.a;
    }

    public final boolean c() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.c() : this.b;
    }

    public final boolean d() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.d() : this.c;
    }

    public final boolean e() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.e() : this.d;
    }

    public final boolean f() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.f() : this.e;
    }

    public final boolean g() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.g() : this.f;
    }

    public final boolean h() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.h() : this.g;
    }

    public final boolean i() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.i() : this.h;
    }

    public final boolean j() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.j() : this.i;
    }

    public final jm4 k() {
        jm4 jm4VarK;
        lm4 lm4VarA = a();
        return (lm4VarA == null || (jm4VarK = lm4VarA.k()) == null) ? this.j : jm4VarK;
    }

    public final int l() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.l() : this.k;
    }

    public final km4 m() {
        km4 km4VarM;
        lm4 lm4VarA = a();
        return (lm4VarA == null || (km4VarM = lm4VarA.m()) == null) ? this.l : km4VarM;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("enable_always_show_new_interaction_in_container", "android-libs-endless-feed", b());
        fpb fpbVar2 = new fpb("enable_dj_feedback", "android-libs-endless-feed", c());
        fpb fpbVar3 = new fpb("enable_dj_persona_v2", "android-libs-endless-feed", d());
        fpb fpbVar4 = new fpb("enable_dj_voice_commentary_setting", "android-libs-endless-feed", e());
        fpb fpbVar5 = new fpb("enable_interactivity_from_uri", "android-libs-endless-feed", f());
        fpb fpbVar6 = new fpb("enable_interactivity_standalone_player", "android-libs-endless-feed", g());
        fpb fpbVar7 = new fpb("enable_mic_permission_dialog_pause", "android-libs-endless-feed", h());
        fpb fpbVar8 = new fpb("enable_premium_upsell_dialog", "android-libs-endless-feed", i());
        fpb fpbVar9 = new fpb("enable_voice_improvements", "android-libs-endless-feed", j());
        String str = k().a;
        jm4[] jm4VarArrValues = jm4.values();
        ArrayList arrayList = new ArrayList(jm4VarArrValues.length);
        for (jm4 jm4Var : jm4VarArrValues) {
            arrayList.add(jm4Var.a);
        }
        fpb fpbVar10 = new fpb("interactivity_container_dismiss_state", "android-libs-endless-feed", str, arrayList);
        fpb fpbVar11 = new fpb("interactivity_timeout_ms", "android-libs-endless-feed", l(), 0, 60000);
        String str2 = m().a;
        km4[] km4VarArrValues = km4.values();
        ArrayList arrayList2 = new ArrayList(km4VarArrValues.length);
        int length = km4VarArrValues.length;
        int i = 0;
        while (i < length) {
            arrayList2.add(km4VarArrValues[i].a);
            i++;
            fpbVar = fpbVar;
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, fpbVar8, fpbVar9, fpbVar10, fpbVar11, new fpb("market_for_disclaimer", "android-libs-endless-feed", str2, arrayList2), new fpb("prompt_via_signal", "android-libs-endless-feed", n()));
    }

    public final boolean n() {
        lm4 lm4VarA = a();
        return lm4VarA != null ? lm4VarA.n() : this.m;
    }

    public lm4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, jm4.ACKNOWLEDGE, 30000, km4.US_MARKET, false, lukVar);
    }
}
