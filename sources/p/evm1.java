package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class evm1 implements pdy0 {
    public final boolean A;
    public final boolean B;
    public final boolean C;
    public final cvm1 D;
    public final boolean E;
    public final boolean F;
    public final luk G;
    public final idd1 H;
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
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f24p;
    public final boolean q;
    public final boolean r;
    public final int s;
    public final int t;
    public final int u;
    public final int v;
    public final int w;
    public final boolean x;
    public final boolean y;
    public final boolean z;

    public evm1(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i, int i2, int i3, int i4, int i5, boolean z19, boolean z20, boolean z21, boolean z22, boolean z23, boolean z24, cvm1 cvm1Var, boolean z25, boolean z26, luk lukVar) {
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
        this.o = z15;
        this.f24p = z16;
        this.q = z17;
        this.r = z18;
        this.s = i;
        this.t = i2;
        this.u = i3;
        this.v = i4;
        this.w = i5;
        this.x = z19;
        this.y = z20;
        this.z = z21;
        this.A = z22;
        this.B = z23;
        this.C = z24;
        this.D = cvm1Var;
        this.E = z25;
        this.F = z26;
        this.G = lukVar;
        this.H = new idd1(new kyk1(this, (byte) 2));
    }

    public final boolean A() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.A() : this.z;
    }

    public final boolean B() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.B() : this.A;
    }

    public final boolean C() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.C() : this.B;
    }

    public final boolean D() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.D() : this.C;
    }

    public final cvm1 E() {
        cvm1 cvm1VarE;
        evm1 evm1VarE = e();
        return (evm1VarE == null || (cvm1VarE = evm1VarE.E()) == null) ? this.D : cvm1VarE;
    }

    public final boolean F() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.F() : this.E;
    }

    public final boolean G() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.G() : this.F;
    }

    public final boolean a() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.a() : this.a;
    }

    public final boolean b() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.b() : this.b;
    }

    public final boolean c() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.c() : this.c;
    }

    public final boolean d() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.d() : this.d;
    }

    public final evm1 e() {
        return (evm1) this.H.getValue();
    }

    public final boolean f() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.f() : this.e;
    }

    public final boolean g() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.g() : this.f;
    }

    public final boolean h() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.h() : this.g;
    }

    public final boolean i() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.i() : this.h;
    }

    public final boolean j() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.j() : this.i;
    }

    public final boolean k() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.k() : this.j;
    }

    public final boolean l() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.l() : this.k;
    }

    public final boolean m() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.m() : this.l;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("album_new_release_icon_enabled", "your-library", a());
        fpb fpbVar2 = new fpb("consider_fast_scrolling_for_edge_approaching_calculations", "your-library", b());
        fpb fpbVar3 = new fpb("context_menu_accessory", "your-library", c());
        fpb fpbVar4 = new fpb("create_playlist_assistant_card_enabled", "your-library", d());
        fpb fpbVar5 = new fpb("denser_rows_enabled", "your-library", f());
        fpb fpbVar6 = new fpb("enable_also_available_offline", "your-library", g());
        fpb fpbVar7 = new fpb("enable_concert_campaigns", "your-library", h());
        fpb fpbVar8 = new fpb("enable_euterpe_tooltip", "your-library", i());
        fpb fpbVar9 = new fpb("enable_hint_providers", "your-library", j());
        fpb fpbVar10 = new fpb("enable_step_quick_scroll", "your-library", k());
        fpb fpbVar11 = new fpb("enable_venues", "your-library", l());
        fpb fpbVar12 = new fpb("enable_your_episodes_with_continue_listening", "your-library", m());
        fpb fpbVar13 = new fpb("follow_podcast_assistant_card_enabled", "your-library", n());
        fpb fpbVar14 = new fpb("global_search_from_library_enabled", "your-library", o());
        fpb fpbVar15 = new fpb("import_music_entry_point_enabled", "your-library", p());
        fpb fpbVar16 = new fpb("import_progress_enabled", "your-library", q());
        fpb fpbVar17 = new fpb("inline_card_message_per_filter_enabled", "your-library", r());
        fpb fpbVar18 = new fpb("library_import_match_result_banner_enabled", "your-library", s());
        fpb fpbVar19 = new fpb("max_selected_filters", "your-library", t(), 1, 4);
        fpb fpbVar20 = new fpb("page_size", "your-library", u(), 1, Integer.MAX_VALUE);
        fpb fpbVar21 = new fpb("page_threshold", "your-library", v(), 0, Integer.MAX_VALUE);
        fpb fpbVar22 = new fpb("playlist_synchronizer_batch_size", "your-library", w(), 1, 20);
        fpb fpbVar23 = new fpb("playlist_synchronizer_throttle_time", "your-library", x(), 10, 200);
        fpb fpbVar24 = new fpb("podcast_follow_education_card_enabled", "your-library", y());
        fpb fpbVar25 = new fpb("recently_updated_artists_sort_enabled", "your-library", z());
        fpb fpbVar26 = new fpb("recently_updated_playlists_sort_enabled", "your-library", A());
        fpb fpbVar27 = new fpb("recents_enabled", "your-library", B());
        fpb fpbVar28 = new fpb("recents_sort_order_enabled", "your-library", C());
        fpb fpbVar29 = new fpb("release_date_sort_order_for_albums_enabled", "your-library", D());
        String str = E().a;
        cvm1[] cvm1VarArrValues = cvm1.values();
        ArrayList arrayList = new ArrayList(cvm1VarArrValues.length);
        int length = cvm1VarArrValues.length;
        int i = 0;
        while (i < length) {
            int i2 = i;
            arrayList.add(cvm1VarArrValues[i2].a);
            i = i2 + 1;
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, fpbVar8, fpbVar9, fpbVar10, fpbVar11, fpbVar12, fpbVar13, fpbVar14, fpbVar15, fpbVar16, fpbVar17, fpbVar18, fpbVar19, fpbVar20, fpbVar21, fpbVar22, fpbVar23, fpbVar24, fpbVar25, fpbVar26, fpbVar27, fpbVar28, fpbVar29, new fpb("root_page_top_offset_adjustment", "your-library", str, arrayList), new fpb("saved_content_by_artist_enabled", "your-library", F()), new fpb("show_new_episodes_offboarding_card", "your-library", G()));
    }

    public final boolean n() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.n() : this.m;
    }

    public final boolean o() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.o() : this.n;
    }

    public final boolean p() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.p() : this.o;
    }

    public final boolean q() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.q() : this.f24p;
    }

    public final boolean r() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.r() : this.q;
    }

    public final boolean s() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.s() : this.r;
    }

    public final int t() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.t() : this.s;
    }

    public final int u() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.u() : this.t;
    }

    public final int v() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.v() : this.u;
    }

    public final int w() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.w() : this.v;
    }

    public final int x() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.x() : this.w;
    }

    public final boolean y() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.y() : this.x;
    }

    public final boolean z() {
        evm1 evm1VarE = e();
        return evm1VarE != null ? evm1VarE.z() : this.y;
    }

    public evm1(luk lukVar) {
        this(false, true, false, true, false, false, false, true, false, false, false, false, true, false, false, false, false, false, 2, 200, 40, 1, 200, false, false, false, false, false, false, cvm1.LARGE, false, false, lukVar);
    }
}
