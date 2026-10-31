package p;

import com.spotify.base.java.logging.Logger;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tl61 implements xwh0 {
    public final g3e a;
    public final ynb0 b;
    public final idd1 c;

    public tl61(g3e g3eVar, d6b1 d6b1Var, ynb0 ynb0Var) {
        this.a = g3eVar;
        this.b = ynb0Var;
        this.c = new idd1(new i1w(d6b1Var, d6b1.class, "mediaSessionWrapper", "getMediaSessionWrapper()Lcom/spotify/mediasession/wrapper/MediaSessionWrapper;", 0, (byte) 12));
    }

    public final void a() {
        if (this.a.b()) {
            ((y490) this.c.getValue()).i();
        }
    }

    public final void b() {
        if (this.a.b()) {
            ((y490) this.c.getValue()).g((p7s) this.b.get());
        } else {
            Logger.g("GOS->Not binding media session to media router when Output Switcher is disabled", new Object[0]);
        }
    }
}
