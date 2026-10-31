package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i44 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final h44 f;
    public final boolean g;
    public final luk h;
    public final idd1 i;

    public i44(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, h44 h44Var, boolean z6, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = h44Var;
        this.g = z6;
        this.h = lukVar;
        this.i = new idd1(new g82(this, (byte) 26));
    }

    public final boolean a() {
        i44 i44VarB = b();
        return i44VarB != null ? i44VarB.a() : this.a;
    }

    public final i44 b() {
        return (i44) this.i.getValue();
    }

    public final boolean c() {
        i44 i44VarB = b();
        return i44VarB != null ? i44VarB.c() : this.b;
    }

    public final boolean d() {
        i44 i44VarB = b();
        return i44VarB != null ? i44VarB.d() : this.c;
    }

    public final boolean e() {
        i44 i44VarB = b();
        return i44VarB != null ? i44VarB.e() : this.d;
    }

    public final boolean f() {
        i44 i44VarB = b();
        return i44VarB != null ? i44VarB.f() : this.e;
    }

    public final h44 g() {
        h44 h44VarG;
        i44 i44VarB = b();
        return (i44VarB == null || (h44VarG = i44VarB.g()) == null) ? this.f : h44VarG;
    }

    public final boolean h() {
        i44 i44VarB = b();
        return i44VarB != null ? i44VarB.h() : this.g;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("close_ad_npv_enabled", "android-adsdisplay-elementimpl", a());
        fpb fpbVar2 = new fpb("display_ad_viewability_tracker_enabled", "android-adsdisplay-elementimpl", c());
        fpb fpbVar3 = new fpb("show_ad_break_time_remaining", "android-adsdisplay-elementimpl", d());
        fpb fpbVar4 = new fpb("skippable_ad_element_enabled", "android-adsdisplay-elementimpl", e());
        fpb fpbVar5 = new fpb("v2_enpv_display", "android-adsdisplay-elementimpl", f());
        String str = g().a;
        h44[] h44VarArrValues = h44.values();
        ArrayList arrayList = new ArrayList(h44VarArrValues.length);
        for (h44 h44Var : h44VarArrValues) {
            arrayList.add(h44Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, new fpb("video_ad_card_click_behavior", "android-adsdisplay-elementimpl", str, arrayList), new fpb("visible_impression_enabled", "android-adsdisplay-elementimpl", h()));
    }

    public i44(luk lukVar) {
        this(false, false, true, false, false, h44.EXPAND_FULL_VIDEO, false, lukVar);
    }
}
