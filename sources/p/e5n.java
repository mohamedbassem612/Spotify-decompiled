package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e5n implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new j3m(this, (byte) 16));

    public e5n(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        e5n e5nVar = (e5n) this.c.getValue();
        return e5nVar != null ? e5nVar.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("enable_anr_shutdown_watchdog", "core-full-session-service-music", a()));
    }
}
