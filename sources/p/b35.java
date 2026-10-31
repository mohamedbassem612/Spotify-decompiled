package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b35 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final y25 g;
    public final z25 h;
    public final a35 i;
    public final luk j;
    public final idd1 k;

    public b35(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, int i, y25 y25Var, z25 z25Var, a35 a35Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = i;
        this.g = y25Var;
        this.h = z25Var;
        this.i = a35Var;
        this.j = lukVar;
        this.k = new idd1(new k25(this, (byte) 6));
    }

    public final b35 a() {
        return (b35) this.k.getValue();
    }

    public final boolean b() {
        b35 b35VarA = a();
        return b35VarA != null ? b35VarA.b() : this.a;
    }

    public final boolean c() {
        b35 b35VarA = a();
        return b35VarA != null ? b35VarA.c() : this.b;
    }

    public final boolean d() {
        b35 b35VarA = a();
        return b35VarA != null ? b35VarA.d() : this.c;
    }

    public final boolean e() {
        b35 b35VarA = a();
        return b35VarA != null ? b35VarA.e() : this.d;
    }

    public final int f() {
        b35 b35VarA = a();
        return b35VarA != null ? b35VarA.f() : this.f;
    }

    public final y25 g() {
        y25 y25VarG;
        b35 b35VarA = a();
        return (b35VarA == null || (y25VarG = b35VarA.g()) == null) ? this.g : y25VarG;
    }

    public final z25 h() {
        z25 z25VarH;
        b35 b35VarA = a();
        return (b35VarA == null || (z25VarH = b35VarA.h()) == null) ? this.h : z25VarH;
    }

    public final a35 i() {
        a35 a35VarI;
        b35 b35VarA = a();
        return (b35VarA == null || (a35VarI = b35VarA.i()) == null) ? this.i : a35VarI;
    }

    public final boolean j() {
        b35 b35VarA = a();
        return b35VarA != null ? b35VarA.j() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("enable_always_highlight_last_chip", "android-system-home-funkispage", b());
        fpb fpbVar2 = new fpb("enable_assign_focus_on_scroll", "android-system-home-funkispage", c());
        fpb fpbVar3 = new fpb("enable_left_aligned_selected_filter_chip_scrolling", "android-system-home-funkispage", d());
        fpb fpbVar4 = new fpb("enable_page_presentation_update", "android-system-home-funkispage", e());
        fpb fpbVar5 = new fpb("is_rive_animations_are_enabled_for_filter_chips", "android-system-home-funkispage", j());
        fpb fpbVar6 = new fpb("override_highlighted_chip_position", "android-system-home-funkispage", f(), 0, 50);
        String str = g().a;
        y25[] y25VarArrValues = y25.values();
        ArrayList arrayList = new ArrayList(y25VarArrValues.length);
        for (y25 y25Var : y25VarArrValues) {
            arrayList.add(y25Var.a);
        }
        fpb fpbVar7 = new fpb("override_highlighted_chip_style", "android-system-home-funkispage", str, arrayList);
        String strA = h().a();
        z25[] z25VarArrValues = z25.values();
        ArrayList arrayList2 = new ArrayList(z25VarArrValues.length);
        for (z25 z25Var : z25VarArrValues) {
            arrayList2.add(z25Var.a());
        }
        fpb fpbVar8 = new fpb("override_highlighted_chip_treatment", "android-system-home-funkispage", strA, arrayList2);
        String str2 = i().a;
        a35[] a35VarArrValues = a35.values();
        ArrayList arrayList3 = new ArrayList(a35VarArrValues.length);
        for (a35 a35Var : a35VarArrValues) {
            arrayList3.add(a35Var.a);
        }
        return p7h.M(fpbVar, fpbVar2, fpbVar3, fpbVar4, fpbVar5, fpbVar6, fpbVar7, fpbVar8, new fpb("root_page_top_offset_adjustment", "android-system-home-funkispage", str2, arrayList3));
    }

    public b35(luk lukVar) {
        this(false, false, false, false, true, 0, y25.DISABLED, z25.b, a35.LARGE, lukVar);
    }
}
