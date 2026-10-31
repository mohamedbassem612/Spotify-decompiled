package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hgd0 implements pdy0 {
    public final boolean a;
    public final boolean b;
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
    public final int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f37p;
    public final boolean q;
    public final fgd0 r;
    public final tgp0 s;
    public final luk t;
    public final idd1 u = new idd1(new cc00(this, (byte) 22));
    public final idd1 v = new idd1(new nzb0(this, (byte) 29));

    public hgd0(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, int i, boolean z15, boolean z16, fgd0 fgd0Var, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = z9;
        this.j = z10;
        this.k = z11;
        this.l = z12;
        this.m = z13;
        this.n = z14;
        this.o = i;
        this.f37p = z15;
        this.q = z16;
        this.r = fgd0Var;
        this.s = tgp0Var;
        this.t = lukVar;
    }

    public final boolean a() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.a() : this.a;
    }

    public final boolean b() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.b() : this.b;
    }

    public final boolean c() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.c() : this.c;
    }

    public final boolean d() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.d() : this.d;
    }

    public final boolean e() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.e() : this.e;
    }

    public final hgd0 f() {
        return (hgd0) this.v.getValue();
    }

    public final boolean g() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.g() : this.f;
    }

    public final boolean h() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.h() : this.g;
    }

    public final boolean i() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.i() : this.h;
    }

    public final boolean j() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.j() : this.i;
    }

    public final boolean k() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.k() : this.j;
    }

    public final boolean l() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.l() : this.k;
    }

    public final boolean m() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("activity_sharing_with_followers_setting_available", "listening-activity", a());
        fpb fpbVar2 = new fpb("activity_sheet_preview_play_enabled", "listening-activity", b());
        fpb fpbVar3 = new fpb("activity_sheet_show_play_context", "listening-activity", c());
        fpb fpbVar4 = new fpb("carousel_enabled", "listening-activity", d());
        fpb fpbVar5 = new fpb("custom_reactions_enabled", "listening-activity", e());
        fpb fpbVar6 = new fpb("enable_text_input_detail_sheet", "listening-activity", g());
        fpb fpbVar7 = new fpb("following_reactions_enabled", "listening-activity", h());
        fpb fpbVar8 = new fpb("hide_user_activity_enabled", "listening-activity", i());
        fpb fpbVar9 = new fpb("invite_first_in_carousel_enabled", "listening-activity", j());
        fpb fpbVar10 = new fpb("kodiak_indicators_enabled", "listening-activity", k());
        fpb fpbVar11 = new fpb("listen_along_copy_enabled", "listening-activity", l());
        fpb fpbVar12 = new fpb("listening_activity_enabled", "listening-activity", m());
        fpb fpbVar13 = new fpb("listening_activity_new_settings_copy_enabled", "listening-activity", n());
        fpb fpbVar14 = new fpb("listening_activity_show_onboarding_from_side_drawer", "listening-activity", o());
        fpb fpbVar15 = new fpb("poll_interval_ms", "listening-activity", q(), 1000, 30000);
        fpb fpbVar16 = new fpb("show_view_others_listening_activity_setting", "listening-activity", r());
        fpb fpbVar17 = new fpb("visibility_indicator_enabled", "listening-activity", s());
        String strA = t().a();
        fgd0[] fgd0VarArrValues = fgd0.values();
        ArrayList arrayList = new ArrayList(fgd0VarArrValues.length);
        for (fgd0 fgd0Var : fgd0VarArrValues) {
            arrayList.add(fgd0Var.a());
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, fpbVar8, fpbVar9, fpbVar10, fpbVar11, fpbVar12, fpbVar13, fpbVar14, fpbVar15, fpbVar16, fpbVar17, new fpb("visibility_indicator_treatment", "listening-activity", strA, arrayList));
    }

    public final boolean n() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.n() : this.m;
    }

    public final boolean o() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.o() : this.n;
    }

    public final Observable p() {
        if (this.s == null) {
            return l1d.h(this.q);
        }
        Observable observableDistinctUntilChanged = ((Observable) this.u.getValue()).map(een.j1).distinctUntilChanged();
        observableDistinctUntilChanged.getClass();
        return observableDistinctUntilChanged;
    }

    public final int q() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.q() : this.o;
    }

    public final boolean r() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.r() : this.f37p;
    }

    public final boolean s() {
        hgd0 hgd0VarF = f();
        return hgd0VarF != null ? hgd0VarF.s() : this.q;
    }

    public final fgd0 t() {
        fgd0 fgd0VarT;
        hgd0 hgd0VarF = f();
        return (hgd0VarF == null || (fgd0VarT = hgd0VarF.t()) == null) ? this.r : fgd0VarT;
    }
}
