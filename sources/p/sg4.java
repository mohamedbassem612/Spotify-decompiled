package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sg4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new cg4(this, (byte) 9));

    public sg4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        sg4 sg4Var = (sg4) this.e.getValue();
        return sg4Var != null ? sg4Var.a() : this.a;
    }

    public final boolean b() {
        sg4 sg4Var = (sg4) this.e.getValue();
        return sg4Var != null ? sg4Var.b() : this.b;
    }

    public final boolean c() {
        sg4 sg4Var = (sg4) this.e.getValue();
        return sg4Var != null ? sg4Var.c() : this.c;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("compose_enabled", "android-feature-main-layout", a()), new fpb("large_screen_layout_npv_mode_persistent", "android-feature-main-layout", b()), new fpb("overlay_page_plugin_enabled", "android-feature-main-layout", c()));
    }
}
