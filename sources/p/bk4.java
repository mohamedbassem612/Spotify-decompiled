package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bk4 implements pdy0 {
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
    public final tgp0 k;
    public final luk l;
    public final idd1 m;
    public final idd1 n;

    public bk4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, tgp0 tgp0Var, luk lukVar) {
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
        this.k = tgp0Var;
        this.l = lukVar;
        this.m = new idd1(new zj4(this, (byte) 1));
        this.n = new idd1(new zj4(this, (byte) 0));
    }

    public final boolean a() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.a() : this.a;
    }

    public final boolean b() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.b() : this.b;
    }

    public final bk4 c() {
        return (bk4) this.n.getValue();
    }

    public final boolean d() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.d() : this.c;
    }

    public final boolean e() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.e() : this.d;
    }

    public final boolean f() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.f() : this.f;
    }

    public final boolean g() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.g() : this.g;
    }

    public final boolean h() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.h() : this.h;
    }

    public final boolean i() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.i() : this.i;
    }

    public final boolean j() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.j() : this.j;
    }

    public final boolean k() {
        bk4 bk4VarC = c();
        return bk4VarC != null ? bk4VarC.k() : this.e;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("child_email_collection_enabled", "android-gen-alpha-account-creation", a()), new fpb("child_login_options_page_enabled", "android-gen-alpha-account-creation", b()), new fpb("enable_compose", "android-gen-alpha-account-creation", d()), new fpb("invite_members_parental_consent_flow_enabled", "android-gen-alpha-account-creation", e()), new fpb("is_member_details_parent_consent_flow_enabled", "android-gen-alpha-account-creation", k()), new fpb("parent_initiated_link_enabled", "android-gen-alpha-account-creation", f()), new fpb("parental_consent_flow_enabled", "android-gen-alpha-account-creation", g()), new fpb("parental_controls_transition_entry_point_enabled", "android-gen-alpha-account-creation", h()), new fpb("teen_initiated_link_enabled", "android-gen-alpha-account-creation", i()), new fpb("teen_link_enabled", "android-gen-alpha-account-creation", j())});
    }

    public bk4(tgp0 tgp0Var, luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, false, tgp0Var, lukVar);
    }
}
