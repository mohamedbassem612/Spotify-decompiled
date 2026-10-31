package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class uh4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final luk h;
    public final idd1 i;

    public uh4(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
        this.g = z7;
        this.h = lukVar;
        this.i = new idd1(new sh4(this, (byte) 1));
    }

    public static uh4 i(aey0 aey0Var) {
        return new uh4(aey0Var.c("android-feature-prompted-playlists:disclosure_sheet_enabled", false), aey0Var.c("android-feature-prompted-playlists:edit_ucp_prompt_page_enabled", false), aey0Var.c("android-feature-prompted-playlists:feedback_enabled", false), aey0Var.c("android-feature-prompted-playlists:mixing_enabled", false), aey0Var.c("android-feature-prompted-playlists:overdue_refresh_enabled", false), aey0Var.c("android-feature-prompted-playlists:prompt_cancelled_cmp_trigger_enabled", false), aey0Var.c("android-feature-prompted-playlists:refining_enabled", false), null);
    }

    public final uh4 a() {
        return (uh4) this.i.getValue();
    }

    public final boolean b() {
        uh4 uh4VarA = a();
        return uh4VarA != null ? uh4VarA.b() : this.a;
    }

    public final boolean c() {
        uh4 uh4VarA = a();
        return uh4VarA != null ? uh4VarA.c() : this.b;
    }

    public final boolean d() {
        uh4 uh4VarA = a();
        return uh4VarA != null ? uh4VarA.d() : this.c;
    }

    public final boolean e() {
        uh4 uh4VarA = a();
        return uh4VarA != null ? uh4VarA.e() : this.d;
    }

    public final boolean f() {
        uh4 uh4VarA = a();
        return uh4VarA != null ? uh4VarA.f() : this.e;
    }

    public final boolean g() {
        uh4 uh4VarA = a();
        return uh4VarA != null ? uh4VarA.g() : this.f;
    }

    public final boolean h() {
        uh4 uh4VarA = a();
        return uh4VarA != null ? uh4VarA.h() : this.g;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("disclosure_sheet_enabled", "android-feature-prompted-playlists", b()), new fpb("edit_ucp_prompt_page_enabled", "android-feature-prompted-playlists", c()), new fpb("feedback_enabled", "android-feature-prompted-playlists", d()), new fpb("mixing_enabled", "android-feature-prompted-playlists", e()), new fpb("overdue_refresh_enabled", "android-feature-prompted-playlists", f()), new fpb("prompt_cancelled_cmp_trigger_enabled", "android-feature-prompted-playlists", g()), new fpb("refining_enabled", "android-feature-prompted-playlists", h())});
    }

    public uh4(luk lukVar) {
        this(false, false, false, false, false, false, false, lukVar);
    }

    public uh4() {
        this(false, false, false, false, false, false, false, null);
    }
}
