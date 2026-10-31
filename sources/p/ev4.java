package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ev4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new st4(this, (byte) 29));

    public ev4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        ev4 ev4Var = (ev4) this.d.getValue();
        return ev4Var != null ? ev4Var.a() : this.a;
    }

    public final boolean b() {
        ev4 ev4Var = (ev4) this.d.getValue();
        return ev4Var != null ? ev4Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("enable_agnostic_mode", "android-nowplaying-modes-agnosticmode", a()), new fpb("show_debug_info", "android-nowplaying-modes-agnosticmode", b())});
    }
}
