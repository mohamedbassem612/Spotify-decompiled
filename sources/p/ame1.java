package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ame1 implements gev0 {
    public final uu0 a;

    public ame1(zle1 zle1Var, iac0 iac0Var) {
        this.a = new uu0(zle1Var, iac0Var, "creator-artist-page-popular-releases", "release-list-load-failed");
    }

    public final void a() {
        this.a.n("failure", "page-load-failed");
    }

    public final void b() {
        this.a.r();
    }

    public final void c() {
        this.a.n("failure", "cancelled");
    }

    public final void d() {
        this.a.n("success", (String) null);
    }

    public final void e() {
        uu0 uu0Var = this.a;
        uu0Var.n("failure", (String) uu0Var.e);
    }

    public final void f() {
        this.a.a = true;
    }
}
