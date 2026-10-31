package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class b4n0 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final luk e;
    public final idd1 f = new idd1(new zem0(this, (byte) 16));

    public b4n0(boolean z, boolean z2, boolean z3, boolean z4, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = lukVar;
    }

    public final boolean a() {
        b4n0 b4n0Var = (b4n0) this.f.getValue();
        return b4n0Var != null ? b4n0Var.a() : this.a;
    }

    public final boolean b() {
        b4n0 b4n0Var = (b4n0) this.f.getValue();
        return b4n0Var != null ? b4n0Var.b() : this.b;
    }

    public final boolean c() {
        b4n0 b4n0Var = (b4n0) this.f.getValue();
        return b4n0Var != null ? b4n0Var.c() : this.c;
    }

    public final boolean d() {
        b4n0 b4n0Var = (b4n0) this.f.getValue();
        return b4n0Var != null ? b4n0Var.d() : this.d;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("coroutine_command_queue_enabled", "music-navigation", a()), new fpb("enable_async_fragment_commits", "music-navigation", b()), new fpb("enable_overlay_animations", "music-navigation", c()), new fpb("nav_events_enabled", "music-navigation", d()));
    }
}
