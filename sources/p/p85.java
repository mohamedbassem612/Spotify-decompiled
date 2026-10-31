package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class p85 implements pdy0 {
    public final boolean a;
    public final o85 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final luk j;
    public final idd1 k = new idd1(new f85(this, (byte) 7));

    public p85(boolean z, o85 o85Var, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, luk lukVar) {
        this.a = z;
        this.b = o85Var;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.h = z7;
        this.i = z8;
        this.j = lukVar;
    }

    public final boolean a() {
        p85 p85VarB = b();
        return p85VarB != null ? p85VarB.a() : this.a;
    }

    public final p85 b() {
        return (p85) this.k.getValue();
    }

    public final o85 c() {
        o85 o85VarC;
        p85 p85VarB = b();
        return (p85VarB == null || (o85VarC = p85VarB.c()) == null) ? this.b : o85VarC;
    }

    public final boolean d() {
        p85 p85VarB = b();
        return p85VarB != null ? p85VarB.d() : this.c;
    }

    public final boolean e() {
        p85 p85VarB = b();
        return p85VarB != null ? p85VarB.e() : this.d;
    }

    public final boolean f() {
        p85 p85VarB = b();
        return p85VarB != null ? p85VarB.f() : this.e;
    }

    public final boolean g() {
        p85 p85VarB = b();
        return p85VarB != null ? p85VarB.g() : this.f;
    }

    public final boolean h() {
        p85 p85VarB = b();
        return p85VarB != null ? p85VarB.h() : this.g;
    }

    public final boolean i() {
        p85 p85VarB = b();
        return p85VarB != null ? p85VarB.i() : this.h;
    }

    public final boolean j() {
        p85 p85VarB = b();
        return p85VarB != null ? p85VarB.j() : this.i;
    }

    @Override // p.pdy0
    public final List models() {
        fpb fpbVar = new fpb("customizable_widget", "android-widgets-npvwidget", a());
        String str = c().a;
        o85[] o85VarArrValues = o85.values();
        ArrayList arrayList = new ArrayList(o85VarArrValues.length);
        for (o85 o85Var : o85VarArrValues) {
            arrayList.add(o85Var.a);
        }
        return p7h.M(fpbVar, new fpb("entity_click_behaviour", "android-widgets-npvwidget", str, arrayList), new fpb("fetch_traits_metadata", "android-widgets-npvwidget", d()), new fpb("hide_skip_buttons_in_compact_format", "android-widgets-npvwidget", e()), new fpb("launcher_logging", "android-widgets-npvwidget", f()), new fpb("recommendations_cache", "android-widgets-npvwidget", g()), new fpb("save_action", "android-widgets-npvwidget", h()), new fpb("skip_loading_on_update", "android-widgets-npvwidget", i()), new fpb("use_loader_with_cross_profile", "android-widgets-npvwidget", j()));
    }
}
