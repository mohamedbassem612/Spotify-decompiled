package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yt4 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new st4(this, (byte) 5));

    public yt4(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
    }

    public final boolean a() {
        yt4 yt4Var = (yt4) this.d.getValue();
        return yt4Var != null ? yt4Var.a() : this.a;
    }

    public final int b() {
        yt4 yt4Var = (yt4) this.d.getValue();
        return yt4Var != null ? yt4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("po_banner_enabled", "android-music-libs-po-session-counter", a()), new fpb("po_max_sessions", "android-music-libs-po-session-counter", b(), 0, 100));
    }
}
