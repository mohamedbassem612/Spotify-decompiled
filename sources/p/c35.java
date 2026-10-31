package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class c35 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new k25(this, (byte) 7));

    public c35(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
    }

    public final boolean a() {
        c35 c35Var = (c35) this.g.getValue();
        return c35Var != null ? c35Var.a() : this.a;
    }

    public final boolean b() {
        c35 c35Var = (c35) this.g.getValue();
        return c35Var != null ? c35Var.b() : this.b;
    }

    public final boolean c() {
        c35 c35Var = (c35) this.g.getValue();
        return c35Var != null ? c35Var.c() : this.c;
    }

    public final boolean d() {
        c35 c35Var = (c35) this.g.getValue();
        return c35Var != null ? c35Var.d() : this.d;
    }

    public final boolean e() {
        c35 c35Var = (c35) this.g.getValue();
        return c35Var != null ? c35Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("is_hide_from_audiobook_shortcuts_enabled", "android-system-home-hidefromhome", a()), new fpb("is_hide_from_podcast_anchors_enabled", "android-system-home-hidefromhome", b()), new fpb("is_hide_from_recents_enabled", "android-system-home-hidefromhome", c()), new fpb("is_hide_from_shortcuts_enabled", "android-system-home-hidefromhome", d()), new fpb("is_hide_from_wrapped_shortcuts_enabled", "android-system-home-hidefromhome", e()));
    }
}
