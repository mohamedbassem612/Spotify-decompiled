package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ya91 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new fe81(this, (byte) 16));

    public ya91(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
    }

    public final boolean a() {
        ya91 ya91Var = (ya91) this.d.getValue();
        return ya91Var != null ? ya91Var.a() : this.a;
    }

    public final boolean b() {
        ya91 ya91Var = (ya91) this.d.getValue();
        return ya91Var != null ? ya91Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_sleeptimer_fade_out", "sleeptimer-handler", a()), new fpb("use_player_state_backed_sleep_timer", "sleeptimer-handler", b()));
    }
}
