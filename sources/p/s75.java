package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s75 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final luk f;
    public final idd1 g = new idd1(new f55(this, (byte) 21));

    public s75(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = lukVar;
    }

    public final boolean a() {
        s75 s75Var = (s75) this.g.getValue();
        return s75Var != null ? s75Var.a() : this.a;
    }

    public final boolean b() {
        s75 s75Var = (s75) this.g.getValue();
        return s75Var != null ? s75Var.b() : this.b;
    }

    public final boolean c() {
        s75 s75Var = (s75) this.g.getValue();
        return s75Var != null ? s75Var.c() : this.c;
    }

    public final boolean d() {
        s75 s75Var = (s75) this.g.getValue();
        return s75Var != null ? s75Var.d() : this.d;
    }

    public final boolean e() {
        s75 s75Var = (s75) this.g.getValue();
        return s75Var != null ? s75Var.e() : this.e;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_debug_tools", "android-voting-playlist", a()), new fpb("enable_entrypoint_section", "android-voting-playlist", b()), new fpb("enable_screenshot_detection", "android-voting-playlist", c()), new fpb("enable_share_header_action", "android-voting-playlist", d()), new fpb("enable_watchfeed_header_action", "android-voting-playlist", e()));
    }
}
