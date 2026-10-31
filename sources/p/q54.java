package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class q54 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final tgp0 d;
    public final luk e;
    public final idd1 f;
    public final idd1 g;

    public q54(boolean z, boolean z2, boolean z3, tgp0 tgp0Var, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = tgp0Var;
        this.e = lukVar;
        this.f = new idd1(new q30(this, (byte) 5));
        this.g = new idd1(new m44(this, (byte) 20));
    }

    public final boolean a() {
        q54 q54Var = (q54) this.g.getValue();
        return q54Var != null ? q54Var.a() : this.a;
    }

    public final boolean b() {
        q54 q54Var = (q54) this.g.getValue();
        return q54Var != null ? q54Var.b() : this.b;
    }

    public final boolean c() {
        q54 q54Var = (q54) this.g.getValue();
        return q54Var != null ? q54Var.c() : this.c;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("should_refresh_capping_state_on_player_error", "android-audiobook-playerlistener", a()), new fpb("should_stop_player_when_capped", "android-audiobook-playerlistener", b()), new fpb("use_extended_metadata_client_for_legacy_capping", "android-audiobook-playerlistener", c())});
    }

    public q54(tgp0 tgp0Var, luk lukVar) {
        this(true, true, true, tgp0Var, lukVar);
    }
}
