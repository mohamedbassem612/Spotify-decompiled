package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ek4 implements pdy0 {
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
    public final idd1 k = new idd1(new q30(this, (byte) 12));
    public final idd1 l = new idd1(new sh4(this, (byte) 29));

    public ek4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, tgp0 tgp0Var, luk lukVar) {
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

    public static ek4 j(aey0 aey0Var) {
        return new ek4(aey0Var.c("android-gen-alpha-blocking:is_allowlisting_management_enabled", false), aey0Var.c("android-gen-alpha-blocking:is_allowlisting_request_enabled", false), aey0Var.c("android-gen-alpha-blocking:is_audiobook_allowlisting_management_enabled", false), aey0Var.c("android-gen-alpha-blocking:is_entry_point_artist_enabled", false), aey0Var.c("android-gen-alpha-blocking:is_entry_point_track_enabled", false), aey0Var.c("android-gen-alpha-blocking:is_managed_account_allowlisting_requests_page_enabled", false), aey0Var.c("android-gen-alpha-blocking:is_managed_accounts_request_settings_page_enabled", false), aey0Var.c("android-gen-alpha-blocking:is_my_allowlisting_requests_page_enabled", false), null, null);
    }

    public final ek4 a() {
        return (ek4) this.l.getValue();
    }

    public final boolean b() {
        ek4 ek4VarA = a();
        return ek4VarA != null ? ek4VarA.b() : this.a;
    }

    public final boolean c() {
        ek4 ek4VarA = a();
        return ek4VarA != null ? ek4VarA.c() : this.b;
    }

    public final boolean d() {
        ek4 ek4VarA = a();
        return ek4VarA != null ? ek4VarA.d() : this.c;
    }

    public final boolean e() {
        ek4 ek4VarA = a();
        return ek4VarA != null ? ek4VarA.e() : this.d;
    }

    public final boolean f() {
        ek4 ek4VarA = a();
        return ek4VarA != null ? ek4VarA.f() : this.e;
    }

    public final boolean g() {
        ek4 ek4VarA = a();
        return ek4VarA != null ? ek4VarA.g() : this.f;
    }

    public final boolean h() {
        ek4 ek4VarA = a();
        return ek4VarA != null ? ek4VarA.h() : this.g;
    }

    public final boolean i() {
        ek4 ek4VarA = a();
        return ek4VarA != null ? ek4VarA.i() : this.h;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("is_allowlisting_management_enabled", "android-gen-alpha-blocking", b()), new fpb("is_allowlisting_request_enabled", "android-gen-alpha-blocking", c()), new fpb("is_audiobook_allowlisting_management_enabled", "android-gen-alpha-blocking", d()), new fpb("is_entry_point_artist_enabled", "android-gen-alpha-blocking", e()), new fpb("is_entry_point_track_enabled", "android-gen-alpha-blocking", f()), new fpb("is_managed_account_allowlisting_requests_page_enabled", "android-gen-alpha-blocking", g()), new fpb("is_managed_accounts_request_settings_page_enabled", "android-gen-alpha-blocking", h()), new fpb("is_my_allowlisting_requests_page_enabled", "android-gen-alpha-blocking", i()));
    }
}
