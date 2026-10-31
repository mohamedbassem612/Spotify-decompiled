package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class fvm1 implements pdy0 {
    public final boolean a;
    public final avm1 b;
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
    public final luk f28p;
    public final idd1 q;

    public fvm1(boolean z, avm1 avm1Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, luk lukVar) {
        this.a = z;
        this.b = avm1Var;
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
        this.f28p = lukVar;
        this.q = new idd1(new yrm1(this, (byte) 3));
    }

    public final boolean a() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.a() : this.a;
    }

    public final fvm1 b() {
        return (fvm1) this.q.getValue();
    }

    public final avm1 c() {
        avm1 avm1VarC;
        fvm1 fvm1VarB = b();
        return (fvm1VarB == null || (avm1VarC = fvm1VarB.c()) == null) ? this.b : avm1VarC;
    }

    public final boolean d() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.d() : this.c;
    }

    public final boolean e() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.e() : this.d;
    }

    public final boolean f() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.f() : this.e;
    }

    public final boolean g() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.g() : this.f;
    }

    public final boolean h() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.h() : this.g;
    }

    public final boolean i() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.i() : this.h;
    }

    public final boolean j() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.j() : this.i;
    }

    public final boolean k() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.k() : this.j;
    }

    public final boolean l() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.l() : this.k;
    }

    public final boolean m() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("cold_start_enabled", "your-library", a());
        String strA = c().a();
        avm1[] avm1VarArrValues = avm1.values();
        ArrayList arrayList = new ArrayList(avm1VarArrValues.length);
        for (avm1 avm1Var : avm1VarArrValues) {
            arrayList.add(avm1Var.a());
        }
        return p7h.M(fpbVar, new fpb("default_pins_section_layout", "your-library", strA, arrayList), new fpb("default_save_location_context_menu_enabled", "your-library", d()), new fpb("default_save_location_settings_enabled", "your-library", e()), new fpb("download_center_icon_enabled", "your-library", f()), new fpb("filter_reordering_enabled", "your-library", g()), new fpb("layout_settings_sheet_enabled", "your-library", h()), new fpb("library_settings_enabled", "your-library", i()), new fpb("liked_songs_platform_context_menu_enabled", "your-library", j()), new fpb("pins_section_enabled", "your-library", k()), new fpb("remember_filter_state_enabled", "your-library", l()), new fpb("select_items_enabled", "your-library", m()), new fpb("tags_bypass_eligibility_checks", "your-library", n()), new fpb("use_dsl_selection_page", "your-library", o()), new fpb("your_episodes_platform_context_menu_enabled", "your-library", p()));
    }

    public final boolean n() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.n() : this.m;
    }

    public final boolean o() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.o() : this.n;
    }

    public final boolean p() {
        fvm1 fvm1VarB = b();
        return fvm1VarB != null ? fvm1VarB.p() : this.o;
    }

    public fvm1(luk lukVar) {
        this(false, avm1.b, false, false, false, false, false, false, true, false, false, false, false, false, true, lukVar);
    }
}
