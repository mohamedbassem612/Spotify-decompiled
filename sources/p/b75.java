package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b75 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final y65 f;
    public final z65 g;
    public final a75 h;
    public final int i;
    public final luk j;
    public final idd1 k;

    public b75(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, y65 y65Var, z65 z65Var, a75 a75Var, int i, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = y65Var;
        this.g = z65Var;
        this.h = a75Var;
        this.i = i;
        this.j = lukVar;
        this.k = new idd1(new f55(this, (byte) 19));
    }

    public final b75 a() {
        return (b75) this.k.getValue();
    }

    public final boolean b() {
        b75 b75VarA = a();
        return b75VarA != null ? b75VarA.b() : this.a;
    }

    public final boolean c() {
        b75 b75VarA = a();
        return b75VarA != null ? b75VarA.c() : this.b;
    }

    public final boolean d() {
        b75 b75VarA = a();
        return b75VarA != null ? b75VarA.d() : this.c;
    }

    public final boolean e() {
        b75 b75VarA = a();
        return b75VarA != null ? b75VarA.e() : this.d;
    }

    public final y65 f() {
        y65 y65VarF;
        b75 b75VarA = a();
        return (b75VarA == null || (y65VarF = b75VarA.f()) == null) ? this.f : y65VarF;
    }

    public final z65 g() {
        z65 z65VarG;
        b75 b75VarA = a();
        return (b75VarA == null || (z65VarG = b75VarA.g()) == null) ? this.g : z65VarG;
    }

    public final a75 h() {
        a75 a75VarH;
        b75 b75VarA = a();
        return (b75VarA == null || (a75VarH = b75VarA.h()) == null) ? this.h : a75VarH;
    }

    public final int i() {
        b75 b75VarA = a();
        return b75VarA != null ? b75VarA.i() : this.i;
    }

    public final boolean j() {
        b75 b75VarA = a();
        return b75VarA != null ? b75VarA.j() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("enable_music_video_carousel_on_creator_page_in_mft_plus", "android-videorecommendation-entrypointsconfigimpl", b());
        fpb fpbVar2 = new fpb("enable_music_video_carousel_on_npv_scroll_in_mft_plus", "android-videorecommendation-entrypointsconfigimpl", c());
        fpb fpbVar3 = new fpb("enable_music_video_carousel_on_search_page_in_mft_plus", "android-videorecommendation-entrypointsconfigimpl", d());
        fpb fpbVar4 = new fpb("enable_music_video_time_cap_upsell_for_video_first_search_results", "android-videorecommendation-entrypointsconfigimpl", e());
        fpb fpbVar5 = new fpb("is_music_video_autoplay_copy_enabled", "android-videorecommendation-entrypointsconfigimpl", j());
        String str = f().a;
        y65[] y65VarArrValues = y65.values();
        ArrayList arrayList = new ArrayList(y65VarArrValues.length);
        for (y65 y65Var : y65VarArrValues) {
            arrayList.add(y65Var.a);
        }
        fpb fpbVar6 = new fpb("music_video_carousel_creator_page_cap_behavior", "android-videorecommendation-entrypointsconfigimpl", str, arrayList);
        String str2 = g().a;
        z65[] z65VarArrValues = z65.values();
        ArrayList arrayList2 = new ArrayList(z65VarArrValues.length);
        for (z65 z65Var : z65VarArrValues) {
            arrayList2.add(z65Var.a);
        }
        fpb fpbVar7 = new fpb("music_video_carousel_npv_scroll_cap_behavior", "android-videorecommendation-entrypointsconfigimpl", str2, arrayList2);
        String str3 = h().a;
        a75[] a75VarArrValues = a75.values();
        ArrayList arrayList3 = new ArrayList(a75VarArrValues.length);
        for (a75 a75Var : a75VarArrValues) {
            arrayList3.add(a75Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, new fpb("music_video_carousel_search_page_cap_behavior", "android-videorecommendation-entrypointsconfigimpl", str3, arrayList3), new fpb("time_cap_music_video_upsell_delay_millis", "android-videorecommendation-entrypointsconfigimpl", i(), 0, 100000));
    }

    public b75(luk lukVar) {
        this(false, false, false, false, false, y65.SHOW_UPSELL, z65.SHOW_UPSELL, a75.SHOW_UPSELL, 2000, lukVar);
    }
}
