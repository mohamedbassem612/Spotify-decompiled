package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ef4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e;

    public ef4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
        this.e = new idd1(new pe4(this, (byte) 12));
    }

    public final boolean a() {
        ef4 ef4Var = (ef4) this.e.getValue();
        return ef4Var != null ? ef4Var.a() : this.a;
    }

    public final boolean b() {
        ef4 ef4Var = (ef4) this.e.getValue();
        return ef4Var != null ? ef4Var.b() : this.c;
    }

    public final boolean c() {
        ef4 ef4Var = (ef4) this.e.getValue();
        return ef4Var != null ? ef4Var.c() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("context_menu_in_toolbar_trailing_action", "android-feature-audiobook-pre-release", a()), new fpb("is_permission_dialog_on_presave_enabled", "android-feature-audiobook-pre-release", c()), new fpb("should_display_watchfeed_entrypoint", "android-feature-audiobook-pre-release", b())});
    }

    public ef4(luk lukVar) {
        this(false, false, false, lukVar);
    }
}
