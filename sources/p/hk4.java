package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class hk4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final tgp0 i;
    public final luk j;
    public final idd1 k = new idd1(new q30(this, (byte) 13));
    public final idd1 l = new idd1(new gk4(this, (byte) 0));

    public hk4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = z8;
        this.i = tgp0Var;
        this.j = lukVar;
    }

    public final hk4 a() {
        return (hk4) this.l.getValue();
    }

    public final boolean b() {
        hk4 hk4VarA = a();
        return hk4VarA != null ? hk4VarA.b() : this.a;
    }

    public final boolean c() {
        hk4 hk4VarA = a();
        return hk4VarA != null ? hk4VarA.c() : this.b;
    }

    public final boolean d() {
        hk4 hk4VarA = a();
        return hk4VarA != null ? hk4VarA.d() : this.g;
    }

    public final boolean e() {
        hk4 hk4VarA = a();
        return hk4VarA != null ? hk4VarA.e() : this.h;
    }

    public final boolean f() {
        hk4 hk4VarA = a();
        return hk4VarA != null ? hk4VarA.f() : this.c;
    }

    public final boolean g() {
        hk4 hk4VarA = a();
        return hk4VarA != null ? hk4VarA.g() : this.d;
    }

    public final boolean h() {
        hk4 hk4VarA = a();
        return hk4VarA != null ? hk4VarA.h() : this.e;
    }

    public final boolean i() {
        hk4 hk4VarA = a();
        return hk4VarA != null ? hk4VarA.i() : this.f;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_login_qr_code_url_decoration", "android-gen-alpha", b()), new fpb("fma_upgrade_dialog_enabled", "android-gen-alpha", c()), new fpb("is_graduation_banner_in_notifications_section_enabled", "android-gen-alpha", f()), new fpb("is_managed_account_details_v2_page_enabled", "android-gen-alpha", g()), new fpb("is_managed_teen_account_parent_controls_enabled", "android-gen-alpha", h()), new fpb("is_teen_graduation_enabled", "android-gen-alpha", i()), new fpb("parent_details_enabled", "android-gen-alpha", d()), new fpb("use_kids_view_get_children", "android-gen-alpha", e()));
    }
}
