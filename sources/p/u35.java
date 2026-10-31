package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class u35 implements pdy0 {
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
    public final luk k;
    public final idd1 l;

    public u35(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, luk lukVar) {
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
        this.k = lukVar;
        this.l = new idd1(new k25(this, (byte) 21));
    }

    public static u35 l(aey0 aey0Var) {
        return new u35(aey0Var.c("android-system-sts:sts_context_menu_actions_enabled", false), aey0Var.c("android-system-sts:sts_create_menu_enabled", false), aey0Var.c("android-system-sts:sts_episode_delete_enabled", false), aey0Var.c("android-system-sts:sts_episode_edit_enabled", false), aey0Var.c("android-system-sts:sts_genpods_episode_delete_enabled", false), aey0Var.c("android-system-sts:sts_genpods_show_delete_enabled", false), aey0Var.c("android-system-sts:sts_open_with_import_enabled", false), aey0Var.c("android-system-sts:sts_share_target_enabled", false), aey0Var.c("android-system-sts:sts_show_delete_enabled", false), aey0Var.c("android-system-sts:sts_show_edit_enabled", false), null);
    }

    public final u35 a() {
        return (u35) this.l.getValue();
    }

    public final boolean b() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.b() : this.a;
    }

    public final boolean c() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.c() : this.b;
    }

    public final boolean d() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.d() : this.c;
    }

    public final boolean e() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.e() : this.d;
    }

    public final boolean f() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.f() : this.e;
    }

    public final boolean g() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.g() : this.f;
    }

    public final boolean h() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.h() : this.g;
    }

    public final boolean i() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.i() : this.h;
    }

    public final boolean j() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.j() : this.i;
    }

    public final boolean k() {
        u35 u35VarA = a();
        return u35VarA != null ? u35VarA.k() : this.j;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("sts_context_menu_actions_enabled", "android-system-sts", b()), new fpb("sts_create_menu_enabled", "android-system-sts", c()), new fpb("sts_episode_delete_enabled", "android-system-sts", d()), new fpb("sts_episode_edit_enabled", "android-system-sts", e()), new fpb("sts_genpods_episode_delete_enabled", "android-system-sts", f()), new fpb("sts_genpods_show_delete_enabled", "android-system-sts", g()), new fpb("sts_open_with_import_enabled", "android-system-sts", h()), new fpb("sts_share_target_enabled", "android-system-sts", i()), new fpb("sts_show_delete_enabled", "android-system-sts", j()), new fpb("sts_show_edit_enabled", "android-system-sts", k()));
    }

    public u35(luk lukVar) {
        this(false, false, false, false, false, false, false, false, false, false, lukVar);
    }

    public u35() {
        this(false, false, false, false, false, false, false, false, false, false, null);
    }
}
