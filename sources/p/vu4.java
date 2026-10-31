package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vu4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final luk d;
    public final idd1 e = new idd1(new st4(this, (byte) 20));

    public vu4(boolean z, boolean z2, boolean z3, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = lukVar;
    }

    public final boolean a() {
        vu4 vu4Var = (vu4) this.e.getValue();
        return vu4Var != null ? vu4Var.a() : this.a;
    }

    public final boolean b() {
        vu4 vu4Var = (vu4) this.e.getValue();
        return vu4Var != null ? vu4Var.b() : this.b;
    }

    public final boolean c() {
        vu4 vu4Var = (vu4) this.e.getValue();
        return vu4Var != null ? vu4Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("destroy_page_lifecycle_on_mode_switch_enabled", "android-nowplaying-core", a()), new fpb("mode_switch_without_fade_enabled", "android-nowplaying-core", b()), new fpb("slower_progress_updates_enabled", "android-nowplaying-core", c())});
    }
}
