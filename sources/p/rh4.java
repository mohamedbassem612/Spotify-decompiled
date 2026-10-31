package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rh4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f;

    public rh4(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
        this.f = new idd1(new cg4(this, (byte) 29));
    }

    public final boolean a() {
        rh4 rh4Var = (rh4) this.f.getValue();
        return rh4Var != null ? rh4Var.a() : this.a;
    }

    public final boolean b() {
        rh4 rh4Var = (rh4) this.f.getValue();
        return rh4Var != null ? rh4Var.b() : this.b;
    }

    public final boolean c() {
        rh4 rh4Var = (rh4) this.f.getValue();
        return rh4Var != null ? rh4Var.c() : this.c;
    }

    public final boolean d() {
        rh4 rh4Var = (rh4) this.f.getValue();
        return rh4Var != null ? rh4Var.d() : this.d;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("listening_party_card_enabled", "android-feature-prerelease", a()), new fpb("push_permission_alert_cdp_album_enabled", "android-feature-prerelease", b()), new fpb("toolbar_context_menu_enabled", "android-feature-prerelease", c()), new fpb("use_album_uri_for_presave", "android-feature-prerelease", d())});
    }

    public rh4(luk lukVar) {
        this(false, false, false, false, lukVar);
    }
}
