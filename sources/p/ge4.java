package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ge4 implements pdy0 {
    public final boolean a;
    public final ee4 b;
    public final fe4 c;
    public final boolean d;
    public final int e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final luk l;
    public final idd1 m;

    public ge4(boolean z, ee4 ee4Var, fe4 fe4Var, boolean z2, int i, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
        this.a = z;
        this.b = ee4Var;
        this.c = fe4Var;
        this.d = z2;
        this.e = i;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = z6;
        this.j = z7;
        this.k = z8;
        this.l = lukVar;
        this.m = new idd1(new wb4(this, (byte) 23));
    }

    public final boolean a() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.a() : this.a;
    }

    public final ge4 b() {
        return (ge4) this.m.getValue();
    }

    public final ee4 c() {
        ee4 ee4VarC;
        ge4 ge4VarB = b();
        return (ge4VarB == null || (ee4VarC = ge4VarB.c()) == null) ? this.b : ee4VarC;
    }

    public final fe4 d() {
        fe4 fe4VarD;
        ge4 ge4VarB = b();
        return (ge4VarB == null || (fe4VarD = ge4VarB.d()) == null) ? this.c : fe4VarD;
    }

    public final boolean e() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.e() : this.d;
    }

    public final int f() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.f() : this.e;
    }

    public final boolean g() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.g() : this.f;
    }

    public final boolean h() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.h() : this.g;
    }

    public final boolean i() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.i() : this.h;
    }

    public final boolean j() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.j() : this.i;
    }

    public final boolean k() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.k() : this.j;
    }

    public final boolean l() {
        ge4 ge4VarB = b();
        return ge4VarB != null ? ge4VarB.l() : this.k;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("ad_auto_dismiss", "android-embeddedadplaylist", a());
        String str = c().a;
        ee4[] ee4VarArrValues = ee4.values();
        ArrayList arrayList = new ArrayList(ee4VarArrValues.length);
        for (ee4 ee4Var : ee4VarArrValues) {
            arrayList.add(ee4Var.a);
        }
        fpb fpbVar2 = new fpb("embedded_ad_placement", "android-embeddedadplaylist", str, arrayList);
        String str2 = d().a;
        fe4[] fe4VarArrValues = fe4.values();
        ArrayList arrayList2 = new ArrayList(fe4VarArrValues.length);
        for (fe4 fe4Var : fe4VarArrValues) {
            arrayList2.add(fe4Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, new fpb("embedded_ad_within_tracklist_placement", "android-embeddedadplaylist", str2, arrayList2), new fpb("filter_albums", "android-embeddedadplaylist", e()), new fpb("playlist_leavebehind_fetch_deadline", "android-embeddedadplaylist", f(), 0, 9999999), new fpb("prioritize_embeddedad", "android-embeddedadplaylist", g()), new fpb("skip_sponsored_playlist_ad_refetch", "android-embeddedadplaylist", h()), new fpb("unified_leavebehind_episode_page_enabled", "android-embeddedadplaylist", i()), new fpb("unified_leavebehind_show_page_enabled", "android-embeddedadplaylist", j()), new fpb("use_unified_leavebehind_fetch", "android-embeddedadplaylist", k()), new fpb("use_video_ad_element_v2", "android-embeddedadplaylist", l()));
    }

    public ge4(luk lukVar) {
        this(true, ee4.NONE, fe4.NONE, false, 5000, false, false, false, false, false, false, lukVar);
    }
}
