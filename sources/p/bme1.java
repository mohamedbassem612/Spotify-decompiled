package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bme1 implements xev0 {
    public final bt6 a;
    public final uu0 b;

    public bme1(zle1 zle1Var, iac0 iac0Var, bt6 bt6Var) {
        this.a = bt6Var;
        this.b = new uu0(zle1Var, iac0Var, "creator-artist-page-popular-track", "track-list-load-failed");
    }

    public final void a() {
        this.b.n("failure", "page-load-failed");
        this.a.l(false);
    }

    public final void b() {
        this.b.r();
    }

    public final void c() {
        this.b.n("failure", "cancelled");
    }

    public final void d() {
        uu0 uu0Var = this.b;
        uu0Var.n("failure", (String) uu0Var.e);
        this.a.l(false);
    }

    public final void e() {
        this.b.n("success", (String) null);
        this.a.l(true);
    }

    public final void f() {
        this.b.a = true;
    }
}
