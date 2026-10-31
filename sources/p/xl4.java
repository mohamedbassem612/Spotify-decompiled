package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xl4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public xl4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new gk4(this, (byte) 18));
    }

    public final boolean a() {
        xl4 xl4Var = (xl4) this.d.getValue();
        return xl4Var != null ? xl4Var.a() : this.a;
    }

    public final boolean b() {
        xl4 xl4Var = (xl4) this.d.getValue();
        return xl4Var != null ? xl4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("stream_reporting_tracker_debug_tracing_enabled", "android-libs-betamax-royalty-stream-reporting", a()), new fpb("stream_reporting_tracker_non_context_player_enabled", "android-libs-betamax-royalty-stream-reporting", b()));
    }

    public xl4(luk lukVar) {
        this(false, true, lukVar);
    }
}
