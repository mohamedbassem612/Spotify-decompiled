package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gi4 implements pdy0 {
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
    public final fi4 m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f6p;
    public final luk q;
    public final idd1 r;

    public gi4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, fi4 fi4Var, boolean z13, boolean z14, boolean z15, luk lukVar) {
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
        this.m = fi4Var;
        this.n = z13;
        this.o = z14;
        this.f6p = z15;
        this.q = lukVar;
        this.r = new idd1(new sh4(this, (byte) 6));
    }

    public final boolean a() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.a() : this.a;
    }

    public final boolean b() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.b() : this.b;
    }

    public final boolean c() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.c() : this.c;
    }

    public final boolean d() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.d() : this.d;
    }

    public final gi4 e() {
        return (gi4) this.r.getValue();
    }

    public final boolean f() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.f() : this.e;
    }

    public final boolean g() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.g() : this.f;
    }

    public final boolean h() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.h() : this.g;
    }

    public final boolean i() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.i() : this.h;
    }

    public final boolean j() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.j() : this.i;
    }

    public final boolean k() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.k() : this.j;
    }

    public final boolean l() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.l() : this.k;
    }

    public final boolean m() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.m() : this.l;
    }

    public final List models() {
        fpb fpbVar = new fpb("community_tab_enabled", "android-feature-show-page-cwp", a());
        fpb fpbVar2 = new fpb("context_aware_show_page_enabled", "android-feature-show-page-cwp", b());
        fpb fpbVar3 = new fpb("context_menu_in_toolbar_trailing_action_show", "android-feature-show-page-cwp", c());
        fpb fpbVar4 = new fpb("creative_work_best_place_to_start_enabled", "android-feature-show-page-cwp", d());
        fpb fpbVar5 = new fpb("enable_age_assurance_verification", "android-feature-show-page-cwp", f());
        fpb fpbVar6 = new fpb("enable_override_progress_api", "android-feature-show-page-cwp", g());
        fpb fpbVar7 = new fpb("enable_rating_target", "android-feature-show-page-cwp", h());
        fpb fpbVar8 = new fpb("hide_podcast_trailer", "android-feature-show-page-cwp", i());
        fpb fpbVar9 = new fpb("host_recommendations_enabled", "android-feature-show-page-cwp", j());
        fpb fpbVar10 = new fpb("media_prefetch_enabled", "android-feature-show-page-cwp", k());
        fpb fpbVar11 = new fpb("member_button_enabled", "android-feature-show-page-cwp", l());
        fpb fpbVar12 = new fpb("no_initial_show_cosmos_sub", "android-feature-show-page-cwp", m());
        String str = n().a;
        fi4[] fi4VarArrValues = fi4.values();
        ArrayList arrayList = new ArrayList(fi4VarArrValues.length);
        int i = 0;
        for (int length = fi4VarArrValues.length; i < length; length = length) {
            arrayList.add(fi4VarArrValues[i].a);
            i++;
        }
        return p7h.M(new fpb[]{fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, fpbVar8, fpbVar9, fpbVar10, fpbVar11, fpbVar12, new fpb("provided_sort_lens", "android-feature-show-page-cwp", str, arrayList), new fpb("share_in_action_row_enabled_show", "android-feature-show-page-cwp", o()), new fpb("should_use_compose_encore_list_row", "android-feature-show-page-cwp", p()), new fpb("use_kodiak_releaserow", "android-feature-show-page-cwp", q())});
    }

    public final fi4 n() {
        fi4 fi4VarN;
        gi4 gi4VarE = e();
        return (gi4VarE == null || (fi4VarN = gi4VarE.n()) == null) ? this.m : fi4VarN;
    }

    public final boolean o() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.o() : this.n;
    }

    public final boolean p() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.p() : this.o;
    }

    public final boolean q() {
        gi4 gi4VarE = e();
        return gi4VarE != null ? gi4VarE.q() : this.f6p;
    }

    public gi4(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, false, false, false, fi4.DISABLED, false, false, false, lukVar);
    }
}
